package lma.marvelsuperheroes;

/**
 * Created by Larissa on 09/06/2016.
 */
public class HeroesData {

    String name;
    int foto;
    public HeroesData(String name, int foto) {
        this.name = name;
        this.foto = foto;


    }

    public String getName() {
        return name;
    }

    public int getFoto(){
        return foto;
    }

}
