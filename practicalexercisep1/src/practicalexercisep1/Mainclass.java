package practicalexercisep1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ArrayList<Book1> booklist=new ArrayList<Book1>();
	     ArrayList<User1> userslist=new ArrayList<User1>();
	     Book1 book =new Book1();
	     User1 user=new User1();
	     Calculate total=new Calculate();
	     int a=0;
			do { System.out.println("************Welcome***********");
			    System.out.println("Choose from the following options");
			    System.out.println("1: add book ");
			    System.out.println("2: delete book ");
			    System.out.println("3: add user");
			    System.out.println("4: delete user");
			    System.out.println("5: total price");
			    System.out.println("6: exit");
			    
			    Scanner s = new Scanner( System.in );
			    a = s.nextInt();

			    switch(a) 
			    {case 1:{ 
			    	System.out.println("insert the id of the book you want to add");
		    	    Scanner sc = new Scanner( System.in );
		    	    int idBook = sc.nextInt();
		    	    book.addbook(book, idBook);
		    	    break;}
			    case 2:{
			    	System.out.println("insert the id of the book you want to delete");
		    	    Scanner sc = new Scanner( System.in );
		    	    int idBook = sc.nextInt();
		    	    book.deletebook(book, idBook);
			    
			    break;}
			    case 3 :{
			    	System.out.println("insert the id of the user you want to add");
		    	    Scanner sc = new Scanner( System.in );
		    	    int id = sc.nextInt();
		    	    user.adduser(user, id);			    
			    break;}
			    
			    case 4 :{
			    	System.out.println("insert the id of the user you want to delete");
		    	    Scanner sc = new Scanner( System.in );
		    	    int id = sc.nextInt();
		    	    user.deleteuser(user, id);			    
			    break;}
			    case 5 :{
			    	System.out.println("insert the quantity you want");
		    	    Scanner sc = new Scanner( System.in );
		    	    int quantity = sc.nextInt();
		    	    System.out.println("insert the quantity you want");
		    	    Scanner sc1 = new Scanner( System.in );
		    	    double pricebook = sc1.nextDouble();
		    	    total.CalculateTotalPrice(quantity, pricebook);
			    break;}
			    case 6:{
			    	System.out.println("Thank you");
			     break; }
			    }}
			    while(a!=6);
			    }
			    }
	

			
	

	
			    


