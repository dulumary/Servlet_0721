package com.marondal.servlet.database;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.servlet.common.MysqlService;

@WebServlet("/db/test02/insert")
public class DBTest02InsertController extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 사이트 이름, url
		String site = request.getParameter("site");
		String url = request.getParameter("url");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "INSERT INTO `favorite` \r\n"
				+ "(`name`, `url`, `createdAt`, `updatedAt`) \r\n"
				+ "VALUES \r\n"
				+ "('" + site + "', '" + url + "', now(), now());";
		
		mysqlService.update(query);
		
		mysqlService.disConnect();
		
		response.sendRedirect("/db/test02.jsp");
			
	}
	
}
