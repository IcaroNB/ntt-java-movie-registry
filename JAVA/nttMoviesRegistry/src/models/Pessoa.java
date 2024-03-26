package models;

public class Pessoa {
    public static String nome;
    public static int idade;
    public static double altura;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Pessoa.nome = nome;
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        Pessoa.idade = idade;
    }

    public static double getAltura() {
        return altura;
    }

    public static void setAltura(double altura) {
        Pessoa.altura = altura;
    }
}
