/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examplelibrary.Service.Custom;

import examplelibrary.Dto.BookDetailsDto;
import examplelibrary.Service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface BookDetailsService extends SuperService{
    String save(BookDetailsDto bookDetailsDto)throws Exception;
    String update(BookDetailsDto bookDetailsDto)throws Exception;
    String delete(String bookId)throws Exception;
    BookDetailsDto get(String bookId)throws Exception;
    ArrayList<BookDetailsDto> getAll()throws Exception;
}
