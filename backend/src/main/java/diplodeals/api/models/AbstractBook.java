package diplodeals.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbstractBook {
    @JsonProperty("_id")
    private String id;

    private String title;

    private double price;

    private String isbn;

    private String author;

    private String edition;

    private String publisher;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public void getIsbn() { return isbn; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public void getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public void getEdition() { return edition; }

    public void setEdition(String edition) { this.edition = edition; }

    public void getPublisher() { return publisher; }

    public void setPublisher(String publisher) { this.publisher = publisher; }

}