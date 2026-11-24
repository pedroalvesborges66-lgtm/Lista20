package Lista20;

public class Musica {
     String titulo;
     String artista;
     int duracao;
      public void tocar() {
    	  System.out.println("Tocando "+titulo+" de "+artista);
      }
      public void pausar() {
    	  System.out.println("Música pausada");
      }
      
      public void mostrardetalhes() {
    	System.out.println("Titulo: " + titulo);
  		System.out.println("Artista: " + artista);
  		System.out.println("Duração: " + duracao);
  		System.out.println("------------------------");
      }
 
}
