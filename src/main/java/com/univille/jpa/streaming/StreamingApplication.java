package com.univille.jpa.streaming;

import com.univille.jpa.streaming.Repository.*;
import com.univille.jpa.streaming.entity.avaliacao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StreamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamingApplication.class, args);
	}

    @Bean
    CommandLineRunner init(avaliacaoRepository avaRepo, categoriaRepository catRepo, perfilRepository perRepo ,
                           usuarioRepository usuRepo, videoRepository vidRepo , visualizacaoRepository visRepo) {
        return args -> {
            // Inserções
            //Id é nulo -> insere o registro ( insert )
            // Id não é nulo -> atualiza o registro ( update )
            avaRepo.save(new avaliacao());

            System.out.println("Lista de Avaliação");
            avaRepo.findAll().forEach(System.out::println);
        };
    }

}
