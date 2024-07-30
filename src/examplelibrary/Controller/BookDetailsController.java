/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Controller;

import examplelibrary.Dto.BookDetailsDto;
import examplelibrary.Service.Custom.BookDetailsService;
import examplelibrary.Service.ServiceFactory;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookDetailsController {
    
    private BookDetailsService bookDetailsService =(BookDetailsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK_DETAILS);
            
    public String save(BookDetailsDto bookDetailsDto)throws Exception{
        return bookDetailsService.save(bookDetailsDto);
    }
    
    public String update(BookDetailsDto bookDetailsDto)throws Exception{
        return bookDetailsService.update(bookDetailsDto);
    }
    
    public String delete(String bookId)throws Exception{
       return bookDetailsService.delete(bookId);
    }
    
    ArrayList<BookDetailsDto> getAll()throws Exception{
        return bookDetailsService.getAll();
    }
    
    public BookDetailsDto get(String bookId)throws Exception{
        return bookDetailsService.get(bookId);
        
    }
}
