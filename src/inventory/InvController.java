package inventory;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Date;

import java.io.IOException;

public class InvController implements Controller{

	protected final Log logger = LogFactory.getLog(getClass());
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String now = (new Date()).toString();
	        logger.info("Returning hello view with " + now);

	        return new ModelAndView("Invstart.jsp", "now", now);	
		
	}

}
