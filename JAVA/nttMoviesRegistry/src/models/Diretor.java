package models;

public class Diretor extends Pessoa{
    public static String filmeDirigido;

    public static String getFilmeDirigido() {
        return filmeDirigido;
    }

    public static void setFilmeDirigido(String filmeDirigido) {
        Diretor.filmeDirigido = filmeDirigido;
    }
}
