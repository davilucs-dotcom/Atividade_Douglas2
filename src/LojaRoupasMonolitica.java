public class LojaRoupasMonolitica {

    public static void processarVendaRoupa(String cliente, String peca, int quantidade, double precoUnitario) {
        System.out.println(" Venda na Loja de Roupas ");

        double valorTotal = quantidade * precoUnitario;
        double desconto = 0.0;

        if (quantidade >= 20) {
            desconto = valorTotal * 0.20;
        } else if (quantidade >= 10) {
            desconto = valorTotal * 0.10;
        } else if (quantidade >= 5) {
            desconto = valorTotal * 0.05;
        }

        double valorFinal = valorTotal - desconto;


        System.out.printf("Cliente: %s\n", cliente);
        System.out.printf("Produto: %s (x%d)\n", peca, quantidade);
        System.out.printf("Valor s/ desconto: R$%.2f\n", valorTotal);
        System.out.printf("Desconto aplicado: R$%.2f\n", desconto);
        System.out.printf("Total a pagar: R$%.2f\n\n", valorFinal);
    }

    public static void main(String[] args) {
        processarVendaRoupa("Davi Lucas", "Camiseta Básica", 12, 50.00);
    }
}
