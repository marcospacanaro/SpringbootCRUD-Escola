package br.com.escola.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_turma")

public class Turma {
	
	//Atributos
	
	@Id                                                  
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	
	@Column(name = "id_turma") 
	private long id;
	
	@Column(name = "nome_turma")
	@NotNull
	private String turma;
	
	@Column(name = "ativo_turma")
	private boolean ativo;
	
	//Getters e Setters 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
