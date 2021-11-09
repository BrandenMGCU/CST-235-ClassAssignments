package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	/*
	

	private void insertOrder() 
	{
	      String JdbcURL = "jdbc:mysql://127.0.0.1:8889/?user=root";  
	      String Username = "root";
	      String Password = "root";
	      String sql = "INSERT INTO testapp.Orders(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES('001122334455', 'This was inserted new', 25.0 , 100)";
	      Connection conn = null;
	      try {
				conn = DriverManager.getConnection(JdbcURL, Username, Password);
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				System.out.println("================>THE CONNECTION WORKED!");
				System.out.println("=====================>THE DATABASE IS CONNECTED!");
			}
			catch(SQLException e) {
				System.out.println("======>THERE WAS AN ISSUE WHEN CONNECTING TO THE SERVER!");
				e.printStackTrace();
			}
			finally {
				if(conn != null) {
					try {
						conn.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	
	
	/*
	 * This will be the getAllOrders method that we will use to get the orders from the DB
	 */
	
	/*
private void getAllOrders() {
		
		Connection conn = null;
		String JdbcURL = "jdbc:mysql://127.0.0.1:8889/?user=root";  
	      String Username = "root";
	      String Password = "root";
		String sql = "SELECT * FROM testapp.Orders";
		try {
			conn = DriverManager.getConnection(JdbcURL, Username, Password);
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			while(res.next()) {
				System.out.println(String.format("ID is %d for Product %s at a price of %f", res.getInt("ID"), res.getString("PRODUCT_NAME"), res.getFloat("PRICE")));
			}
			res.close();
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println("Failure!" + e);
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	*/
	
	
	
	//onSubmit Button Code
	public String onSubmit(User user) 
	{
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.getExternalContext().getRequestMap().put("user", user);
		
		/*
		 * This should call the get all orders
		 * from the testapp.Orders DB and then run the insert all orders
		 */
		//getAllOrders();
		///insertOrder();
		
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
