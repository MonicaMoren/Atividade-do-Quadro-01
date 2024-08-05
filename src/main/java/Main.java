import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bem Vindo Instagram");
    System.out.println(" ");
System.out.println("Digite seu Usuario");
String Login = sc.nextLine();

 System.out.println("Digite sua senha:");

    int senha =  sc.nextInt();

  while( senha!= 2022) {
    System.out.println("Senha incorreta");
    System.out.println(" ");
    System.out.println("Digite sua senha novamente:");
    senha = sc.nextInt();
  }
if (senha == 2022) {
  System.out.println(" ");
      System.out.println("Seja bem vindo " + Login);
}
     sc.close();
  }
}
