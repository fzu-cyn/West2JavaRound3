CREATE TABLE Country(
	iso INT PRIMARY KEY,
	country CHAR(50)
);
DROP TABLE Country;
DELETE FROM Country WHERE iso=392;
SELECT * FROM Country;

CREATE TABLE information( 
	area INT, 
	area2 CHAR(50),
	recovery INT, 
	diagnosis INT, 
	renew CHAR(50), 
	longitude DOUBLE,
    latitude DOUBLE,
	death INT,
	CONSTRAINT k FOREIGN KEY (information) REFERENCES Country(iso) ON UPDATE CASCADE 
);
TRUNCATE TABLE information;
SELECT * FROM information;

CREATE TABLE CountryGeneral( 
	CountryGen INT,
	continent CHAR(50), 
	capital VARCHAR(50), 
	life DOUBLE, 
	abridge VARCHAR(50), 
	diagnosis INT, 
	sumpopulation INT,
	territory INT, 
	recovery INT, 
	altitudes VARCHAR(50),
	position VARCHAR(50),
	death INT, 
	CONSTRAINT k FOREIGN KEY (CountryGen) REFERENCES Country(iso) ON UPDATE CASCADE 
);
SELECT * FROM CountryGeneral;
DROP TABLE CountryGeneral;
