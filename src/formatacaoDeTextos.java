public class formatacaoDeTextos {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais%n", nome, idade, valor);
        String aluno = "João";
        int aulas = 4;

        String mensagem = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(aluno, aulas);

        System.out.println(mensagem);
    }
}
