public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    public Book(String n, Author[] a, double p) {
        this.name = n;
        this.authors = a;
        this.price = p;
    }

    public Book(String n, Author[] a, double p, int q) {
        this.name = n;
        this.authors = a;
        this.price = p;
        this.qty = q;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setQty(int q) {
        this.qty = q;
    }

    public String toString() {
        String authorDetails = "{";
        for (int i = 0; i < authors.length; i++) {
            authorDetails += authors[i].toString();
        }
        authorDetails += "}";

        return "Book[name=" + name +
                ", authors=" + authorDetails +
                ", price=" + price +
                ", qty=" + qty +
                "]";
        }

    public String getAuthorsNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length; i++) {
            authorNames += authors[i].getName() + " ";
        }
        return authorNames;
    }

}
