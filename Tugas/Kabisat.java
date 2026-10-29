package Tugas;


import java.util.Scanner;
public class Kabisat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int tahun;
        System.out.println("Masukkan tahun (1909-2024)  :");  
        tahun = input.nextInt();
        
        if (tahun < 1909 || tahun >2024){
            System.out.println("tahun harus berapa dalam rentang 1909-2024.");
        }else if(tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)){
            System.out.println(tahun + "Adalah tahun kabisat");
        }else{
            System.out.println(tahun + "Bukan tahun kabisat" );
        }
    }
    
}