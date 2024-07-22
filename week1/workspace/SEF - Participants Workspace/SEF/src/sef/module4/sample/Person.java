package sef.module4.sample;

import java.util.Calendar;

public class Person {

	//Attributes
	private String name;
	private int idade;
	
	//Behavior
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name,int idade){
		this.name = name;
		this.idade= idade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String introduce(){
		return "My name is " + name;
	}

	public String qual_Idade() {
		return "Person [idade=" + idade + "]";
	}

	
}
