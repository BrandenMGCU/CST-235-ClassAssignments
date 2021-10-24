package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User 
{
	@NotNull(message = "Please enter a first name with 5 or more letters!")
	@Size(min=5, max=15)
	private String firstName = "";
	
	@NotNull(message = "Please enter a last name with 5 or more letters")
	@Size(min=5,max=15)
	private String lastName = "";
	
	public User() 
	{
		this.firstName = "Branden";
		this.lastName = "McNeill";
	}


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
