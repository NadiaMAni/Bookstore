package practicalexercisep1;

import java.util.ArrayList;

public class User1 {
		
	private int id;
	private String name;
	private String lastName;
	private int nbUser;
    ArrayList<User1> userslist=new ArrayList<User1>();  
    

		public User1() {
		super();
	}

		public User1(int id, String name, String lastName) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
		
		public void adduser(User1 user,int id)
		{
			
			if (nbUser<userslist.size() )
			userslist.add(user);
		
		}
		public void deleteuser(User1 user, int id)
		{
			
			if (nbUser<userslist.size() )
			userslist.remove(user);
		
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

	

		
}
	
