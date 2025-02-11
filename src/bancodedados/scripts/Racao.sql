CREATE TABLE IF NOT EXISTS racao( 
    idRacao INTEGER PRIMARY KEY AUTOINCREMENT, 
    demanda INTEGER NOT NULL,    
    marca TEXT NOT NULL,  
    preco REAL NOT NULL,  
    idGrupo INTEGER NOT NULL,
    FOREIGN KEY (idGrupo) REFERENCES grupo(idGrupo) 
        ON DELETE CASCADE
      
);