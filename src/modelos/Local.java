package modelos;

public class Local {
    private String nome, nisPastor;
    private int idFazenda;
    private double area;
    private Imagem foto;

    public Local(String nome, String nisPastor, int idFazenda, double area, Imagem foto) {
        this.nome = nome;
        this.nisPastor = nisPastor;
        this.idFazenda = idFazenda;
        this.area = area;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNisPastor() {
        return nisPastor;
    }

    public void setNisPastor(String nisPastor) {
        this.nisPastor = nisPastor;
    }

    public int getIdFazenda() {
        return idFazenda;
    }

    public void setIdFazenda(int idFazenda) {
        this.idFazenda = idFazenda;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Imagem getFoto() {
        return foto;
    }

    public void setFoto(Imagem foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Local{" + "nome=" + nome + ", nisPastor=" + nisPastor + ", idFazenda=" + idFazenda + ", area=" + area + '}';
    }
    
    
    
    
}
