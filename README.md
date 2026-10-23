# GameDex 

O GameDex é um aplicativo Android para explorar um catálogo de jogos. Ele foi desenvolvido para colocar em prática conceitos modernos de desenvolvimento mobile nativo, focando puramente na criação de interfaces e fluxos de navegação.

Este projeto foi construído como parte de uma avaliação acadêmica (AP2). Por conta das diretrizes do projeto, ele não utiliza banco de dados local (como Room) ou chamadas de API (como Retrofit). Todos os dados dos jogos estão armazenados de forma estática no próprio código.

## Funcionalidades

*   **Catálogo de Jogos:** Lista principal com capas, categorias, ano de lançamento e plataformas.
*   **Filtros por Gênero:** Filtre rapidamente a lista por categorias como RPG, Metroidvania, Ação e Aventura, entre outras.
*   **Tela de Detalhes:** Informações completas sobre o jogo selecionado, incluindo sinopse, desenvolvedora, nota e um visual imersivo.
*   **Imagens Reais:** Carregamento de capas e banners direto da internet.

## Tecnologias Utilizadas

*   **Kotlin**
*   **Jetpack Compose:** Para toda a construção da interface (UI declarativa).
*   **Navigation Compose:** Navegação segura com rotas tipadas usando `kotlinx.serialization`.
*   **Coil:** Para o carregamento assíncrono das imagens.
*   **Material Design 3:** Base para a estrutura visual, adaptado com uma paleta de cores customizada escura ("Neon Slate").

## Como rodar o projeto

1. Clone este repositório na sua máquina.
2. Abra a pasta do projeto no **Android Studio**.
3. Aguarde o Gradle sincronizar as dependências automaticamente.
4. Execute o app em um emulador ou dispositivo físico (botão de Run ou `Shift + F10`).

## Link Dani
[Abrir no Google Drive](https://drive.google.com/file/d/1_ZwdUfP9O4RdPBXIQu-n_Ec4yd7pmPeg/view?usp=sharing)
