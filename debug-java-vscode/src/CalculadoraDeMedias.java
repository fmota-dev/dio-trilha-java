import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

        try {
            double media = CalculaMediaDaTurma(alunos, scan);

            System.out.printf("Média da turma %.1f", media);
        } catch (InputMismatchException err) {
            System.out.println("Por favor, digite um valor válido.");
        }
    }

    public static double CalculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                throw new InputMismatchException();
            }
            soma += nota;
        }

        return soma / alunos.length;
    }
}
