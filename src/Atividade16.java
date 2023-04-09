import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double tamanho = input.nextDouble();

        
        double litrosDeTinta = tamanho / 6.0 * 1.1;

        
        int numeroDeLatas = (int) Math.ceil(litrosDeTinta / 18.0);
        int numeroDeGaloes = (int) Math.ceil(litrosDeTinta / 3.6);

        
        double custoComLatas = numeroDeLatas * 80.0;

        
        double custoComGaloes = numeroDeGaloes * 25.0;

        
        int numeroDeLatasUsadas = (int) (litrosDeTinta / 18.0);
        int numeroDeGaloesUsados = (int) Math.ceil((litrosDeTinta % 18.0) / 3.6);
        double custoComLatasEGaloes = numeroDeLatasUsadas * 80.0 + numeroDeGaloesUsados * 25.0;

        
        System.out.printf("Para pintar %.2f metros quadrados, serão necessários:\n", tamanho);
        System.out.printf("%.2f litros de tinta, considerando 10%% de folga.\n", litrosDeTinta);

        System.out.println("\nOpção 1 - Comprar apenas latas de 18 litros:");
        System.out.printf("%d lata(s) de tinta, no valor total de R$ %.2f.\n", numeroDeLatas, custoComLatas);

        System.out.println("\nOpção 2 - Comprar apenas galões de 3,6 litros:");
        System.out.printf("%d galão(ões) de tinta, no valor total de R$ %.2f.\n", numeroDeGaloes, custoComGaloes);

        System.out.println("\nOpção 3 - Comprar latas e galões:");
        System.out.printf("%d lata(s) de tinta e %d galão(ões) de tinta, no valor total de R$ %.2f.\n", 
                numeroDeLatasUsadas, numeroDeGaloesUsados, custoComLatasEGaloes);

        input.close();
    }
}
