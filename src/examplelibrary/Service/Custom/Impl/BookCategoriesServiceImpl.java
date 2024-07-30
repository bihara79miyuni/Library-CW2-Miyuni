/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Service.Custom.Impl;

import examplelibrary.Dao.Custom.BookCategoriesDao;
import examplelibrary.Dao.DaoFactory;
import examplelibrary.Dto.BookCategoriesDto;
import examplelibrary.Entity.BookCategoriesEntity;
import examplelibrary.Service.Custom.BookCategoriesService;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookCategoriesServiceImpl implements BookCategoriesService{
    
    private BookCategoriesDao bookCategoriesDao = (BookCategoriesDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK_CATEGORIES);

    @Override
    public String save(BookCategoriesDto bookCategoriesDto) throws Exception {
        BookCategoriesEntity entity = getBookCategoriesEntity(bookCategoriesDto);
        return bookCategoriesDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(BookCategoriesDto bookCategoriesDto) throws Exception {
        BookCategoriesEntity entity = getBookCategoriesEntity(bookCategoriesDto);
        return bookCategoriesDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(int isbn) throws Exception {
        return bookCategoriesDao.delete(isbn) ? "Success" : "Fail";
    }

    @Override
    public BookCategoriesDto get(int isbn) throws Exception {
        BookCategoriesEntity entity = bookCategoriesDao.get(isbn);
        if(entity != null){
            return getBookCategoriesDto(entity);
        }
        return  null;
    }

    @Override
    public ArrayList<BookCategoriesDto> getAll() throws Exception {
        ArrayList<BookCategoriesEntity> bookCategoriesEntities = bookCategoriesDao.getAll();
        if(bookCategoriesEntities != null && bookCategoriesEntities.isEmpty()){
            ArrayList<BookCategoriesDto> bookCategoriesDtos = new ArrayList<>();
            
            for(BookCategoriesEntity bookCategoriesEntity : bookCategoriesEntities){
                bookCategoriesDtos.add(getBookCategoriesDto(bookCategoriesEntity));
            }
            return bookCategoriesDtos;
        }
        return null;
    }

    /**
     * @return the bookCategoriesDao
     */
    
    
    private BookCategoriesEntity getBookCategoriesEntity(BookCategoriesDto bookCategoriesDto){
        return new BookCategoriesEntity(
                bookCategoriesDto.getIsbn(),
                bookCategoriesDto.getGenre(),
                bookCategoriesDto.getTitle(),
                bookCategoriesDto.getCopies());
    }
    
    private BookCategoriesDto getBookCategoriesDto(BookCategoriesEntity entity){
        return new BookCategoriesDto(
            entity.getIsbn(),
            entity.getGenre(),
            entity.getTitle(),
            entity.getCopies());
    }
    
}
