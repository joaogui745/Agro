CREATE TABLE IF NOT EXISTS localidade(
    PRIMARY KEY (nome, idFazenda),
    nome TEXT NOT NULL,
    idFazenda INTEGER NOT NULL,
    area REAL NOT NULL,
    foto BLOB NOT NULL,
    idPastor INTEGER NOT NULL,
    FOREIGN KEY (idFazenda) REFERENCES fazenda(idFazenda)
        ON DELETE CASCADE,
    FOREIGN KEY (idPastor) REFERENCES pastor(idPastor)
        ON DELETE CASCADE
);

