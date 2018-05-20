package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCheckBoxData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetCheckBoxData() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// set response head
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String title = "read all checkboxdatas";
		out.println("<!DOCTYPE html>" + "<head>" + "<meta charset='UTF-8'>" + "<title>" + title + "</title>" + "</head>"
				+ "<body>"+"<table>");
		// get web parameters Names(runoob.google,taobao)其中被checked的会被传过来
		Enumeration paramNames = request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			// 获取参数集合中的下一个单个参数名
			String paramName = (String) paramNames.nextElement();
			out.print("<tr><td>" + paramName + "</td>\n");
			// 根据参数名字获取参数值(value属性)
			String[] paramValues = request.getParameterValues(paramName);
			// 读取单个值的数据
			if (paramValues.length == 1) {
				String paramValue = paramValues[0];
				if (paramValue.length() == 0)
					out.println("<td><i>没有值</i></td>");
				else
					out.println("<td>" + paramValue + "</td>");
			}
			// 读取多个值的数据
			else
			{
			out.println("<td><ul>");
			for (int i = 0; i < paramValues.length; i++) {
				out.println("<li>" + paramValues[i]);
			}
			out.println("</ul></td>");
			}
			out.print("</tr>");
		}
		out.println("\n</table>\n</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
