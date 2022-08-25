import javax.swing.JDialog;
import javax.swing.JOptionPane;

//Classe de mensagens utilizando JOptionPane 
public class Mensagem {
	// Constantes com os tipos de icones de mensagem para facilitar
	final static int IconError = 0; 
	final static int IconInfo = 1;
	final static int IconAlert = 2;
	final static int IconQuestion = 3;


	//Metodo de mensagem com input
	public static String input(String texto, String titulo) { 
		if (titulo == null) {
			titulo = "Lista Encadeada";
		}
        return JOptionPane.showInputDialog(null, texto, titulo, 3, null, null, null).toString();		
	
	}
	
	//Metodo de mensagem com opcao de altear o titulo da tela e icone do tipo de mensagem
	public static void mensagem(String texto, String titulo, int tipo) { 
		if (titulo == null) {
			titulo = "Lista Encadeada";
		}
	
		JOptionPane jp = new JOptionPane(texto, tipo, JOptionPane.DEFAULT_OPTION, null);
		
		JDialog dialog = jp.createDialog(null, titulo);
		
	
		dialog.setVisible(true); 
		
	}

}
