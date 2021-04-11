package Exam10;

public class WebSearchItem {
	private String authors = null;
	private String contents = null;
	private String datetime = null;
	private int price = 0;
	private int sale_price = 0;
	private String isbn = null;
	private String publisher = null;
	private String status = null;
	private String thumbnail = null;
	private String title = null;
	private String translators = null;
	private String url = null;
	public WebSearchItem(String authors, String contents, String datetime, int price, int sale_price, String isbn,
			String publisher, String status, String thumbnail, String title, String translators, String url) {
		super();
		this.authors = authors;
		this.contents = contents;
		this.datetime = datetime;
		this.price = price;
		this.sale_price = sale_price;
		this.isbn = isbn;
		this.publisher = publisher;
		this.status = status;
		this.thumbnail = thumbnail;
		this.title = title;
		this.translators = translators;
		this.url = url;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDataitem() {
		return datetime;
	}
	public void setDataitem(String datetime) {
		this.datetime = datetime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSale_price() {
		return sale_price;
	}
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTranslators() {
		return translators;
	}
	public void setTranslators(String translators) {
		this.translators = translators;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "ImageItem [authors=" + authors + ", contents=" + contents + ", datetime=" + datetime + ", price="
				+ price + ", sale_price=" + sale_price + ", isbn=" + isbn + ", publisher=" + publisher + ", status="
				+ status + ", thumbnail=" + thumbnail + ", title=" + title + ", translators=" + translators + ", url="
				+ url + "]";
	}
	

}
