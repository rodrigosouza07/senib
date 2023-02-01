package com.nibsantoantonio.senib.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "aluno ")
public class Aluno extends AbstractEntity<Long>{

    @Column(name = "matricula", nullable = false, unique = true, length = 6)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matricula;
    @Column(name = "nome", nullable = false, length = 80)
    public String nome;
    @Column(name = "telefone", nullable = false, unique = true, length = 20)
    public String telefone;
    @Column(name = "email", nullable = false, length = 80)
    public String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "GA", nullable = false, length = 40)
    public GA GA;
    @Column(name = "senha", nullable = false, length = 16)
    public String senha;

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
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

    public com.nibsantoantonio.senib.domain.GA getGA() {
        return GA;
    }

    public void setGA(com.nibsantoantonio.senib.domain.GA GA) {
        this.GA = GA;
    }
}
