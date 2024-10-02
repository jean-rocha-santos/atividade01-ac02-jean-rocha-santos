package school.sptech.ex1;

public class TesteRecursosHumanos {

  public static void main(String[] args) {
    Colaborador colaborador01 = new Colaborador("Jean","Dev",1800.0);
    RecursosHumanos funcionario01= new RecursosHumanos();

    funcionario01.reajustarSalario(colaborador01,20.0);
    funcionario01.promover(colaborador01,"Dev-Pleno",6000.00);

  }
}
