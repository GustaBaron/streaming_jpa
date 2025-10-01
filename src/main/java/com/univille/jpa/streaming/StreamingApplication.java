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

                video video4 = new video();
                video4.setTitulo("Missão: Impossível");
                video4.setDescricao("Ação intensa com Ethan Hunt.");
                video4.setDuracao(7000);
                video4.setCategoria(catAcao);

                video video5 = new video();
                video5.setTitulo("Invicação do Mal");
                video5.setDescricao("Um filme que te fará pular da cadeira");
                video5.setDuracao(7200);
                video5.setCategoria(catTerror);

                video video6 = new video();
                video6.setTitulo("Viagem ao Desconhecido");
                video6.setDescricao("Uma aventura épica por terras inexploradas.");
                video6.setDuracao(6800);
                video6.setCategoria(catAventura);

                video video7 = new video();
                video7.setTitulo("Amor em Paris");
                video7.setDescricao("Uma emocionante história de romance em meio à Cidade Luz.");
                video7.setDuracao(6200);
                video7.setCategoria(catRomance);

                video video8 = new video();
                video8.setTitulo("O Mistério da Mansão");
                video8.setDescricao("Um suspense envolvente cheio de reviravoltas.");
                video8.setDuracao(7500);
                video8.setCategoria(catSuspense);

                video video9 = new video();
                video9.setTitulo("Caçada Implacável");
                video9.setDescricao("Um thriller de ação onde nada é o que parece.");
                video9.setDuracao(7100);
                video9.setCategoria(catAcao);

                video video10 = new video();
                video10.setTitulo("O Segredo das Profundezas");
                video10.setDescricao("Documentário sobre os mistérios escondidos no fundo dos oceanos.");
                video10.setDuracao(4000);
                video10.setCategoria(catDocumentario);

                video video11 = new video();
                video11.setTitulo("Noites de Riso");
                video11.setDescricao("Uma coletânea de situações hilárias e inesperadas.");
                video11.setDuracao(5000);
                video11.setCategoria(catComedia);

                video video12 = new video();
                video12.setTitulo("A Casa Sombria");
                video12.setDescricao("Um terror psicológico que desafia a sanidade.");
                video12.setDuracao(6900);
                video12.setCategoria(catTerror);

                vidRepo.saveAll(Arrays.asList(video1, video2, video3, video4, video5,
                        video6, video7, video8, video9, video10, video11, video12));

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

                avaliacao avaliacao3 = new avaliacao();
                avaliacao3.setPerfil(perfil2);
                avaliacao3.setVideo(video3);
                avaliacao3.setNota(5);
                avaliacao3.setComentario("Imagens maravilhosas, documentário incrível.");

                avaliacao avaliacao4 = new avaliacao();
                avaliacao4.setPerfil(perfil4);
                avaliacao4.setVideo(video5);
                avaliacao4.setNota(3);
                avaliacao4.setComentario("Assustador, mas esperava mais da história.");

                avaliacao avaliacao5 = new avaliacao();
                avaliacao5.setPerfil(perfil5);
                avaliacao5.setVideo(video4);
                avaliacao5.setNota(4);
                avaliacao5.setComentario("Muita ação e cenas bem produzidas.");

                avaliacao avaliacao6 = new avaliacao();
                avaliacao6.setPerfil(perfil6);
                avaliacao6.setVideo(video6);
                avaliacao6.setNota(5);
                avaliacao6.setComentario("Aventura épica, uma das melhores que já vi!");

                avaliacao avaliacao7 = new avaliacao();
                avaliacao7.setPerfil(perfil7);
                avaliacao7.setVideo(video7);
                avaliacao7.setNota(4);
                avaliacao7.setComentario("Romance envolvente, ótimo para assistir a dois.");

                avaliacao avaliacao8 = new avaliacao();
                avaliacao8.setPerfil(perfil8);
                avaliacao8.setVideo(video8);
                avaliacao8.setNota(5);
                avaliacao8.setComentario("Suspense cheio de reviravoltas, prende até o fim.");

                avaliacao avaliacao9 = new avaliacao();
                avaliacao9.setPerfil(perfil9);
                avaliacao9.setVideo(video9);
                avaliacao9.setNota(3);
                avaliacao9.setComentario("Boas cenas de ação, mas o roteiro é previsível.");

                avaliacao avaliacao10 = new avaliacao();
                avaliacao10.setPerfil(perfil10);
                avaliacao10.setVideo(video10);
                avaliacao10.setNota(5);
                avaliacao10.setComentario("Documentário fascinante sobre o fundo do mar!");

                avaliacao avaliacao11 = new avaliacao();
                avaliacao11.setPerfil(perfil11);
                avaliacao11.setVideo(video11);
                avaliacao11.setNota(4);
                avaliacao11.setComentario("Bem engraçado, gargalhadas garantidas.");

                avaliacao avaliacao12 = new avaliacao();
                avaliacao12.setPerfil(perfil12);
                avaliacao12.setVideo(video12);
                avaliacao12.setNota(2);
                avaliacao12.setComentario("Achei fraco, não deu medo como esperava.");

                avaliacao avaliacao13 = new avaliacao();
                avaliacao13.setPerfil(perfil13);
                avaliacao13.setVideo(video1);
                avaliacao13.setNota(5);
                avaliacao13.setComentario("Clássico de ação, não tem como não gostar!");

                avaliacao avaliacao14 = new avaliacao();
                avaliacao14.setPerfil(perfil14);
                avaliacao14.setVideo(video2);
                avaliacao14.setNota(3);
                avaliacao14.setComentario("Algumas piadas boas, mas meio repetitivo.");

                avaliacao avaliacao15 = new avaliacao();
                avaliacao15.setPerfil(perfil15);
                avaliacao15.setVideo(video3);
                avaliacao15.setNota(4);
                avaliacao15.setComentario("Ótima produção, imagens de tirar o fôlego.");

                avaliacao avaliacao16 = new avaliacao();
                avaliacao16.setPerfil(perfil16);
                avaliacao16.setVideo(video5);
                avaliacao16.setNota(5);
                avaliacao16.setComentario("Um terror de respeito, me deixou sem dormir!");

                avaliacao avaliacao17 = new avaliacao();
                avaliacao17.setPerfil(perfil17);
                avaliacao17.setVideo(video7);
                avaliacao17.setNota(3);
                avaliacao17.setComentario("História bonita, mas um pouco clichê.");

                avaliacao avaliacao18 = new avaliacao();
                avaliacao18.setPerfil(perfil18);
                avaliacao18.setVideo(video8);
                avaliacao18.setNota(5);
                avaliacao18.setComentario("Suspense muito bem feito, não consegui parar de assistir.");

                avaliacao avaliacao19 = new avaliacao();
                avaliacao19.setPerfil(perfil19);
                avaliacao19.setVideo(video9);
                avaliacao19.setNota(4);
                avaliacao19.setComentario("Boa ação, gostei do ritmo do filme.");

                avaliacao avaliacao20 = new avaliacao();
                avaliacao20.setPerfil(perfil20);
                avaliacao20.setVideo(video10);
                avaliacao20.setNota(5);
                avaliacao20.setComentario("Um dos melhores documentários que já vi.");

                avaliacao avaliacao21 = new avaliacao();
                avaliacao21.setPerfil(perfil1);
                avaliacao21.setVideo(video11);
                avaliacao21.setNota(4);
                avaliacao21.setComentario("Rendeu boas risadas, ótimo para descontrair.");

                avaliacao avaliacao22 = new avaliacao();
                avaliacao22.setPerfil(perfil2);
                avaliacao22.setVideo(video12);
                avaliacao22.setNota(3);
                avaliacao22.setComentario("Um terror mediano, esperava mais sustos.");

                avaRepo.saveAll(Arrays.asList(
                        avaliacao1, avaliacao2, avaliacao3, avaliacao4, avaliacao5, avaliacao6,
                        avaliacao7, avaliacao8, avaliacao9, avaliacao10, avaliacao11, avaliacao12,
                        avaliacao13, avaliacao14, avaliacao15, avaliacao16, avaliacao17, avaliacao18,
                        avaliacao19, avaliacao20, avaliacao21, avaliacao22
                ));


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

                visualizacao visualizacao4 = new visualizacao();
                visualizacao4.setPerfil(perfil2);
                visualizacao4.setVideo(video2);
                visualizacao4.setData_hora(LocalDateTime.now().minusDays(3));
                visualizacao4.setProgresso(5400); // filme completo

                visualizacao visualizacao5 = new visualizacao();
                visualizacao5.setPerfil(perfil2);
                visualizacao5.setVideo(video5);
                visualizacao5.setData_hora(LocalDateTime.now().minusWeeks(1));
                visualizacao5.setProgresso(2500); // assistiu parcialmente

                visualizacao visualizacao6 = new visualizacao();
                visualizacao6.setPerfil(perfil4);
                visualizacao6.setVideo(video6);
                visualizacao6.setData_hora(LocalDateTime.now().minusHours(5));
                visualizacao6.setProgresso(6800); // completo

                visualizacao visualizacao7 = new visualizacao();
                visualizacao7.setPerfil(perfil5);
                visualizacao7.setVideo(video7);
                visualizacao7.setData_hora(LocalDateTime.now().minusMonths(1));
                visualizacao7.setProgresso(3100); // metade do filme

                visualizacao visualizacao8 = new visualizacao();
                visualizacao8.setPerfil(perfil6);
                visualizacao8.setVideo(video8);
                visualizacao8.setData_hora(LocalDateTime.now().minusDays(10));
                visualizacao8.setProgresso(7500); // completo

                visualizacao visualizacao9 = new visualizacao();
                visualizacao9.setPerfil(perfil7);
                visualizacao9.setVideo(video9);
                visualizacao9.setData_hora(LocalDateTime.now().minusHours(12));
                visualizacao9.setProgresso(2000); // início do filme

                visualizacao visualizacao10 = new visualizacao();
                visualizacao10.setPerfil(perfil8);
                visualizacao10.setVideo(video10);
                visualizacao10.setData_hora(LocalDateTime.now().minusWeeks(3));
                visualizacao10.setProgresso(4000); // completo

                visualizacao visualizacao11 = new visualizacao();
                visualizacao11.setPerfil(perfil9);
                visualizacao11.setVideo(video11);
                visualizacao11.setData_hora(LocalDateTime.now().minusDays(6));
                visualizacao11.setProgresso(2500); // parcial

                visualizacao visualizacao12 = new visualizacao();
                visualizacao12.setPerfil(perfil10);
                visualizacao12.setVideo(video12);
                visualizacao12.setData_hora(LocalDateTime.now().minusHours(8));
                visualizacao12.setProgresso(6900); // completo

                visualizacao visualizacao13 = new visualizacao();
                visualizacao13.setPerfil(perfil11);
                visualizacao13.setVideo(video1);
                visualizacao13.setData_hora(LocalDateTime.now().minusWeeks(2));
                visualizacao13.setProgresso(3500);

                visualizacao visualizacao14 = new visualizacao();
                visualizacao14.setPerfil(perfil12);
                visualizacao14.setVideo(video4);
                visualizacao14.setData_hora(LocalDateTime.now().minusDays(15));
                visualizacao14.setProgresso(7000);

                visualizacao visualizacao15 = new visualizacao();
                visualizacao15.setPerfil(perfil13);
                visualizacao15.setVideo(video6);
                visualizacao15.setData_hora(LocalDateTime.now().minusHours(3));
                visualizacao15.setProgresso(1200);

                visualizacao visualizacao16 = new visualizacao();
                visualizacao16.setPerfil(perfil14);
                visualizacao16.setVideo(video8);
                visualizacao16.setData_hora(LocalDateTime.now().minusMonths(2));
                visualizacao16.setProgresso(5000);

                visualizacao visualizacao17 = new visualizacao();
                visualizacao17.setPerfil(perfil15);
                visualizacao17.setVideo(video10);
                visualizacao17.setData_hora(LocalDateTime.now().minusDays(20));
                visualizacao17.setProgresso(1000);

                visualizacao visualizacao18 = new visualizacao();
                visualizacao18.setPerfil(perfil16);
                visualizacao18.setVideo(video12);
                visualizacao18.setData_hora(LocalDateTime.now().minusHours(6));
                visualizacao18.setProgresso(6900); // completo

                visualizacao visualizacao19 = new visualizacao();
                visualizacao19.setPerfil(perfil17);
                visualizacao19.setVideo(video2);
                visualizacao19.setData_hora(LocalDateTime.now().minusWeeks(4));
                visualizacao19.setProgresso(2000);

                visualizacao visualizacao20 = new visualizacao();
                visualizacao20.setPerfil(perfil18);
                visualizacao20.setVideo(video7);
                visualizacao20.setData_hora(LocalDateTime.now().minusDays(2));
                visualizacao20.setProgresso(6200); // quase completo

                visualizacao visualizacao21 = new visualizacao();
                visualizacao21.setPerfil(perfil19);
                visualizacao21.setVideo(video9);
                visualizacao21.setData_hora(LocalDateTime.now().minusHours(9));
                visualizacao21.setProgresso(7100); // completo

                visualizacao visualizacao22 = new visualizacao();
                visualizacao22.setPerfil(perfil20);
                visualizacao22.setVideo(video11);
                visualizacao22.setData_hora(LocalDateTime.now().minusMonths(1));
                visualizacao22.setProgresso(500);

                visRepo.saveAll(Arrays.asList(
                        visualizacao1, visualizacao2, visualizacao3, visualizacao4, visualizacao5,
                        visualizacao6, visualizacao7, visualizacao8, visualizacao9, visualizacao10,
                        visualizacao11, visualizacao12, visualizacao13, visualizacao14, visualizacao15,
                        visualizacao16, visualizacao17, visualizacao18, visualizacao19, visualizacao20,
                        visualizacao21, visualizacao22
                ));


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
