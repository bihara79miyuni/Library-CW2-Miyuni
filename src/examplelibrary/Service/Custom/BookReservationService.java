/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examplelibrary.Service.Custom;

import examplelibrary.Dto.BookReservationDto;
import examplelibrary.Service.SuperService;

/**
 *
 * @author user
 */
public interface BookReservationService extends SuperService{
    public String addReservation(BookReservationDto bookReservationDto)throws Exception;
            
        
}
