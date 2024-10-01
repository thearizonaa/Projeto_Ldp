import java.util.Scanner;

public class a1 {
   public static void main(String[] args) {
      int soma, a, b, c;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite primeiro nro inteiro: ");
      a = scanner.nextInt();

      System.out.print("Digite segundo nro inteiro: ");
      b = scanner.nextInt();

      System.out.print("Digite terceiro nro inteiro: ");
      c = scanner.nextInt();

      soma = a + b * c + b;

      System.out.println("Resultado: " + soma);
   }
}
