/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Cliente MMS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro L1=new Livro("J.K.Roling","fantasia",300,"Harry Potter", 40.0,50);
        Livro L2=new Livro("J.R.R. Tolkien", "fantasia",500,"Senhor dos Anéis" ,60.0,30);
        Livro L3=new Livro("GFT", "educativo",500,"Java POO",20.0,50);
        
        VideoGame ps4=new VideoGame("Sony", "Slim", false,"PS4", 1800.0,100);
        VideoGame ps4Usado=new VideoGame("Sony", "Slim", true,"PS4",1000.0,7);
        VideoGame xbox=new VideoGame("Microsoft", "One",false, "XBOX", 1500.0,500);
        
        ArrayList<Livro> livros=new ArrayList();
        livros.add(L1);
        livros.add(L2);
        livros.add(L3);
        
        ArrayList<VideoGame> games=new ArrayList();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);
        
        Loja americanas=new Loja("Americanas","123456",livros,games);
        
        System.out.println("Testando calculo de impostos");
        System.out.println(L2.calcularImposto());
        System.out.println(L3.calcularImposto());
        System.out.println(ps4Usado.calcularImposto());
        System.out.println(ps4.calcularImposto());
        
        System.out.println("Fim do teste");
        
        System.out.println("Testando metodos ListaLivros e ListaVideoGames");
        
        //System.out.println(americanas.listaLivros());
        //System.out.println(americanas.listaVideoGames());
        
        System.out.println("Fim dos testes");
        
        System.out.println();
        
       /* System.out.println("testando calcular patrimonio");
        System.out.println("O patrimonio da loja "+ americanas.getNome()+" é igual a R$ "+ americanas.calculaPatrimonio());
        System.out.println("Fim do teste");
        
        // TODO code application logic here*/
    }
    
}
