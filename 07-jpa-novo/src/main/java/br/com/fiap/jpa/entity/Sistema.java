package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_SISTEMA")
@SequenceGenerator(name="sistema", sequenceName = "COD_SISTEMA", allocationSize = 1)
public class Sistema {
	

	@Id
	@Column(name="cd_sistema")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sistema")
	private Integer codigo;
	
	@Column(name="nm_sistema", nullable = false, length = 80)
	private String nomeSistema;
	
	

}
