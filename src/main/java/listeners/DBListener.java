package listeners;

import database.DBConnection;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


//@WebListener
public class DBListener implements ServletContextListener {

	public DBListener() {

	}

	public void contextInitialized(ServletContextEvent sce) {

		ServletContext context = sce.getServletContext();

		String url = context.getInitParameter("DBUrl");
		String user = context.getInitParameter("DBUser");
		String pass = context.getInitParameter("DBPass");
		 

		DBConnection.initalize(url, user, pass);
		
//		System.out.println("url: "+url);
//		System.out.println("user: "+user);
//		System.out.println("pass: "+pass);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

}
