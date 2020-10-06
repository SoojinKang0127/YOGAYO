package com.team4.util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.team4.vo.UserVo;

public class UserAuthCheck {

	public static void loginCheck(HttpServletRequest req, HttpServletResponse res, Model model) {
		HttpSession session = req.getSession();
		Object user = session.getAttribute("user");
		model.addAttribute("user", (UserVo) user);
		if (user == null) {
			String errMessage = "로그인 후 이용이 가능합니다.";
			model.addAttribute("errMessage", errMessage);
			req.setAttribute("errMessage", errMessage);
			RequestDispatcher rd = req.getRequestDispatcher("/login");
			try {
				rd.forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
	
	public static void sendToMainView(HttpServletRequest req, HttpServletResponse res, Model model) {
		HttpSession session = req.getSession();
		Object user = session.getAttribute("user");
		model.addAttribute("user", (UserVo) user);
		if (user != null) {
			try {
				res.sendRedirect("main");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
