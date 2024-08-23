import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo[] retangulos = new Retangulo[5]; // aqui estou criando um metodo

        // aqui preenche os valores que o usuario coloca
        for (int i = 0; i < retangulos.length; i++) {
            System.out.print("Digite a largura do retângulo " + (i + 1) + ": ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura do retângulo " + (i + 1) + ": ");
            double altura = scanner.nextDouble();

            retangulos[i] = new Retangulo(largura, altura); // aqui vai criar um novo obj retangulo no vetor
        }

        // exibe as informações
        System.out.println("\nInformações dos retângulos:");
        for (Retangulo retangulo : retangulos) {
            retangulo.MostrarInformacao();
        }

        // o retângulo com a maior área
        Retangulo maiorArea = retangulos[0];
        for (int i = 1; i < retangulos.length; i++) {
            if (retangulos[i].CalculoArea() > maiorArea.CalculoArea()) {
                maiorArea = retangulos[i];
            }
        }
        System.out.println("Retângulo com a maior área:");
        maiorArea.MostrarInformacao();

        // o retângulo com o menor perímetro
        Retangulo menorPerimetro = retangulos[0];
        for (int i = 1; i < retangulos.length; i++) {
            if (retangulos[i].CalculoPerimetro() < menorPerimetro.CalculoPerimetro()) {
                menorPerimetro = retangulos[i];
            }
        }
        System.out.println("Retângulo com o menor perímetro:");
        menorPerimetro.MostrarInformacao();

        scanner.close();
    }
}
