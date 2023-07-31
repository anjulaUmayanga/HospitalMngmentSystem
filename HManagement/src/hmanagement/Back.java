
package hmanagement;
import java.util.Scanner;
//import java.util.ArrayList;
/**
 *
 * @author Anjula
 */
public class Back extends HManagement{
    Scanner in = new Scanner(System.in);
    
    int no_pation;
    private String booking_name;
    private String booking_Id;
    private String booking_D_name;
    
    
   
    String pation_name[];
    int test[];
    int pation_age[] ;
    int pation_id[];
    
   
    
    void hospitalDb(){
        System.out.println(doctors[0]);
        
    }
    void viewDct(){
       int i = doctors.length;
       int b=0;
       while(i>0){
           System.out.println(doctors[b]);
           b++;
           i--;
       
       }
    }
    
    void addBooking(){
        System.out.println("Enter Name:");
        booking_name=in.nextLine();
        System.out.println("Enter Booking Id: ");
        booking_Id=in.nextLine();
        System.out.println("Enter Doctor Name: ");
        booking_D_name=in.nextLine();
        
        System.out.println("Booking Is Success!!");
    }
    void addPation(){
        Scanner str= new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("How many pations You want to add: ");
        no_pation=in.nextInt();
        
        pation_name=new String[no_pation+1];
        pation_age=new int[no_pation];
        pation_id=new int[no_pation];
        int count=1;
        
       

       
         for(int i=0;i<no_pation;i++){
             System.out.println("Enter pation "+(i+1)+" information");
             System.out.println("Enter pation "+count+" Name: ");
             pation_name[i]=str.nextLine();
             System.out.println("Enter Pation "+count+" Id: ");
             pation_id[i]=in2.nextInt();
             System.out.println("Enter Pation "+count+" Age: ");
             pation_age[i]=in2.nextInt();
            
             
             count++;

       
        }
    }
    void viewPation(){
        
        if(pation_id.length != 0){
            for(int a=0; a<pation_age.length; a++){
                System.out.println("Pation Name is: "+pation_name[a]);
                System.out.println("Pationt Age is: "+pation_age[a]);
                System.out.println("Pationt Id is: "+pation_id[a]);
            }
        }
        else{
            System.out.println("Please Enter Pation Information");
        }
    }
    
}
