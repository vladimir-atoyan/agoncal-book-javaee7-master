package org.agoncal.book.javaee7.chapter05.ex63;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Antonio Goncalves
 * APress Book - Beginning Java EE 7 with Glassfish 4
 * http://www.apress.com/
 * http://www.antoniogoncalves.org
 * --
 */

//@Entity
//@Table(name = "ex63_item")
public class Item63 {

    // ======================================
    // =             Attributes             =
    // ======================================

    //    @Id
//    @GeneratedValue
//    protected Long id;    
    protected String title;
    protected Float price;
    protected String description;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Item63() {
    }

    public Item63(String title, Float price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}