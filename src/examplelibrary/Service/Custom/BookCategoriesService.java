/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examplelibrary.Service.Custom;

import examplelibrary.Dto.BookCategoriesDto;
import examplelibrary.Service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface BookCategoriesService extends SuperService{
    String save(BookCategoriesDto bookCategoriesDto)throws Exception;
    String update(BookCategoriesDto bookCategoriesDto)throws Exception;
    String delete(int isbn)throws Exception;
    BookCategoriesDto get(int isbn)throws Exception;
    ArrayList<BookCategoriesDto> getAll()throws Exception;
}
