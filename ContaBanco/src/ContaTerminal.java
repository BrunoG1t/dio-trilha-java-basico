//importaçao da classe Scanner para está coletando os dados que serão inseridos pelo usuário através do teclado:
import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) {
        //váriável 'input' irá carregar todos metódos da classe Scanner:
        Scanner input = new Scanner(System.in);
        //variáveis que irão armazenar todas informações pedidas ao usuário:
        int numero;
        String agencia, nomeCliente;
        //Somente a variável saldo irá começar com um valor definido, as restantes serão inseridas pelo usuário:
        float saldo = 350f;
        
        System.out.println("Você está acessando o banco TAL");

        System.out.print("Por favor, digite seu nome: ");
        //Receber atráves do input.next() somente dados do tipo String:
        nomeCliente = input.next();

        System.out.print("Informe número da agência: ");
        agencia = input.next();

        System.out.print("Informe os 4 primeiros números de sua conta: ");
        //Receber atráves do input.nextInt() somente dados do tipo inteiro:
        numero = input.nextInt();

        System.out.println("Processando...");

        //mensagem final exibida ao usuário após inserir seus dados:
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$" + saldo +" já está disponível para saque.");


    }
}
