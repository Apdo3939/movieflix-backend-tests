INSERT INTO tb_user (name, email, password) VALUES ('Bob Blue', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Ana Pink', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Gustav Green', 'gustav@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_genre (name) VALUES ('Ficção Ciêntifica');
INSERT INTO tb_genre (name) VALUES ('Drama');
INSERT INTO tb_genre (name) VALUES ('Comédia');
INSERT INTO tb_genre (name) VALUES ('Terror');
INSERT INTO tb_genre (name) VALUES ('Ação');
INSERT INTO tb_genre (name) VALUES ('Infantil');
INSERT INTO tb_genre (name) VALUES ('Fantasia');
INSERT INTO tb_genre (name) VALUES ('Musical');
INSERT INTO tb_genre (name) VALUES ('Aventura');
INSERT INTO tb_genre (name) VALUES ('Corrida');


INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Aves de Rapina', 'Arlequina e sua Emancipação Fantabulosa', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/10/BIRDS-OF-PREY-AVES-DE-RAPINA.jpeg', 'Um spinoff referente a esquadrão suicida', 5);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Mulan', 'Mulan', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/10/mulan-disney-2020-696x392.jpg', 'Remake de fantasia da disney', 7);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('007 – Sem Tempo Para Morrer', '007 – Sem Tempo Para Morrer', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/08/bond-25-007-696x392.jpg', 'Um sequência esperada do 007', 5);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Viúva Negra', 'Viúva Negra', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/12/black-widow-2020-696x392.jpg', 'Filme de heroi baseado nos quadrinhos da marvel', 5);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Velozes e Furiosos 9', 'Velozes e Furiosos 9', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/10/vin-diesel-696x500.jpg', 'Mais uma sequencia da aclamada serie velosos e furiosos', 10);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Mulher-Maravilha 1984', 'Mulher-Maravilha 1984 ação', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/06/wonder-woman-1984-poster-feature-696x419.jpg', 'Filme de heroi baseado nos quadrinhos da DC', 5);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Soul', 'Soul', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/12/pixar-1-696x401.jpg', 'Mais uma belíssima animação da pixar', 6);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Top Gun', 'Top Gun: Maverick', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/07/20190719091307_1200_675_-_top_gun__maverick-696x392.jpg', 'Remake de um antigo sucesso com o mesmo nome', 5);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Jungle Cruise', 'Jungle Cruise', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2018/09/jungle_cruise_announcement-670x377.jpg', 'Uma nova ip de aventura da disney', 9);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Tenet', 'Tenet', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/12/john-david-washington-tenet-christopher-nolan-cdl-01-1280x720-696x392.jpg', 
'Uma misteriosa aventura de ficção científica que envolve espionagem e viagem no tempo', 1);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Morbius', 'Morbius', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/08/jared-leto-morbius-696x391.jpg', 
'A Sony Pictures segue expandindo seu próprio universo de produções da Marvel com mais um vilão', 4);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Bill & Ted 3', 'Face the Music', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/07/bill-and-ted-face-the-music-696x418.png', 
'Alex Winter e Keanu Reeves tentando escrever a música que enfim salvará o universo de uma catástrofe', 3);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Godzilla vs Kong', 'Godzilla vs Kong', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/05/godzilla-vs-kong-696x366.jpg', 
'Um confronto de dois kaijus mais aclamados de Holywood ', 5);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Amor Sublime Amor', 'Amor Sublime Amor', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/06/west-side-story.jpg', 
'Steven Spielberg é um dos grandes cineastas americanos de todos os tempos e vai ousar refilmar aquele que é considerado o maior filme musical da História dos EUA', 8);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Mank', 'mank', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/07/David-Fincher-696x453.jpg', 
'Em parceria com a Netflix, o diretor vai contar os bastidores de Cidadão Kane, clássico de Orson Welles', 2);


INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis, genre_id  ) VALUES ('Duna', 'Duna', 2020, 
'https://observatoriodocinema.uol.com.br/wp-content/uploads/2019/04/dune-originalgame-ftd-970x545-696x391.jpg', 
'Clássicos de ficção científica contando com o elenco mais estelar dos últimos anos', 1);


INSERT INTO tb_review (text, user_id, movie_id ) VALUES ('Amei este filme e recomendo' , 2 , 16);


