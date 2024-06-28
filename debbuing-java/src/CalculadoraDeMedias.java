import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        try {
            double media = CalculaMediaDaTurma(alunos, scan);

            System.out.printf("Média da turma %.1f", media);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao tentar calcular a média");
        }
    }

    public static double CalculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
