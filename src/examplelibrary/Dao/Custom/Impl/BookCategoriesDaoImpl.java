/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dao.Custom.Impl;

import examplelibrary.Dao.CrudUtil;
import examplelibrary.Dao.Custom.BookCategoriesDao;
import examplelibrary.Entity.BookCategoriesEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class BookCategoriesDaoImpl implements BookCategoriesDao{

    @Override
    public boolean create(BookCategoriesEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO bookcategories VALUES(?,?,?,?)",t.getIsbn(),t.getGenre(),t.getTitle(),t.getCopies());
    }

    @Override
    public boolean update(BookCategoriesEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE bookcategories SET Genre=?, Title=?, NoOfCopies=? WHERE ISBN=?",t.getGenre(),t.getTitle(),t.getCopies());
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM bookcategories WHERE ISBN=?",id);
    }

    @Override
    public BookCategoriesEntity get(Integer id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM bookcategories WHERE ISBN=? ", id);
        if(rst.next()){
            BookCategoriesEntity entity = new BookCategoriesEntity(
                rst.getInt("ISBN"),
                rst.getString("Genre"),
                rst.getString("Title"),
                rst.getInt("NoOfCopies")); 
            
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<BookCategoriesEntity> getAll() throws Exception {
         ArrayList<BookCategoriesEntity> bookCategoriesEntities = new ArrayList<>();
         ResultSet rst =CrudUtil.executeQuery("SELECT * FROM bookcategories");
         while(rst.next()){
             BookCategoriesEntity entity = new BookCategoriesEntity(
                rst.getInt("ISBN"),
                rst.getString("Genre"),
                rst.getString("Title"),
                rst.getInt("NoOfCopies")); 
            
            bookCategoriesEntities.add(entity);
         }
         return bookCategoriesEntities;
    }
}
