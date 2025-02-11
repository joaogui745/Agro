
package modelos;

public class Pastor {
    /*nis TEXT PRIMARY KEY,
    nome TEXT NOT NULL,
    salario REAL NOT NULL*/
    private String nis, nome, email;
    private double salario;

    public Pastor(String nis, String nome, String email, double salario) {
        this.nis = nis;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    public String toString(){
        return nis + " - " +  nome;
    }
    
    public String tooString() {
        return "Pastor{" + "nis=" + nis + ", nome=" + nome + ", salario=" + salario + '}';
    }
    
    
}
/*          
        (   new Pastor("98765432101", "Maria Pereira", 4500.00));
        (   new Pastor("55555555555", "José Santos", 3800.00));
        (   new Pastor("11111111111", "Ana Rodrigues", 4200.00));
        (   new Pastor("22222222222", "Carlos Almeida", 5200.00));
        (   new Pastor("33333333333", "Fernanda Oliveira", 4800.00));
        (   new Pastor("44444444444", "Ricardo Souza", 5500.00));
        (   new Pastor("55555555555", "Patrícia Martins", 4100.00));
        (   new Pastor("66666666666", "Marcelo Costa", 4700.00));
        (   
       */ 