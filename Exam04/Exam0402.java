package Exam04;
class Book{

	private String Title; //제목
	private int Price; //가격
	private String Author; //저자
	private String Publisher; //출판사 
	private String PubDate; //출간일
	public Book(String title, int price, String author, String publisher, String pubDate) {
		super();
		Title = title;
		Price = price;
		Author = author;
		Publisher = publisher;
		PubDate = pubDate;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author, String string) {
		Author = author;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPubDate() {
		return PubDate;
	}
	public void setPubDate(String pubDate) {
		PubDate = pubDate;
	}
	@Override
	public String toString() {
		return "Book [Title=" + Title + ", Price=" + Price + ", Author=" + Author + ", Publisher=" + Publisher
				+ ", PubDate=" + PubDate + "]";
	}




}
public class Exam0402 {

	public static void main(String[] args) {
		//생성자 파라미터 --> 제목, 가격, 저자, 출판사, 출간일
		Book book = new Book("모바일 웹 퍼블리싱", 35100, "주영아", "인터프레스", "2012-12-21");
		System.out.println(book.toString());
		
		//제목 설정하기
		book.setTitle("Javascript+jQuery+Ajax 완벽가이드");
		//가격 설정하기
		book.setPrice(29700);
		//저자 설정하기
		book.setAuthor("주영아","이광호");
		//출판사 설정하기
		book.setPublisher("Interpress");
		//출간일 설정하기
		book.setPubDate("2014-11-25");
		
		System.out.println("제목: " + book.getTitle());
		System.out.println("가격: " + book.getPrice());
		System.out.println("저자: " + book.getAuthor());
		System.out.println("출판사: " + book.getPublisher());
		System.out.println("출판일: " + book.getPubDate());

	}

}
