package school.sptech.ex1;

public class RecursosHumanos {
    private Integer totalPromovidos;
    private Integer totalReajustados;

    public RecursosHumanos(Integer totalPromovidos, Integer totalReajustados) {
        this.totalPromovidos = totalPromovidos;
        this.totalReajustados = totalReajustados;
    }

    public RecursosHumanos() {
    }

    public void reajustarSalario(Colaborador salario, Double reajuste) {
        Double salarioReajustado = ((salario.getSalario() * reajuste) / 100) + salario.getSalario();
        salario.setSalario(salarioReajustado);

        totalReajustados++;
    }

    public void promover(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (novoSalario < colaborador.getSalario()) {
            System.out.println("Valor menor que o salario anterior");
        } else {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromovidos++;
        }
    }


    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustados() {
        return totalReajustados;
    }
}
