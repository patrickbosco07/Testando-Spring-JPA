package DIO.TestandoSpringJPA.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "user_id")
            Integer id;
    @Column(length = 50, nullable = false)
    String nome;
    @Column(length = 50, nullable = false)
    String login;
    @Column(length = 100, nullable = false)
    String senha;

    public Integer id() {
        return id;
    }

    public Usuario setId(Integer id) {
        this.id = id;
        return this;
    }

    public String nome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String login() {
        return login;
    }

    public Usuario setLogin(String login) {
        this.login = login;
        return this;
    }

    public String senha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
