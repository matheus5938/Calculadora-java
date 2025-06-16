import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float soma;
        float sub;
        float div;
        float mult;
        float media;
        float porcen;

        float n1;
        System.out.println("Digite um número: ");
        n1 = entrada.nextFloat();

        float n2;
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextFloat();

        soma = n1 + n2;
        sub = n1 - n2;
        div = n1 / n2;
        mult = n1 * n2;
        media = soma / 2;
        porcen = n1 * n2 / 100;

        System.out.println("A soma dos números são: " + soma);
        System.out.println("A subtração dos números são: " + sub);
        System.out.println("A divisão dos números são: " + div);
        System.out.println("A multiplicação dos números são: " + mult);
        System.out.println("A média dos números são: " + media);
        System.out.println("A porcentagem dos números são: " + porcen);
    }
}