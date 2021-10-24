package controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController 
{
	/*
	 * This is used to call the test methods 
	 * from either A.O.B.S or O.B.S
	 */
	@Inject
	OrdersBusinessInterface service;
	
	@EJB
	MyTimerService timer;
	
	//onSubmit Button Code
	public String onSubmit(User user) 
	{
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.getExternalContext().getRequestMap().put("user", user);
		
		//Call Business Service (Test Which Call FROM AOBS or OBS)
		service.test();
		
		//This will call the Timer Service (Test Programmic Timer)
		timer.setTimer(10000);
		
		return "TestResponse.xhtml";
	}
	
	//Get and Return Service from OrdersBusinessInterface 
	public OrdersBusinessInterface getService()
	{
		return service;
	}
	
	
	
	//onFlash Button Code
	public String onFlash(User user) 
	{
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.getExternalContext().getFlash().put("user", user);
		return "TestResponse.xhtml?faces-redirect=true";
	}
	
	//Return to Login Code
	public String returntologin(User user)
	{
		/*
		 * This was not needed, I can make a call to just return
		 * to the TestForm.xhtml page.
		 */
		
		/*
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.getExternalContext().getFlash().put("user", user);
		*/
		return "TestForm.xhtml";
	}
	
		/*
		 * This is saying when we click onSubmit
		 * give us the TestResponse Page.
		 * 
		 * When we click onFlash give us the Test Response 2 page.
		 */
}
