package org.acme.model;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Pessoa extends PanacheEntity {
    public String nome;
    public int idade;
    
    public Pessoa() {
    	
    }

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
    
    public static Pessoa findByName(String nome) {
        return find("nome", nome).firstResult();
    }

   
    public static List<Pessoa> findOlderThan(int idade) {
        return list("idade > ?1", idade);
    }

    
}
