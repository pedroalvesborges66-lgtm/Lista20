package Lista20;

public class Videogame {
 String marca;
 String modelo;
 boolean ligado;
 public void ligar() {
	 ligado = true;
	 System.out.println("O console está ligado");
 }
 public void desligado() {
	 ligado = false;
	 System.out.println("O console está ligado");
 }
 public void status() {
	 if(ligado) {
		 System.out.println("O console está ligado");
	 }else {
		 System.out.println("O console não está ligado");
	 }
	 
	 
 }
 
}
