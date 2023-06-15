package com.jocile.cadastro6.entidades;

public class Aluno {
    private String nome;
    private char sexo;
    private int idade;
    private String matricula;
    private int anoDeIngresso;

    public Aluno(String nome, char sexo, int idade, String matricula, int anoDeIngresso) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.matricula = matricula;
        this.anoDeIngresso = anoDeIngresso;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", matricula=" + matricula + ", anoDeIngresso=" + anoDeIngresso + '}';
    }
    
    
}
