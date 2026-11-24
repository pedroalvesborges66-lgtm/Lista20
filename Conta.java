package Lista20;

public class Conta {
  String titular;
  double saldo;
  
  public void depositar(double valor) {
	  saldo = saldo + valor;
	  System.out.println("Deposito realizado");
	}
  public void sacar(double valor) {
		if(valor <saldo) {
			saldo = saldo - valor;
			System.out.println("Você tem saldo");	
		}else {
			System.out.println("Você não tem saldo");
		}
	}
  public void mostrarsaldo() {
		System.out.println("Saldo: "+saldo);
	}
}
