package com.beans.livrariabeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("A Cabana");
        livro.setID("7DJ32S");
        livro.setGenero("Drama");


        Autor autor = factory.getBean(Autor.class);
        autor.setNome("William P. Young");
        livro.exibir();

   
    }
}
