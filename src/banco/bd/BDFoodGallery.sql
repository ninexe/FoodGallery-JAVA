insert into tb_tipo_usu (Descricao)
values                  ("Administrador"),
						("Gerenciador"),
						("Comum");
                        
insert into tb_usuario  (Email,Senha,idTipo_Usu,data_cadastro)
values                  ("fabio@gmail.com","1234",1,current_timestamp()),
						("guilherme@gmail.com","1234",1,current_timestamp()),
						("jorge@gmail.com","1234",1,current_timestamp()),
						("juci@gmail.com","1234",1,current_timestamp()),
						("stefany@gmail.com","1234",1,current_timestamp()),
                        ("pastelaria@gmail.com","1234",2,current_timestamp()),
                        ("pizzaria@gmail.com","1234",2,current_timestamp()),
                        ("hamburgueria@gmail.com","1234",2,current_timestamp()),
                        ("sorveteria@gmail.com","1234",2,current_timestamp());

			
insert into tb_Status  (Status)
values                 ("Aprovado"),
					   ("Pendente"),
					   ("Cancelado"),
					   ("Entregue");

insert into tb_tipoproduto (descricao)
values					   ('Pastel'),
						   ('Pizza'),
                           ('Hamburguer'),
                           ('Sorvete');

insert into tb_estabelecimento(CNPJ,Nome_Fantasia,Razao_Social,Nome_Gerente,Email_Gerente,Foto,idUsuario)
values						  ('79.852.044/0001-08','Pastelaria Sabor e Arte','Sabor e Arte LTDA','Leticia Sousa','leticia@gmail.com','pastelaria.jpeg',6),
							  ('66.199.645/0001-03','Pizzaria  Sabor da Ilha','Sabor da Ilha LTDA','Rafael Costa','rafael@hotmail.com','pizzaria.jpeg',7),
                              ('10.175.443/0001-77','Nabrasa Hamburgueria','Nabrasa LTDA','Marcos da Silva','marcos@gmail.com','hamburgueria.jpeg',8),
                              ('16.225.523/0001-76','Ice Cream','Sorveteria Ice Cream LTDA','Isabela Martins','isabela@hotmail.com','sorveteria.jpeg',9);
                         
insert into tb_produto (Descricao, Preco, Foto, idEstab,idTipoProd)
values                 ("Tres Casquinhas", 6.90, "cbS1.jpg",8,4),
					   ("Sorvete M&M", 13.90, "sorvete.jpg",8,4),
					   ("Açaí", 8.90, "acai1.jpg",8,4),
					   ("Cinco Pasteis", 8.00,"cbPs1.jpg",5,1),
					   ("Dois Pasteis", 2.50, "cbPs2.jpg",5,1),
					   ("Dois hamburgueres com fritas", 22.00, "cbH3.jpg",7,3),
					   ("Hamburguer com Onion rings", 22.00, "cbH2.jpg",7,3),
					   ("Hamburguer + refri + fritas ", 15.00, "cbH1.jpg",7,3);
                       
create view vw_cliente as
select t.Descricao as TipoUsuario,
	   u.Senha,
	   u.Email,
       c.Nome,
       c.Telefone
from tb_tipo_usu t
inner join tb_usuario u
on t.idtipo_usu = u.idtipo_usu
inner join tb_cliente c 
on u.idusuario = c.idusuario;

create view vw_estabelecimento as
select t.Descricao as TipoUsuario,
	   u.Email,
       u.Senha,
       e.CNPJ,
       e.Nome_Gerente,
       e.Nome_Fantasia,
       e.Razao_Social
from tb_tipo_usu t
inner join tb_usuario u 
on t.idtipo_usu = u.idtipo_usu
inner join tb_estabelecimento e
on u.idusuario = e.idusuario
where nome_fantasia is not null;

create view vw_admin as
select t.descricao as TipoUsuario,
	   u.Email,
       u.Senha,
       a.Nome
from tb_tipo_usu t 
inner join tb_usuario u 
on t.idtipo_usu = u.idtipo_usu
inner join tb_admin a
on u.idusuario = a.idusuario;

create view vw_usuario as
select idUsuario,
	   Email,
       Senha,
       idTipo_Usu as idTipo 
from tb_usuario;

create view vw_ClienteStatus as
select distinct c.Nome,
				u.Email,
				c.idCliente,
                t.idStatus,
                tip.idtipo_usu as idTipo,
                c.Telefone,
                c.Pontuacao,
                s. Status
from tb_tipo_usu tip 
inner join tb_usuario u  
on tip.idtipo_usu = u.idtipo_usu
left join tb_cliente c  
on c.idusuario = u.idusuario
left join tb_ticket t 
on c.idcliente = t.idcliente
left join tb_status s 
on t.idstatus = s.idstatus
where tip.idtipo_usu = 3;

create view vw_produto as
select p.idProduto,
	   e.idEstab,
       e.nome_fantasia as Estabelecimento,
	   p.Descricao,
       p.Preco,  
       p.Foto
from tb_estabelecimento e  
inner join tb_produto p 
on e.idestab = p.idestab
order by idProduto;

create view vw_emailcliente as
select cli.idcliente,
	   usu.email 
from tb_usuario usu
inner join tb_cliente cli
on usu.idusuario = cli.idusuario;

create view vw_qrcode as
select tp.qtdade_produto as Quantidade,
	   tp.valor_uni as Valor_Unitario,
       tp.Valor_Total,
       ti.Data_Ticket,
       st.Status 
from tb_ticket_produto tp
inner join tb_ticket ti
on tp.idticket = ti.idticket
inner join tb_status st
on st.idstatus = ti.idstatus
