package es.hedasoft.ws.impl;

import es.hedasoft.model.Book;
import es.hedasoft.service.ServiceBook;
import es.hedasoft.ws.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookServiceImpl implements BookService
{

    public static Map<Integer,Book> mapBook = new HashMap<Integer, Book>();
    private int currentId = 1;

    @Autowired ServiceBook serviceBook;

    @Override
    public Book getBook(int id)
    {
        Book book = mapBook.get(id);
        return book;
    }

    @Override
    public Response insertBook(Book book)
    {
        Response response;
        if(book != null && serviceBook.checkTitle(book.getTitle()))
        {
            book.setId(currentId++);
            mapBook.put(book.getId(),book);
            response = Response.ok(book).build();
        }else
        {
            response = Response.status(400).build();
        }
        return response;
    }

    @Override
    public Collection<Book> getAllBooks()
    {
        return mapBook.values();
    }

    @Override
    public Response deleteBook(int id) {
        Response response;

        Book book = mapBook.remove(id);
        if(book == null){
            response = Response.status(400).build();
        }else {
            response = Response.ok().build();
        }
        return response;
    }
}
