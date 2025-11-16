🧠 ChatBot Java com Spring Boot + OpenAI

Um sistema simples de chatbot desenvolvido em Java + Spring Boot, integrado à API da OpenAI, contendo um endpoint REST e uma interface web minimalista para interação.

📌 Funcionalidades

✔️ Envio de mensagens para a IA via REST
✔️ Interface web simples (chat.html) para conversar com o chatbot
✔️ Comunicação com a API da OpenAI usando chave via variáveis de ambiente
✔️ Projeto limpo, fácil de rodar e evoluir

🏗️ Arquitetura do Projeto
src/
 └── main/
     ├── java/com/example/chatbot/
     │     ├── controller/ChatController.java
     │     ├── service/ChatService.java
     │     └── dto/ChatRequest.java
     └── resources/
           ├── static/chat.html
           └── application.properties

🚀 Tecnologias Utilizadas

Java 17+

Spring Boot 3+

Maven

OpenAI API

Fetch API (JS) para interface web

🔧 Configuração do Ambiente
1️⃣ Criar variável de ambiente contendo sua API Key
Linux / Mac:
export OPENAI_API_KEY="sua_chave_aqui"

Windows PowerShell:
setx OPENAI_API_KEY "sua_chave_aqui"

▶️ Como Rodar o Projeto
Via Maven:
mvn spring-boot:run

Via IDE (IntelliJ / Eclipse)

Abra o projeto

Rode a classe ChatbotApplication.java (ou a classe principal do seu projeto)

💬 Acessar o Chat

Depois de rodar a aplicação:

👉 Acesse no navegador:

http://localhost:8080/chat


Isso abrirá a interface web simples para conversar com o chatbot.

🧪 Testar via Postman / Insomnia
POST /api/chat

URL:

http://localhost:8080/api/chat


Body (JSON):

{
  "message": "Olá, tudo bem?"
}


Resposta esperada:

{
  "response": "Olá! Tudo bem! Como posso ajudar hoje?"
}

📄 Conteúdo da Interface Web (chat.html)

O arquivo chat.html deve estar em:

src/main/resources/static/chat.html


E contém:

Área de mensagens

Campo de texto

Botão enviar

Requisição AJAX usando fetch()

🛠️ Possíveis Erros e Soluções
❌ 401 Unauthorized

Sua API Key está errada

A variável de ambiente não foi exportada corretamente

Reinicie o terminal após exportar

❌ 404 No static resource chat.html

Certifique-se de que o arquivo está em:

✔️ src/main/resources/static/chat.html

❌ Cannot read property 'innerHTML' of null

O elemento não existe

O ID do HTML não bate com o JavaScript

Certifique-se que o JS referencia:

messages

userInput

📦 Como Subir Para o GitHub
git init
git add .
git commit -m "ChatBot Java com Spring Boot e OpenAI"
git branch -M main
git remote add origin https://github.com/SEU_USUARIO/NOME_DO_REPO.git
git push -u origin main

📬 Contato

Link: linkedin.com/in/lucas-viana-souza-87a06a352/
Instagram: instagram.com/lc.vianasz
🔗 GitHub: https://github.com/Lcvianasz
