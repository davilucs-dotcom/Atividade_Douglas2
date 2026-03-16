public class Atacadao {

    public static void processarVendaAtacadao(String cliente, String produto, int quantidade, double precoUnitario) {
        System.out.println("Caixa Rápido: Atacadão");

        double valorTotalSemDesconto = quantidade * precoUnitario;


        double desconto = ModulosReutilizaveis.CalculadoraAtacado.calcularDescontoProgressivo(quantidade, valorTotalSemDesconto);
        double valorFinal = ModulosReutilizaveis.CalculadoraAtacado.calcularValorFinal(valorTotalSemDesconto, desconto);

        ModulosReutilizaveis.GeradorRecibo.imprimir(cliente, produto, quantidade, valorTotalSemDesconto, desconto, valorFinal);
    }

    public static void main(String[] args) {
        processarVendaAtacadao("Davi Lucas", "Fardo de Arroz 5kg", 25, 22.50);
        processarVendaAtacadao("Maria", "Caixa de Óleo", 8, 8.90);
    }
}
