package app;
import service.BancoService;
// Essa classe inicializa a aplicação
public class Main {

	public static void main(String[] args) {
		BancoService banco = new BancoService();
		Menu menu = new Menu(banco);
	    menu.iniciar();

	}

}
