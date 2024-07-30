/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Service.Custom.Impl;

import examplelibrary.Dao.Custom.BookDetailsDao;
import examplelibrary.Dao.DaoFactory;
import examplelibrary.Dto.BookDetailsDto;
import examplelibrary.Entity.BookDetailsEntity;
import examplelibrary.Service.Custom.BookDetailsService;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookDetailsServiceImpl implements BookDetailsService{
    
    private BookDetailsDao bookDetailsDao =(BookDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK_DETAILS);

    @Override
    public String save(BookDetailsDto bookDetailsDto) throws Exception {
        BookDetailsEntity entity = getBookDetailsEntity(bookDetailsDto);
        return bookDetailsDao.create(entity) ? "Success" : "Fail";
        
    }

    @Override
    public String update(BookDetailsDto bookDetailsDto) throws Exception {
        BookDetailsEntity entity = getBookDetailsEntity(bookDetailsDto);
        return bookDetailsDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String bookId) throws Exception {
        return bookDetailsDao.delete(bookId) ? "Success" : "Fail";
    }

    @Override
    public BookDetailsDto get(String bookId) throws Exception {
        BookDetailsEntity entity = bookDetailsDao.get(bookId);
        if(entity != null){
            return getBookDetailsDto(entity);
        }
        return  null;
    }

    @Override
    public ArrayList<BookDetailsDto> getAll() throws Exception {
       ArrayList<BookDetailsEntity> bookDetailsEntities = bookDetailsDao.getAll();
        if(bookDetailsEntities != null && bookDetailsEntities.isEmpty()){
            ArrayList<BookDetailsDto> bookDetailsDtos = new ArrayList<>();
            
            for(BookDetailsEntity bookDetailsEntity : bookDetailsEntities){
                bookDetailsDtos.add(getBookDetailsDto(bookDetailsEntity));
            }
            return bookDetailsDtos;
        }
        return null;
    }
    
    private BookDetailsEntity getBookDetailsEntity(BookDetailsDto bookDetailsDto){
        return new BookDetailsEntity(
            bookDetailsDto.getBookId(),
            bookDetailsDto.getIsbn(),
            bookDetailsDto.getAuthor(),
            bookDetailsDto.getPublisher(),
            bookDetailsDto.getLanguage());
    }
    
    private BookDetailsDto getBookDetailsDto(BookDetailsEntity entity){
        return new BookDetailsDto(
            entity.getBookId(),
            entity.getIsbn(),
            entity.getAuthor(),
            entity.getPublisher(),
            entity.getLanguage());  
    }
    
    
}
