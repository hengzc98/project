/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kai Ming
 */
public class Project2019 {

    static String password, loginPass, username, loginUser;
    static boolean login = true;
    static boolean checkvalid = false;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner read=new Scanner(System.in);
        ArrayList<String>Module=new ArrayList<String>();
        int option=0;
        int num;
       MemberJoinDAO MemberJoinDAO = new MemberJoinDAO();
        
        outerloop:
        while (option==0){
        MemberJoinDAO.menu();
        option = sc.nextInt();
 // Sign up  
           
          if(option == 1) {
           MemberJoinDAO.MemberJoin();
           option = 0;
           System.out.println("-----------------------------------------------------");
           System.out.println("-----------------------------------------------------");
           }
           
                  
// Login page    
   
        else if(option == 2){
            int totalAttempts = 3;
          
            while (totalAttempts != 0) { 
        System.out.println("");
        System.out.println("ID : ");
        String id = sc.next();
        System.out.println("PassWord : ");
        String pw = sc.next();     
       
        MemberDTO member = MemberJoinDAO.FindById(id);
        if(member == null){
            System.out.println("Not regestered.");
        }else if(member.getPW().equals(pw)) {
            System.out.println("[" + member.getID() + "]has logged in.");
            break;
        }else {
            System.out.println("Wrong password.");
        }
            totalAttempts--;
            System.out.print("Remain: " + totalAttempts + " times");
           
        }
               
   
        if(totalAttempts == 0){
            
            System.out.println("Maximum number of attempts exceeded");
            option = 0;
        }
          }
          
           
        
          else if (option == 3){
               MemberJoinDAO.SelectMember();
               option = 0;
               System.out.println("-----------------------------------------------------");
               System.out.println("-----------------------------------------------------");
           }
                else if (option != 0||option != 1 ||option != 2 ||option != 3 ) {
            System.out.println("Exit");
            System.exit(0);
              break ;
             }
                
           
      }
          // Main Program
        
