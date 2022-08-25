public class fila {
    int[] fila;
    int inicio;
    int fim;

    public fila() {
        inicio = -1;
        fim = -1;
        fila = new int[10];       
    }

    public void adicionar(int valor){
        if(fim != fila.length-1){
            if(inicio==-1){
                inicio=0;
            }

            fim++;
            fila[fim] = valor;

        }
    }
    public void remover(){
        if(estaVazia()==false){
            inicio++;
   
        }
    }    
            
    public boolean estaVazia(){
        if (inicio==-1){
            return true;           
        }    
        return false;
    }

    public boolean estaCheia(){
        if(fim == fila.length-1){
            return true;           
        }    
        return false;
    }



    public void mostrarFila(){
        for (int i = inicio; i <= fim; i++) {
            System.out.print(fila[i]+ "<-");
            
        }
    }
}