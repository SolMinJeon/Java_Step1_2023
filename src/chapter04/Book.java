package chapter04;

import java.util.Scanner;

public class Book {
	
	public String bookname;
	public String author;
	
	Scanner sc = new Scanner(System.in);
	
	//디폴트 생성자
	public Book() {
	}
	
	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	}
	
	
	
	//---------------------------------------------
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//-------------------------------------------------
	
	//사용자 정의
	public void showBookinfo() {
		System.out.println("책이름 : " + bookname + " | 저자 : " + author);
	}
	
	public void inputb(String bookname) {
		this.bookname = sc.next();
	}
	
	public void inputa(String author) {
		this.author = sc.next();
	}
	
	

}
