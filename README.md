![GitHub](https://img.shields.io/github/license/giupolub/Motivation)
# Motivation

Aplicativo gerador de frases motivacionais.

## 🔨 Funcionalidades do projeto

Elaborado com apenas duas activities (telas), este aplicativo apresenta um "gerador" de frases armazenado em um arrayOf (conjunto ou matriz). Conforme o botão "NOVA FRASE" é selecionado, uma frase aleatória é chamada e apresentada logo acima na mesma tela.

Ainda nessa activity, existem três ImageView's em sua região superior e nelas foram atribuídas a função de click. Quando selecionadas, muda-se a categoria das frases e novas serão apresentadas. Da esquerda para a direita o :infinity: armazena todas as 13 frases, o :smiley: armazena 6 frases e o :sunny: armazena as outras 7 frases.

Na activity de entrada é possível entrar com o nome, que será armazenado e apresentado na activity seguinte como saudação. A partir do momento que o aplicativo é iniciado a primeira vez, o nome será salvo e não mais será necessário indica-lo novamente.

![ezgif com-gif-maker](https://user-images.githubusercontent.com/110063157/182272821-19c65eda-7de9-44ed-8498-862d4c2ac8f6.gif)
asdasdasd

## ✔️ Técnicas e tecnologias utilizadas

Tecnologias:

- [Kotlin](https://kotlinlang.org/)
- [Android Studio](https://developer.android.com/studio?hl=pt&gclid=Cj0KCQjwio6XBhCMARIsAC0u9aFcStoZloea7hLJnt5StTOh7VHBqr15T1HpjgvOY00QfByC4676HYAaAmxmEALw_wcB&gclsrc=aw.ds)

Técnicas:

- `RelativeLayout`: ViewGrup que exibe view's filhas em posições relativas
- `View Binding`: busca de views do layout de forma segura
- `Personalização de tema`: modificação de cores para o tema do App
- `Toast notification`: um aviso fornecendo um feedback simples sobre uma operação em uma pequena janela pop-up
- `Shared preferences`: dados armazenados e reutilizados
- `startActivity`: navegação entre activities
- `Internacionalização`: aplicativo preparado para outras línguas (PT, EN e FR)

<img src="https://user-images.githubusercontent.com/110063157/182057268-2a249483-7ae4-4629-ae2c-a96a06ea3d1c.png" width="650" height="500" />

## 📁 Acesso ao projeto

Você pode [acessar o código fonte do projeto inicial](https://github.com/giupolub/Motivation) ou [baixá-lo](https://github.com/giupolub/Motivation/archive/refs/heads/main.zip).

## 🛠️ Abrir e rodar o projeto

Após baixar o projeto, você pode abrir com o Android Studio. Para isso, na tela de launcher clique em:

- **Open project**
- Procure o local onde o projeto está e o selecione (caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo)
- Por fim clique em OK

O Android Studio deve executar algumas tasks do Gradle para configurar o projeto, aguarde até finalizar. Ao finalizar as tasks, você pode executar o App 🏆 
