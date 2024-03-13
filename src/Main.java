import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = ler.next();

        System.out.printf("\nResultado: ");
        // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (ValidaCPF.isCPF(CPF)) {
            System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
        } else {
            System.out.print("Erro, CPF invalido !!!\n");
        }

        Scanner lerEmail = new Scanner(System.in);

        String email;

        System.out.printf("Informe um email: ");
        email = ler.next();

        System.out.printf("\nResultado: ");

        if (ValidaEmail.validate(email))
            System.out.printf(ValidaEmail.VALID_EMAIL_ADDRESS_REGEX(email));
        else System.out.print("Email com erro, invalido !!!\n");
    }

}