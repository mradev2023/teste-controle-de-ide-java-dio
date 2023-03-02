package br.com.dio.model;

import java.util.Objects;

public class Cachorro {

	private String nome;
	private String cor;
	private Integer data;

	public Cachorro() {
	}

	public Cachorro(String nome, String cor, Integer data) {
		this.nome = nome;
		this.cor = cor;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, data, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cachorro other = (Cachorro) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(data, other.data) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", cor=" + cor + ", data=" + data + "]";
	}

}
