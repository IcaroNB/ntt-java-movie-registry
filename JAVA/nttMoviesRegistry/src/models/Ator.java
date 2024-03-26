package models;

public class Ator extends Pessoa{
    public String filmeAtuado;
    public boolean atorPrincipal;

    public String getFilmeAtuado() {
        return filmeAtuado;
    }

    public void setFilmeAtuado(String filmeAtuado) {
        this.filmeAtuado = filmeAtuado;
    }

    public boolean isAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(boolean atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }
}
