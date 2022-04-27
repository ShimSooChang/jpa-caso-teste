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
@Table(name="TB_CASO_TESTE")
@SequenceGenerator(name="casoTeste", sequenceName = "COD_CASO_TESTE", allocationSize = 1)
public class CasoTeste {
	
	@Id
	@Column(name="cd_teste")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teste")
	private Integer codigo;
	
	@Column(name="nm_casoTeste", nullable = false, length = 80)
	private String NomeCasoTeste;
	
	@ManyToOne
	@JoinColumn(name="cd_sistema", nullable = false)
	private Sistema sistema;
	
	
	private String DescCasoTeste;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeCasoTeste() {
		return NomeCasoTeste;
	}

	public void setNomeCasoTeste(String nomeCasoTeste) {
		NomeCasoTeste = nomeCasoTeste;
	}

	public String getDescCasoTeste() {
		return DescCasoTeste;
	}

	public void setDescCasoTeste(String descCasoTeste) {
		DescCasoTeste = descCasoTeste;
	}
	
	
}
