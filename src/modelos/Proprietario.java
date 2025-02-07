package modelos;

public class Proprietario {
    private static Proprietario proprietarioSessao;
    private String cpf, email, senha, nome, telefone;

    public Proprietario(String cpf, String email, String senha, String nome, String telefone) {
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
    }

    public static Proprietario getProprietarioSessao() {
        return proprietarioSessao;
    }

    public static void setProprietarioSessao(Proprietario proprietarioSessao) {
        Proprietario.proprietarioSessao = proprietarioSessao;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proprietario{");
        sb.append("cpf=").append(cpf);
        sb.append(", email=").append(email);
        sb.append(", senha=").append(senha);
        sb.append(", nome=").append(nome);
        sb.append(", telefone=").append(telefone);
        sb.append('}');
        return sb.toString();
    }
    
    
}
