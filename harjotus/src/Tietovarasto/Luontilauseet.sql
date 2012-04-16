--drop table Yllapito;
--drop table Ostoskori;
--drop table TilausRaportti;
--drop table Tuote;
--drop table AsiakaidenLennot;
--drop table Lento;
--drop table Tuoteryhma;

create table Lento(                   
    lennonNro integer not null primary key, 
    lahtoaika date not null                              
);
create table Tuoteryhma(                   
    tuoteryhmanNro integer not null primary key,
    tuoteryhmanNimi varchar(30) not null                                  
);
create table AsiakaidenLennot(                   
    asiakasnro integer not null primary key, 
    paikka integer not null,              	  
    lennonNro integer not null,
    FOREIGN key (lennonNro) REFERENCES Lento(lennonNro)
);
create table Tuote(                   
    tuoteNro integer not null primary key, 
    nimi integer not null,              	  
    hinta integer not null,
    kuvaus varchar(300) not null,
    tuoteryhma integer not null,
    FOREIGN key (tuoteryhma) REFERENCES Tuoteryhma(tuoteryhmanNro)
);
--create table TilausRaportti(                   
--    tilausRaportinNro integer not null primary key, 
--    tuoteNro integer not null,           	  
--    laatimisAika timestamp not null,
--    asiakasNro integer not null,
--    FOREIGN key (asiakasnro) REFERENCES Asiakas(asiakasnro),
--    Foreign key (tuoteNro) references Tuote(tuoteNro)
--);
create table Ostoskori(                   
    tuoteNro integer not null,           	  
    asiakasNro integer not null, 
    FOREIGN key (tuoteNro) references Tuote(tuoteNro),
    FOREIGN key (asiakasNro) REFERENCES AsiakaidenLennot(asiakasNro) 
);
--create table Yllapito(                     
--    tilausRaportinNro integer not null, 
--    FOREIGN key (tilausRaportinNro) REFERENCES TilausRaportti(tilausRaportinNro)
--);

