package app;
import java.time.LocalDate;
import java.util.Scanner;
import service.BancoService;
import model.Cliente;

public class Menu {
	private BancoService banco;
	Scanner sc = new Scanner(System.in);
	
	public Menu(BancoService banco) {
		this.banco=banco;
		
	}
	
	public void iniciar () {
		boolean sair=false;
		
		while(!sair) {
			System.out.println("=== MENU ===\n 1- Criar Cliente\n 2- Depositar\n 3- Sacar\n 4- Tranferir\n"
					+ " 5- Consultar\n 6- Histórico\n 0- sair\n -Escolha uma opção-");
			
			int opcao=sc.nextInt();
			switch(opcao) {
			case 1:
				criarCliente();
				break;
			case 2:
				depositar();
				break;
			case 3:
				sacar();
				break;
			case 4:
				transferir();
				break;
			case 5:
				consultarSaldo();
				break;
			case 6:
				exibirHistorico();
				break;
			case 0:
				sair=true;
				System.out.println("Saindo...");
				break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
			
		
		}
	}
	
	// criaçaõ dos metodos
	
	private void criarCliente() {
	    sc.nextLine();

	    System.out.print("Nome do cliente: ");
	    String nome = sc.nextLine();

	    System.out.print("CPF: ");
	    String cpf = sc.nextLine();

	    System.out.print("RG: ");
	    String rg = sc.nextLine();

	    System.out.print("Data de nascimento (AAAA-MM-DD): ");
	    String data = sc.nextLine();
	    LocalDate dataNasc = LocalDate.parse(data);

	    System.out.print("Número da conta: ");
	    int numeroConta = sc.nextInt();

	    Cliente c = new Cliente(nome, cpf, rg, dataNasc, numeroConta);
	    banco.criarCliente(c);

	    System.out.println("Cliente criado!");
	}

	
	private void depositar() {
		System.out.println("Número da conta:");
		int numero=sc.nextInt();
		System.out.println("Valor a depositar:");
		double valor=sc.nextDouble();
		banco.depositar(numero, valor);
	}
	
	  private void sacar() {
	        System.out.print("Número da conta: ");
	        int numero = sc.nextInt();
	        System.out.print("Valor a sacar: ");
	        double valor = sc.nextDouble();
	        banco.sacar(numero, valor);
	    }
	  

	    private void transferir() {
	        System.out.print("Conta de origem: ");
	        int origem = sc.nextInt();
	        System.out.print("Conta de destino: ");
	        int destino = sc.nextInt();
	        System.out.print("Valor a transferir: ");
	        double valor = sc.nextDouble();
	        banco.transferir(origem, destino, valor);
	    }

	    private void consultarSaldo() {
	        System.out.print("Número da conta: ");
	        int numero = sc.nextInt();
	        banco.consultarSaldo(numero);
	    }
	    
	    private void exibirHistorico() {
	        System.out.print("Número da conta: ");
	        int numero = sc.nextInt();
	        banco.mostrarHistorico(numero);
	    }
}
