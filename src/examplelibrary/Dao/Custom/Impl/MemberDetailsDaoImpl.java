/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dao.Custom.Impl;

import examplelibrary.Dao.CrudUtil;
import examplelibrary.Dao.Custom.MemberDetailsDao;
import examplelibrary.Entity.MemberDetailsEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class MemberDetailsDaoImpl implements MemberDetailsDao{

    @Override
    public boolean create(MemberDetailsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO memberDetails VALUES(?,?,?,?,?)",t.getMemberId(),t.getName(),t.getAddress(),t.getContact(),t.getEmail());
    }

    @Override
    public boolean update(MemberDetailsEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE memberdetails SET Name=?, Address=?, Contact=?, Email=? WHERE MemberId=?",t.getName(),t.getAddress(),t.getContact(),t.getEmail(),t.getMemberId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM memberdetails WHERE MemberId=?",id);
    }

    @Override
    public MemberDetailsEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM memberdetails WHERE MemberId=? ", id);
        if(rst.next()){
            MemberDetailsEntity entity = new MemberDetailsEntity(
                rst.getString("MemberId"),
                rst.getString("Name"),
                rst.getString("Adress"),
                rst.getString("Contact"),
                rst.getString("Email"));               
            
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<MemberDetailsEntity> getAll() throws Exception {
        ArrayList<MemberDetailsEntity> memberDetailsEntities = new ArrayList<>();
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM memberdetails");
         while(rst.next()){
            MemberDetailsEntity entity = new MemberDetailsEntity(
                rst.getString("MemberId"),
                rst.getString("Name"),
                rst.getString("Adress"),
                rst.getString("Contact"),
                rst.getString("Email"));               
            
            memberDetailsEntities.add(entity);
        }
        return memberDetailsEntities;
    }
    
}
