/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Yura
 * Tanggal : 15 Maret 2025
 */
public class Latihan02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nama = "Yuraa";
       String nim = "2301010015";
       double ipk = 3.95;
       
       BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.print("Input Nama Mahasiswa: ");
       try{
           nama = dtain.readLine();
           System.out.print("Input NIM Mahasiswa: ");
           nim = dtain.readLine();
           System.out.print("Input IPK Mahasiswa: ");
           ipk = Double.parseDouble(dtain.readLine());
           
       }catch(IOException e){ 
           System.out.println("Error pembacaan data");
       }
       
       System.out.println(nama);
       System.out.println(nim);
       
       System.out.printf("Nama saya %s dengan NIM %s dengan IPK %,2f",nama,nim,ipk);
    }
    
}
