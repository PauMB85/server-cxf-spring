package es.hedasoft.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Book
{
    private Integer id;
    private String title;
    private String editorial;
    private String author;

    public Book(){}
    public Book(String title,String editorial,String author)
    {
        this.title = title;
        this.editorial = editorial;
        this.author = author;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getEditorial() {return editorial;}

    public void setEditorial(String editorial) {this.editorial = editorial;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}
}