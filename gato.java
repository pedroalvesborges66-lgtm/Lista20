package Lista20;

public class gato {
  String nome;
  String raca;
  int idade;
  
  public void miar() {
	  System.out.println("Miau");
  }
  
  public void comer() {
	  System.out.println(nome+" está comendo");
  }
  
  public void mostrar() {
	  System.out.println("Nome: " + nome);
		System.out.println("Raça: " + raca);
		System.out.println("Idade: " + idade);
  }
}
