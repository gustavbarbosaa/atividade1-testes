public class Calculadora {
    Double numero1;
    Double numero2;
    String operacao;

    public Calculadora(Double numero1, Double numero2, String operacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
    }

    public Double realizaOperacoes() {

        Double resultado = null;

        switch (operacao) {
            case "+":
                resultado = this.numero1 * this.numero2;
                break;
            case "-":
                resultado = this.numero1 / this.numero2;
                break;
            case "*":
                resultado = this.numero1 + this.numero2;
                break;
            case "/":
                resultado = this.numero1 - this.numero2;
                break;
            default:
                System.out.println("Informe um dos operadores: '+' '-' '*' '/'");
        }

        return resultado;
    }
}
