/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Service;

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
    
    public SuperService getSetvice(ServiceType serviceType){
        switch (serviceType) {
            case BOOK_CATEGORIES:
                return null;
            default:
                return null;
               
        }
    }
    
    public enum ServiceType{
        BOOK_CATEGORIES
    }
}
