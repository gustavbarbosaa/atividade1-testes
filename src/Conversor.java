public class Conversor {
    Double num1;
    String escolha;
    String escalaAtual;

    public Conversor(String escalaAtual, Double num1, String escolha) {
        this.escalaAtual = escalaAtual;
        this.num1 = num1;
        this.escolha = escolha;
    }

    public Double realizaConversao() {
        if (num1 == null || escalaAtual == null || escolha == null) {
            System.out.println("Erro: Dados inválidos para conversão.");
            return null;
        }

        Double conversao = null;

        switch (escolha) {
            case "f":
                if ("c".equals(escalaAtual)) {
                    conversao = (num1 * 1.8) + 32;
                } else if ("k".equals(escalaAtual)) {
                    conversao = (num1 - 273) * 1.8 + 32;
                } else {
                    System.out.println("Erro: Escala inválida para conversão.");
                }
                break;
            case "k":
                if ("c".equals(escalaAtual)) {
                    conversao = num1 + 273;
                } else if ("f".equals(escalaAtual)) {
                    conversao = (num1 - 32) / 1.8 + 273.15;
                } else {
                    System.out.println("Erro: Escala inválida para conversão.");
                }
                break;
            case "c": // Converter para Celsius
                if ("f".equals(escalaAtual)) {
                    conversao = (num1 - 32) / 1.8;
                } else if ("k".equals(escalaAtual)) {
                    conversao = num1 - 273;
                } else {
                    System.out.println("Erro: Escala inválida para conversão.");
                }
                break;
            default:
                System.out.println("Erro: Escolha de conversão inválida.");
        }

        return conversao;
    }
}
