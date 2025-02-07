CREATE TABLE IF NOT EXISTS animal( 
    idAnimal INTEGER PRIMARY KEY AUTOINCREMENT,  
    idade INTEGER NOT NULL, 
    imagem BLOB NOT NULL, 
    sexo TEXT NOT NULL,
    idGrupo INTEGER NOT NULL
        FOREIGN KEY idGrupo REFERENCES grupo(idGrupo) ON DELETE CASCADE,
    idCaderneta INTEGER NOT NULL 
        FOREIGN KEY idCaderneta REFERENCES caderneta(idCaderneta) ON DELETE CASCADE 
); 