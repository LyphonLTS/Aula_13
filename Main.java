import java.util.Scanner;

import Controller.StreamService;
import Controller.User;
import Controller.Decorator.Package1;
import Controller.Decorator.Package2;
import Controller.Decorator.Package3;
import Controller.Decorator.Package4;
import Controller.Decorator.Package5;

class Main {
  public static void main(String[] args) {
    String condition = "continuar";
    StreamService streamService = new StreamService();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome de usuário: ");
    String username = scanner.nextLine();
    System.out.println("**Escolha um serviço**");
    System.out.println("1 - Assinatura base");
    System.out.println("2 - Pacote 1");
    System.out.println("3 - Pacote 2");
    System.out.println("4 - Pacote 3");
    System.out.println("5 - Pacote 4");
    System.out.println("6 - Pacote 5");
    String service = scanner.nextLine();

    User user = new User(username);

    switch (service) {
      case "1":
        user.setService(new StreamService());
        break;
      case "2":
        user.setService(new Package1(streamService));
        break;
      case "3":
        user.setService(new Package2(streamService));
        break;
      case "4":
        user.setService(new Package3(streamService));
        break;
      case "5":
        user.setService(new Package4(streamService));
        break;
      case "6":
        user.setService(new Package5(streamService));
        break;
      default:
        user.setService(new StreamService());
        break;
    }

    do {
      System.out.println("**Escolha uma opção**");
      System.out.println("1 - Visualizar assinatura");
      System.out.println("2 - Alterar assinatura");
      System.out.println("0 - Sair");
      String option = scanner.nextLine();

      switch (option) {
        case "1":
          System.out.println(user.toString());
          break;
        case "2":
          System.out.println("**Escolha um serviço**");
          System.out.println("1 - Assinatura base");
          System.out.println("2 - Pacote 1");
          System.out.println("3 - Pacote 2");
          System.out.println("4 - Pacote 3");
          System.out.println("5 - Pacote 4");
          System.out.println("6 - Pacote 5");
          service = scanner.nextLine();

          switch (service) {
            case "1":
              user.setService(new StreamService());
              break;
            case "2":
              user.setService(new Package1(streamService));
              break;
            case "3":
              user.setService(new Package2(streamService));
              break;
            case "4":
              user.setService(new Package3(streamService));
              break;
            case "5":
              user.setService(new Package4(streamService));
              break;
            case "6":
              user.setService(new Package5(streamService));
              break;
            default:
              user.setService(new StreamService());
              break;
          }
          break;
        default:
          condition = "sair";
          break;
      }
    } while (condition.toLowerCase().equals("continuar"));

    scanner.close();
  }
}