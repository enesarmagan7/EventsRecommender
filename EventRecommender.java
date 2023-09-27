package Letcode;

import java.util.Scanner;

public class EventRecommender {
    public static void main(String[] args) {
        int heat;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz..");
        heat=sc.nextInt();
        if(heat<5){
            System.out.println("Kayak yapabilirsin.");
        }
        else if(heat>=5 && heat <=15){
            System.out.println("Sinemaya gidebilirsin.");
        }
        else if(heat>=15 && heat<=25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        else{
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
