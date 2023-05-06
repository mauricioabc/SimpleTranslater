# SimpleTranslater

Este é um projeto simples que usa a API do Google Translate para traduzir um arquivo de propriedades de um idioma para outro.

## O que é?

A API do Google Translate é uma ferramenta que permite traduzir textos de um idioma para outro. Neste exemplo, usamos a API para traduzir um arquivo de propriedades para qualquer idioma disponível.

## Como usar?

Para usar a aplicação, siga as instruções abaixo:

1. Clone o repositório para sua máquina local ou baixe uma release.
2. Crie um arquivo `.json` com as credenciais da API do Google Translate. 
Veja a documentação do Google para mais informações sobre como obter as credenciais.
3. Execute o programa.

## Como traduzir?
Interface gráfica da aplicação:

![image](https://user-images.githubusercontent.com/97888901/236639160-db3eb625-24b5-47c8-a0cd-cb0adffe10f4.png)

- Selecione a língua de sua preferência, estão disponíveis: Português, Inglês e Espanhol;
- Clique no botão `Novo` para escolher qual arquivo será traduzido;
- Informe a nomenclatura do arquivo gerado, seguindo o padrão [Language Tag](https://www.oracle.com/java/technologies/javase/jdk17-suported-locales.html), por exemplo `pt_BR`;
- Informe a língua em que o arquivo a ser traduzido se encontra e a língua para a qual se deseja traduzir, seguindo os [padrões da API](https://cloud.google.com/translate/docs/languages);
- Clique em `Traduzir`, assim, o arquivo traduzido será gerado na pasta `output`.

## Contribuições

Contribuições são bem-vindas! Se você tiver alguma sugestão de melhoria ou correção de bugs, sinta-se à vontade para abrir um Pull Request.

## Referências

- [Documentação da API do Google Translate](https://cloud.google.com/translate/docs)
- [Parâmetros de linguas aceitos pela API](https://cloud.google.com/translate/docs/languages)
- [Java Locales and Modules](https://www.oracle.com/java/technologies/javase/jdk17-suported-locales.html)
- [Interncionalização do Java](https://docs.oracle.com/en/java/javase/17/intl/internationalization-guide.pdf)
- [Tutorial para gerar a API Key](https://www.youtube.com/watch?v=1wcE-DfqNtU)
- [Tutorial gerando API Key](https://alexsacchi.com.br/como-gerar-uma-api-do-google-translate/)
