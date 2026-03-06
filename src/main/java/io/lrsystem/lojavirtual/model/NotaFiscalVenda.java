package io.lrsystem.lojavirtual.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "nota-fiscal-venda")
@SequenceGenerator(name = "seq_nota-fiscal-venda", sequenceName = "seq_nota-fiscal-venda", allocationSize = 1, initialValue = 1)
public class NotaFiscalVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota-fiscal-venda")
    private Long id;

    private String numero;
    private String serie;
    private String tipo;

    @OneToOne
    @JoinColumn(name = "venda_compra_loja_virtual_id", nullable = false, foreignKey = @ForeignKey
            (value = ConstraintMode.CONSTRAINT, name = "venda_compra_loja_virtual_fk"))
    private VndCompLjVirtual vendaCompraLojaVirtual;

    @Column(columnDefinition = "text")
    private String xml;

    @Column(columnDefinition = "text")
    private String pdf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public VndCompLjVirtual getVendaCompraLojaVirtual() {
        return vendaCompraLojaVirtual;
    }

    public void setVendaCompraLojaVirtual(VndCompLjVirtual vendaCompraLojaVirtual) {
        this.vendaCompraLojaVirtual = vendaCompraLojaVirtual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalVenda that = (NotaFiscalVenda) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
