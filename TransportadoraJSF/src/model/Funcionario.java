package model;

public class Funcionario {

	private Funcionario funcionario;
	private String nome;
	private String sobrenome;
	private char cpf;
	private int registroInterno;
	private String funcao;

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

	public char getCpf() {
		return cpf;
	}

	public void setCpf(char cpf) {
		this.cpf = cpf;
	}

	public int getRegistroInterno() {
		return registroInterno;
	}

	public void setRegistroInterno(int registroInterno) {
		this.registroInterno = registroInterno;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}



}
