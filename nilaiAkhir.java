package input;
import java.util.Scanner;

public class nilaiAkhir {

 
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
       
        /*INPUT*/
            System.out.print("NPM: ");
            String npm = masukan.nextLine();
            
            System.out.print("Nama Mahasiswa: ");
            String nama = masukan.nextLine();
            
            System.out.print("Nilai Kehadirsn: ");
            int absen = masukan.nextInt();
            
            System.out.print("Nilai Tugas: ");
            int tugas = masukan.nextInt();
            
            System.out.print("Nilai UTS: ");
            int uts = masukan.nextInt();
            
            System.out.print("Nilai UAS: ");
            int uas = masukan.nextInt();
            
            
        /*VARIABLE NILAI AKHIR*/    
            double nilaiAkhir = (absen*0.1)+(tugas*0.2)+(uts*0.3)+(uas*0.4);
           
        
        /*VARIABLE GRADE*/    
            char Grade;
            if(nilaiAkhir >= 76){
                Grade = 'A';
            }else if(nilaiAkhir >= 66){
                Grade = 'B';
            }else if(nilaiAkhir >= 56){
                Grade = 'C';
            }else if(nilaiAkhir >= 46){
                Grade = 'D';
            }else{
                Grade = 'E';
            }
        
            
        /*VARIABLE KETERANGAN*/    
            String Keterangan;
            if(nilaiAkhir >= 76){
                Keterangan = "ISTIMEWA";
            }else if(nilaiAkhir >= 66){
                Keterangan = "BAIK";
            }else if(nilaiAkhir >= 56){
                Keterangan = "CUKUP";
            }else if(nilaiAkhir >= 46){
                Keterangan = "KURANG";
            }else{
                Keterangan = "KURANG SEKALI";
            }
            
            
        /*OUTPUT*/
            System.out.println("NPM Mahasiswa   : " + npm);
            System.out.println("Nama Mahsiswa   : " + nama);
            System.out.println("Nilai Akhir     : " + nilaiAkhir);
            System.out.println("Grade           : " + Grade);
            System.out.println("Keterangan      : " + Keterangan);
    }
    
}
