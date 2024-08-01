/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Controller;

import examplelibrary.Dto.BookReservationDto;
import examplelibrary.Service.Custom.BookReservationService;
import examplelibrary.Service.ServiceFactory;

/**
 *
 * @author user
 */
public class BookReservationController {
    
    private BookReservationService bookReservationService = (BookReservationService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK_RESERVATION);
    
    public String addReservation(BookReservationDto bookReservationDto)throws Exception{
        return bookReservationService.addReservation(bookReservationDto);
    }
}
