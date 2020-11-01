/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas24;
import java.util.Scanner;

/**
 *
 * @author
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {
    public static void PerbandinganAngka(int FirstNumber, int SecondNumber){
        if(FirstNumber > SecondNumber){
            System.out.println(FirstNumber+" Lebih besar dari "+SecondNumber);
        }else if(FirstNumber < SecondNumber){
            System.out.println(FirstNumber+" Lebih kecil dari "+SecondNumber);
        }else{
            System.out.println(FirstNumber+" Sama dengan "+SecondNumber);
        }
    }
    public static void main(String[] args) {
        int FirstNumber, SecondNumber;
        String isRepeat = "ya";
        while(isRepeat.equals("ya")){
            var Keyboard = new Scanner(System.in);
            
            System.out.println("Masukan Angka Pertama: ");
            FirstNumber = Keyboard.nextInt();
            System.out.println("Masukan Angka Kedua: ");
            SecondNumber = Keyboard.nextInt();
            
            PerbandinganAngka(FirstNumber, SecondNumber);
            System.out.println("Ulangi Aktifitas? (ya/tidak) : ");
            isRepeat = Keyboard.next();
        }
    }
}
