import java.util.Scanner;

public class Main {

    static class Ambiente {
        String nome;
        int nivelRuido;

        public Ambiente(String nome, int nivelRuido) {
            this.nome = nome;
            this.nivelRuido = nivelRuido;
        }
    }

    public static void main(String[] args) {
        Ambiente[] ambientes = new Ambiente[5];
        ambientes[0] = new Ambiente("Sala", 60);
        ambientes[1] = new Ambiente("Cozinha", 75);
        ambientes[2] = new Ambiente("banheiro", 97);
        ambientes[3] = new Ambiente("Quarto", 55);
        ambientes[4] = new Ambiente("sala de jantar", 72);

        int somaNiveis = 0;
        int count = 0;

        System.out.println("Ambientes com nível de ruído acima de 70dB:");
        for (Ambiente ambiente : ambientes) {
            if (ambiente.nivelRuido > 70) {
                System.out.println(ambiente.nome + ": " + ambiente.nivelRuido + "dB");
            }
            somaNiveis += ambiente.nivelRuido;
            count++;
        }

        double nivelMedio = (double) somaNiveis / count;
        System.out.println("Nível médio de ruído: " + nivelMedio + "dB");
    }
}