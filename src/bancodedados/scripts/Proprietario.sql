CREATE TABLE IF NOT EXISTS proprietario(
    email PRIMARY KEY NOT NULL,
    cpf TEXT UNIQUE NOT NULL,
    nome TEXT NOT NULL,
    senha TEXT NOT NULL,
    telefone TEXT NOT NULL
);
