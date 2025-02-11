 CREATE TABLE IF NOT EXISTS rel_Veterinario_Grupo( 
   	CRMV INTEGER NOT NULL,
   	idGrupo INTEGER NOT NULL, 
   	FOREIGN KEY (CRMV) REFERENCES veterinario(CRMV) 
   			ON DELETE CASCADE,  
 	FOREIGN KEY (idGrupo) REFERENCES grupo(idGrupo) 
            ON DELETE CASCADE,
    PRIMARY KEY (CRMV, idGrupo)
);