// Meu código
public class fibonatti {

	public static void main(String[] args) {

		// teste do programa. Imprime os 20 primeiros termos
		for (int i = 0; i < 20; i++) {
			System.out.print( fibo(i) + " ");
	    }

	}
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

}


/*Código do Feedback

public class Fibonacci {
    int fibo(int n) {
        if(n < 2){
            return n;
        } 
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}


public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 30; i++) {
            System.out.print(f.fibo(i) + " ");
        }
}*/


