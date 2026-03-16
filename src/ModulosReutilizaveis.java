public class ModulosReutilizaveis {


    public static class CalculadoraAtacado {

        public static double calcularDescontoProgressivo(int quantidade, double valorTotal) {
            if (quantidade >= 20) return valorTotal * 0.20;
            if (quantidade >= 10) return valorTotal * 0.10;
            if (quantidade >= 5)  return valorTotal * 0.05;
            return 0.0;
        }

        public static double calcularValorFinal(double valorTotal, double descontoAplicado) {
            return valorTotal - descontoAplicado;
        }
    }


    public static class GeradorRecibo {

        public static void imprimir(String cliente, String produto, int qtd, double total, double desconto, double valorFinal) {
            System.out.printf("CLIENTE: %s\n", cliente);
            System.out.printf("ITEM: %s | QTD: %d\n", produto, qtd);
            System.out.printf("SUBTOTAL: R$%.2f\n", total);
            System.out.printf("DESCONTO: R$%.2f\n", desconto);
            System.out.printf("TOTAL A PAGAR: R$%.2f\n", valorFinal);
        }
    }
}