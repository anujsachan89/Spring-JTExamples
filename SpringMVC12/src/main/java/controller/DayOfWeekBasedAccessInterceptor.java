package controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter
{
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
	//if this method returns true then - application will further handle the request
	//if this method returns false then - application will not further handle the request
	
	Calendar cal = Calendar.getInstance();
	int dayOfWeek = cal.get(cal.DAY_OF_WEEK); //getting the day on which request is made
	if(dayOfWeek==2)	//1means Sunday,2means monday,...
	{
		response.getWriter().write("the website is closed on sunday please try accessing it"+" on any other week day");
		return false;
	}
	
	
	
	return true;
}
	
	
}
