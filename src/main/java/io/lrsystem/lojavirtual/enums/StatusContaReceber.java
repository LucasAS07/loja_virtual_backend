package io.lrsystem.lojavirtual.enums;

public enum StatusContaReceber {

    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    LIQUIDADA("Liquidada");

    private String descricao;

    StatusContaReceber(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
