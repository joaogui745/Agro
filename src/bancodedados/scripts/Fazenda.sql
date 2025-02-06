CREATE TABLE IF NOT EXISTS fazenda(
    idfazenda INTEGER PRIMARY KEY AUTOINCREMENT,
    areaTotal REAL NOT NULL,
    estado TEXT CHECK (estado in ('AC', 'AL', 'AP', 'AM', 'BA', 'CE', 'DF', 'ES',
                                  'GO', 'MA', 'MT', 'MS', 'MG', 'PA', 'PB', 'PR', 
                                  'PE', 'PI', 'RJ', 'RN', 'RS', 'RO', 'RR', 'SC', 
                                  'SP', 'SE', 'TO')),
    nome TEXT NOT NULL,
    cpfProprietario TEXT NOT NULL
    FOREIGN KEY cpfProprietario REFERENCES proprietario(cpf)
        ON DELETE CASCADE
);
