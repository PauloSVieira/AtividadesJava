public class Funcionario {
    private String nome;
    private String cargo;
    private Double salario;

    public Funcionario(String nome, String cargo, Double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nFuncionario:\nNome: " + nome + "\nCargo: " + cargo + "\nSalario: " + salario + "\n";
    }
}