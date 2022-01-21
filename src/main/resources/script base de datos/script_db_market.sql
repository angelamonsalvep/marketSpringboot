create table categorias
		(id_cate int,
		 descripcion_cate varchar (50),
         estado_cate tinyint,
		 primary key (id_cate));


create table clientes
		(id_clie varchar(20),
		nombre_clie varchar (40),
		apellidos_clie varchar(100),
		celular_clie decimal,
		direccion_clie varchar(80),
		correo_clie varchar(70),
		primary key (id_clie));

create table productos
		(id_prod int,
		nombre_prod varchar(45),
		id_cate_prod int,
		codigo_barras_prod varchar(150),
		precio_venta_prod decimal(16,2),
		cantidad_stock_prod int,
		estado_prod tinyint,
		primary key (id_prod),
		foreign key (id_cate_prod) references categorias(id_cate));

create table compras
		(id_comp int,
		id_clie_comp varchar(20),
		fecha_comp datetime,
		medio_pag_comp char(1),
		comentario_comp varchar(300),
		estado char(1),
		primary key (id_comp),
		foreign key (id_clie_comp) references clientes(id_clie));	

create table compras_productos
		(id_comp_compprod int,
		id_prod_compprod int,
		cantidad_compprod int,
		total decimal(16,2),
		estado tinyint,
		foreign key (id_comp_compprod) references compras(id_comp),
		foreign key (id_prod_compprod) references productos(id_prod));