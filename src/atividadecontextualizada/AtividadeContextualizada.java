package atividadecontextualizada;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* @Autor Lazaro Jose da Silva de Souza - UNINABUCO 2021
* github: https://github.com/lazarok09
*
*/
public class AtividadeContextualizada {
  
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("----- BEM VINDO AO PROGRAMA ----");
        System.out.println("Quantos alunos deseja cadastrar ?");
        int quantidade = s1.nextInt();
        /* inicializando alunos */
        Aluno aluno[] = new Aluno[quantidade];
        for(int y = 0; quantidade > y; y++) {
            aluno[y] = new Aluno();
        }           
        /* alunos inicializados e prontos para o cadastro. */
        
            /* INÍCIO DO CADASTRO */
            // criado novo scanner para evitar conflitos
            Pacotes p = new Pacotes();
            for (int i = 0; aluno.length > i ; i++) {
            
            Scanner s2 = new Scanner(System.in);
            
            ValidarString vs = new ValidarString();
            boolean continuar = true;
            while(continuar) {
                System.out.print("Digite o nome do aluno: ");  
                String input = s2.nextLine();
                if((vs.testarNome(input)) == "erro") { 
                   System.out.println("NOME INCORRETO");
                   continuar = true;
                   continue;
                } if ((vs.testarNome(input)) != "erro") {
                    aluno[i].setNome(input);     
                    continuar = false;
                    }
                }
          
            // idade, altura e peso.     
            System.out.print("Digite a idade do aluno (numeros inteiros): ");
            aluno[i].setIdade(s2.nextInt());
          
            System.out.print("Digite a altura do aluno (m,cm): ");
            aluno[i].setAltura(s2.nextFloat());
            
            System.out.print("Digite o peso do aluno (kg,g): ");
            aluno[i].setPeso(s2.nextFloat());
            
            /* validarCPF */
            ValidarCpf vcpf = new ValidarCpf();
            while(continuar) {
            System.out.print("Digite o CPF do aluno: ");
            String cpf = s2.next();
            if(vcpf.testarCpf(cpf).equals("erro")){
                System.out.println("CPF INCORRETO");
                continuar = true;
            }
            if(vcpf.testarCpf(cpf) != "erro") {
                aluno[i].setCpf(cpf);
                continuar = false;
            }
             }; 
            /* fim validarCPF */
           
            // checando atividade
            System.out.print("o aluno está ativo ou inativo? : ");
            String input = s2.next();
            if(input.equals("ativo") | input.equals("inativo")) {
                aluno[i].setStatus(input);
            }
            
            
            // escolhendo um pacote
            System.out.println("Pacotes disponíveis : A, B e C");
            
            System.out.println("A = {" + p.pacoteA + " }");
            System.out.println("B = {" + p.pacoteB + " }");
            System.out.println("C = {" + p.pacoteC + " }");
            Scanner s3 = new Scanner(System.in);
            System.out.print("Escolha um dos pacotes : ");
            aluno[i].setPacoteDoAluno(s3.nextLine());
            
            
            // ultimo print antes de ir para o próximo aluno se houver
            System.out.println("\n PRÓXIMO");
            }
            // fora do loop de cadastro
            System.out.println("--CADASTRO CONCLUIDO COM SUCESSO--");
            
            // restante do programa
            System.out.println("MOSTRANDO INFORMAÇÕES DOS ALUNOS");
            
            for (int x = 0; aluno.length > x ; x++) {
                System.out.println(aluno[x].mostrarInformacoes() + "\n Detalhes do pacote: " + aluno[x].getPacoteDoAluno());
               
            }
            // contar os alunos ativos/inativos/matriculados
                int ativos = 0;
                int inativos = 0;
                int matriculados = 0;
            for (int c = 0; aluno.length > c ; c++) {
                
                if((aluno[c].getStatus().equals("ativo"))) {  
                    ativos++;
                }
                if((aluno[c].getStatus().equals("inativo"))){
                    inativos++;
                }
                 if(aluno[c].getNome() != null) {
                    matriculados++;
                }
            }
            System.out.println("--- ALUNOS ATIVOS E INATIVOS ---");
            System.out.println("ativos : " + ativos);
            System.out.println("inativos : " + inativos);
            System.out.println("matriculados : " + matriculados);
    
     }
}
    
