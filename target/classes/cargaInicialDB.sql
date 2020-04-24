insert into perfil (id, nome, descricao) values (0,'Administrador','Adminsitrador do Sistema');
insert into perfil (id, nome, descricao) values (1, 'Gestor','Gestor da empresa');
insert into perfil (id, nome, descricao) values (2, 'Operador','operador da empesa');

insert into empresa (id, nome, descricao) values (0, 'Familia Sansone',' Famila Sansone');

insert into usuario (id, nome, email, senha, id_empresa, id_perfil) values (0, 'admin','admin@email.com','123',0, 0);
insert into usuario (id, nome, email, senha, id_empresa, id_perfil) values (1, 'Marcio Sansone','msansone@gmail.com','123',0, 1);
