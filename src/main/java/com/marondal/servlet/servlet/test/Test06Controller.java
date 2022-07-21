package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class Test06Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		
		// 두개의 수를 전달 받아서 
		// 더하기 빼기 곱하기 나누기 연산을 한다. 
		// 그결과를 json으로 response에 작성한다. 
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		int plus = number1 + number2;
		int minus = number1 - number2;
		int multi = number1 * number2;
		int div = number1 / number2;
		
		// {"addtion":10, "subtraction":5, "multiplication":25, "division":1}
		
		out.println("{\"addtion\":" + plus + ", \"subtraction\":" + minus + ", \"multiplication\":" + multi +", \"division\":" + div + "}");
		
	}

}
