public class App {
    public static void main(String[] args) throws Exception {
        fila f = new fila();

        f.adicionar(10);
        f.adicionar(20);
        f.adicionar(30);
        f.adicionar(40);

        f.remover();
        f.remover();
        f.remover();

        f.adicionar(50);
        f.adicionar(60);
        f.adicionar(70);

        f.remover();
        f.remover();

        f.mostrarFila();

    }
}
