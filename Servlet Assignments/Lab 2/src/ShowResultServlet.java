

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowResultServlet")
public class ShowResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int op1=(Integer)request.getAttribute("arg1");
		int op2=(Integer)request.getAttribute("arg2");
		
		String addt=(String)request.getAttribute("arg3");
		String subt=(String)request.getAttribute("arg4");
		String mult=(String)request.getAttribute("arg5");
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher dispatcher=request.getRequestDispatcher("operation.html");
		
		dispatcher.include(request, response);
		
		out.println("<html><body>");
		if(addt != null)
	    {    
	      out.println("<h3> Addition is: "+(op1+op2)+ "</h3>");
	    }			                         
	    else if(subt != null)
	    { 
	      out.println("<h3> Subtraction is "+(op1-op2)+ "</h3>");                      
	    }
	    else if(mult != null)
	    { 
	      out.println("<h3> Multiplication is "+(op1*op2)+ "</h3>");                      
	    }
		out.println("</body></html>");
				
		
		out.close();
	}

		
	}
