
package input;
import java.util.Scanner;

public class imt {
    
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        
        
    /*INPUT*/
        System.out.print("Berat Badan(KG)         : ");
        int berat = masukan.nextInt();
            
        System.out.print("Tinggi Badan(M)         : ");
        double tinggi = masukan.nextDouble();
            
        
    /*NILAI IMT*/   
        double IMT = berat / (tinggi*tinggi);
        String Kriteria;
        if(IMT > 40){
            Kriteria = "Sangat Gemuk";
        }else if(IMT >= 30){
            Kriteria = "Gemuk";
        }else if(IMT >= 25){
            Kriteria = "Berat Badan Lebih";
        }else if(IMT >= 18.5){
            Kriteria = "Berat Badan Ideal";
        }else{
            Kriteria = "Berat Badan Kurang";
        }
        
     
    /*OUTPUT*/
        System.out.println("Nilai IMT               : " + IMT);
        System.out.println("Kriteria                : " + Kriteria);
    }
}
