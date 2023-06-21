import java.util.List;

public class Book {
  private String name;
  private List<Author> authors;
  private double price;
  private int qty;

  public Book(String name, List<Author> authors, double price){
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = 0;
  }

  public Book(String name, List<Author> authors, double price, int qty){
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String toString(){
    return "Name: " + this.name + " author: " + this.authors + " author: " + this.authors;
  }
  public String getName() {
    return name;
  }

  public List<Author> getAuthors() {
    return this.authors;
  }

  public double getPrice() {
    return price;
  }

  public int getQty() {
    return qty;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAuthor(List<Author> author) {
    this.authors = authors;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }
}
