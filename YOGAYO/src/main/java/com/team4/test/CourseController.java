package com.team4.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.team4.dao.course.CourseServiceImpl;
import com.team4.dao.like.LikeServiceImpl;
import com.team4.dao.pose.PoseServiceImpl;
import com.team4.resource.R;
import com.team4.user.dao.UserServiceImpl;
import com.team4.util.UserAuthCheck;
import com.team4.vo.CommentVo;
import com.team4.vo.CoursePosesVo;
import com.team4.vo.CourseVo;
import com.team4.vo.DiffiVo;
import com.team4.vo.FeedVo;
import com.team4.vo.LikeVo;
import com.team4.vo.UserVo;

@Controller
public class CourseController implements R  {

	@RequestMapping(value = "/course-detail-upload-comment", method = RequestMethod.POST)
	public void uploadComment(Model model, @RequestParam("crsNum") int crsNum, @RequestParam("uNum") int uNum,
			@RequestParam("comment") String context, @RequestParam("rating") int rate, HttpServletResponse res,HttpServletRequest req) {
		UserAuthCheck.loginCheck(req, res, model);
		CourseVo crsvo = new CourseVo();
		crsvo.setCrsNum(crsNum);
		double cmavg = 0.0;
		CourseServiceImpl service = new CourseServiceImpl();
		UserServiceImpl uService = new UserServiceImpl();
		// 새 댓글 db에 넣는 작업
		CommentVo cvo = new CommentVo();
		cvo.setCrsNum(crsNum);
		cvo.setuNum(uNum);
		cvo.setContext(context);
		cvo.setRate(rate);
		try {
			service.addComment(cvo);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		// 새 댓글을 포함한 코스에 관련된 댓글들을 다시 jsp 쏴줘야됨

		CourseVo crsVo = new CourseVo();
		crsVo.setCrsNum(crsNum);
		List<CommentVo> commentList;
		List<CommentVo> reviewList;

		// 평점 추가하는 부분
		try {
			cmavg = service.commentAvg(crsvo);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	
		try {
			commentList = service.commentAll(crsVo);
			reviewList = service.reviewAll(crsVo);
			String json = "{\"comment\":{";
			UserVo uvo = new UserVo();
			for (int i = 0; i < commentList.size(); i++) {
				uvo = uService.getUserByCommentVo(commentList.get(i));
				json = json + "\"" + i + "\":" + commentList.get(i).toString() + "\"name\":" + "\"" + uvo.getName()
						+ "\"," + "\"img\":" + "\"" + uvo.getImg() + "\"" + "},";

			}
			json = json + "}, \"review\":{";

			for (int i = 0; i < reviewList.size(); i++) {
				uvo = uService.getUserByCommentVo(reviewList.get(i));
				json = json + "\"" + i + "\":" + reviewList.get(i).toString() + "\"name\":" + "\"" + uvo.getName()
						+ "\"," + "\"img\":" + "\"" + uvo.getImg() + "\"" + "},";
			}
			
			json = json + "}, \"avg\":" + Double.toString(cmavg);
			json = json + "}";

			System.out.println(json);
			res.getWriter().write(json);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping(value = "/course-detail", method = RequestMethod.POST)
	public void ajaxCourse(Model model, @RequestParam("crsNum") int crsNum, HttpServletResponse res,HttpServletRequest req) {
		CourseVo crsvo = new CourseVo();
		crsvo.setCrsNum(crsNum);
		double cmavg = 0.0;
		CourseServiceImpl service = new CourseServiceImpl();
		UserServiceImpl uService = new UserServiceImpl();
		// 새 댓글을 포함한 코스에 관련된 댓글들을 다시 jsp 쏴줘야됨
		
		CourseVo crsVo = new CourseVo();
		crsVo.setCrsNum(crsNum);
		List<CommentVo> commentList;
		List<CommentVo> reviewList;

		// 평점 추가하는 부분
		try {
			cmavg = service.commentAvg(crsvo);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			commentList = service.commentAll(crsVo);
			reviewList = service.reviewAll(crsVo);
			String json = "{\"comment\":{";
			UserVo uvo = new UserVo();
			for (int i = 0; i < commentList.size(); i++) {
				uvo = uService.getUserByCommentVo(commentList.get(i));
				json = json + "\"" + i + "\":" + commentList.get(i).toString() + "\"name\":" + "\"" + uvo.getName()
						+ "\"," + "\"img\":" + "\"" + uvo.getImg() + "\"" + "},";

			}
			json = json + "}, \"review\":{";

			for (int i = 0; i < reviewList.size(); i++) {
				uvo = uService.getUserByCommentVo(reviewList.get(i));
				json = json + "\"" + i + "\":" + reviewList.get(i).toString() + "\"name\":" + "\"" + uvo.getName()
						+ "\"," + "\"img\":" + "\"" + uvo.getImg() + "\"" + "},";
			}
			json = json + "}, \"avg\":" + Double.toString(cmavg);
			json = json + "}";

			System.out.println(json);
			res.getWriter().write(json);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping(value = "/course-page", method = RequestMethod.GET)
	public String coueseTitle(HttpServletRequest req, HttpServletResponse res, Model model,  @RequestParam(value="startNum", required=false, defaultValue="0") int startNum) throws Exception {
		UserAuthCheck.loginCheck(req, res, model);
		CourseServiceImpl service = new CourseServiceImpl();
		if(startNum!=0) {
			startNum = startNum+1;
		}
		List<CourseVo> list = service.selectAll(startNum);
		model.addAttribute("courses", list);
		return "course-page";
	}
	
	@ResponseBody
	@RequestMapping(value = "/course-page-ajax", method = RequestMethod.POST)
	public Map courseTitleAjax(@RequestParam(value="startNum", required=false, defaultValue="0") int startNum) throws Exception {
		CourseServiceImpl service = new CourseServiceImpl();
		if(startNum!=0) {
			startNum = startNum+1;
		}
		System.out.println(startNum);
		List<CourseVo> list = service.selectAll(startNum);
		
		Map searchMap = new HashMap();
		searchMap.put("result", list);
		return searchMap;
	}

	@ResponseBody
	@RequestMapping(value = "/search-course", method = RequestMethod.POST)
	public Map searchCourse(@RequestParam(value = "searchType", required = false) String searchType,
			@RequestParam(value = "sort", required = false) String sort,
			@RequestParam(value="startNum", required=false, defaultValue="0") int startNum) throws Exception {
		CourseServiceImpl service = new CourseServiceImpl();
		System.out.println("searchType : " + searchType);
		System.out.println("sort : " + sort);
		if(startNum!=0) {
			startNum = startNum+1;
		}
		System.out.println(startNum);
		Map searchMap = new HashMap();
		int uNum = 0;
		if (searchType.equals("pro")) {
			uNum = 101;
		};
		if (sort != null) {
			uNum = 0;
		};
		List<CourseVo> list = service.searchCourse(uNum, sort, startNum);
		searchMap.put("result", list);
		return searchMap;
	}

	@RequestMapping(value = "/addReview", method = RequestMethod.GET)
	public String addReview(CommentVo cvo, Model model, @RequestParam("uNum") int uNum,
			@RequestParam("crsNum") int crsNum, @RequestParam("review") String context,
			@RequestParam("parent") int parent) {
		CourseServiceImpl service = new CourseServiceImpl();
		System.out.println(crsNum + " + addReview");
		cvo = new CommentVo();
		cvo.setuNum(uNum);
		cvo.setCrsNum(crsNum);
		cvo.setContext(context);
		cvo.setParent(parent);
		try {
			service.addReview(cvo);
		} catch (Exception e) {
			System.out.println("[CourseController /  addReview]" + e.toString());
		}

		return "redirect:/course-detail?crsNum=" + crsNum;
	}

	@RequestMapping(value = "/addComment", method = RequestMethod.GET)
	public String addComment(CommentVo cvo, Model model, @RequestParam("crsNum") int crsNum,
			@RequestParam("uNum") int uNum, @RequestParam("comment") String context,
			@RequestParam("rating3") int rate) {
		CourseServiceImpl service = new CourseServiceImpl();
		cvo = new CommentVo();
		cvo.setCrsNum(crsNum);
		cvo.setuNum(uNum);
		cvo.setContext(context);
		cvo.setRate(rate);
		try {
			service.addComment(cvo);
		} catch (Exception e) {
			System.out.println("[CourseController /  addComment]" + e.toString());
		}

		return "redirect:/course-detail?crsNum=" + crsNum;
	}
	
	@ResponseBody
	@RequestMapping(value = "/comment_more", method = RequestMethod.POST)
	public Map comment_more(CommentVo cvo, CourseVo vo, Model model,
			@RequestParam(value = "crsNum", required = false) int crsNum,
			@RequestParam(value = "commentMore", required = false) String commentMore) {
		CourseServiceImpl service = new CourseServiceImpl();
		List<CommentVo> commentList = new ArrayList();
		vo.setCrsNum(crsNum);
		Map result = new HashMap();
		try {
			commentList = service.commentAllMore(vo);
			System.out.println(commentList.get(0).getContext());
		} catch (Exception e) {
			e.printStackTrace();
		}
		result.put("result", commentList);
		return result;
	}

	@RequestMapping(value = "/course-detail", method = RequestMethod.GET)
	public String makeCourse(CourseVo vo, CoursePosesVo cpvo, UserVo uv, FeedVo fv, HttpServletRequest req,
			RedirectAttributes rttr, Model model, @RequestParam("crsNum") int crsNum, HttpServletResponse res) throws Exception {
		UserAuthCheck.loginCheck(req, res, model);
		CourseServiceImpl service = new CourseServiceImpl();
		LikeServiceImpl lservice = new LikeServiceImpl();
		int totalTime = 0;
		int totalMin = 0;
		int totalSec = 0;
		UserVo uvo= (UserVo)req.getSession().getAttribute("user");
		model.addAttribute("user",uvo);
		
		vo = new CourseVo();
		cpvo = new CoursePosesVo();

		vo.setCrsNum(crsNum);
		model.addAttribute("crsNum", crsNum);
		
		DBCollection courseDB = mongoDBf.getCollection("COURSE");
		BasicDBObject myQuery = new BasicDBObject("_id", crsNum);
		BasicDBObject field = new BasicDBObject("keyword", 1);
		DBCursor Cursor = courseDB.find(myQuery, field);
		DBObject myobj = Cursor.next();
		List<String> myList = (List<String>) myobj.get("keyword");
		String keyword =myList.get(0);
		if(myList.size()>1) {
			keyword+=", "+myList.get(1);
		}
		if(keyword.equals("")) {
			keyword="해쉬태그 없음";
		}
		model.addAttribute("keyword",keyword);
		
		CourseVo course;
		CoursePosesVo cpv;
		List<CommentVo> commentList;
		List<CommentVo> reviewList;
		int cmc;
		double cmavg;
		int userCount;
		DiffiVo dv;
		String diffi;

		try {

			dv = service.courseDiffi(vo);
			model.addAttribute("diffi", dv);

			int[] diffiArr = { Integer.parseInt(dv.getDiff1()), Integer.parseInt(dv.getDiff2()),
					Integer.parseInt(dv.getDiff3()), Integer.parseInt(dv.getDiff4()), Integer.parseInt(dv.getDiff5()),
					Integer.parseInt(dv.getDiff6()), Integer.parseInt(dv.getDiff7()), Integer.parseInt(dv.getDiff8()) };
			int sum = 0;
			double totalDiffi = 0;
			String difficulty = "";
			for (int i = 0; i < diffiArr.length; i++) {
				sum += diffiArr[i];
				// System.out.println(sum);
				totalDiffi = sum / 8;
				if (totalDiffi < 2) {
					diffi = "쉬움";
				} else if (totalDiffi > 2 || totalDiffi < 4) {
					diffi = "보통";
				} else {
					diffi = "어려움";
				}
				difficulty = diffi;
			}

			model.addAttribute("difficulty", difficulty);

			userCount = service.userCount(vo);
			model.addAttribute("userCount", userCount);

			uv = service.makerInfo(vo);
			model.addAttribute("makerInfo", uv);

			course = service.selectOne(vo);
			model.addAttribute("course", course);

			cpv = service.coursePoses(vo);
			model.addAttribute("coursePoses", cpv);

			int[] timeArr = { Integer.parseInt(cpv.getTime1()), Integer.parseInt(cpv.getTime2()),
					Integer.parseInt(cpv.getTime3()), Integer.parseInt(cpv.getTime4()),
					Integer.parseInt(cpv.getTime5()), Integer.parseInt(cpv.getTime6()),
					Integer.parseInt(cpv.getTime7()), Integer.parseInt(cpv.getTime8()) };

			ArrayList mins = new ArrayList();
			ArrayList seconds = new ArrayList();
			String minute;
			String second;

			for (int i = 0; i < timeArr.length; i++) {
				int min = timeArr[i] / 60;
				int sec = timeArr[i] % 60;

				if (min < 10) {
					minute = "0" + Integer.toString(min);
				} else {
					minute = Integer.toString(min);
				}
				if (sec < 10) {
					second = "0" + Integer.toString(sec);
				} else {
					second = Integer.toString(sec);
				}

				mins.add(minute);
				seconds.add(second);
			}
			model.addAttribute("mins", mins);
			model.addAttribute("seconds", seconds);

			totalTime = Integer.parseInt(cpv.getTime1()) + Integer.parseInt(cpv.getTime2())
					+ Integer.parseInt(cpv.getTime3()) + Integer.parseInt(cpv.getTime4())
					+ Integer.parseInt(cpv.getTime5()) + Integer.parseInt(cpv.getTime6())
					+ Integer.parseInt(cpv.getTime7()) + Integer.parseInt(cpv.getTime8());

			totalMin = totalTime / 60;
			totalSec = totalTime % 60;

			model.addAttribute("totalMin", totalMin);
			model.addAttribute("totalSec", totalSec);

			commentList = service.commentAll(vo);
			model.addAttribute("commentList", commentList);

			cmc = service.commentCount(vo);
			model.addAttribute("cmc", cmc);

			cmavg = service.commentAvg(vo);
			model.addAttribute("cmavg", cmavg);

			reviewList = service.reviewAll(vo);
			model.addAttribute("reviewList", reviewList);
			
			int likeFlag = 0;
			LikeVo lvo = new LikeVo();
			lvo.setCrsNum(crsNum);
			lvo.setuNum(uvo.getuNum());
			likeFlag = lservice.likeOrNot(lvo);
			System.out.println(likeFlag);
			if (likeFlag == 1) {
				model.addAttribute("like", "fas fa-heart");
			} else {
				model.addAttribute("like", "far fa-heart");
			}

		} catch (Exception e) {
			System.out.println("[CourseController /  makeCourse]" + e.toString());
		}

		return "course-detail";

	}

}
