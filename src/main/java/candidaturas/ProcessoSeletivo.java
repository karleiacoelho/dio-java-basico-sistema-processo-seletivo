package candidaturas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.concurrent.ThreadLocalRandom.current;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("*** Processo Seletivo ***");

        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato : candidatos) {
        entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while (continuarTentando && tentativasRealizadas < 3);
            if(atendeu) {
                System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " NA " + tentativasRealizadas + ".");
            } else System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + "NUMERO MAXIMO DE " + tentativasRealizadas + " TENTATIVAS ATINGIDO.");
    }
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo com informação de indice usando for");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n." + (i+1) + " é o(a) " + candidatos[i]);
        }
        System.out.println("Imprimindo de forma abreviada com foreach");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }

    }
    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosSelecionados < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candodato " + candidato + " pretende o salario de R$ " + salarioPretendido);

            if(salarioBase <= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0 , 2200.0);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato.");
            } else if(salarioPretendido == salarioBase) {
            System.out.println("Ligar para candidato com contra proposta.");
            } else System.out.println("Aguardando demais resultados.");

        }
}