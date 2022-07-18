/**
 * 
 */
package com.river.bend.iclinic.models;


import java.util.Base64;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author asshaik
 *
 */

@Document("baseauth")
public class BaseAuth {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String email;
    private String password;

    public BaseAuth(String id, String email, String password) {

        this.id = id;
        this.email = email;
        Base64.Encoder encoder = Base64.getUrlEncoder();  
        String encPassword = encoder.encodeToString(password.getBytes()); 
        System.out.println("-------password is-------------");
        System.out.println(encPassword);
        this.password = encPassword;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sample{");
        sb.append("id=").append(id);
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }


	@Override
	public int hashCode() {
		return Objects.hash(email, id, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseAuth other = (BaseAuth) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

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