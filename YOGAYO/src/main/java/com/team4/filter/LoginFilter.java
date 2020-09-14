package com.team4.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team4.vo.UserVo;

public class LoginFilter implements Filter {

	
	HttpServletRequest req;
	HttpServletResponse res;
	HttpSession session;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		req= (HttpServletRequest) request;
		res= (HttpServletResponse) response;
		session=req.getSession();
		String uri= req.getRequestURI();
		System.out.println(uri);
		UserVo uvo=(UserVo)session.getAttribute("user");
		
		if(!"/test/login".equals(uri) && !"/test/".equals(uri) && !"/test/sign-up".equals(uri) && !"/test/checkDuplication".equals(uri)) {
		if(uvo==null) {
			res.sendRedirect("/test/login");
		}
		}
			chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		
	}

}
