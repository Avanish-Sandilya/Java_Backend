package com.example.librarayManagement.Controller;

import com.example.librarayManagement.DTO.BookRequest;
import com.example.librarayManagement.DTO.BookResponse;
import com.example.librarayManagement.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/addBook")
    public BookResponse addNewBook(@RequestBody @Valid BookRequest request){
        return libraryService.addNewBook(request.getName(), request.getAuthorName(), request.getShelf());
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBookById(@PathVariable Long id){
        return libraryService.deleteBook(id);
    }

    @PutMapping("/updateShelf/{id}/{shelf}")
    public BookResponse updateBookShelf(@PathVariable Long id,@PathVariable @Valid int shelf){
        return libraryService.updateBookShelf(shelf,id);
    }

    @GetMapping("/book/{id}")
    public BookResponse getBookByid(@PathVariable Long id){
        return libraryService.getBookById(id);
    }

    @GetMapping("/shelf/{id}")
    public int getBookShelf(@PathVariable Long id){
        return libraryService.findBookLocation(id);
    }


    @GetMapping("/books/all")
    public List<BookResponse> getAllBooks(){
        return libraryService.getAllBooks();
    }


}
