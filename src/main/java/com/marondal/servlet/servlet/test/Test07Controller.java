package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class Test07Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 주소, 카드, 가격
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		
		out.println("<html><head><title>배달의민족</title></head><body>");
		
		// 서울시가 아닌경우 배달 불가 지역
		if(!address.contains("서울시")) {
			out.println("<h1>배달불가지역 입니다</h1>");
		} else if(card.equals("신한카드")) { // 신한카드인경우 결제 불가 카드
			out.println("<h1>결제불가 카드입니다.</h1>");
		} else {
			out.println("<h2>" + address + " 배달 준비중</h2> <hr>");
			out.println("결제금액 : " + price + "원");
		} // 정상경우
		
		out.println("</body></html>");
		
		
		
	}

}
