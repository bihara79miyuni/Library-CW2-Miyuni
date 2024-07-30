/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Controller;

import examplelibrary.Dto.BookCategoriesDto;
import examplelibrary.Service.Custom.BookCategoriesService;
import examplelibrary.Service.ServiceFactory;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookCategoriesController {
    
    private BookCategoriesService bookCategoriesService = (BookCategoriesService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK_CATEGORIES);
    
    public String save(BookCategoriesDto bookCategoriesDto)throws Exception{
        return bookCategoriesService.save(bookCategoriesDto);
    }
    
    public String update(BookCategoriesDto bookCategoriesDto)throws Exception{
        return bookCategoriesService.update(bookCategoriesDto);
    }
    
    public String delete(int isbn)throws Exception{
        return bookCategoriesService.delete(isbn);
    }
    
    public ArrayList<BookCategoriesDto> getAll()throws Exception{
        return bookCategoriesService.getAll();
    }
    
    public BookCategoriesDto get(int isbn)throws Exception{
        return bookCategoriesService.get(isbn);
    }
}
