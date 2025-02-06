CREATE TABLE IF NOT EXISTS localidade(
    nome TEXT NOT NULL,
    area REAL NOT NULL,
    foto BLOB NOT NULL,
    idFazenda INTEGER NOT NULL,
    idPastor INTEGER NOT NULL,
    PRIMARY KEY (nome, idFazenda),
    FOREIGN KEY (idFazenda) REFERENCES fazenda(idFazenda)
        ON DELETE CASCADE,
    FOREIGN KEY (idPastor) REFERENCES pastor(idPastor)
        ON DELETE CASCADE
);