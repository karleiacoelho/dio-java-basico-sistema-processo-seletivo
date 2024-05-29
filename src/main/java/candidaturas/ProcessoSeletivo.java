package candidaturas;

import java.util.concurrent.ThreadLocalRandom;

import static java.util.concurrent.ThreadLocalRandom.current;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("*** Processo Seletivo ***");
        /*
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        */
        selecaoCandidatos();
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