import java.util.Objects;

public class Pessoa {

    private String nomeCompleto;
    private String dataNasciemento;
    private String idade;
    private String cpf;
    private String cidadeMora;
    private String estdoMora;
    private String email;
    private String senha;

    public Pessoa(String nomeCompleto, String dataNasciemento, String idade, String cpf,
                  String cidadeMora, String estdoMora, String email, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.dataNasciemento = dataNasciemento;
        this.idade = idade;
        this.cpf = cpf;
        this.cidadeMora = cidadeMora;
        this.estdoMora = estdoMora;
        this.email = email;
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nome) {
        this.nomeCompleto = nome;
    }

    public String getDataNasciemento() {
        return dataNasciemento;
    }

    public void setDataNasciemento(String dataNasciemento) {
        this.dataNasciemento = dataNasciemento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidadeMora() {
        return cidadeMora;
    }

    public void setCidadeMora(String cidadeMora) {
        this.cidadeMora = cidadeMora;
    }

    public String getEstdoMora() {
        return estdoMora;
    }

    public void setEstdoMora(String estdoMora) {
        this.estdoMora = estdoMora;
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

    public void nomeCompleto(String primeiroNome, String segundoNome) {
        if(!Objects.equals(nomeCompleto, primeiroNome + segundoNome)) {
            System.out.println("Voce deve cadastrar seu nome completo");
        } else {
            System.out.println("Seu nome foi cadastrado com sucesso");
        }
    }

}
