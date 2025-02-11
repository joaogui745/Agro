CREATE TABLE IF NOT EXISTS grupo( 
    idGrupo INTEGER PRIMARY KEY AUTOINCREMENT,  
    nome TEXT NOT NULL,     
    quantidade INTEGER NOT NULL,  
    tipo TEXT NOT NULL,  
    idLocal INTEGER NOT NULL,
        FOREIGN KEY (idLocal) REFERENCES localidade(idLocal) ON DELETE CASCADE  
);