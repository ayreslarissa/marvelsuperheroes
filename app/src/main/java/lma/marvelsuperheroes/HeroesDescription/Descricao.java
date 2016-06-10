package lma.marvelsuperheroes.HeroesDescription;

/**
 * Created by Larissa on 04/08/2015.
 */
public class Descricao {
    private String nome;
    private String descricao;
    private int foto;

    public Descricao(String nome, int foto, String descricao){
        this.nome = nome;
        this.descricao = descricao;

        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public int getFoto() {
        return foto;
    }

    public String getDescricao() {
        return descricao;
    }
}
