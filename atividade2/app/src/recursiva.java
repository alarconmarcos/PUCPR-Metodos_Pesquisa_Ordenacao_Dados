
public class recursiva {

	public int recursiva2(int valor1, int valor2)
	{
	    if(valor1 == 5)
	    {
	        return -1;
	    }
	    else if(valor1 < valor2)
	    {
	        return 1 + recursiva2(valor1+1, valor2-1);
	    }
	    else
	    {
	        return 2 + recursiva2(valor1+1, valor2-1);
	    }
	} 
	
}
