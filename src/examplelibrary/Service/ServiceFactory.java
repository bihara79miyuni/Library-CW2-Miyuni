/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Service;

import examplelibrary.Service.Custom.Impl.BookCategoriesServiceImpl;
import examplelibrary.Service.Custom.Impl.BookDetailsServiceImpl;
import examplelibrary.Service.Custom.Impl.BookReservationServiceImpl;
import examplelibrary.Service.Custom.Impl.MemberDetailsServiceImpl;

/**
 *
 * @author user
 */
public class ServiceFactory {//Singletone
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
        switch (serviceType) {
            case BOOK_CATEGORIES:
                return new BookCategoriesServiceImpl();
            case BOOK_DETAILS:
                return new BookDetailsServiceImpl();
            case MEMBER_DETAILS:
                return new MemberDetailsServiceImpl();
            case BOOK_RESERVATION:
                return new BookReservationServiceImpl();
            default:
                return null;
              
        }
    }
    
    public enum ServiceType{
        BOOK_CATEGORIES,BOOK_DETAILS,MEMBER_DETAILS,BOOK_RESERVATION
    }
}
