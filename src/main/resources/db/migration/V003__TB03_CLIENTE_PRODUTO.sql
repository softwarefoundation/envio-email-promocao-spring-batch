CREATE TABLE tb03_cliente_produto (
	cliente_id int8 NULL,
	produto_id int8 NULL,
	CONSTRAINT tb03_cliente_produto_pk PRIMARY KEY (cliente_id,produto_id)
);
