package com.ssafy.cookie;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/make")
public class MakeCookieServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		String value = req.getParameter("value");
		System.out.println(key);
		
		// 쿠키 생성
		Cookie cookie = new Cookie(key, value);
		
		// 유효시간 결정
		cookie.setMaxAge(60); // 1분
		
		// 쿠키 삭제
//		cookie.setMaxAge(0);
		
		resp.addCookie(cookie);
		
		resp.sendRedirect(req.getContextPath()+"/02_CookieResult.jsp");
	}
}
