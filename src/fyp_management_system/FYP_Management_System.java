/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp_management_system;

import static fyp_management_system.FYP_Management_System.Ocontroler;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author M GHOUS
 */
public class FYP_Management_System {

    private int f;
    /**
     * @param args the command line arguments
     */
    public static Ccontroler Ocontroler = null;
    static Cserialization obj = new Cserialization();

    public static void main(String[] args) {
        // TODO code application logic 
        //static public Ccontroler Ocontroler=null;
        Ocontroler = obj.Mdeserialize();
        if (Ocontroler == null) {
            Ocontroler = new Ccontroler();
            obj.Mserialize(Ocontroler);
        }

        System.out.println("Welcome To FYP Management System ");
        //  input = new Scanner(System.in).nextLine();
//        System.out.println("Select Your Role :\n1 For Student \n2 For Advisor\n3 For Internal\n4 For External");
//        String input = new Scanner(System.in).nextLine();
//        if (input == "1") {
//            System.out.println("\n1 For Login \n2 For Create Account");
//            input = new Scanner(System.in).nextLine();
//
//            if (input == "1") {
//                System.out.println("Enter Username :");
//                String ussername = new Scanner(System.in).nextLine();
//                System.out.println("Enter Pass :");
//                String pass = new Scanner(System.in).nextLine();
//                Clogin ologin=new Clogin(Erole.Student, new loginsub(ussername, pass));
//
//            }
//            else if (input=="2") {
//               //
//            }
//
//        } else if (input == "2") {
//
//        } else if (input == "3") {
//
//        } else if (input == "4") {
//
//        } else {
//        }

        System.out.print("Condition:\n");
        System.out.println("Running.....:");

    }

}
