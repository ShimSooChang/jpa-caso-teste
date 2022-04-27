package br.com.fiap.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ITEM_TEST")
@SequenceGenerator(name="itemTeste", sequenceName = "COD_USUARIO", allocationSize = 1)
public class TesteUsuario {
	
	@ManyToMany
	@JoinColumn(name="cd_usuario", nullable = false)
	private Usuario Usuario;
	
	@ManyToMany
	@JoinColumn(name="cd_teste", nullable = false)
	private ItemTeste ItemTeste;

}
