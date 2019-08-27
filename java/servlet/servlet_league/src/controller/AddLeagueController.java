package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.MyConnectionFactory;
import model.League;

@WebServlet("/add_league.do")
public class AddLeagueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String title,season,year;
       private int iYear;
       private List<String> errMsgs;

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				doProcess(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException, SQLException
	{
		errMsgs = new LinkedList<String>();
		season = request.getParameter("season");
		if(season.equals("unkown"))
		{
			errMsgs.add("please enter a valid title");
		}
		year = request.getParameter("year");
		try {
			iYear = Integer.parseInt(year);
		} catch (Exception e) {
			errMsgs.add("year must be numeric");
		}
		title = request.getParameter("title");
		if(title.toString().length()<5)
		{
			errMsgs.add("title should more than 5 characters");
		}
		
		if(errMsgs.isEmpty())
		{
			request.setAttribute("SUCCESS", new League(title,season,iYear));
			Connection connection = MyConnectionFactory.getMySqlConnection();
			PreparedStatement pst = connection.prepareStatement("insert into league(title,season,year,uid) value(?,?,?,?)");
			pst.setString(1, title);
			pst.setString(2, season);
			pst.setInt(3, iYear);
			pst.setInt(4,League.serialVersionUID++ );
			pst.executeUpdate();
			RequestDispatcher view = request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
		else
		{
			request.setAttribute("ERROR", errMsgs);
			RequestDispatcher view = request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
	}

}
