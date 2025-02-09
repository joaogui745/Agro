CREATE TABLE IF NOT EXISTS fazenda(
    idfazenda INTEGER PRIMARY KEY AUTOINCREMENT,
    areaTotal REAL NOT NULL,
    estado TEXT,
    nome TEXT NOT NULL,
    email TEXT NOT NULL,
    FOREIGN KEY (email) REFERENCES proprietario(email)
        ON DELETE CASCADE
);
