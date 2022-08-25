import java.util.*;

public class App {

public static void main(String argumentos[]){
    Integer []vetor = {1, 5, 2, 3, 1, 3, 1};
    System.out.print("MODA: ");

//    System.out.println();
       Integer[] result = moda(vetor);

       for(int i = 0; i< result.length;i++) {
           if (i>0) {
              System.out.print(", "+result[i]);    
           } else {
              System.out.print(result[i]);    
           }
    }

}

  public static Integer[] moda(Integer[] vetor){
      Set<Integer> modas = new LinkedHashSet<Integer>(  );
      int maxCount=0;   
      for (int i = 0; i < vetor.length; ++i){
        int count = 0;
        for (int j = 0; j < vetor.length; ++j){
          if (vetor[j] == vetor[i]) 
              ++count;
        }
        if (count > maxCount){
          maxCount = count;
          modas.clear();
          modas.add( vetor[i] );
        } else if ( count == maxCount ){
          modas.add( vetor[i] );
        }
      }
      return modas.toArray( new Integer[modas()]);
    }

private static int modas() {
    // TODO Auto-generated method stub
    return 0;
}
}