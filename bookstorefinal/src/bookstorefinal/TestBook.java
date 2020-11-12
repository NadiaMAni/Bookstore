package bookstorefinal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import connetion.MyConnection;

public class TestBook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME TO BOOKSOTRE");
		
		Commandline cmdl= new Commandline();
		Book book=new Book();
		User user=new User();
		int a=0;
		do {
		    System.out.println("Choose from the following options");
		    System.out.println("1: add book ");
		    System.out.println("2: update book ");
		    System.out.println("3: display books");
		    System.out.println("4: total price");
		    System.out.println("5: total bill");
		    System.out.println("6: delete book ");
		    System.out.println("7: add user ");
		    System.out.println("8: display users list ");
		    System.out.println("9: Exit ");
		    
		    Scanner s = new Scanner( System.in );
		    a = s.nextInt();

		    switch(a) 
		    {case 1:{ 
		    	System.out.println("***********ADD BOOK*************");
		    	   System.out.println("Put  the book's id you want to add ");
		    	    Scanner sc9 = new Scanner( System.in );
		    	    int id   = sc9.nextInt();
		    	    
		    	    
		    	    System.out.println("title of the book you want to add");
		    	    Scanner sc = new Scanner( System.in );
		    	    String title   = sc.nextLine();
		    	    System.out.println(" name of it's author ");
		    	    Scanner sc1 = new Scanner( System.in );
		    	    String author   = sc1.nextLine();
		    	    System.out.println(" the book's price ");
		    	    Scanner sc3 = new Scanner( System.in );
		    	    Double pricebook = sc3.nextDouble();
		    	    System.out.println("insert date yyyy-mm-dd");
		    	    Scanner sc5 = new Scanner( System.in );
		            String d=sc5.next();
		            java.sql.Date releaseDate=java.sql.Date.valueOf(d);
		    	    book.addBook(title, author, pricebook, releaseDate);
		    	
		    	break;}
		    case 2:{ 
		      System.out.println("***********UPDATE BOOK*************");
		      System.out.println("Put  the book's id you want to update ");
		      Scanner sc9 = new Scanner( System.in );
		      int id = sc9.nextInt();
		  
		      System.out.println(" title ");
		   	  Scanner sc = new Scanner( System.in );
              String title   = sc.nextLine();
		      System.out.println(" author ");
		      Scanner sc1 = new Scanner( System.in );
		      String author   = sc1.nextLine();
		      System.out.println(" price ");
		      Scanner sc3 = new Scanner( System.in );
		      Double pricebook   = sc3.nextDouble();
		      System.out.println("insert date yyyy-mm-dd");
              Scanner sc5 = new Scanner( System.in );
              String d=sc5.next();
              java.sql.Date releaseDate=java.sql.Date.valueOf(d);
//		      Date releaseDate = new Date(11-12-1997);
		      book.updateBook(id, title,author, pricebook, releaseDate);
		  break;}
		    case 3:{ 
			    System.out.println("***********ShOW BOOK*************");

		    	book.displayBook();
		     break; }
		    case 4:{ 
		    	System.out.println("***********TOTAL COST*************");
		    	int k=0;
                do    
                {        
                 cmdl.addCommandline();
                 System.out.println("If you wanna exit press 2 ");
                 Scanner sc2 = new Scanner( System.in );
                  k = sc2.nextInt();
                  }
             
             while(k!=2);
         break;}
		    case 5:
		    {
		   System.out.println("the total bill is");
		    cmdl.totalPrice();
		    break;}
		   	   	               
		    
		    case 6:{ 
		    	System.out.println("***********DELETE BOOK*************");
		    System.out.println("insert the id of the book that you want to delete");		    
			Scanner sc8 = new Scanner( System.in );
			int id  = sc8.nextInt();
		    System.out.println("Put Quantity ");		    
		    Scanner sc7 = new Scanner( System.in );
		    Double quantite  = sc7.nextDouble();
		    book.deleteBook(id, quantite);
		    break;}
		    case 7:{
		    	System.out.println("***********ADD USER*************");
		    	user.adduser();
		    	break;}
		    case 8:{
		    	System.out.println("***********USERS LIST*************");
		    	user.listuser();
		    	break;
		    }
		    case 9:{
		    	MyConnection con;
		    	PreparedStatement pstmt;
		    	con = new MyConnection();
		    	try {
		    	pstmt = con.MyConnection().prepareStatement("TRUNCATE TABLE commandline ");


		    	pstmt.executeUpdate();
		    	System.out.println("a la prochaine");
		    	}
		    	catch(SQLException e)
		    	{e.printStackTrace();}
		    	break;}
		    	
		    	
		    
		   
		    	
		 //   System.out.println("Exit");
		    }	  
		
		}
		while(a!=6);
}}