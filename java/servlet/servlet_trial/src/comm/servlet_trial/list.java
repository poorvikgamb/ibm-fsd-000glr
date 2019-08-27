package comm.servlet_trial;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet_trial
 */
@WebServlet("/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<table>");
		out.println("<tr><td>title</td><td>year</td><td>season</td></tr>");
		List<League> list = new ArrayList<League>();
		list.add(new League("english premeire legue", 2015, "winter"));
		list.add(new League("la legue", 2015, "winter"));
		list.add(new League("champions legue", 2015, "winter"));
		for(League l:list)
		{
			out.println("<tr>"+
						"<td>"+l.getTitle()+"</td>"+
						"<td>"+l.getYear()+"</td>"+
						"<td>"+l.getSeason()+"</td>"+
						"</tr>");
		}
		out.println("</table>");
	}

}
