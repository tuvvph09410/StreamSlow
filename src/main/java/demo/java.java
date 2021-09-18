/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author vuvantu
 */
public class java {

    public static void main(String[] args) {
        String pathFile = "/Users/vuvantu/Documents/java_nang_cao/unit7.rtf";
        try {
            int i = 5;
            String s="Vu Van Tu";
            char c= 'r';
            FileOutputStream outputStream= new FileOutputStream(pathFile);
            outputStream.write(i);
            outputStream.write(c);
            outputStream.write(s.getBytes());
            outputStream.close();
            
            FileInputStream inputStream= new FileInputStream(pathFile);
            byte bytes[] = new byte[1];
            
            inputStream.read(bytes);
            System.out.println("int: " + bytes[0]);
            
            inputStream.read(bytes);
            System.out.println("Code: " + bytes[0]);
            System.out.println("character: " + new String(bytes));
            
            bytes= new byte[s.length()];
            inputStream.read(bytes);
            System.out.println("String: " + new String(bytes));
            
            outputStream.close();
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
