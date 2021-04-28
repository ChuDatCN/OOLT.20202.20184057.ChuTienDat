package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.disc.DigitalVideoDisc;


public class TestMediaCompareTo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"Fox","Eladin","Animation",90,30);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"WB","AMatrix","Fiction",160,40);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Disney","Troll","Drama",150,23);
		// TODO Auto-generated constructor stub
		java.util.Collection collection = new java.util.ArrayList();
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		java.util.Iterator iterator = collection.iterator();
		System.out.println( "The DVD sorted" );
		while(iterator.hasNext()) {
			((DigitalVideoDisc)iterator.next()).print();
			System.out.println();
		}
		java.util.Collections.sort((java.util.List)collection);
		
		
	}
	
}
