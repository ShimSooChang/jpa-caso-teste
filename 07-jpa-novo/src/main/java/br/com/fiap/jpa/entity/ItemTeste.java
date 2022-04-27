package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ITEM_TESTE")
@SequenceGenerator(name="teste", sequenceName = "COD_ITEM_TESTE", allocationSize = 1)

public class ItemTeste {
	@Id
	@Column(name="cd_itemTeste")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_teste")
	private Integer codigo;
	
	@Column(name="ds_item_teste", nullable = false, length = 80)
	private String itemTeste;
	
	@ManyToOne
	@JoinColumn(name="cd_teste", nullable = false)
	private CasoTeste CasoTeste;

}
