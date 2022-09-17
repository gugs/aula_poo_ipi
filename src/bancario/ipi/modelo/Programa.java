package bancario.ipi.modelo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c1 = new Conta("123A");
		
		Conta c2 = new Conta("222A");
		
		Conta c3 = new Conta("321A");
		
		Cliente cli1 = new Cliente("000", "Gustavo");
		
		cli1.telefones.add("83999999999");
		
		cli1.contas.add(c1);
		
		cli1.contas.add(c2);
		
		cli1.contas.add(c3);
		
		System.out.println(cli1);
		
	}

}
