package Lista20;

public class Principal2 {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.sabor="Frango catupiry";
		p1.tamanho= 6;
		p1.borda= true;
		
		Pizza p2 = new Pizza();
		p2.sabor="Brocolis com bacon";
		p2.tamanho= 4;
		p2.borda= false;
		
		p1.preparar();
		p1.assando();
		p1.mostrarinfo();
		
		p2.preparar();
		p2.assando();
		p2.mostrarinfo();

	}

}
