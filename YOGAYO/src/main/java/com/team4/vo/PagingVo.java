package com.team4.vo;

public class PagingVo {
	
	private int totalCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	private int displayPageNum = 10;
	
	private CourseVo criteria;
	
	public void setCourse(CourseVo criteria) {
		this.criteria = criteria;
	}
	
//	public void setTotalCount(int totalCount) {
//		this.totalCount = totalCount;
//		calcDate();
//	}
	
//	private void  calcDate() {
//		endPage = (int)(Math.ceil(criteria.getPage()/(double) displayPageNum)*displayPageNum);
//		startPage = (endPage - displayPageNum) +1;
//		
//	}
//	
	


}
