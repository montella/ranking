package com.dc.ranking.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dc.ranking.dao.UserDao;
import com.dc.ranking.dao.impl.UserDaoImpl;
import com.dc.ranking.model.UserBean;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;

@Controller
public class DemoController 
{
	/* ================== */
	/* VARIABLES DE CLASE */
	/* ================== */
	
	private static final Logger log = Logger.getLogger(DemoController.class.getName());
	
	public UserDao userDao;
	
	@Autowired private ObjectifyFactory objectifyFactory;
	
	/* ================ */
	/* MÉTODOS DE CLASE */
	/* ================ */
	
    @RequestMapping(value="/demo.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException 
    {
    	ModelAndView mav = new ModelAndView("login");
    	
    	int numAleatorio = (int) (Math.random()*4+1);
    	
    	UserBean userBean = new UserBean();
    	userBean.setEmail("carlos@gmail.com");
    	userBean.setFirstName("Carlos");
    	userBean.setLastName("Córdoba");
    	userBean.setPassword("Carlos");
    	
    	// Grabo
		Objectify ofy = objectifyFactory.begin();
		ofy.save().entity(userBean).now();
		
		// Recupero
	    ofy.load().type(UserBean.class);
	    List<UserBean> users = ofy.load().type(UserBean.class).list();		
    	
		mav.addObject("users", users);
		
		log.info("TrenesController name: " + "Mensaje de prueba");
 
		return mav;
    }		
}
