package listeners;

import java.io.InputStream;
import java.util.Properties;

import database.DBConnection;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


//@WebListener
public class DBListener implements ServletContextListener {

	public DBListener() {

	}
// local db
	public void contextInitialized(ServletContextEvent sce) {

		ServletContext context = sce.getServletContext();

		String url = context.getInitParameter("DBUrl");
		String user = context.getInitParameter("DBUser");
		String pass = context.getInitParameter("DBPass");
		 

		DBConnection.initialize(url, user, pass);
		
	}

	
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

}
