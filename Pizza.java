package Lista20;

public class Pizza {
   String sabor;
   int tamanho;
   boolean borda;
   public void preparar() {
	   System.out.println("Preparando pizza de: "+sabor);
   }
   public void assando() {
	   System.out.println("Assando pizza tamanho: "+tamanho);
   }
   public void mostrarinfo() {
	   System.out.println("Sabor: " + sabor);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Borda: " + borda);
		System.out.println("------------------------");
		
		
   }
}
