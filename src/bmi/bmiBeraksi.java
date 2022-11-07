package bmi;
import javax.swing.*;

public class bmiBeraksi {
    public static void main(String[] args){
        Bmi hitung = new Bmi();
        
        while (true) {
            String tinggi = JOptionPane.showInputDialog("Masukkan Tinggi Badan Kamu (cm)");
            if (tinggi == null || tinggi == "null" || tinggi == "") {
                System.exit(0);
            } 
            String berat = JOptionPane.showInputDialog("Masukkan Berat Badan Kamu (kg)");
            if (berat == null || berat == "null" || berat == "") {
                System.exit(0);
            }

            double hsl = hitung.hitungBmi(Double.parseDouble(berat), Double.parseDouble(tinggi));

            hitung.getBmi(hsl);
        }
    }
}
