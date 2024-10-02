package school.sptech.ex2;

public class TreinadorPokemon {
    private String nome;
    private Double nivel;

    public TreinadorPokemon(String nome, Double nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }public TreinadorPokemon() {

    }

    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca()*0.10+ pokemon.getForca());
        pokemon.setDoces(pokemon.getDoces()+10);

    }

    public void evoluirPokemon(Pokemon pokemon, String evolucao) {
        if (pokemon.getDoces() >= 50) {
            pokemon.setNome(evolucao);
            pokemon.setDoces((pokemon.getDoces()) - 50);
            setNivel(getNivel()+10);
        }else {
            System.out.println("Não foi possível realizar operação");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }


}
