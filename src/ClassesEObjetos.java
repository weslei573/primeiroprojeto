public class ClassesEObjetos {
    public static void main(String[] args) {
        ClassesAndObjetos pessoa = new ClassesAndObjetos();

        pessoa.nome = "Ana";
        pessoa.idade = 20;

        System.out.println(pessoa.nome + " tem " + pessoa.idade + " anos");
        pessoa.fazAniversario();
        System.out.println("A idade agora e: " + pessoa.idade);

        ClassesAndObjetos pessoa2 = new ClassesAndObjetos();

        pessoa2.nome = "Carlos";
        pessoa2.idade = 23;
        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");
        pessoa2.fazAniversario();
        System.out.println("A idade agora é: " + pessoa2.idade);
    }
}
