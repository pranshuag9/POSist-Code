/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posist.application;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class POSistApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter user name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter user ID");
        String userID = sc.nextLine();
       
        System.out.println("what do yu want to do:\n\n1.) Add a node \n2.Decrypt the value of node");
    }
    
}
