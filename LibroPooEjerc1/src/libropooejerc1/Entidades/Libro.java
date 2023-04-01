/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libropooejerc1.Entidades;

/**
 *
 * @author molin
 */
public class Libro {
    
    public String ISBN; 
    public String Título;
    public String Autor;
    public int páginas;

    public Libro() {
        
    }

    public Libro(String ISBN, String Título, String Autor, int páginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.páginas = páginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", p\u00e1ginas=" + páginas + '}';
    }
    
   
}   

