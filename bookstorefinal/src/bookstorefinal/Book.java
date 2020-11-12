package bookstorefinal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connetion.MyConnection;


	public class Book {
		
		private String titre;
		private String author;
		private double pricebook;
		private Date releaseDate;


		public void addBook(String title, String author, double pricebook,Date releaseDate) throws ClassNotFoundException, SQLException
	    {
	    MyConnection con;
	    PreparedStatement pstmt;
	    con = new MyConnection();
	   
	    pstmt =  con.MyConnection().prepareStatement("INSERT INTO `book`(id,title,author,pricebook,releaseDate) VALUES (? , ?, ?, ?, ?)");
	    pstmt.setNString(1, null );
	    pstmt.setString(2, title );
	    pstmt.setString(3, author );
	    pstmt.setDouble(4,pricebook);
	    pstmt.setDate(5, releaseDate );
	    System.out.println("addition with success");
	    pstmt.executeUpdate();
	        }
	
	
	
	public void displayBook() throws ClassNotFoundException, SQLException 
       {   MyConnection con;
           PreparedStatement pstmt;
           con = new MyConnection();

    try {
    	pstmt =  con.MyConnection().prepareStatement("SELECT * FROM Book");
    
        ResultSet rs = pstmt.executeQuery();
        int i=0;
        while (rs.next()) {
        i++;
        System.out.println("Book n° "+i);
        System.out.println("id : " + rs.getString("id"));
        System.out.println("title : " + rs.getString("title"));
        System.out.println("author : " + rs.getString("author"));
        System.out.println("price : " + rs.getString("pricebook"));
        System.out.println("releaseDate : " + rs.getString("releaseDate"));
    }}
    catch(SQLException e)
    {e.printStackTrace();}  }
    
	

public void deleteBook(int id ,double quantite ) throws ClassNotFoundException, SQLException {

	         MyConnection con;
             PreparedStatement pstmt;
             con = new MyConnection();
       try {
          
           pstmt =  con.MyConnection().prepareStatement("SELECT * FROM Book where id = ?");
           pstmt.setDouble(1,id);
           ResultSet rs = pstmt.executeQuery();
           while (rs.next()) {
              
               System.out.println("CalculTotal = "+Double.parseDouble(rs.getString("pricebook"))*quantite);
              
           }}
           catch(SQLException e)
           {e.printStackTrace();}}

public void updateBook(int id,String title, String author, double pricebook,Date releaseDate) throws ClassNotFoundException, SQLException {

	 MyConnection con;
     PreparedStatement pstmt;
     con = new MyConnection();
     
     try {
     pstmt =con.MyConnection().prepareStatement("UPDATE book SET author = ?,title = ?,pricebook = ?,releasedate = ? WHERE id = ?");
     pstmt.setString(1, author );
     pstmt.setString(2, title );
     pstmt.setDouble(3,pricebook);
     pstmt.setDate(4, releaseDate);
     pstmt.setInt(5, id );

          pstmt.executeUpdate();
          System.out.println("updated succefully");}
     catch(SQLException e)
     {e.printStackTrace();}
}



public String getTitre() {
	return titre;
}



public void setTitre(String titre) {
	this.titre = titre;
}



public String getAuthor() {
	return author;
}



public void setAuthor(String author) {
	this.author = author;
}



public double getPricebook() {
	return pricebook;
}



public void setPricebook(double pricebook) {
	this.pricebook = pricebook;
}



public Date getReleaseDate() {
	return releaseDate;
}



public void setReleaseDate(Date releaseDate) {
	this.releaseDate = releaseDate;
}

	}
	
	
	
	
