/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Cliente MMS
 */
public class Livro extends Produto implements Imposto{
    private String autor;
    private String tema;
    private int qtdPag;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public Livro(String autor, String tema, int qtdPag, String nome, double preco, int qtd) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    @Override
    public double calcularImposto() {
        if (getTema().equals("educativo")){
            return 0;
        }else{
            return ((getPreco()*10)/100)+getPreco();
        }
    }

    
   
    
    
}
