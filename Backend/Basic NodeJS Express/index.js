const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const port = process.env.PORT || 8080;

const jsonParser = bodyParser.json();
app.use(jsonParser);

app.get('/', (req, res) => {
    res.send('Hello world!');
});

// Endpoints de envio de mensagens
// CRUD -> Create, Read (Read All e Read Single), Update and Delete
// CRUD -> Criar, Ler (Ler tudo e ler individualmente), atualizar e remover

const mensagens = [
    {
        id:0,
        texto:"Essa é uma mensagem",
    },
    {
        id:1,
        texto: "Essa é outra mensagem",
    }
];

// Read All
app.get('/mensagens', (req, res) => {
    res.json(mensagens.filter(Boolean));
});

// Create
app.post('/mensagens', (req, res) => {
    // Obtendo a mensagem que foi recebida através do body da requisição
    const mensagem = {};

    const id = mensagens.length;
    mensagem.id = id;

    mensagem.texto = req.body.mensagem;
    // Insiro a mensagem na lista de mensagens
    mensagens.push(mensagem);


    // Exibido o ID da mensagem, que no caso é o índice que ela foi adicionada
    res.send(`Mensagem criada. ID: ${id}.\nTexto é ${mensagem.texto}`);
});

// Read Single
app.get('/mensagens/:id', (req, res) => {
    const id  = req.params.id
    res.json(mensagens[id]);
});

// Update
app.put('/mensagens/:id', (req, res) => {
    const id  = req.params.id;
    mensagens[id].texto = req.body.mensagem;
    res.send('message updated successfully').status(204);
});

// Delete
app.delete('/mensagens/:id', (req, res) => {
    const id = req.params.id;
    delete mensagens[id]
    res.status(204).send();
});

app.listen(port, () => {
    console.log(`App rodando em http://localhost:${port}`);
});
