package shop.myaspect.admin;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class AdminLoginCheck {

	public boolean adminloginCheck(HttpServletRequest request, HttpServletResponse response) throws Throwable{
		
		HttpSession session = request.getSession();
		if(session.getAttribute("id")==null) {
			response.sendRedirect("adminLogin");
			return true;
		}else {
			return false;
		}
	}
}
