package models;

public class Filme {
    public static String nomeFilme;
    public static String enderecoGravacao;
    public static int duracaoFilme;
    public static String dataInicioGravacao;
    public static String dataFimGravacao;

    public static String getNomeFilme() {
        return nomeFilme;
    }

    public static void setNomeFilme(String nomeFilme) {
        Filme.nomeFilme = nomeFilme;
    }

    public static String getEnderecoGravacao() {
        return enderecoGravacao;
    }

    public static void setEnderecoGravacao(String enderecoGravacao) {
        Filme.enderecoGravacao = enderecoGravacao;
    }

    public static int getDuracaoFilme() {
        return duracaoFilme;
    }

    public static void setDuracaoFilme(int duracaoFilme) {
        Filme.duracaoFilme = duracaoFilme;
    }

    public static String getDataInicioGravacao() {
        return dataInicioGravacao;
    }

    public static void setDataInicioGravacao(String dataInicioGravacao) {
        Filme.dataInicioGravacao = dataInicioGravacao;
    }

    public static String getDataFimGravacao() {
        return dataFimGravacao;
    }

    public static void setDataFimGravacao(String dataFimGravacao) {
        Filme.dataFimGravacao = dataFimGravacao;
    }
}
