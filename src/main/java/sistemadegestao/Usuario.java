package sistemadegestao;

public sealed abstract class Usuario permits Gerente, Vendedor, Atendente {

    private String nome;
    private String email;
    private String senha;
    private boolean isAdministrador;

    public Usuario(String nome, String email, String senha, boolean isAdministrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdministrador = isAdministrador;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void realizarLogin() {
    }
    public void realizarLogoff() {
    }
    public void alterarDados() {
    }
    public void alterarSenha() {

    }

}
