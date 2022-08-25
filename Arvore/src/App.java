public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArvoreBinaria a = new ArvoreBinaria();
		
		a.insere(20);
		a.insere(25);
		a.insere(10);
		a.insere(15);
		a.insere(30);
		a.insere(23);
		a.insere(24);
		a.insere(35);

		a.preOrdem();
		System.out.println("");
		a.inOrdem();
		System.out.println("");
		a.posOrdem();
		System.out.println("");
		System.out.println("");
		
		a.remove(a, 10);

		a.busca(15);
		a.busca(12);
		
		System.out.println("");
		a.preOrdem();
		System.out.println("");
		a.inOrdem();
		System.out.println("");
		a.posOrdem();
	}

}
