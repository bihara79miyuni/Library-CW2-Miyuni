/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dao.Custom.Impl;

import examplelibrary.Dao.CrudUtil;
import examplelibrary.Dao.Custom.BookDetailsDao;
import examplelibrary.Entity.BookDetailsEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class BookDetailsDaoImpl implements BookDetailsDao{

    @Override
    public boolean create(BookDetailsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO bookdetails VALUES(?,?,?,?,?)",t.getBookId(),t.getIsbn(),t.getAuthor(),t.getPublisher(),t.getLanguage());
    }

    @Override
    public boolean update(BookDetailsEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE bookdetails SET ISBN=?, Author=?, Publisher=?, Language=? WHERE BookId=?",t.getIsbn(),t.getAuthor(),t.getPublisher(),t.getLanguage(),t.getBookId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM bookdetails WHERE BookId=?",id);
    }

    @Override
    public BookDetailsEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM bookdetails WHERE BookId=? ", id);
        if(rst.next()){
            BookDetailsEntity entity = new BookDetailsEntity(
                rst.getString("BookId"),
                rst.getInt("ISBN"),
                rst.getString("Author"),
                rst.getString("publisher"),
                rst.getString("Language"));
            
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<BookDetailsEntity> getAll() throws Exception {
         ArrayList<BookDetailsEntity> bookDetailsEntities = new ArrayList<>();
         ResultSet rst =CrudUtil.executeQuery("SELECT * FROM bookdetails");
         while(rst.next()){
             BookDetailsEntity entity = new BookDetailsEntity(
                rst.getString("BookId"),
                rst.getInt("ISBN"),
                rst.getString("Author"),
                rst.getString("publisher"),
                rst.getString("Language"));
            
            bookDetailsEntities.add(entity);
         }
         return bookDetailsEntities;
    }
    
}
