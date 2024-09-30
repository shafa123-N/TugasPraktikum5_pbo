package input;
import java.util.Scanner;

public class diskon {
    
     public static void main(String[] args){
        Scanner masukan = new Scanner(System.in); 
         
        /*INPUT*/
            System.out.print("Total Pembelian             : ");
            int total = masukan.nextInt();
        
            
        /*BESAR POTONGAN & JUMLAH BAYAR*/
            double potongan;
            if(total < 50000){
                potongan = total * 0.05;
                System.out.println("Besarnya Potongan           : " + potongan);
                System.out.println("Jumlah yang Harus Dibayar   : " + (total - potongan));
            }else{
                potongan = total * 0.2;
                System.out.println("Besarnya Potongan           : " + potongan);
                System.out.println("Jumlah yang Harus Dibayar   : " + (total - potongan));
            }
     }
}
