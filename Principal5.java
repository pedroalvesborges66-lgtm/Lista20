package Lista20;

public class Principal5 {

	public static void main(String[] args) {
		Produto p1 = new Produto();
	    p1.Nome = "Monitor";
	    p1.preco=1300;
	    p1.estoque=30;
	
	    Produto p2= new Produto();
        p2.Nome = "Mouse G pro";
        p2.preco=700;
        p2.estoque=20;
        
        p1.vender(10);
        p1.mostrardetalhes();
        
        p2.vender(9);
        p2.mostrardetalhes();
        
}

}
