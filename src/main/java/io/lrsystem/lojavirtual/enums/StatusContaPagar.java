package io.lrsystem.lojavirtual.enums;

public enum StatusContaPagar {

    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    LIQUIDADA("Liquidada"),
    NEGOCIADA("Renegociada");

    private String descricao;

    StatusContaPagar(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
