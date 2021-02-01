/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Cliente MMS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A=input.nextDouble();
        double B=input.nextDouble();
        double C=input.nextDouble();
        double delta,raiz1,raiz2;
        double div;
        
        double b2=B*B;
        double d1=b2-4*A*C;

        if(d1<0){
            System.out.println("Impossível calcular");
        }else{
         delta=Math.sqrt(d1);

         div=2*A;
        if(div==0){
            System.out.println("Impossível calcular");
        }else{
            
             raiz1=(-B+ delta)/div;
             raiz2=(-B-delta)/div;
             
             System.out.format("X1 = %.5f\n", raiz1);
             System.out.format("X2 = %.5f\n",raiz2);
             


        }}
        
        
        
        
        // TODO code application logic here
    }
    
}
