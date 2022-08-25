public class Lista {
	private No primeiro;

	// Cria a Lista
	public Lista() {
		primeiro = null;
	}

	// Verifica se a lista esta vazia, se retornar falso a lista tem NOS
	public boolean vazia() {
		return primeiro == null;
	}

	//Metodo criado para exibir quantos itens tem na lista
	public int qtdLista() {
		No no = this.primeiro;
		int qtd = 0;
		while (no != null) { 
			no = no.getProx();
			qtd++;
		}
		return qtd;
	}
	
	// Insere um NO no inicio da Lista
	public void inserePrimeiro(int info) {
		No auxiliar = new No();
		auxiliar.setInfo(info);
		auxiliar.setProx(primeiro);
		primeiro = auxiliar;
	}

	// Insere um NO no final da Lista
	public void insereUltimo(int info) {

		// Se a lista estiver vazia, insere um NO no inicio
		if (vazia() == true) {
			inserePrimeiro(info);
		}

		// senao, insere no final
		else {
			No auxiliar = primeiro;

			while (auxiliar != null && auxiliar.getProx() != null) {
				auxiliar = auxiliar.getProx();
			}

			if (auxiliar.getProx() == null) {
				No novoNo = new No();
				novoNo.setInfo(info);
				auxiliar.setProx(novoNo);
			}

		}

	}

	// Metodo para mostrar a lista
	public void mostrar() {
		No auxiliar = primeiro;
		String lc = "";
		while (auxiliar != null) {
			lc += auxiliar.getInfo() + ", ";
			auxiliar = auxiliar.getProx();
		}
		Mensagem.mensagem(lc, null, Mensagem.IconInfo);
	}

	// Metodo que remove o ultimo NO
	public void removeUltimo() {

		// Verifica se a lista esta vazia
		if (vazia()) {
			Mensagem.mensagem("A Lista está vazia!", null, Mensagem.IconAlert);
		}

		// senao percorre a lista ate encontrar o ultimo NO
		else {
			No auxiliar = primeiro;

			if (auxiliar.getProx() == null) {

				Mensagem.mensagem("Existe apenas o Nó inicial: " + auxiliar.getInfo(), null, Mensagem.IconAlert);

			} else {

				while (auxiliar.getProx() != null) {
					No umAFrente = auxiliar.getProx();

					if (umAFrente.getProx() == null) {
						break;
					} else {
						auxiliar = auxiliar.getProx();
					}
				}

				auxiliar.setProx(null);
				Mensagem.mensagem("Último Nó removido com sucesso", null, Mensagem.IconInfo);
			}
		}
	}
	
	//Se a lista nao tiver vazia define como primeiro da lista o proximo NO da lista
	public void removePrimeiro() {
		if (vazia()) 
			Mensagem.mensagem("A Lista está vazia!", null, Mensagem.IconError);	
		else {
			primeiro = primeiro.getProx();
			Mensagem.mensagem("Primeiro Nó removido com sucesso", null, Mensagem.IconInfo);
		}
	}

	//Metodo criado para encontrar um NO determinado, onde roda a lista ate encontrar
	public No buscar(int info) {
		No no = this.primeiro;
		while ((no != null) && (no.getInfo() != info)) 
			no = no.getProx();
		return no;
		
	}
	
	//Insere um novo NO depois de um NO determinado
	public void insereDepois(No no, int info) {
		No novo = new No();
		novo.setInfo(info);
		
		novo.setProx(no.getProx());
		no.setProx(novo);
	}
	
	//Remove um NO determinado
	public void remove(No no) {
		No auxiliar = this.primeiro;
		
		//Se o NO informado para remover for o primeiro NO da lista
		if (auxiliar == no)
			removePrimeiro();

		//Percorre a lista ate encontrar o NO informado
		while ((auxiliar.getProx() != no) && (auxiliar.getProx()!=null)) {
			auxiliar = auxiliar.getProx();
		}
		//Se encontrar, define como proximo do item anterior o NO posterior ao NO removido
		if(auxiliar.getProx()==no) {
			auxiliar.setProx(no.getProx()); 
		
		}
			
	}
	
	public int retornaInteiro(String entrada) { // retorna um valor inteiro

		//Enquanto nao for possivel converter o valor de entrada para inteiro, permanece no loop
		while (!this.intValido(entrada)) {
			entrada = Mensagem.input("Valor incorreto!\n\nDigite um número inteiro.", null);

		}
		return Integer.parseInt(entrada);
	}

	private boolean intValido(String s) {
		try {
			Integer.parseInt(s); // Metodo estatico, que tenta tranformar uma string em inteiro
			return true;
		} catch (NumberFormatException e) { // Nao conseguiu tranformar em inteiro e gera erro
			return false;
		}
	}
	
}
