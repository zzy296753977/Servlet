package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetFormData extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public GetFormData()
	{
		super();
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException 
	{
		//set response head
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
		out.println(
				"<!DOCTYPE html><head><meta charset='UTF-8'><title>Insert title here</title></head>"
				+ "<body>"
				+ name		
				+ "</body>"
				+ "</html>"
						);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		doGet(request, response);
	}
}
