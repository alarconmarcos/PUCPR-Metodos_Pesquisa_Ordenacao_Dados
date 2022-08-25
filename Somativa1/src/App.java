public class App {
    
    public static void main(String[] args) throws Exception {

    	showMenu();
    }

    public static void showMenu (){

        //Cria uma lista
        No no;
    	Lista l = new Lista();

    	String menu = "";
		String entrada;
		int    opc;

		do {
			menu = "Opções:\n\n" + 
					"1 - Verifica se a lista está vazia\n" +
					"2 - Insere Nó no início\n" +
					"3 - Insere Nó no final\n" +
					"4 - Mostrar lista\n" +
					"5 - Remove último Nó\n" +
					"6 - Remove primeiro Nó\n" +
					"7 - Insere Nó depois de um Nó\n" +
					"8 - Remove um Nó determinado\n" +
					"9 - Sair";
			entrada = Mensagem.input(menu + "\n\n", null);
			opc = l.retornaInteiro(entrada);

			switch (opc) {
			case 1: //Verifica se a lista esta vazia
				if (l.vazia())
					Mensagem.mensagem("A Lista está vazia", null, Mensagem.IconInfo);
				else
					Mensagem.mensagem("A Lista não está vazia, há "+l.qtdLista()+" iten(s) na Lista", null, Mensagem.IconInfo);
					
				break;

			case 2: // Insere o NO no inicio da lista
				
				int value = l.retornaInteiro(Mensagem.input("Digite um valor para o Nó: ", null));
		        l.inserePrimeiro(value);
		        Mensagem.mensagem("Nó adicionado no início da lista com sucesso", null, Mensagem.IconInfo);
				break;

			case 3: // Insere o NO no final da lista

				int value3 = l.retornaInteiro(Mensagem.input("Digite um valor para o Nó: ", null));
		        l.insereUltimo(value3);
		        Mensagem.mensagem("Nó adicionado no final da lista com sucesso", null, Mensagem.IconInfo);
				
				break;
		
			case 4: // Mostrar lista
				if (l.vazia())
					Mensagem.mensagem("A Lista está vazia", null, Mensagem.IconInfo);
				else
					l.mostrar();


				break;
			case 5: // Remove Ultimo NO
		        l.removeUltimo();

				break;
			case 6: // Remove primeiro NO
		        l.removePrimeiro();

				break;
			case 7: // Insere NO depois de um NO
				int nvalue = l.retornaInteiro(Mensagem.input("Digite o valor do novo Nó: ", null));

				int ovalue = l.retornaInteiro(Mensagem.input("Informe após qual Nó deve ser inserido o novo Nó: ", null));

				//Adicionado o metodo buscar para encontrar o NO informado antes de inserir Depois
		        no = l.buscar(ovalue);
		        if (no != null) {
		        	l.insereDepois(no, nvalue);
			        Mensagem.mensagem("Nó adicionado na posição informada com sucesso", null, Mensagem.IconInfo);
	        	
		        }else {
			        Mensagem.mensagem("O Nó informado não existe na Lista", null, Mensagem.IconError);
		        	
		        }
		        	
				break;
			case 8: // Remove um NO determinado
				
				int oldvalue = l.retornaInteiro(Mensagem.input("Informe qual Nó deve ser removido: ", null));
				
		        //Adicionado o metodo buscar para encontrar o NO informado antes de remove-lo
		        no = l.buscar(oldvalue);
		        if (no != null) { 
		        	l.remove(no);
			        Mensagem.mensagem("Nó informado removido da Lista com sucesso", null, Mensagem.IconInfo);
		        	
		        }else { 
	     	        Mensagem.mensagem("O Nó informado não existe na Lista", null, Mensagem.IconError);
		        }
				
				break;
			case 9: // Finaliza o programa
				
				Mensagem.mensagem("Fim do Programa", null, Mensagem.IconInfo);
				break;
			}
		} while (opc != 9);
	}
}
