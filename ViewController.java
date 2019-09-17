
package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * @author yogesh
 *
 */
public class ViewController implements Controller {

	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Date d=null;
		d=new Date();
		return new ModelAndView("home", "richa",d);
		
	}
	
	
	public void m1(){
		
	}

}
