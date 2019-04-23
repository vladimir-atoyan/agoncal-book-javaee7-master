package org.agoncal.book.javaee7.chapter10.ex06;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author Antonio Goncalves
 * APress Book - Beginning Java EE 7 with Glassfish 4
 * http://www.apress.com/
 * http://www.antoniogoncalves.org
 * --
 */
@Named
@RequestScoped
public class BookController {

//    static {
//        TimeZone tz = TimeZone.getDefault();
//    }

    // ======================================
    // =             Attributes             =
    // ======================================

    @Inject
    private BookEJB bookEJB;

    private Book book = new Book();
    private Date currentDate = new Date();
    private TimeZone timeZone = TimeZone.getDefault();

    // ======================================
    // =           Public Methods           =
    // ======================================

    public String doCreateBook() {
        book = bookEJB.createBook(book);
        return "listBooks.xhtml";
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getCurrentDate() {
//        Locale locale = Locale.getDefault();
//        Date currentDate = new Date();
//        System.out.println("Date: " + currentDate);
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }
}