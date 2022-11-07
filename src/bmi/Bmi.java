package bmi;
import java.text.*;
import javax.swing.*;

public class Bmi {
    Double hitungBmi(double berat, double tinggi)
    {       
       double tb = tinggi / 100;
       double bmi = berat / (tb * tb);
       return bmi;
    }   
    
    void getBmi(double bmi){
        NumberFormat nf = new DecimalFormat(".##");
        String hsl = nf.format(bmi);
        if (bmi < 18.5) {
            JOptionPane.showMessageDialog(null, "BMI : " + hsl + "\nBerat Badan Kurang", "Hasil Perhitungan", 2);
        } else if (bmi < 25) {
            JOptionPane.showMessageDialog(null, "BMI : " + hsl + "\nIdeal", "Hasil Perhitungan", 1);
        } else if (bmi < 30) {
            JOptionPane.showMessageDialog(null, "BMI : " + hsl + "\nKegemukan", "Hasil Perhitungan", 2);
        } else {
            JOptionPane.showMessageDialog(null, "BMI : " + hsl + "\nObesitas", "Hasil Perhitungan", 0);
        }
 
    }
}