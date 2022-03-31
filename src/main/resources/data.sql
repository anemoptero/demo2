DROP TABLE IF EXISTS Book;

CREATE TABLE Book(
	isbn VARCHAR(18) PRIMARY KEY,
	name VARCHAR(20) NOT NULL,
	author VARCHAR(20) NOT NULL,
	tranlator VARCHAR(20),
	publishers VARCHAR(20) NOT NULL,
	publication_date Date NOT NULL,
	pricing Int NOT NULL
);