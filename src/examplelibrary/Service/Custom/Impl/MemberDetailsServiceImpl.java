/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Service.Custom.Impl;

import examplelibrary.Dao.Custom.MemberDetailsDao;
import examplelibrary.Dao.DaoFactory;
import examplelibrary.Dto.MemberDetailsDto;
import examplelibrary.Entity.MemberDetailsEntity;
import examplelibrary.Service.Custom.MemberDetailsService;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MemberDetailsServiceImpl implements MemberDetailsService{
    
    private MemberDetailsDao memberDetailsDao = (MemberDetailsDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER_DETAILS);

    @Override
    public String save(MemberDetailsDto memberDetailsDto) throws Exception {
        MemberDetailsEntity entity = getMemberDetailsEntity(memberDetailsDto);
        return memberDetailsDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(MemberDetailsDto memberDetailsDto) throws Exception {
        MemberDetailsEntity entity = getMemberDetailsEntity(memberDetailsDto);
        return memberDetailsDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String memberId) throws Exception {
        return memberDetailsDao.delete(memberId) ? "Success" : "Fail";
    }

    @Override
    public MemberDetailsDto get(String memberId) throws Exception {
        MemberDetailsEntity entity = memberDetailsDao.get(memberId);
        if(entity != null){
            return getMemberDetailsDto(entity);
        }
        return  null;
    }

    @Override
    public ArrayList<MemberDetailsDto> getAll() throws Exception {
        ArrayList<MemberDetailsEntity> memberDetailsEntities = memberDetailsDao.getAll();
        if(memberDetailsEntities != null && !memberDetailsEntities.isEmpty()){
            ArrayList<MemberDetailsDto> memberDetailsDtos = new ArrayList<>();
            
            for(MemberDetailsEntity memberDetailsEntity : memberDetailsEntities){
                memberDetailsDtos.add(getMemberDetailsDto(memberDetailsEntity));
            }
            return memberDetailsDtos;
        }
        return null; 
    }

     private MemberDetailsEntity getMemberDetailsEntity(MemberDetailsDto MemberDetailsDto){
        return new MemberDetailsEntity(
                MemberDetailsDto.getMemberId(),
                MemberDetailsDto.getName(),
                MemberDetailsDto.getAddress(),
                MemberDetailsDto.getContact(),
                MemberDetailsDto.getEmail());
    }
    
    private MemberDetailsDto getMemberDetailsDto(MemberDetailsEntity entity){
        return new MemberDetailsDto(
            entity.getMemberId(),
            entity.getName(),
            entity.getAddress(),
            entity.getContact(),
            entity.getEmail());             
    }
  

    
}
