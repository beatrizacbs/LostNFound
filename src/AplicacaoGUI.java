import GUI.TelaInicial;
import LF.Fachada.Fachada;


public class AplicacaoGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fachada fachada = Fachada.getInstance();
		TelaInicial inicial = new TelaInicial();
		inicial.setVisible(true);
	}

}
