CREATE TABLE IF NOT EXISTS pastor(
    nis TEXT PRIMARY KEY,
    nome TEXT NOT NULL,
    salario REAL NOT NULL,
    email TEXT NOT NULL,
       FOREIGN KEY (email) REFERENCES proprietario(email)
            ON DELETE CASCADE
);

