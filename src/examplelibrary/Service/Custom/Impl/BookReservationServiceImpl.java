/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Service.Custom.Impl;

import examplelibrary.DB.DBConnection;
import examplelibrary.Dao.Custom.BookCategoriesDao;
import examplelibrary.Dao.Custom.BookDetailsDao;
import examplelibrary.Dao.Custom.BookReservationDao;
import examplelibrary.Dao.Custom.MemberDetailsDao;
import examplelibrary.Dao.DaoFactory;
import examplelibrary.Dto.BookReservationDto;
import examplelibrary.Entity.BookReservationEntity;
import examplelibrary.Service.Custom.BookReservationService;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class BookReservationServiceImpl implements BookReservationService{
    
    private BookReservationDao bookReservationDao = (BookReservationDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK_RESERVATION);
    private BookCategoriesDao bookCategoriesDao = (BookCategoriesDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK_CATEGORIES);
    private BookDetailsDao bookDetailsDao = (BookDetailsDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK_DETAILS);
    private MemberDetailsDao memberDetailsDao = (MemberDetailsDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER_DETAILS);
    

    @Override
    public String addReservation(BookReservationDto bookReservationDto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
           
//            connection.setAutoCommit(false);
//            BookReservationEntity bookReservationEntity = new BookReservationEntity(bookReservationDto.getBookId(), bookReservationDto.getMemberId(),bookReservationDto.getbDate(),bookReservationDto.getdDate(),bookReservationDto.getrDate());
//            
//            if(BookReservationDao.create(bookReservationEntity)){
//                boolean isOrderDetailSaved = true;
//            }else{
//               
//            }
            //////////////////////////
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
        return null;
    }
    
}
