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
import org.springframework.data.domain.PageRequest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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

            if (usuRepo.count() > 0) {
                System.out.println("--- DADOS JÁ INSERIDOS ---");
            } else {
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

                usuario user3 = new usuario();
                user3.setNome("Ryan Gosling");
                user3.setEmail("ryan.gosling@email.com");
                user3.setSenha("senha321");
                user3.setData_cadastro(LocalDateTime.now());

                usuario user4 = new usuario();
                user4.setNome("Joao Rosa");
                user4.setEmail("joao.rosa@email.com");
                user4.setSenha("senha678");
                user4.setData_cadastro(LocalDateTime.now());

                usuario user5 = new usuario();
                user5.setNome("Felipe");
                user5.setEmail("felipe@email.com");
                user5.setSenha("senha299");
                user5.setData_cadastro(LocalDateTime.now());

                usuario user6 = new usuario();
                user6.setNome("Sergio Costa");
                user6.setEmail("sergio.costa@email.com");
                user6.setSenha("senha7756");
                user6.setData_cadastro(LocalDateTime.now());


                usuario user7 = new usuario();
                user7.setNome("Nicolau Flamel");
                user7.setEmail("nicolau.flafla@email.com");
                user7.setSenha("senhaflaflu");
                user7.setData_cadastro(LocalDateTime.now());


                usuario user8 = new usuario();
                user8.setNome("Luis Carlos");
                user8.setEmail("carlãoluis@email.com");
                user8.setSenha("senhasantosmundial3");
                user8.setData_cadastro(LocalDateTime.now());


                usuario user9 = new usuario();
                user9.setNome("Albertina Rosa");
                user9.setEmail("beteeeeeeee@email.com");
                user9.setSenha("senha5.6849612");
                user9.setData_cadastro(LocalDateTime.now());


                usuario user10 = new usuario();
                user10.setNome("Elisane Esseler");
                user10.setEmail("elisane.esseler@email.com");
                user10.setSenha("senhashfsknf1.62");
                user10.setData_cadastro(LocalDateTime.now());

                usuRepo.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10));

                // 2. Criar Perfis
                perfil perfil1 = new perfil();
                perfil1.setNome_perfil("Ana Pessoal");
                perfil1.setUsuario(user1);

                perfil perfil2 = new perfil();
                perfil2.setNome_perfil("Ana Kids");
                perfil2.setUsuario(user2);

                perfil perfil3 = new perfil();
                perfil3.setNome_perfil("Bruno");
                perfil3.setUsuario(user3);

                perfil perfil4 = new perfil();
                perfil4.setNome_perfil("Joao");
                perfil4.setUsuario(user4);

                perfil perfil5 = new perfil();
                perfil5.setNome_perfil("Felipe");
                perfil5.setUsuario(user5);

                perfil perfil6 = new perfil();
                perfil6.setNome_perfil("Sergio");
                perfil6.setUsuario(user6);

                perfil perfil7 = new perfil();
                perfil7.setNome_perfil("Nicolas");
                perfil7.setUsuario(user7);

                perfil perfil8 = new perfil();
                perfil8.setNome_perfil("Leticia");
                perfil8.setUsuario(user8);

                perfil perfil9 = new perfil();
                perfil9.setNome_perfil("Lisete");
                perfil9.setUsuario(user9);

                perfil perfil10 = new perfil();
                perfil10.setNome_perfil("Izaias");
                perfil10.setUsuario(user10);

                perfil perfil11 = new perfil();
                perfil11.setNome_perfil("Ila");
                perfil11.setUsuario(user1);

                perfil perfil12 = new perfil();
                perfil12.setNome_perfil("Nayara");
                perfil12.setUsuario(user2);

                perfil perfil13 = new perfil();
                perfil13.setUsuario(user3);
                perfil13.setNome_perfil("Fabricio");

                perfil perfil14 = new perfil();
                perfil14.setNome_perfil("Rei");
                perfil14.setUsuario(user4);

                perfil perfil15 = new perfil();
                perfil15.setNome_perfil("Tia Dori");
                perfil15.setUsuario(user5);

                perfil perfil16 = new perfil();
                perfil16.setNome_perfil("Samw");
                perfil16.setUsuario(user6);

                perfil perfil17 = new perfil();
                perfil17.setNome_perfil("Panda");
                perfil17.setUsuario(user7);

                perfil perfil18 = new perfil();
                perfil18.setNome_perfil("John");
                perfil18.setUsuario(user8);

                perfil perfil19 = new perfil();
                perfil19.setNome_perfil("Gio");
                perfil19.setUsuario(user9);

                perfil perfil20 = new perfil();
                perfil20.setNome_perfil("Mumu");
                perfil20.setUsuario(user10);

                perRepo.saveAll(Arrays.asList(perfil1, perfil2, perfil3, perfil4, perfil5, perfil6, perfil7, perfil8, perfil9, perfil10,
                                     perfil11, perfil12, perfil13, perfil14, perfil15, perfil16, perfil17, perfil18, perfil19, perfil20));

                // 3. Criar Categorias
                categoria catAcao = new categoria();
                catAcao.setNome("Ação");

                categoria catAventura = new categoria();
                catAventura.setNome("Aventura");

                categoria catComedia = new categoria();
                catComedia.setNome("Comédia");

                categoria catDocumentario = new categoria();
                catDocumentario.setNome("Documentário");

                categoria catRomance = new categoria();
                catRomance.setNome("Romance");

                categoria catSuspense = new categoria();
                catSuspense.setNome("Suspense");

                categoria catTerror = new categoria();
                catTerror.setNome("Terror");

                catRepo.saveAll(Arrays.asList(catAcao, catAventura, catComedia, catDocumentario, catRomance, catSuspense, catTerror));

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
                video3.setCategoria(catDocumentario);

                // Extra: vídeo com "Missão" no título
                video video4 = new video();
                video4.setTitulo("Missão: Impossível");
                video4.setDescricao("Ação intensa com Ethan Hunt.");
                video4.setDuracao(7000);
                video4.setCategoria(catAcao);

                vidRepo.saveAll(Arrays.asList(video1, video2, video3, video4));

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
                visualizacao2.setData_hora(LocalDateTime.now().minusWeeks(2));
                visualizacao2.setProgresso(1800);

                visualizacao visualizacao3 = new visualizacao();
                visualizacao3.setPerfil(perfil3);
                visualizacao3.setVideo(video1);
                visualizacao3.setData_hora(LocalDateTime.now().minusHours(2));
                visualizacao3.setProgresso(3000);

                visRepo.saveAll(Arrays.asList(visualizacao1, visualizacao2, visualizacao3));

                System.out.println("--- DADOS INSERIDOS COM SUCESSO ---");
            }

            // CONSULTAS
            System.out.println("\n================ CONSULTAS =================");

            // 1. Buscar vídeos pelo título contendo "Missão"
            System.out.println("\n📽 Vídeos com título contendo 'Missão':");
            vidRepo.findByTituloContainingIgnoreCaseOrderByTituloAsc("Missão")
                    .forEach(v -> System.out.println(" - " + v.getTitulo()));

            // 2. Vídeos da categoria "Ação"
            System.out.println("\n🎬 Vídeos da categoria 'Ação':");
            vidRepo.findByCategoriaNomeOrderByTituloAsc("Ação")
                    .forEach(v -> System.out.println(" - " + v.getTitulo()));

            // 3. Top 10 vídeos mais bem avaliados
            System.out.println("\n⭐ Top 10 vídeos mais bem avaliados:");
            avaRepo.findTop10VideosMaisBemAvaliados(PageRequest.of(0, 10))
                    .forEach(v -> System.out.println(" - " + v.getTitulo()));

            // 4. Top 10 vídeos mais assistidos
            System.out.println("\n👁 Top 10 vídeos mais assistidos:");
            visRepo.findTop10VideosMaisAssistidos(PageRequest.of(0, 10))
                    .forEach(v -> System.out.println(" - " + v.getTitulo()));

            // 5. Usuário que mais assistiu vídeos
            System.out.println("\n👤 Usuário que mais assistiu vídeos:");
            List<usuario> topUserList = visRepo.findUsuariosPorVisualizacoesDesc(PageRequest.of(0, 1));
            if (!topUserList.isEmpty()) {
                System.out.println(" - " + topUserList.getFirst().getNome());
            } else {
                System.out.println("Nenhum usuário encontrado.");
            }

            System.out.println("\n=============== FIM ===============");
        };
    }

}
