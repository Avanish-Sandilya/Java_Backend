package com.example.librarayManagement.Service;

import com.example.librarayManagement.DTO.BookResponse;
import com.example.librarayManagement.Entity.Book;
import com.example.librarayManagement.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private BookRepository bookRepository;

    public BookResponse addNewBook(String name,String authorName,int shelf){
        Book savedBook=bookRepository.save(new Book(name,authorName,shelf));
        return new BookResponse(savedBook.getId(),name,authorName,shelf);
    }

    public List<BookResponse> getAllBooks(){
        List<Book> books=bookRepository.findAll();
        Collections.sort(books);
        List<BookResponse> bookResponses=new ArrayList<>();

        for(var v:books){
            bookResponses.add(new BookResponse(v.getId(),v.getName(),v.getAuthorName(),v.getShelf()));
        }
        return bookResponses;
    }

    public int findBookLocation(Long id){
            Book book = bookRepository.findById(id).orElse(null);
            return book==null?-1:book.getShelf();
    }

    public BookResponse getBookById(Long id){
        Book book=bookRepository.findById(id).orElse(null);
        return book==null?new BookResponse((long) -1,null,null,0)
                :new BookResponse(book.getId(), book.getName(), book.getAuthorName(), book.getShelf());
    }

    public String deleteBook(Long id){
        BookResponse book = getBookById(id);
        if(book.getId()!=-1){
            bookRepository.deleteById(id);
            return "Record deleted successfully";
        }
        return "No such record exists or record has already been deleted";
    }

    public BookResponse updateBookShelf(int shelf, Long id){
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            return new BookResponse((long) -1, null, null, 0);
        }

        book.setShelf(shelf);

        Book updatedBook=bookRepository.save(book);

        return new BookResponse(
                updatedBook.getId(),
                updatedBook.getName(),
                updatedBook.getAuthorName(),
                updatedBook.getShelf()
        );

    }


}
