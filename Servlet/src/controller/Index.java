package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Index extends HttpServlet {
 
	private static final long serialVersionUID = 1L;

public void init() throws ServletException
  {
      
     // message = "Hello World";
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      
	  // 设置响应内容类型
      /*response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();   
      out.println(
    		  "<html>"
    		  + "<head>"
    		  + "</head>"
    		  + "<body>"
    		  + "<form action='getFormData' method='GET'>"
    		  + "<input type='text' name='name' />"
    		  + "<input type='submit' />"
    		  + "</form>"
    		  + "<a href='checkbox.html'>获取复选框数据</a> "
    		  + "</body>"
    		  + "</html>"
    		  );*/
	  response.sendRedirect("Index.jsp"); 
  }
  
  public void destroy()
  {
      
  }
}