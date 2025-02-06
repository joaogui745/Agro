CREATE TABLE IF NOT EXIST proprietario(
    email PRIMARY KEY NOT NULL,
    cpf TEXT UNIQUE NOT NULL,
    senha TEXT NOT NULL,
    nome TEXT NOT NULL,
    telefone TEXT NOT NULL
);