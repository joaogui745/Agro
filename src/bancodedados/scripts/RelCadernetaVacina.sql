CREATE TABLE IF NOT EXISTS rel_Caderneta_Vacina( 
    dataAplicacao DATE NOT NULL,  
    idVacina INTEGER KEY NOT NULL,
    idCaderneta INTEGER KEY NOT NULL,
    FOREIGN KEY (idVacina) REFERENCES vacina(idVacina) 
        ON DELETE CASCADE,  
    FOREIGN KEY (idCaderneta) REFERENCES caderneta(idCaderneta) 
        ON DELETE CASCADE,
    PRIMARY KEY (idVacina, idCaderneta)
); 