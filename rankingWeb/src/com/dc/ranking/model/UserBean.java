package com.dc.ranking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserBean 
{
	/* ********* */
	/* ATRIBUTOS */
	/* ********* */

	/**
	 * 
	 */
	@Id
    private String email;	
	
	/**
	 * 
	 */
    private String firstName;

    /**
     * 
     */
    private String lastName;
    
    /**
     * 
     */
    private String password;


	/* *********** */
	/* CONSTRUCTOR */
	/* *********** */
    
    public UserBean()
    {
    	
    }
    
	/* ******* */
	/* METHODS */
	/* ******* */

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
    
}
