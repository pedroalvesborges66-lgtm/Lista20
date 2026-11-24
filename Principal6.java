package Lista20;

public class Principal6 {

	public static void main(String[] args) {
		filme f1 = new filme();
		f1.titulo = "Avengers";
		f1.genero = "Ação";
		f1.duracao = 143;
		
		filme f2 = new filme();
		f2.titulo = "Minh culpa";
		f2.genero = "Romance";
		f2.duracao = 120;
		
		filme f3 = new filme();
		f3.titulo = "Homem-Aranha";
		f3.genero = "Ação";
		f3.duracao = 144;
		
		f1.assistir();
        f1.mostrardetalhes();
        
        f2.assistir();
        f2.mostrardetalhes();
        
        f3.assistir();
        f3.mostrardetalhes();
			}
	

}
