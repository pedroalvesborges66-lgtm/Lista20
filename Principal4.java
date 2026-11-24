package Lista20;

public class Principal4 {

	public static void main(String[] args) {
		Musica m1 = new Musica();
	    m1.titulo = "M4";
	    m1.artista="Teto";
	    m1.duracao=3;
	    
	    Musica m2 = new Musica();
	    m2.titulo = "Jeito bandido";
	    m2.artista="Veigh e Kyan";
	    m2.duracao=4;
	    
	    Musica m3 = new Musica();
	    m3.titulo = "Paypal";
	    m3.artista="Teto";
	    m3.duracao=3;
	    
	    m1.tocar();
	    m1.pausar();
	    m1.mostrardetalhes();
	    
	    m2.tocar();
	    m2.pausar();
	    m2.mostrardetalhes();
	    
	    m3.tocar();
	    m3.pausar();
	    m3.mostrardetalhes();
	    
	}

}
