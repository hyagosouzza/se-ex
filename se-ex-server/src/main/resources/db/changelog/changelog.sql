-- liquibase formatted sql

-- changeset liquibase:CriaTabelaScore
CREATE TABLE score (
	descricao VARCHAR(255),
	inicial   SMALLINT,
	final     SMALLINT,
	PRIMARY KEY (descricao)
)

-- changeset liquibase:CriaTabelaAfinidade
CREATE TABLE afinidade (
	regiao  VARCHAR(255),
	estados JSON,
	PRIMARY KEY (regiao)
)

-- changeset liquibase:CriaTabelaPessoa
CREATE TABLE pessoa (
	id            BIGINT auto_increment,
	data_inclusao TIMESTAMP,
	nome          VARCHAR(255),
	telefone      VARCHAR(255),
	cidade        VARCHAR(255),
	estado        VARCHAR(255),
	regiao        VARCHAR(255),
	score         VARCHAR(255),
	idade         TINYINT,
	FOREIGN KEY (regiao) REFERENCES afinidade(regiao),
	FOREIGN KEY (score) REFERENCES score(descricao),
	PRIMARY KEY (id)
)
