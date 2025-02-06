CREATE TABLE IF NOT EXISTS rel_Caderneta_Vacina( 
    dataAplicacao DATE NOT NULL,  
    idVacina INTEGER PRIMARY KEY NOT NULL
        FOREIGN KEY idVacina REFERENCES vacina(idVacina) ON DELETE CASCADE,  
    idCaderneta INTEGER PRIMARY KEY NOT NULL
        FOREIGN KEY idCaderneta REFERENCES caderneta(idCaderneta) ON DELETE CASCADE 
); 