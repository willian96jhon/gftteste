/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Cliente MMS
 */
public class Loja {
    private String nome;
    private String cnpj;
    private Livro[] livros;
    private VideoGame[] videoGames;

    public Loja(String nome, String cnpj, Livro[] livros, VideoGame[] videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    Loja(String americanas, String string, ArrayList<Livro> livros, ArrayList<VideoGame> games) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public VideoGame[] getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(VideoGame[] videoGames) {
        this.videoGames = videoGames;
    }
    
    public void listaLivros(){
        for(int i=0;i<livros.length;++i){
            
        
        System.out.println(livros[i].getNome());
        
    }}
    
    
    public void listaVideoGames(){
        for(int i=0;i<videoGames.length;++i){
            System.out.println(videoGames[i].getNome());
        }
    }
    
    
    public double calculaPatrimonio(){
        double patrimonio=0;
        for(int i=0;i<livros.length;++i){
            patrimonio= patrimonio+livros[i].getPreco();
            
        }
        for(int i=0;i<videoGames.length;++i){
            patrimonio=patrimonio+videoGames[i].getPreco();
        }
        return patrimonio;
        
        }
    
}
