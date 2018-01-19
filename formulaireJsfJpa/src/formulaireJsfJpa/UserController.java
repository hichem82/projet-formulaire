package formulaireJsfJpa;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class UserController implements Serializable {

	//private static final long serialVersionUID = 1L;

	private User            user;

	public UserController() {
		super();
		user = new User();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public String show() {
		
		System.out.println(user.getEmail() + " " + user.getPassword());
		return "affiche";
		
	}
    
    
}
