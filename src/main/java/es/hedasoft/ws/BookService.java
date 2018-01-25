package es.hedasoft.ws;


import es.hedasoft.model.Book;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Collection;

@WebService(name="BookServices")
@Path("/book")
public interface BookService
{
    @WebMethod
    @GET
    @Path("/{id}")
    public Book getBook(@PathParam("id") int id);

    @WebMethod
    @POST
    @Path("/")
    public Response insertBook(Book book);

    @WebMethod
    @GET
    @Path("/")
    public Collection<Book> getAllBooks();

    @WebMethod
    @DELETE
    @Path("/{id}")
    public Response deleteBook(@PathParam("id") int id);

    @WebMethod
    @PUT
    @Path("/{id}")
    public Response putBook(@PathParam("id") int id,Book book);
}
