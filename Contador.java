package controle_candidatos;
import java.util.Scanner;
class ParametrosInvalidos extends Exception {
    public ParametrosInvalidos(String mensagem) {
        super(mensagem);
    }
}


	

		public class Contador {
		    public static void main(String[] args) {
		        Scanner terminal = new Scanner(System.in);
		        System.out.println("Digite o primeiro parâmetro");
		        int parametroUm = terminal.nextInt();
		        System.out.println("Digite o segundo parâmetro");
		        int parametroDois = terminal.nextInt();

		        try {
		            contar(parametroUm, parametroDois);
		        } catch (ParametrosInvalidos e) {
		            System.out.println(e.getMessage());
		        }
		    }

		    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidos {
		        if (parametroUm >= parametroDois) {
		            throw new ParametrosInvalidos("O segundo parâmetro deve ser maior que o primeiro");
		        }

		        for (int i = parametroUm + 1; i <= parametroDois; i++) {
		            System.out.println("Imprimindo o número " + i);
		        }
		    }
		


	}


