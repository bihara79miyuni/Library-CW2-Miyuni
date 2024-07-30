/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dao.Custom.Impl;

import examplelibrary.Dao.Custom.MemberDetailsDao;
import examplelibrary.Entity.MemberDetailsEntity;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MemberDetailsDaoImpl implements MemberDetailsDao{

    @Override
    public boolean create(MemberDetailsEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean update(MemberDetailsEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public MemberDetailsEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<MemberDetailsEntity> getAll() throws Exception {
        return null;
    }
    
}
