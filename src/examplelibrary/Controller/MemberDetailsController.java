/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Controller;

import examplelibrary.Dto.MemberDetailsDto;
import examplelibrary.Service.Custom.MemberDetailsService;
import examplelibrary.Service.ServiceFactory;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MemberDetailsController {
    
    private MemberDetailsService memberDetailsService =(MemberDetailsService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER_DETAILS);
    
    public String save(MemberDetailsDto memberDetailsDto)throws Exception{
        return memberDetailsService.save(memberDetailsDto);
    }
    
    public String update(MemberDetailsDto memberDetailsDto)throws Exception{
        return memberDetailsService.update(memberDetailsDto);
    }
    
    public String delete(String memberId)throws Exception{
        return memberDetailsService.delete(memberId);
    }
    
    public ArrayList<MemberDetailsDto> getAll()throws Exception{
        return memberDetailsService.getAll();
    }
    
    public MemberDetailsDto get(String memberId)throws Exception{
        return memberDetailsService.get(memberId);
    }
}
