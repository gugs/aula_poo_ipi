package bancario.ipi.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Cliente {

	String cpf;
	String nome;
	ArrayList<Conta> contas = new ArrayList<>();
	HashSet<String> telefones = new HashSet<>();
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}


	

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", contas=" + contas + ", telefones=" + telefones + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
}
