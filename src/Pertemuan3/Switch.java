/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author Katsuki
 */
import java.util.Scanner;
public class Switch {
    public  static void main(String[] args){
        Scanner in=new Scanner(System.in);
		
		long bonus;
		int n,lama,umur;
		
		System.out.println("\n\t==PROGRAM BONUS GAJI KARYAWAN==\n");
        System.out.println("Pilihan Menu\n");
		System.out.println("1.Staff");
		System.out.println("2.Non-Staff\n");
		System.out.print("Pilih Golongan Anda : ");
		n=in.nextInt();
		System.out.print("Masukkan Lama Masa Kerja : ");
		lama=in.nextInt();
        System.out.print("Masukkan Umur : ");
        umur=in.nextInt();
		
		switch(n){
			case 1 : System.out.println("\n=ANDA MERUPAKAN KARYAWAN GOLONGAN STAFF=");
					if(lama>=5){
                        if(umur>=45){
                            bonus = 10000000;
                            System.out.println("Bonus Diterima : "+bonus);
                        }
                        else{
                            bonus = 7000000;
                            System.out.println("Bonus Diterima : "+bonus);
                        }
					}
					else{
						bonus=5000000;
                        System.out.println("Bonus Diterima : "+bonus);
					}
					break;

			case 2 : System.out.println("\n=ANDA MERUPAKAN KARYAWAN GOLONGAN NON-STAFF=");
					if(lama>5){
						if(umur>45){
                            bonus = 6000000;
                            System.out.println("Bonus Diterima : "+bonus);
                        }
                        else{
                            bonus = 2500000;
                            System.out.println("Bonus Diterima : "+bonus);
                        }
					}
					else{
						bonus = 2500000;
                        System.out.println("Bonus Diterima : "+bonus);
					}
					break;
			default : System.out.println("\n-Maaf Pilihan Menu Yang Diinputkan Salah!!-");
			}

    }
}
