/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Dto;

/**
 *
 * @author user
 */
public class MemberDetailsDto {
    private String memberDetails;
    private String name;
    private String address;
    private String contact;
    private String email;

    public MemberDetailsDto() {
    }

    public MemberDetailsDto(String memberDetails, String name, String address, String contact, String email) {
        this.memberDetails = memberDetails;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    /**
     * @return the memberDetails
     */
    public String getMemberDetails() {
        return memberDetails;
    }

    /**
     * @param memberDetails the memberDetails to set
     */
    public void setMemberDetails(String memberDetails) {
        this.memberDetails = memberDetails;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MemberDetailsDto{" + "memberDetails=" + memberDetails + ", name=" + name + ", address=" + address + ", contact=" + contact + ", email=" + email + '}';
    }
    
    
}
