package bancario.ipi.modelo;

import java.util.Date;
import java.util.Objects;

public class Conta {

	String numero;
    private float saldo;
	Date dataAbertura;
	boolean status;
	
	
	public Conta(String numero) {
		this.numero = numero;
		this.saldo = 0f;
		this.dataAbertura = new Date();
		this.status = true;
	}
	
	public Conta() {
		
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status=" + status
				+ "]";
	}
	
	public boolean depositar(float quantia) {
		if(quantia > 0) {
			this.saldo += quantia;
			return true;
		}else
			return false;
	}
	
	public boolean sacar(float quantia) {
		if(quantia > 0 && saldo <= quantia && status == true) {
			saldo -= quantia;
			return true;
		}
		else
			return false;
	}
	
	public void desativarConta() {
		status = false;
	}
	
	public void ativarConta() {
		status = true;
	}
	
	public void transferir(float quantia, Conta destino) {
		if(quantia > 0 && this.saldo >= quantia && destino.status && this.status) {
			this.saldo -= quantia;
			destino.saldo += quantia;
			System.out.println("Tudo certo!");
		}
		else
			System.out.println("A transferência não pôde ser realizado!");
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numero, other.numero);
	}
	
	
	
}
