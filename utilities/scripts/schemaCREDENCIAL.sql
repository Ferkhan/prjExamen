CREATE TABLE CREDENCIAL (
    IdCredencial INTEGER PRIMARY KEY AUTOINCREMENT ID,
    IdUsuario   INTEGER NOT NULL,
    Clave       TEXT NOT NULL,
    Estado      INTEGER DEFAULT 1,
    FechaIng    DATETIME DEFAULT CURRENT_TIMESTAMP,
    FechaMod    DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (IdUsuario) REFERENCES USUARIO (IdUsuario)  
);

SELECT * FROM CREDENCIAL;
DROP TABLE CREDENCIAL;

INSERT INTO CREDENCIAL (IdUsuario, Clave) VALUES (1, "123"); 