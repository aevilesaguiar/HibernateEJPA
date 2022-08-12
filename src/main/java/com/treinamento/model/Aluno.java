package com.treinamento.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tabela_aluno")
public class Aluno {

    @Id
    @Column(name = "cod_aluno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matricula",nullable = false, length = 20)
    private String matricula;

    @Column(name = "nome_aluno", nullable = false, length = 250)
    private String nomeCompleto;

    @Column(name = "sexo_aluno", nullable = false)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @ManyToMany(mappedBy = "alunos")
    private List<Unidade> unidades;



    public Aluno() {
    }

    public Aluno(String matricula, String nomeCompleto, Sexo sexo) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<Unidade> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<Unidade> unidades) {
        this.unidades = unidades;
    }

}
