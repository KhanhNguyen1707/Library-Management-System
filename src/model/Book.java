package model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Asus
 */
public class Book implements Serializable {
    private int BookID, BookPrice;
    private String BookName, BookAuthor, BookType;

    public Book() {
    }

    public Book(int BookID, String BookName, String BookAuthor, String BookType, int BookPrice) {
        this.BookID = BookID;
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.BookType = BookType;
        this.BookPrice = BookPrice;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String BookAuthor) {
        this.BookAuthor = BookAuthor;
    }

    public String getBookType() {
        return BookType;
    }

    public void setBookType(String BookType) {
        this.BookType = BookType;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int BookPrice) {
        this.BookPrice = BookPrice;
    }

    @Override
    public String toString() {
        return "Book[" + "BookID=" + BookID + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", BookType=" + BookType + ", BookPrice=" + BookPrice + ']';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.BookID;
        hash = 59 * hash + Objects.hashCode(this.BookName);
        hash = 59 * hash + Objects.hashCode(this.BookAuthor);
        hash = 59 * hash + Objects.hashCode(this.BookType);
        hash = 59 * hash + Objects.hashCode(this.BookPrice);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.BookID != other.BookID) {
            return false;
        }
        if (!Objects.equals(this.BookName, other.BookName)) {
            return false;
        }
        if (!Objects.equals(this.BookAuthor, other.BookAuthor)) {
            return false;
        }
        if (!Objects.equals(this.BookType, other.BookType)) {
            return false;
        }
        return Objects.equals(this.BookPrice, other.BookPrice);
    }

}


