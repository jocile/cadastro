package com.jocile.cadastro6;
import com.jocile.cadastro6.entidades.Aluno;
import com.jocile.cadastro6.entidades.Professor;


public class Principal {

    public static void main(String[] args) {
        
        // Testando a classe aluno
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("joão");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("pedro");
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Verice");
        Aluno aluno5 = new Aluno();
        aluno5.setNome("Wallison");
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
        System.out.println(aluno5.toString());
        
        // Testando a classe professor
        Professor professor1 = new Professor();
        professor1.setNome("Lucas");
        Professor professor2 = new Professor();
        professor2.setNome("joão");
        Professor professor3 = new Professor();
        professor3.setNome("pedro");
        Professor professor4 = new Professor();
        professor4.setNome("Verice");
        Professor professor5 = new Professor();
        professor5.setNome("Wallison");
        System.out.println(professor1.toString());
        System.out.println(professor2.toString());
        System.out.println(professor3.toString());
        System.out.println(professor4.toString());
        System.out.println(professor5.toString());
    }
}
