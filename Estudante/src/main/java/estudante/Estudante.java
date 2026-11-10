package estudante;
public class Estudante {
    //atributos
        int idade = 42;
        String nome = "Emília";
        double altura = 1.70;
        boolean estudante = true;

        //Construtores
        public Estudante(String nome){
            this.nome=nome;
        }

        public Estudante(int idade){
            this.idade=idade;
        }
        public Estudante() {
    }
    //getters e setters

        public int getIdade() {
        return idade;
    }

        public void setIdade(int idade) {
        this.idade = idade;
    }

        public String getNome() {
            return nome;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

        public double getAltura() {
        return altura;
    }

        public void setAltura(double altura) {
        this.altura = altura;
    }

        public boolean isEstudante() {
        return estudante;
    }

        public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }
}
