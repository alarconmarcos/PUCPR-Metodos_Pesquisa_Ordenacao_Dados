public class App {
    public static void main(String[] args) throws Exception {
        
        Lista l = new Lista();
        l.insereUltimo(10);
        l.insereUltimo(20);
        l.insereUltimo(30);

        l.inserePrimeiro(50);
        l.insereUltimo(5);

        l.mostrar();
    }
}
