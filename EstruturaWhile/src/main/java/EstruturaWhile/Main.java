
package EstruturaWhile;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        int totalAlunos = 10;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        while(totalAlunos > 0){
            
            System.out.println("Nome do aluno: ");
            String nomeAluno = leitorScanner.nextLine();
            System.out.println("Idade do aluno: ");
            int idadeAluno = leitorScanner.nextInt();
            
            System.out.println("O nome do aluno é " + nomeAluno + ", a sua idade"
                    + "é" + idadeAluno);
            
            totalAlunos = totalAlunos - 1;
        }
    }    
}
