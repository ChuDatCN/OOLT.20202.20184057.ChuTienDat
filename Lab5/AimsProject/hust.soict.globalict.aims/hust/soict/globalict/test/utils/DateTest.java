package hust.soict.globalict.test.utils;
import hust.soict.globalict.aims.utils.DateUtils;
import hust.soict.globalict.aims.utils.MyDate;

public class DateTest {

	public static void main(String[] args) {
		//Date Format: dd/MM/yyyy
		MyDate[] d = new MyDate[4];
		d[0] = new MyDate("sixteenth" , "March" , "twenty hundred");
		d[1] = new MyDate("second" , "September" , "twenty nineteen");
		d[2] = new MyDate("twenty-fourth" , "January" , "twenty twenty-three");
		d[3] = new MyDate("twenty-fifth" , "February" , "twenty twenty");
		
		
		assert DateUtils.compare(d[2],d[3]) == 0 : "Wrong compare";
		DateUtils.sort(d);
		
		for (MyDate myDate : d) {
			myDate.print();
			myDate.printShort();
		}
	}
}