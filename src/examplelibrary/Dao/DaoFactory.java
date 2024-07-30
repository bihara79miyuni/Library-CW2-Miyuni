/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dao;

import examplelibrary.Dao.Custom.Impl.BookCategoriesDaoImpl;
import examplelibrary.Dao.Custom.Impl.BookDetailsDaoImpl;
import examplelibrary.Dao.Custom.Impl.MemberDetailsDaoImpl;

/**
 *
 * @author user
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case BOOK_CATEGORIES:
                return new BookCategoriesDaoImpl();
            case BOOK_DETAILS:
                return new BookDetailsDaoImpl();
            case MEMBER_DETAILS:
                return new MemberDetailsDaoImpl();
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        BOOK_CATEGORIES,BOOK_DETAILS,MEMBER_DETAILS
    }
}
