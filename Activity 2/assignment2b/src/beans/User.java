package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class User 
{
	private String firstName = "Branden";
	private String lastName = "McNeill";
	
	/*
	public User() 
	{
		this.firstName = "Branden";
		this.lastName = "McNeill";
	}
	*/

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	/*
	 * These will be the setters and getters for the 
	 * First and Last name that was just set.
	 */
}
