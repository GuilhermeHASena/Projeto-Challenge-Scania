package br.com.scania.dto;

public class Usuario {
	
	private long usuario_id;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario(long usuario_id, String nome, String email, String senha) {
		this.usuario_id = usuario_id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public long getId() {
		return usuario_id;
	}

	public void setId(long usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
