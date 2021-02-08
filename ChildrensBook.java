package classes;

public class ChildrensBook extends Book {

	private String author;
	private String format;
	
	public ChildrensBook() {
		super();
	}
	
	public ChildrensBook(String ISBN, String callNumber, int availNumber, int totalNumber,String bookTitle, String author, String format)  {
		super(ISBN, callNumber, bookTitle, totalNumber, availNumber);
		this.author = author;
		this.format = format;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return "ChildrensBook [author=" + author + ", format=" + format + "]";
	}
	
	
}
