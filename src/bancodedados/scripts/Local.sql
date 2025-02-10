CREATE TABLE IF NOT EXISTS localidade(
    nome TEXT NOT NULL,
    idFazenda INTEGER NOT NULL,
    area REAL NOT NULL,
    foto BLOB NOT NULL,
    nisPastor TEXT NOT NULL,
    PRIMARY KEY (nome, idFazenda),
    FOREIGN KEY (idFazenda) REFERENCES fazenda(idFazenda)
        ON DELETE CASCADE,
    FOREIGN KEY (nisPastor) REFERENCES pastor(nis)
        ON DELETE CASCADE
);

