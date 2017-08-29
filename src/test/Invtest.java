package test;
	
import junit.framework.TestCase;

import inventory.InvController;
import org.springframework.web.servlet.ModelAndView;


public class Invtest extends TestCase{
	

	public void testHandleRequest() throws Exception {
		InvController controller = new InvController();
		ModelAndView mav = controller.handleRequest(null, null);
		 assertEquals("Invstart.jsp", mav.getViewName());
		 assertNotNull(mav.getModel());
	        String nowValue = (String) mav.getModel().get("now");
	        assertNotNull(nowValue);
	}

}
