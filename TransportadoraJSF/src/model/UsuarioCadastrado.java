package model;

import java.util.List;

public class UsuarioCadastrado {

	private String nome;
	private String sobrenome;
	private char telefone;
	private Endereco endereco;
	private String login;
	private String senha;
	private char cnpj;
	private char cpf;
	private List<Pacote> pacotes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public char getTelefone() {
		return telefone;
	}

	public void setTelefone(char telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public char getCnpj() {
		return cnpj;
	}

	public void setCnpj(char cnpj) {
		this.cnpj = cnpj;
	}

	public char getCpf() {
		return cpf;
	}

	public void setCpf(char cpf) {
		this.cpf = cpf;
	}

	public List<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(List<Pacote> pacotes) {
		this.pacotes = pacotes;
	}

}
