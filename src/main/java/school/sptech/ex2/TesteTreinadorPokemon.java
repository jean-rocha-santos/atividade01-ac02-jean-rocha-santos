package school.sptech.ex2;

public class TesteTreinadorPokemon {
    public static void main(String[] args) {
        TreinadorPokemon treinadorPokemon01 = new TreinadorPokemon("Jeano",33.0);
        Pokemon pokemon1 = new Pokemon("Salamance","Dragão",96.7,100);
        Pokemon pokemon2 = new Pokemon("Riolu","Lutador",56.2,50);

        treinadorPokemon01.treinarPokemon(pokemon1);
        treinadorPokemon01.evoluirPokemon(pokemon2, "Lucario");
    }

}