        System.out.println("+----------------------------------+");
        System.out.println("|-----------  PROGRAM  ------------|");
        System.out.println("+----------------------------------+");
        System.out.println("Please Enter the Following Detail :");
        User u1 = new User();
        System.out.println("");
        System.out.println("1 = Bachelor Of Computer Science(HONS)");
        System.out.println("2 = Bachelor of Information Technology (HONS)");
        System.out.println("Please enter a course number: ");
        int course = sc.nextInt();
        do {
        switch(course) {
           case 1: {
                System.out.println("Bachelor Of Computer Science (HONS)");
                //modules     
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|----------------------- Module List ---------------------------|");
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|1.\t Computer Networking                               RM3000|");
            System.out.println("|2.\t Database System                                   RM2500|");
            System.out.println("|3.\t Human Computer Interraction                       RM4000|");
            System.out.println("|4.\t Data Stuctures and Algorithms                     RM3500|");
            System.out.println("|5.\t Computer Architecture                             RM4400|");
            System.out.println("|6.\t Information Assurance and Security                RM3000|");
            System.out.println("|7.\t Discrete Structure                                RM4000|");
            System.out.println("|8.\t Object Orientated Programming                     RM2900|");
            System.out.println("|9.\t Professional Computing Practice                   RM3000|");
            System.out.println("|10.\t System Administration and Platform Technologies   RM2500|");
            System.out.println("+---------------------------------------------------------------+");
             System.out.println("Please enter 5 module");
             String[] modules = {"Computer Networking ","Database System ","Human Computer Interraction","Data Stuctures and Algorithms ","Computer Architecture",
                                 "Information Assurance and Security","Discrete Structure","Object Orienrtated Programming","Professional Computing Practice",
                                 "System Administration and Platform Technologies" };
             int[] fees = {3000,2500,4000,3500,4400,3000,4000,2900,3000,2500};
             int num1;
             int num2;
             int num3;
             int num4;
             int num5;
            
             num1 = sc.nextInt();
             num2 = sc.nextInt();
             num3 = sc.nextInt();
             num4 = sc.nextInt();
             num5 = sc.nextInt();
             
             
                System.out.println("Module Registered:");
                System.out.println(modules[num1 - 1]);
                System.out.println(modules[num2 - 1]);
                System.out.println(modules[num3 - 1]);
                System.out.println(modules[num4 - 1]);
                System.out.println(modules[num5 - 1]);
                System.out.println("+-----------------------------------------------------+");
                System.out.println("|----------------------RECEIPT------------------------|");
                System.out.println("+-----------------------------------------------------+");
                System.out.println(u1.toString());
                System.out.println("");
                System.out.println("Course: Bachelor Of Computer Science (HONS)");
                System.out.println("");
                System.out.println("Modules:");
                System.out.println("1)" + modules[num1 - 1]);
                System.out.println("2)" + modules[num2 - 1]);
                System.out.println("3)" + modules[num3 - 1]);
                System.out.println("4)" + modules[num4 - 1]);
                System.out.println("5)" + modules[num5 - 1]);
                System.out.println("");
                System.out.print("Total Fees:");
                int total=fees[num1 - 1] + fees[num2 - 1] + fees[num3 - 1] +fees[num4 - 1] + fees[num5 - 1];
                System.out.println(" RM" +total);
                System.exit(0);
          
               
            }
           case 2: {
                System.out.println("Bachelor of Information Technology (HONS)");
                //modules
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|----------------------- Module List ---------------------------|");
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("|1.\t Computer Networking                               RM3000|");  
            System.out.println("|2.\t Database System                                   RM2500|");
            System.out.println("|3.\t Human Computer Interraction                       RM4000|");
            System.out.println("|4.\t Data Stuctures and Algorithms                     RM3500|");
            System.out.println("|5.\t IT Fundamantals                                   RM4500|");
            System.out.println("|6.\t Information Assurance and Security                RM3000|");
            System.out.println("|7.\t Mathematics and Statistics                        RM3300|");
            System.out.println("|8.\t Object Orienr=ted Programming                     RM2900|");
            System.out.println("|9.\t Professional Computing Practice                   RM3000|");
            System.out.println("|10.\t System Administration and Platform Technologies   RM2500|");
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("Please enter 5 module");
            String[] modules = {"Computer Networking ","Database System ","Human Computer Interraction","Data Stuctures and Algorithms ","IT Fundamantals",
                                "Information Assurance and Security","Mathematics and Statistics","Object Orienrtated Programming","Professional Computing Practice",
                                "System Administration and Platform Technologies" };
            int[] fees={3000,2500,4000,3500,4500,3000,3300,2900,3000,2500};
            int num1;
            int num2;
            int num3;
            int num4;
            int num5;
            
             num1 = sc.nextInt();
             num2 = sc.nextInt();
             num3 = sc.nextInt();
             num4 = sc.nextInt();
             num5 = sc.nextInt();
                
           
                System.out.println("Module Registered:");
                System.out.println(modules[num1 - 1]);
                System.out.println(modules[num2 - 1]);
                System.out.println(modules[num3 - 1]);
                System.out.println(modules[num4 - 1]);
                System.out.println(modules[num5 - 1]);
                System.out.println("+-----------------------------------------------------+");
                System.out.println("|----------------------RECEIPT------------------------|");
                System.out.println("+-----------------------------------------------------+");
                System.out.println(u1.toString());
                System.out.println("");
                System.out.println("Course: Bachelor of Information Technology (HONS)");
                System.out.println("");
                System.out.println("Modules:");
                System.out.println("1)" + modules[num1 - 1]);
                System.out.println("2)" + modules[num2 - 1]);
                System.out.println("3)" + modules[num3 - 1]);
                System.out.println("4)" + modules[num4 - 1]);
                System.out.println("5)" + modules[num5 - 1]);
                System.out.println("");
                System.out.print("Total Fees:");
                int total=fees[num1 - 1] + fees[num2 - 1] + fees[num3 - 1] +fees[num4 - 1] + fees[num5 - 1];
                System.out.println(" RM" +total);
                System.exit(0);
                   
            }  
           default:
            System.out.println("Invalid input!");
            System.out.println("1 = Bachelor Of Computer Science(HONS)");
            System.out.println("2 = Bachelor of Information Technology (HONS)");
            System.out.println("Please enter the course number: ");
            course = sc.nextInt();
        }
        }while (course !=1 || course !=2);
        
        } 
}
        
        
    

        
     
    

