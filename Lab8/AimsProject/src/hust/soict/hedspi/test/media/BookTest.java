package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.book.Book;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book(8,"University", "Drama", 712.2f);
		b1.setContent("Xin chao!!!");
 		System.out.println(b1.getContent());
 		System.out.println(b1.getContentTokens());
		System.out.println("========================================");
		System.out.println(b1.toString());
		}

}