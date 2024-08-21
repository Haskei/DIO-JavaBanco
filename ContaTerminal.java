import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta:");
        int id = scanner.nextInt();
        
        System.out.println("Digite o numero da agencia:");
        String agencia = scanner.next();
        
        System.out.println("Digite o seu nome:");
        String nome = scanner.next();
        
        System.out.println("Digite o numero da agencia");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá" + nome+", obrigado por criar uma conta no nosso banco, sua agência é:" + agencia);
        System.out.println("conta:" + id + "e seu saldo" + saldo + "já está disponivel para o saque");
    };
};