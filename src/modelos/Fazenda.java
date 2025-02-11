
package modelos;


public class Fazenda {
    private int idFazenda;
    private double areaTotal;
    private String estado, nome, email;

    public Fazenda(double areaTotal, String estado, String nome, String email) {
        this.areaTotal = areaTotal;
        this.estado = estado;
        this.nome = nome;
        this.email = email;
    }

    public Fazenda(int idFazenda, double areaTotal, String estado, String nome, String email) {
        this.idFazenda = idFazenda;
        this.areaTotal = areaTotal;
        this.estado = estado;
        this.nome = nome;
        this.email = email;
    }

    public void setIdFazenda(int idFazenda) {
        this.idFazenda = idFazenda;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdFazenda() {
        return idFazenda;
    }

    public String tooString() {
        return "Fazenda{" + "idFazenda=" + idFazenda + ", areaTotal=" + areaTotal + ", estado=" + estado + ", nome=" + nome + ", email=" + email + '}';
    }
    
    @Override
    public String toString(){
        return String.format("%d - %s", idFazenda, nome);
    }
    
    
}

