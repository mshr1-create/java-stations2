import java.util.Objects;

public class User {
    int id;
    String name;
    String email;
    
    public boolean equals(Object other) {
    	if(!(other instanceof User)) {
    		return false;
    	}
    	User user = (User) other;
    	return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }
    
    public int hashCode() {
    	return Objects.hash(id, name, email);
    }
    
}