import backProjeto.Empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.printf("Quantos Funcionarios tem na empresa ? >> ");
        int funTot = leia.nextInt();
        double pegaMedia = 0;

        //Criação da lista
        Empresa[] listaEmpresa = new Empresa [funTot];

        System.out.println("Registre oos funcionaiors, matricula e devido salario: ");
        for (int cont = 0; cont < funTot;cont++) {


            Empresa listaFuncionario = new Empresa();
            System.out.print("NOME >> ");
            listaFuncionario.setNome(leia.next());

            System.out.print("Matricula >> ");
            listaFuncionario.setMatricula(leia.nextInt());

            System.out.print("Salario >> ");
            listaFuncionario.setSalario(leia.nextDouble());

            pegaMedia +=  listaFuncionario.getSalario();

            listaEmpresa [cont] = listaFuncionario;
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n=====Lista de Registro=====");
        for (Empresa empresa : listaEmpresa) {
            //impressao da lista
            System.out.print("NOME: "+empresa.getNome()+" MATRICULA: "+empresa.getMatricula()+" SALARIO: R$"+empresa.getSalario()+"\n");
        }
        System.out.print("Media Salarial: R$"+pegaMedia/funTot);

    }
}