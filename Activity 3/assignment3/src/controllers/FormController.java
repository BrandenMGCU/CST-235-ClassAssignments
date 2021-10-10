package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped
public class FormController 
{
	//onSubmit Button Code
	public String onSubmit(User user) 
	{
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	
	//onFlash Button Code
	public String onFlash(User user) 
	{
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.getExternalContext().getFlash().put("user", user);
		return "TestResponse2.xhtml?faces-redirect=true";
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
