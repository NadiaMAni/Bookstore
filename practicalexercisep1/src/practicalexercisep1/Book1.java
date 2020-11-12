package practicalexercisep1;

import java.sql.Date;
import java.util.ArrayList;

public class Book1 {
	private int idBook;
	private String title;
	private String author;
	private double pricebook;
	private Date releaseDate;
	private int nbBook;
    ArrayList<Book1> booklist=new ArrayList<Book1>();
    
	public Book1() {
		super();
	}

	public Book1(String titre, String author, double pricebook, Date releaseDate, int nbBook) {
		
		this.title = title;
		this.author = author;
		this.pricebook = pricebook;
		this.releaseDate = releaseDate;
		this.nbBook = nbBook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public int getNbBook() {
		return nbBook;
	}

	public void setNbBook(int nbBook) {
		this.nbBook = nbBook;
	}
	
	
	public void addbook(Book1 book,int idBook)
	{
		
		if (nbBook<booklist.size() )
		booklist.add(book);
	
	}
	public void deletebook(Book1 book,int idBook)
	{
		
		if (nbBook<booklist.size() )
		booklist.remove(book);
	}
}
