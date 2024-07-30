/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examplelibrary.Service.Custom;

import examplelibrary.Dto.MemberDetailsDto;
import examplelibrary.Service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface MemberDetailsService extends SuperService{
    String save(MemberDetailsDto memberDetailsDto)throws Exception;
    String update(MemberDetailsDto memberDetailsDto)throws Exception;
    String delete(String memberId)throws Exception;
    MemberDetailsDto get(String memberId)throws Exception;
    ArrayList<MemberDetailsDto> getAll()throws Exception;
}
