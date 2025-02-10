
package modelos;

public class Pastor {
    /*nis TEXT PRIMARY KEY,
    nome TEXT NOT NULL,
    salario REAL NOT NULL*/
    private String nis, nome;
    private double salario;

    public Pastor(String nis, String nome, double salario) {
        this.nis = nis;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Pastor{" + "nis=" + nis + ", nome=" + nome + ", salario=" + salario + '}';
    }
    
    
}
