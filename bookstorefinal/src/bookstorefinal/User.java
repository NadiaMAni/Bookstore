package bookstorefinal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import connetion.MyConnection;

public class User {
	private String name;
	private String lastName;
	private String phone;
	private String password;
	private String idUser;
	
	
		public void adduser() throws ClassNotFoundException, SQLException  
		{
		    MyConnection con;
		    PreparedStatement pstmt;
		    con = new MyConnection();
		    System.out.println(" idUser ");
		    Scanner a1 = new Scanner( System.in );
		    String idUser   = a1.nextLine();
		    System.out.println("password");
		    Scanner a2 = new Scanner( System.in );
		    String password   = a2.nextLine();
		    System.out.println(" Last Name ");
		    Scanner a3 = new Scanner( System.in );
		    String name   = a3.nextLine();
		    System.out.println(" First Name ");
		    Scanner a4 = new Scanner( System.in );
		    String lastName   = a4.nextLine();
		    System.out.println(" phone ");
		    Scanner a5 = new Scanner( System.in );
		    String phone  = a5.nextLine();
		    

		    pstmt = con.MyConnection().prepareStatement("INSERT INTO `user`(idUser,password,name,lastName,phone) VALUES (?, ?, ?, ?, ?)");
		    pstmt.setNString(1, idUser );
		    pstmt.setString(2, password );
		    pstmt.setString(3, name );
		    pstmt.setString(4,lastName);
		    pstmt.setString(5, phone );
		               System.out.println("ajout avec success");
		               pstmt.executeUpdate();}
	
public void listuser() throws ClassNotFoundException, SQLException
{
     MyConnection con;
     PreparedStatement pstmt;
     con = new MyConnection();
      pstmt = con.MyConnection().prepareStatement("SELECT * FROM user "); 
     ResultSet rs = pstmt.executeQuery();
     int i=0;
     while (rs.next()) {
         
            String idUser = rs.getString("idUser");
            String password = rs.getString("password");
            String name = rs.getString("name");
            String lastName = rs.getString("lastName");
            String phone = rs.getString("phone");
            

            System.out.print("idUser: " + idUser);
            System.out.print(", password: " + password);
            System.out.print(", name: " + name);
            System.out.print(", lastName " + lastName);
            System.out.print(", phone: " + phone);
}
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

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getIdUser() {
	return idUser;
}

public void setIdUser(String idUser) {
	this.idUser = idUser;
}

}
	


