

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveData")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empId=Integer.parseInt(request.getParameter("EmpId"));
		String empName=request.getParameter("EmpName");
		int empSal=Integer.parseInt(request.getParameter("Sal"));
		String address[]=request.getParameterValues("Address");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("ShowDetailsServlet");
		request.setAttribute("arg1", EmpId);
		request.setAttribute("arg2", EmpName);
		request.setAttribute("arg3", Sal);
		request.setAttribute("arg4", Address);
		
		dispatcher.forward(request,response);
		
		
	}

}
