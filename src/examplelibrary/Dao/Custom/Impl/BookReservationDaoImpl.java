/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dao.Custom.Impl;

import examplelibrary.Dao.CrudUtil;
import examplelibrary.Dao.Custom.BookReservationDao;
import examplelibrary.Entity.BookReservationEntity;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookReservationDaoImpl implements BookReservationDao{

    @Override
    public boolean create(BookReservationEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO bookreservation VALUES(?,?,?,?,?)",t.getBookId(),t.getMemberId(),t.getbDate(),t.getdDate(),t.getrDate());
    }

    @Override
    public boolean update(BookReservationEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public BookReservationEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<BookReservationEntity> getAll() throws Exception {
        return null;
    }
    
}
