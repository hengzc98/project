/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2019;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static project.pkg2019.Project2019.login;

/**
 *
 * @author USER
 */
public class MemberJoinDAO {
 Scanner sc = new Scanner(System.in);
    List<MemberDTO> members = new ArrayList<>();
    int totalAttempts = 3;
    int option;
    
    public MemberJoinDAO (){
        members.add(new MemberDTO("abc","1234","NY"));
        members.add(new MemberDTO("bcd","1234","KL"));
        members.add(new MemberDTO("cde","1234","SL"));       
    }
    
    public void SelectMember() {
        Iterator<MemberDTO> ite = members.iterator();
        
        while(ite.hasNext()) {
            System.out.println(ite.next() + " ");
        }
        
    }
 
    public void MemberJoin() {

        String id = getStrInput("ID : ");
        String pw = getStrInput("PassWord : ");
        String pw2 = getStrInput("Password Confirm : ");
        String name = getStrInput("Name : ");
        
       
         if(pw.equals(pw2)) {
            members.add(new MemberDTO(id, pw, name));
            System.out.println("\n" + id + " Registered Successful." + "\n" + "\n");
        }else if(!pw.equals(pw2)) {
            System.out.println("Incorrect Password.");
            option = 0;
        }
       
    }
 
    public boolean idCheck(String id) {
        boolean check = true;
        MemberDTO member = FindById(id);
        if(member == null)
            check = false;
        return check;
    }
 
    public void Login() {
        while(totalAttempts != 0){
        String id = getStrInput("      ID : ");
        String pw = getStrInput("PassWord : ");
        
        MemberDTO member = FindById(id);
        
        if(member == null){
            System.out.println("Not regestered.");
        }else if(member.getPW().equals(pw)) {
            System.out.println("[" + member.getID() + "]has logged in.");
        }else {
            System.out.println("Wrong password.");
            totalAttempts--;
            System.out.println(totalAttempts);
        }
               
    }
        if(totalAttempts == 0){
            
            System.out.println("Maximum number of attempts exceeded");
        
        }
 }
    
 
    public MemberDTO FindById(String id) {
        for(MemberDTO memberDTO : members) {
            if(memberDTO.getID().equals(id)) {
                return memberDTO;
            }
        }
        return null;
    }
 
    public String getStrInput(String msg) {
        System.out.println(msg);
        return sc.nextLine();        
    }
 
    public void menu() {
        
         System.out.println("//////////////////////////////////////");
         System.out.println("/////////////WELCOME//////////////////");
         System.out.println("//////////////////////////////////////");
         System.out.println("+-------------------------+");
         System.out.println("|   1" + "\t|" + "Sign Up          |");
         System.out.println("|-------------------------+");
         System.out.println("|   2" + "\t|" + "Sign In          |");
         System.out.println("|-------------------------+");
         System.out.println("|   3" + "\t|" + "See Account      |");
         System.out.println("+-------------------------+");
         System.out.println("|   4" + "\t|" + "Exit             |");
         System.out.println("|-------------------------+");
         System.out.println("Your selection:");
        
    }
 
    public int getNumInput(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
 
}
