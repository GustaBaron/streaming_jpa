package com.univille.jpa.streaming;

import com.univille.jpa.streaming.Repository.avaliacaoRepository;
import com.univille.jpa.streaming.Repository.categoriaRepository;
import com.univille.jpa.streaming.Repository.perfilRepository;
import com.univille.jpa.streaming.Repository.usuarioRepository;
import com.univille.jpa.streaming.Repository.videoRepository;
import com.univille.jpa.streaming.Repository.visualizacaoRepository;

import com.univille.jpa.streaming.entity.avaliacao;
import com.univille.jpa.streaming.entity.categoria;
import com.univille.jpa.streaming.entity.perfil;
import com.univille.jpa.streaming.entity.usuario;
import com.univille.jpa.streaming.entity.video;
import com.univille.jpa.streaming.entity.visualizacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class StreamingApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamingApplication.class, args);
    }

    @Bean
    CommandLineRunner init(
            avaliacaoRepository avaRepo,
            categoriaRepository catRepo,
            perfilRepository perRepo,
            usuarioRepository usuRepo,
            videoRepository vidRepo,
            visualizacaoRepository visRepo
    ) {
        return args -> {
            System.out.println("--- INSERINDO DADOS INICIAIS ---");

            // 1. Criar Usuários
            usuario user1 = new usuario();
            user1.setNome("Ana Silva");
            user1.setEmail("ana.silva@email.com");
            user1.setSenha("senha123");
            user1.setData_cadastro(LocalDateTime.now());

            usuario user2 = new usuario();
            user2.setNome("Bruno Costa");
            user2.setEmail("bruno.costa@email.com");
            user2.setSenha("senha456");
            user2.setData_cadastro(LocalDateTime.now());

            usuRepo.saveAll(Arrays.asList(user1, user2));

            // 2. Criar Perfis
            perfil perfil1 = new perfil();
            perfil1.setNome_perfil("Ana Pessoal");
            perfil1.setUsario(user1);

            perfil perfil2 = new perfil();
            perfil2.setNome_perfil("Ana Kids");
            perfil2.setUsario(user1);

            perfil perfil3 = new perfil();
            perfil3.setNome_perfil("Bruno");
            perfil3.setUsario(user2);

            perRepo.saveAll(Arrays.asList(perfil1, perfil2, perfil3));

            // 3. Criar Categorias
            categoria catAcao = new categoria();
            catAcao.setNome("Ação");

            categoria catComedia = new categoria();
            catComedia.setNome("Comédia");

            categoria catDoc = new categoria();
            catDoc.setNome("Documentário");

            catRepo.saveAll(Arrays.asList(catAcao, catComedia, catDoc));

            // 4. Criar Vídeos
            video video1 = new video();
            video1.setTitulo("A Grande Fuga");
            video1.setDescricao("Um filme eletrizante sobre uma equipe de elite.");
            video1.setDuracao(7200);
            video1.setCategoria(catAcao);

            video video2 = new video();
            video2.setTitulo("Rindo à Toa");
            video2.setDescricao("As situações mais engraçadas do cotidiano.");
            video2.setDuracao(5400);
            video2.setCategoria(catComedia);

            video video3 = new video();
            video3.setTitulo("Planeta Terra");
            video3.setDescricao("Uma jornada visual pelas maravilhas da natureza.");
            video3.setDuracao(3600);
            video3.setCategoria(catDoc);

            vidRepo.saveAll(Arrays.asList(video1, video2, video3));

            // 5. Criar Avaliações
            avaliacao avaliacao1 = new avaliacao();
            avaliacao1.setPerfil(perfil1);
            avaliacao1.setVideo(video1);
            avaliacao1.setNota(5);
            avaliacao1.setComentario("Filme excelente, muita adrenalina!");

            avaliacao avaliacao2 = new avaliacao();
            avaliacao2.setPerfil(perfil3);
            avaliacao2.setVideo(video2);
            avaliacao2.setNota(4);
            avaliacao2.setComentario("Muito divertido, recomendo.");

            avaRepo.saveAll(Arrays.asList(avaliacao1, avaliacao2));

            // 6. Criar Visualizações
            visualizacao visualizacao1 = new visualizacao();
            visualizacao1.setPerfil(perfil1);
            visualizacao1.setVideo(video1);
            visualizacao1.setData_hora(LocalDateTime.now().minusDays(1));
            visualizacao1.setProgresso(7200);

            visualizacao visualizacao2 = new visualizacao();
            visualizacao2.setPerfil(perfil1);
            visualizacao2.setVideo(video3);
            visualizacao2.setData_hora(LocalDateTime.now());
            visualizacao2.setProgresso(1800);

            visualizacao visualizacao3 = new visualizacao();
            visualizacao3.setPerfil(perfil3);
            visualizacao3.setVideo(video1);
            visualizacao3.setData_hora(LocalDateTime.now().minusHours(2));
            visualizacao3.setProgresso(3000);

            visRepo.saveAll(Arrays.asList(visualizacao1, visualizacao2, visualizacao3));

            System.out.println("--- DADOS INSERIDOS COM SUCESSO ---");
        };
    }
}
