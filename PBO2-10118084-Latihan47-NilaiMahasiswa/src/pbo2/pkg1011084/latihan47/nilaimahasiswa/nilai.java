/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011084.latihan47.nilaimahasiswa;

/**
 *
 * @author Freza
 */
public class nilai {
    private double quiz;
    private double uts;
    private double uas;
    private double nilaiAkhir;

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getUas() {
        return uas;
    }
    
    public double nilaiAkhir(double quiz,double uts,double uas){
    return 0.2*quiz+0.3*uts+0.5*uas;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public void index(double nilaiAkhir){
        if(nilaiAkhir<=100){
            System.out.println("index = A");
        }
        else if(nilaiAkhir<80){
            System.out.println("index = B");
            
        }
        else if(nilaiAkhir<68){
            System.out.println("index = C");
            
        }
         else if(nilaiAkhir<56){
            System.out.println("index = D");
            
        }
         else if(nilaiAkhir<45){
            System.out.println("index = E");
            
        }
        
    
    }
    public void keterangan(double nilaiAkhir){
     if(nilaiAkhir<=100){
            System.out.println("Sangat Baik");
        }
        else if(nilaiAkhir<80){
            System.out.println("Baik");
            
        }
        else if(nilaiAkhir<68){
            System.out.println("Cukup");
            
        }
         else if(nilaiAkhir<56){
            System.out.println("Kurang");
            
        }
         else if(nilaiAkhir<45){
            System.out.println("Sangat Kurang");
            
        }
    }
    
}
