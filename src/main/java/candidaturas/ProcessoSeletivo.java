package candidaturas;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("*** Processo Seletivo ***");

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
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