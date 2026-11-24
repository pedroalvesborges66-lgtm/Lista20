package Lista20;

public class filme {
   String titulo;
   String genero;
   int duracao;
   public void assistir() {
		System.out.println("Assistindo: "+titulo);
	}
   public void mostrardetalhes() {
	   	System.out.println("Titulo: " + titulo);
	 		System.out.println("Genero: " + genero);
	 		System.out.println("Duração: " + duracao);
	 		System.out.println("------------------------");
	     }

}
