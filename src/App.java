import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite a priemira nota : ");
    double nota1 = sc.nextDouble();
    System.out.println();
    System.out.print("Digite a segunda nota : ");
    double nota2 = sc.nextDouble();
    System.out.println();
    System.out.print("Digite a terceria nota : ");
    double nota3 = sc.nextDouble();
    System.out.println();
    System.out.print("Digite a quarta nota : ");
    double nota4 = sc.nextDouble();
    sc.close();
    
    double media = (nota1 + nota2 + nota3 + nota4)/4;
    System.out.println();
    
    System.out.println("A media do aluno foi : " + media);
    }
}
