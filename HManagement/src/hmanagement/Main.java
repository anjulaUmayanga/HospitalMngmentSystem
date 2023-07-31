/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmanagement;

import java.util.Scanner;

/**
 *
 * @author Anjula
 */
public class Main {
    public static void main(String[] args) {
        
        HManagement myobj = new Back();
        
        Scanner sc = new Scanner(System.in);
        
        int input;
        while(true){
        System.out.println("please one of menu: ");
        System.out.println("1: View available doctors ");
        System.out.println("2: Place Booking");
        System.out.println("3: Insert patient information");
        System.out.println("4: Show patient information");
        System.out.println("5: Exit");
        input=sc.nextInt();
        
        if(input==1){
            myobj.viewDct();
        }
        else if(input==2){
            myobj.addBooking();
        }
        else if(input==3){
            myobj.addPation();
        }
        else if(input==4){
            myobj.viewPation();
        }
        else if(input==5){
            break;
        }
        else{
            System.out.println("Enter Valid input!!!!");
        }
        
          
        }
    }
}
