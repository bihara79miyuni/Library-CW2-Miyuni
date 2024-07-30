/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dao.Custom.Impl;

import examplelibrary.Dao.Custom.BookCategoriesDao;
import examplelibrary.Entity.BookCategoriesEntity;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookCategoriesDaoImpl implements BookCategoriesDao{

    @Override
    public boolean create(BookCategoriesEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean update(BookCategoriesEntity t) throws Exception {
         return false;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
         return false;
    }

    @Override
    public BookCategoriesEntity get(Integer id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<BookCategoriesEntity> getAll() throws Exception {
        return null;
    }
}
