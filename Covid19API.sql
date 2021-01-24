CREATE TABLE Country(
	iso INT PRIMARY KEY,
	country CHAR(50)
);
DROP TABLE Country;
DELETE FROM Country WHERE iso=392;
SELECT * FROM Country;

CREATE TABLE information( 
	iso_area INT, 
	area CHAR(50),
	recovered INT, 
	confirmed INT, 
	updated CHAR(50), 
	longitude DOUBLE,
    latitude DOUBLE,
	deaths INT,
	CONSTRAINT k FOREIGN KEY (iso_area) REFERENCES Country(iso) ON UPDATE CASCADE 
);
TRUNCATE TABLE information;
SELECT * FROM information;

CREATE TABLE CountryGeneral( 
	iso_CountryGen INT,
	continent CHAR(50), 
	capital VARCHAR(50), 
	life DOUBLE, 
	abridge VARCHAR(50), 
	confirmed INT, 
	sumpopulation INT,
	territory INT, 
	recovered INT, 
	altitudes VARCHAR(50),
	position VARCHAR(50),
	deaths INT, 
	CONSTRAINT k FOREIGN KEY (iso_CountryGen) REFERENCES Country(iso) ON UPDATE CASCADE 
);
SELECT * FROM CountryGeneral;
DROP TABLE CountryGeneral;
