package com.spring.codeblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


/**
 *
 * @author iddsp
 */
@Entity
@Table(name="TAB_POST")
public class Post implements Serializable {
    
  /**Variaveis*/  
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank
    private String titulo;
    
    @NotBlank
    private String autor;
    
    @NotBlank
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;
    
    @NotBlank
    @Lob
    private String texto;
    
    
/**Getters e Setters */
 

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }

  
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }

 
    public void setAutor(String autor) {
        this.autor = autor;
    }

 
    public LocalDate getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    

    
}
