import java.util.Scanner;

public class SistemaEscolarSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada das 8 notas diretamente
        System.out.print("Digite a nota 1: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = input.nextDouble();

        System.out.print("Digite a nota 4: ");
        double nota4 = input.nextDouble();

        System.out.print("Digite a nota 5: ");
        double nota5 = input.nextDouble();

        System.out.print("Digite a nota 6: ");
        double nota6 = input.nextDouble();

        System.out.print("Digite a nota 7: ");
        double nota7 = input.nextDouble();

        System.out.print("Digite a nota 8: ");
        double nota8 = input.nextDouble();

        // Cálculo das médias
        double bimestre1 = (nota1 + nota2) / 2;
        double bimestre2 = (nota3 + nota4) / 2;
        double semestre1 = (bimestre1 + bimestre2) / 2;

        double bimestre3 = (nota5 + nota6) / 2;
        double bimestre4 = (nota7 + nota8) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;

        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibição dos resultados
        System.out.printf("1o Bimestre: %.1f%n", bimestre1);
        System.out.printf("2o Bimestre: %.1f%n", bimestre2);
        System.out.printf("1o Semestre: %.1f%n", semestre1);
        System.out.println("----------------------");
        System.out.printf("3o Bimestre: %.1f%n", bimestre3);
        System.out.printf("4o Bimestre: %.1f%n", bimestre4);
        System.out.printf("2o Semestre: %.1f%n", semestre2);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        input.close();
    }
}

