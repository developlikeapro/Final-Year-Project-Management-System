/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp_management_system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author M GHOUS
 */
public class Cserialization {

    

    public Ccontroler Mdeserialize() {
        Ccontroler obj = new Ccontroler();

        try {
            FileInputStream fileIn = new FileInputStream("serri.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = (Ccontroler) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
           // i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Controler not Found class not found");
           // c.printStackTrace();
            return null;
        }
        return obj;
    }

    public void Mserialize(Ccontroler obj) {
        try {
            FileOutputStream fileOut
                    = new FileOutputStream("serri.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/serri.ser");
        } catch (IOException i) {
          //  i.printStackTrace();
        }
    }
}
