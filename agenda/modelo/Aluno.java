package br.com.alura.agenda.modelo;

/**
 * Created by andressa on 04/11/2017.
 */

public class Aluno {
    private long id;
    private String nome;
    private String endereço;
    private String telefne;
    private String email;
    private Double nota;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefne() {
        return telefne;
    }

    public void setTelefne(String telefne) {
        this.telefne = telefne;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}

