package ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import ssm.bean.User;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object Object) throws Exception {
		StringBuffer url = request.getRequestURL();
		if (url.indexOf("/first")>0 || url.indexOf("/login/login")>0) {
			return true;
		}
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("USER");
		
		if(user!=null){
			return true;
		}
		
		request.setAttribute("msg", "µÇÂ½³É¹¦");
		request.getRequestDispatcher("/WEB-INF/jsp/firstPage.jsp").forward(request, response);
		
		return false;
		
	}

}
