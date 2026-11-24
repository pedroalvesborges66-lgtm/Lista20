package Lista20;

public class Principal7 {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Pedro";
		c1.saldo = 11000;
		
		Conta c2 = new Conta();
		c2.titular = "Maria";
		c2.saldo = 21000;
		
		c1.depositar(1000);
		c1.sacar(4000);
		c1.mostrarsaldo();
		
		c2.depositar(3000);
		c2.sacar(1000);
		c2.mostrarsaldo();
		
	}

}
