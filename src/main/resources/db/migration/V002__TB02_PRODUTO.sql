CREATE TABLE tb02_produto (
	id serial NOT NULL,
	nome varchar(500) NOT NULL,
	descricao text NOT NULL,
	preco numeric(10,2) NOT NULL,
	CONSTRAINT tb02_produto_pkey PRIMARY KEY (id)
);
