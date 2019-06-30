/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2019;

/**
 *
 * @author USER
 */
public class MemberDTO {
    private String ID;
    private String PW;
    private String Name;
    
    public MemberDTO(String iD, String pW, String name) {
        ID = iD;
        PW = pW;
        Name = name;
    }

    MemberDTO(String id, String pw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public String getID() {
        return ID;
    }
 
    public String getPW() {
        return PW;
    }
 
    public String getName() {
        return Name;
    }
 
    public void setID(String iD) {
        ID = iD;
    }
 
    public void setPW(String pW) {
        PW = pW;
    }
 
    public void setName(String name) {
        Name = name;
    }
 
    @Override
    public String toString() {
        return "ID : " + ID + " PW : " + PW + " Name : " + Name;
    }
    
    
}


