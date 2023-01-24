package servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/oldmunk")
public class Akshay extends HttpServlet {

	public Akshay() {

		System.out.println("running  hareesha " + getClass().getSimpleName());

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("create goget");
		String name = "Samsung";
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(name);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post created");
		String data = "Akshay Joshi";
		PrintWriter Writer = resp.getWriter();
		Writer.print(data);
		resp.setContentType("text/plain");

	}
	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete created");
		String data = "shubhamr̥r̥";
		PrintWriter Writer = resp.getWriter();
		Writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete created");
		String data = "Hareesha ";
		PrintWriter Writer = resp.getWriter();
		Writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("Delete created");
		String data = "Eclipse ";
		PrintWriter Writer = resp.getWriter();
		Writer.print(data);
		resp.setContentType("text/plain");
		
	}

}
