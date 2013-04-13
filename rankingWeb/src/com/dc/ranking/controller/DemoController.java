package com.dc.ranking.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController 
{
	/* ================== */
	/* VARIABLES DE CLASE */
	/* ================== */
	private static final Logger log = Logger.getLogger(DemoController.class.getName());
	
	/* ================ */
	/* MÉTODOS DE CLASE */
	/* ================ */
	
    @RequestMapping(value="/trenes.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException 
    {
    	ModelAndView mav = new ModelAndView("trenes");
    	
		mav.addObject("trenes", "Mensaje de prueba");
		
		log.info("TrenesController name: " + "Mensaje de prueba");
 
		return mav;
    }		
}
