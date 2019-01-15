
package book;


public class Book {

	final String title;
	final int releaseYear;
	int copiesSold;
	
	Book(String t, int r) {
		title = t;
		releaseYear = r;
	}
	
	void sell(int nrCopies) {
		copiesSold += nrCopies;
	}
	
	int nrCopiesSold() {
		return copiesSold;
	}
	
	public static void main(String[] args) {
		Book firstBook = new Book("First Book", 2004);
		Book secondBook = new Book("Another Book", 2014);
		firstBook.sell(200);
		System.out.println("Number of copies sold of first book is now: "
			+firstBook);
		System.out.println("Title of the second book is: "+secondBook.title);
	}
}


