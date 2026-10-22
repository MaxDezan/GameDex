package com.example.gamedex.data.repository

import com.example.gamedex.data.model.Game

object GameRepository {

    private const val PC = "PC"
    private const val PLAYSTATION = "PlayStation"
    private const val XBOX = "Xbox"
    private const val SWITCH = "Switch"

    private fun steamCover(appId: Int) =
        "https://cdn.cloudflare.steamstatic.com/steam/apps/$appId/header.jpg"

    private val games: List<Game> = listOf(
        Game(
            id = 1,
            title = "The Witcher 3: Wild Hunt",
            category = "RPG",
            imageUrl = steamCover(292030),
            description = "Geralt de Rívia, um caçador de monstros profissional, parte em busca de Ciri, " +
                "a criança da profecia, enquanto a Caçada Selvagem avança sobre os Reinos do Norte. " +
                "Um mundo aberto gigantesco, repleto de contratos de monstros, escolhas morais com " +
                "consequências reais e duas expansões aclamadas: Hearts of Stone e Blood and Wine.",
            releaseYear = 2015,
            developer = "CD Projekt Red",
            rating = 9.3,
            platforms = listOf(PC, PLAYSTATION, XBOX, SWITCH)
        ),
        Game(
            id = 2,
            title = "Elden Ring",
            category = "Soulslike",
            imageUrl = steamCover(1245620),
            description = "Nas Terras Intermédias, o Anel Prístino foi estilhaçado. Como um Maculado, " +
                "você deve reunir os fragmentos do anel e se tornar o Lorde Prístino. Criado por " +
                "Hidetaka Miyazaki em parceria com George R. R. Martin, combina combate desafiador com " +
                "um vasto mundo aberto cheio de segredos, masmorras e chefes memoráveis.",
            releaseYear = 2022,
            developer = "FromSoftware",
            rating = 9.6,
            platforms = listOf(PC, PLAYSTATION, XBOX)
        ),
        Game(
            id = 3,
            title = "Hollow Knight",
            category = "Metroidvania",
            imageUrl = steamCover(367520),
            description = "Desça às profundezas de Hallownest, um reino de insetos em ruínas. Explore " +
                "cavernas interconectadas, enfrente criaturas corrompidas e desvende os mistérios de " +
                "uma civilização perdida neste metroidvania desenhado à mão, famoso pela atmosfera " +
                "melancólica e pela trilha sonora marcante.",
            releaseYear = 2017,
            developer = "Team Cherry",
            rating = 8.7,
            platforms = listOf(PC, PLAYSTATION, XBOX, SWITCH)
        ),
        Game(
            id = 4,
            title = "Cyberpunk 2077",
            category = "RPG",
            imageUrl = steamCover(1091500),
            description = "Em Night City, uma megalópole obcecada por poder, glamour e modificações " +
                "corporais, você é V, um mercenário em busca de um implante único que é a chave para " +
                "a imortalidade. Personalize seu personagem, seu estilo de jogo e explore uma cidade " +
                "vertical cheia de neon, gangues e corporações.",
            releaseYear = 2020,
            developer = "CD Projekt Red",
            rating = 8.6,
            platforms = listOf(PC, PLAYSTATION, XBOX)
        ),
        Game(
            id = 5,
            title = "Baldur's Gate 3",
            category = "RPG",
            imageUrl = steamCover(1086940),
            description = "Reúna seu grupo e retorne aos Reinos Esquecidos em uma história de amizade, " +
                "traição, sacrifício e sobrevivência. Baseado nas regras de Dungeons & Dragons 5ª " +
                "edição, oferece combate tático por turnos, liberdade quase total de escolhas e " +
                "companheiros profundamente desenvolvidos.",
            releaseYear = 2023,
            developer = "Larian Studios",
            rating = 9.6,
            platforms = listOf(PC, PLAYSTATION, XBOX)
        ),
        Game(
            id = 6,
            title = "Red Dead Redemption 2",
            category = "Ação e Aventura",
            imageUrl = steamCover(1174180),
            description = "América, 1899. O fim da era do Velho Oeste se aproxima. Arthur Morgan e a " +
                "gangue Van der Linde fogem após um assalto fracassado, perseguidos por agentes " +
                "federais e caçadores de recompensas. Uma narrativa épica sobre lealdade e redenção " +
                "em um mundo aberto incrivelmente detalhado.",
            releaseYear = 2018,
            developer = "Rockstar Games",
            rating = 9.7,
            platforms = listOf(PC, PLAYSTATION, XBOX)
        ),
        Game(
            id = 7,
            title = "God of War Ragnarök",
            category = "Ação e Aventura",
            imageUrl = steamCover(2322010),
            description = "Kratos e Atreus embarcam em uma jornada pelos Nove Reinos em busca de " +
                "respostas enquanto as forças asgardianas se preparam para a batalha profetizada que " +
                "trará o fim do mundo. Combate brutal, exploração e uma história emocionante sobre " +
                "pai e filho.",
            releaseYear = 2022,
            developer = "Santa Monica Studio",
            rating = 9.4,
            platforms = listOf(PC, PLAYSTATION)
        ),
        Game(
            id = 8,
            title = "Hades",
            category = "Roguelike",
            imageUrl = steamCover(1145360),
            description = "Desafie o deus dos mortos enquanto você abre caminho para fora do Submundo " +
                "neste roguelike de ação. Como Zagreus, filho de Hades, use os poderes concedidos " +
                "pelos deuses do Olimpo para escapar, morrendo e tentando novamente enquanto a " +
                "história avança a cada tentativa.",
            releaseYear = 2020,
            developer = "Supergiant Games",
            rating = 9.3,
            platforms = listOf(PC, PLAYSTATION, XBOX, SWITCH)
        ),
        Game(
            id = 9,
            title = "Celeste",
            category = "Plataforma",
            imageUrl = steamCover(504230),
            description = "Ajude Madeline a sobreviver aos seus demônios interiores em sua jornada até " +
                "o topo da Montanha Celeste. Um jogo de plataforma de precisão com centenas de " +
                "desafios criados à mão, segredos escondidos e uma história sensível sobre ansiedade " +
                "e autoaceitação.",
            releaseYear = 2018,
            developer = "Maddy Makes Games",
            rating = 9.2,
            platforms = listOf(PC, PLAYSTATION, XBOX, SWITCH)
        ),
        Game(
            id = 10,
            title = "Stardew Valley",
            category = "Simulação",
            imageUrl = steamCover(413150),
            description = "Você herdou a antiga fazenda do seu avô em Stardew Valley. Com ferramentas " +
                "de segunda mão e algumas moedas, comece uma nova vida: cultive, crie animais, pesque, " +
                "explore minas e faça amizade com os moradores desta pequena e acolhedora cidade.",
            releaseYear = 2016,
            developer = "ConcernedApe",
            rating = 8.9,
            platforms = listOf(PC, PLAYSTATION, XBOX, SWITCH)
        ),
        Game(
            id = 11,
            title = "Sekiro: Shadows Die Twice",
            category = "Soulslike",
            imageUrl = steamCover(814380),
            description = "No Japão do período Sengoku, você é o \"lobo de um braço só\", um shinobi " +
                "desonrado e desfigurado resgatado da beira da morte. Use sua prótese shinobi, " +
                "furtividade e combate baseado em postura para resgatar seu jovem senhor e se vingar " +
                "de seus inimigos.",
            releaseYear = 2019,
            developer = "FromSoftware",
            rating = 9.0,
            platforms = listOf(PC, PLAYSTATION, XBOX)
        ),
        Game(
            id = 12,
            title = "Disco Elysium",
            category = "RPG",
            imageUrl = steamCover(632470),
            description = "Você é um detetive com um sistema de habilidades único à disposição e um " +
                "quarteirão inteiro para investigar. Interrogue personagens inesquecíveis, resolva " +
                "assassinatos ou aceite subornos. Torne-se um herói ou um desastre de ser humano " +
                "neste RPG revolucionário focado em diálogos.",
            releaseYear = 2019,
            developer = "ZA/UM",
            rating = 9.1,
            platforms = listOf(PC, PLAYSTATION, XBOX, SWITCH)
        )
    )

    fun getAllGames(): List<Game> = games

    fun getGameById(id: Int): Game? = games.find { it.id == id }

    fun getCategories(): List<String> = games.map { it.category }.distinct().sorted()
}
