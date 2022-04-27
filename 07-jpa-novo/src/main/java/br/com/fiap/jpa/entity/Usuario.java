package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
@SequenceGenerator(name="usuario", sequenceName = "COD_USUARIO", allocationSize = 1)
public class Usuario {
	@Id
	@Column(name="cd_usuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	private Integer codigo;
	
	@Column(name="nm_usuario", nullable = false, length = 80)
	private String usuario;
	

}
