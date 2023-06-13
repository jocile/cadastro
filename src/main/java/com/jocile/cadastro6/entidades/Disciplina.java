package com.jocile.cadastro6.entidades;

class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    
    public Disciplina() {
        // Construtor vazio
    }

    public Disciplina(String nome, int semestre, String horario) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
