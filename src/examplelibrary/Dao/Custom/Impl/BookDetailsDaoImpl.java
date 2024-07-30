/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dao.Custom.Impl;

import examplelibrary.Dao.Custom.BookDetailsDao;
import examplelibrary.Entity.BookDetailsEntity;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookDetailsDaoImpl implements BookDetailsDao{

    @Override
    public boolean create(BookDetailsEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean update(BookDetailsEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public BookDetailsEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<BookDetailsEntity> getAll() throws Exception {
        return null;
    }
    
}
