package Lista20;

public class Principal3 {
	public static void main(String[] args) {
	Videogame v1 = new Videogame();
    v1.marca = "Xbox";
    v1.modelo="360";
    v1.ligado=true;
    
    v1.ligar();
    v1.desligado();
    v1.status();
	}
}
