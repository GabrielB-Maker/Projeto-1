package estudante;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Brasil");
        Estudante estudante2 = new Estudante();
        estudante2.setNome("espanhol");
        System.out.println("o nome é: " + estudante.getNome());
        estudante.setAltura(1.68);
        estudante.setIdade(23);
        estudante.setEstudante(true);
        System.out.println("O Estudante possui: " + estudante.getAltura());
        System.out.println("o Estudante possui " + estudante.getIdade() + " anos");
        System.out.println(estudante.isEstudante());
        Estudante maria = new Estudante ("maria");
        System.out.println("o nome é: " + maria.getNome());
        System.out.println(estudante2.getNome());
        Estudante estudante3 = new Estudante(30);
        estudante3.setNome("Lucas");
        System.out.println("a idade do estudante " + estudante3.getNome() + " é " + estudante3.getIdade());



    }
}
