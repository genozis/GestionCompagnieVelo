
DROP TABLE IF EXISTS Reservations ;
DROP TABLE IF EXISTS Velos ; 
DROP TABLE IF EXISTS Clients ;

CREATE TABLE Velos (idVelo_Velos INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, 
categorie_Velos VARCHAR(20), 
ville_Velos VARCHAR(20), 
prixLocationDeBase_Velos INTEGER);  

CREATE TABLE Clients (idClient_Clients INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, 
login_Clients VARCHAR(50),
password_Clients VARCHAR(50),
nom_Clients VARCHAR(50), 
prenom_Clients VARCHAR(50), 
mail_Clients VARCHAR(50), 
telephone_Clients VARCHAR(15), 
adresse_Clients VARCHAR(50));

CREATE TABLE Reservations (idReservation_Reservations INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, 
idClient_Clients INTEGER REFERENCES Clients(idClient_Clients), 
idVelo_Velos INTEGER REFERENCES Velos(idVelo_Velos), 
dateLocationDebut_Reservations DATE, 
dateLocationFin_Reservations DATE, 
booleenPaimentEffectue_Reservations BOOLEAN, 
FOREIGN KEY (idClient_Clients) REFERENCES Clients(idClient_Clients), 
FOREIGN KEY (idVelo_Velos) REFERENCES Velos(idVelo_Velos));  