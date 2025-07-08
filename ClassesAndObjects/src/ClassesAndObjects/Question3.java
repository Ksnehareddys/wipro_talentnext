package ClassesAndObjects;

import java.util.Scanner;

class Author {
	private String name;
	private String Email;
	private char gender;

	Author(String name, String Email, char gender) {
		this.name = name;
		this.Email = Email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return Email;
	}

	public char getGender() {
		return gender;
	}

	
}

class Book {
	String name;
	Author author;
	double price;
	int qtyInStock;

	Book(String name, Author author, int qtyInStock, double price) {
		this.name = name;
		this.author = author;
		this.qtyInStock = qtyInStock;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getqtyInStock() {
		return qtyInStock;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setqtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}

// Move Question3 class OUTSIDE of Book class
public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		String email = sc.next();
		char gender = sc.next().charAt(0);

		Author author = new Author(name, email, gender);

		String bookName = sc.next();
		int qt = sc.nextInt();
		double price = sc.nextDouble();

		Book b = new Book(bookName, author, qt, price);

		System.out.println("Book Name: " + b.getName());
		System.out.println("Author Name: " + author.getName());
		System.out.println("Author Email: " + author.getEmail());
		System.out.println("Author Gender: " + author.getGender());
		System.out.println("Quantity in Stock: " + b.getqtyInStock());
		System.out.println("Price: " + b.getPrice());
	}
}