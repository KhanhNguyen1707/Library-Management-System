package model;


import java.util.ArrayList;

/**
 *
 * @author Asus
 */

public class LMSModel {
    private ArrayList<Book> Booklist;
    private String FileName;

    public LMSModel() {
        this.Booklist = new ArrayList<Book>();
        this.FileName="";
    }

    public LMSModel(ArrayList<Book> Booklist) {
        this.Booklist = Booklist;
    }

    public ArrayList<Book> getBookList() {
        return Booklist;
    }

    public void setBookList(ArrayList<Book> Booklist) {
        this.Booklist = Booklist;
    }

    public void insert(Book book) {
        this.Booklist.add(book);
    }

    public void delete(Book book) {
        this.Booklist.remove(book);
    }


    public String getFileName() {
        return FileName;
    }

    public void setFileName(String FileName) {
        this.FileName = FileName;
    }
    public boolean CheckDuplicate(Book ts) {
        for(Book book: Booklist) {
            if(book.getBookID() == ts.getBookID())
                return true;
        }
        return false;
    }


}