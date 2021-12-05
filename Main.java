package com.nandodevs.bootcamp;

public class Main {
    
    public static void main(String[] args) {
        
        Conteudo conteudo = new Curso();
        conteudo.setTitulo("Curso de Java");
        conteudo.setDescricao("Aprendendo Java");
        conteudo.calcularXp();
        
        System.out.println(conteudo);

    }

}

