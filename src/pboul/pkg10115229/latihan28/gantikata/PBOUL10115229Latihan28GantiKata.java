/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class PBOUL10115229Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sandu = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat\t: ");
        String kernel = sandu.nextLine();
        
        StringBuffer pretelan = new StringBuffer (kernel);
        
        System.out.println("Kata yang diganti\t: ");
        String crul = sandu.nextLine();
        
        int id = kernel.indexOf(crul);
        
        System.out.println("Kata pengganti\t: ");
        String mahu = sandu.nextLine();
        
        StringBuffer man = new StringBuffer(mahu);
        
        int id1 = crul.length();
        pretelan.delete(id,id+id1);
        pretelan.insert(id,man);
        
        System.out.println("Menjadi\t: ");
        System.out.println(pretelan.toString());
        
        System.out.println("");
        System.out.println(" develop BY: Muhammad Lukman Hakim ");

        
        
    }
    
}
