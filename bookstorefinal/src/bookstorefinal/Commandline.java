package bookstorefinal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import connetion.MyConnection;

public class Commandline {
	 private int idcmdline;
	    private int quantity;
	    
	    
	   

	public int getIdcmdline() {
			return idcmdline;
		}
		public void setIdcmdline(int idcmdline) {
			this.idcmdline = idcmdline;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

	public void addCommandline() throws ClassNotFoundException, SQLException 
    { double pricebook = 0;
    MyConnection con;
    PreparedStatement pstmt;
    con = new MyConnection();
    System.out.println("Put in the book's id ");
    Scanner sc4 = new Scanner( System.in );
    int idBook   = sc4.nextInt();
    System.out.println("Put in the quantity ");
    Scanner sc2 = new Scanner( System.in );
    int quantity   = sc2.nextInt();
  
    con = new MyConnection();	
    try {
    pstmt =  con.MyConnection().prepareStatement("SELECT * FROM Book where id = ?");
     
    pstmt.setDouble(1,idBook);
    ResultSet rs = pstmt.executeQuery();
    while (rs.next()) {
       
    	pricebook =Double.parseDouble(rs.getString("pricebook"));       
    }}
    catch(SQLException e)
    {e.printStackTrace();}
    
    pstmt =  con.MyConnection().prepareStatement("INSERT INTO `commandline`(`idcmdline`,idbook,pricebook,quantity,totprice) VALUES ( ?, ?, ?, ?,?)");
    pstmt.setNString(1,null  );
    pstmt.setInt(2, idBook );
    pstmt.setDouble(3,pricebook);
    pstmt.setInt(4, quantity );
    pstmt.setDouble(5,pricebook*quantity);
    pstmt.executeUpdate();}
    
    
    
	////////////////////////////show bill/////////////////////////////
	
		public static void totalPrice() throws ClassNotFoundException {
			double Totalprice=0;
			try {
			MyConnection con;
			PreparedStatement pstmt;
			con = new MyConnection();
			pstmt = con.MyConnection().prepareStatement("SELECT totprice FROM commandline ");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
			Totalprice += Double.parseDouble(rs.getString("totprice"));
			}
			System.out.println();
			System.out.println("total to pay "+Totalprice);
			}
			catch(SQLException e)
			{
			e.printStackTrace();
			}

		}}
