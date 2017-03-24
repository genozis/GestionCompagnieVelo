
DROP TABLE IF EXISTS Reservations ;
DROP TABLE IF EXISTS Annulations;
DROP TABLE IF EXISTS Velos ; 
DROP TABLE IF EXISTS Clients ;


CREATE TABLE Velos (idVelo INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, 
categorie VARCHAR(20), 
ville VARCHAR(20), 
prixLocationDeBase INTEGER);  

CREATE TABLE Clients (idClient INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, 
login VARCHAR(50),
password VARCHAR(50),
nom VARCHAR(50), 
prenom VARCHAR(50), 
mail VARCHAR(50), 
telephone VARCHAR(15), 
adresse VARCHAR(50));

CREATE TABLE Reservations (idReservation INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, 
idClient INTEGER REFERENCES Clients(idClient), 
idVelo INTEGER REFERENCES Velos(idVelo), 
dateLocationDebut DATE, 
dateLocationFin DATE, 
paimentEffectue BOOLEAN, 
FOREIGN KEY (idClient) REFERENCES Clients(idClient), 
FOREIGN KEY (idVelo) REFERENCES Velos(idVelo));

CREATE TABLE Annulations (idReservation INTEGER NOT NULL PRIMARY KEY, 
idClient INTEGER REFERENCES Clients(idClient), 
idVelo INTEGER REFERENCES Velos(idVelo), 
dateLocationDebut DATE, 
dateLocationFin DATE, 
paimentEffectue BOOLEAN, 
FOREIGN KEY (idClient) REFERENCES Clients(idClient), 
FOREIGN KEY (idVelo) REFERENCES Velos(idVelo));