package com.springmvclearn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.springmvclearn.interceptor.Authority;
import com.springmvclearn.model.User;

public class RightsCheckInterceptor implements HandlerInterceptor{
	private Logger logger = Logger.getLogger(RightsCheckInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("Intercepted.....executing!");
		User u = (User) request.getSession().getAttribute("User");
		logger.debug("The login.jsp's intercepted.....");
		System.out.println("The session in authority is:" + request.getSession());
		System.out.println("Now the value of user in session in authority interceptor is:"
				+ request.getSession().getAttribute("User"));
		System.out.println("The user in sesion is:" + u);
		if (null == u) {
			request.getRequestDispatcher("/WEB-INF/views/login/login.jsp").forward(request, response);
		} else {
			return true;
		}

		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
