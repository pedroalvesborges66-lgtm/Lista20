package Lista20;

public class Produto {
	String Nome;
    int preco;
    int estoque;
    
    public void vender(int quantidade) {
 
    	if(quantidade > estoque) {
    		System.out.println("Estoque insuficiente");
    	}else {
    		estoque= estoque - quantidade;
    				System.out.println("Venda feita");
    	}
    }
     public void mostrardetalhes() {
   	System.out.println("Nome: " + Nome);
 		System.out.println("Preço: " + preco);
 		System.out.println("Estoque: " + estoque);
 		System.out.println("------------------------");
     }
}
