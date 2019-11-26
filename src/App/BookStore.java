/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Uvini Wijesinghe
 */
public class BookStore {
    
    private int bookID;
    private String bookName;
    private String author;
    private String category;
    private double price;
    private int stock;

    public BookStore(){
        
    }
    
    public BookStore(int bookID, String bookName, String author, String category, double price, int stock) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
