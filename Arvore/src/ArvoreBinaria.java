public class ArvoreBinaria {
    private No raiz;

    private void preOrdem(No no) {
    	if (no != null) {
    		System.out.print(no.info() + " ");
            preOrdem(no.left());
            preOrdem(no.right());
        }
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    private void inOrdem(No no) {
        if (no != null) {
            inOrdem(no.left());
            System.out.print(no.info() + " ");
            inOrdem(no.right());
        }
    }

    public void inOrdem() {
        inOrdem(raiz);
        
    }

    private void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.left());
            posOrdem(no.right());
            System.out.print(no.info() + " ");
        }
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    public No getRaiz() {
        return raiz;
    }

    public void insere(Integer valor) {
        insere(raiz, valor);
    }

    private void insere(No no, Integer valor) {
        if (no == null)
            raiz = new No(valor);
        else if (valor >= no.info())
            if (no.right() == null)
                no.setRight(new No(valor));
            else
                insere(no.right(), valor);
        else if (no.left() == null)
            no.setLeft(new No(valor));
        else
            insere(no.left(), valor);
    }
    
    public No busca(Integer valor) {
        return busca(raiz, valor);
    }

    private No busca(No no, Integer valor) {
        if (no != null) {
            if (no.info() == valor) {
                System.out.println("Nó "+valor+" encontrado!");
                return no;
            } else if (valor >= no.info()) {
                return busca(no.right(), valor);
            } else {
                return busca(no.left(), valor);
            }
        } else {
            System.out.println("Nó "+valor+" não encontrado!");
            return null;
        }
    }

    public No remove(ArvoreBinaria bt, Integer valor) {
        No balancear = remove(bt, raiz, valor, null);
        return balancear;
    }

    private No remove(ArvoreBinaria bt, No no, Integer valor, No pai) {
        if (no != null) {
            if (no.info() == valor) {
                if (no.left() == null && no.right() == null) {  //Sem filhos
                    if(pai == null) {
                        bt.raiz = null;
                    }
                    else if (no.info() >= pai.info()) {
                        pai.setRight(null);
                    } else {
                        pai.setLeft(null);
                    }
                    return no;
                } else if (no.left() == null) {                   //Somente um filho na direita
                    if (no.info() >= pai.info()) {
                        pai.setRight(no.right());
                    } else {
                        pai.setLeft(no.right());
                    }
                    no.setLeft(null);
                    return no;
                } else if (no.right() == null) {                  //Somente um filho na esquerda
                    if (no.info() >= pai.info()) {
                        pai.setRight(no.left());
                    } else {
                        pai.setLeft(no.left());
                    }
                    no.setLeft(null);
                    return no;
                } else {        
                    int menor = menorLeft(no).info();  
                    int removeinfo = remove(bt, menor).info();                         //Dois filhos
                    no.setInfo(removeinfo);
                    return no;
                }
            }
            if (valor >= no.info()) {
                return remove(bt, no.right(), valor, no);
            } else {
                return remove(bt, no.left(), valor, no);
            }
        }
        return null;
    }

    private No menorLeft(No no) {
        if (no.left() != null) {
            no = no.left();
            while (no.right() != null) {
                no = no.right();
            }
        }
        return no;
    }
}
