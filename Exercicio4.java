public class Exercicio4{
    
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        double percentualSp = (sp / totalFaturamento) * 100;
        double percentualRj = (rj / totalFaturamento) * 100;
        double percentualMg = (mg / totalFaturamento) * 100;
        double percentualEs = (es / totalFaturamento) * 100;
        double percentualOutros = (outros / totalFaturamento) * 100;

        System.out.printf("Percentual de representação do faturamento de SP: %.2f%%\n", percentualSp);
        System.out.printf("Percentual de representação do faturamento de RJ: %.2f%%\n", percentualRj);
        System.out.printf("Percentual de representação do faturamento de MG: %.2f%%\n", percentualMg);
        System.out.printf("Percentual de representação do faturamento de ES: %.2f%%\n", percentualEs);
        System.out.printf("Percentual de representação do faturamento de Outros: %.2f%%\n", percentualOutros);
    }
}