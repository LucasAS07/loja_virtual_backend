package io.lrsystem.lojavirtual.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cupom_desconto")
@SequenceGenerator(name = "seq_cupom_desconto", sequenceName = "seq_cupom_desconto",
		allocationSize = 1, initialValue = 1)
public class CupomDesconto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cupom_desconto")
	private Long id;

	@Column(nullable = false)
	private String codDesconto;


	private BigDecimal vlRealDesconto;
	private BigDecimal vlPorcntDesconto;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodDesconto() {
		return codDesconto;
	}

	public void setCodDesconto(String codDesconto) {
		this.codDesconto = codDesconto;
	}

	public BigDecimal getVlRealDesconto() {
		return vlRealDesconto;
	}

	public void setVlRealDesconto(BigDecimal vlRealDesconto) {
		this.vlRealDesconto = vlRealDesconto;
	}

	public BigDecimal getVlPorcntDesconto() {
		return vlPorcntDesconto;
	}

	public void setVlPorcntDesconto(BigDecimal vlPorcntDesconto) {
		this.vlPorcntDesconto = vlPorcntDesconto;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		CupomDesconto that = (CupomDesconto) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
}
