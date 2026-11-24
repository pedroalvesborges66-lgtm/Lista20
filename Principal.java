package Lista20;

public class Principal {

	public static void main(String[] args) {
		gato g1 = new gato ();
		g1.nome="Thor";
		g1.raca="Vira lata";
		g1.idade=4;
		gato g2 = new gato();
		g2.nome="Sales";
		g2.raca="Maine Coon";
		g2.idade=5;
		
		
		g1.miar();
		g1.comer();
		g2.miar();
		g2.comer();
	}
}
