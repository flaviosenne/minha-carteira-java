package com.carteira.minha.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.carteira.minha.enums.TipoLancamento;
import com.carteira.minha.enums.TipoStatus;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import lombok.Data;

@Data
@Entity
@Table(name = "lancamento", schema = "carteira")
public class Lancamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "mes")
    private Integer mes;
    
    @Column(name = "ano")
    private Integer ano;
    
    @Column(name = "valor")
    private BigDecimal valor;
    
    @Column(name = "tipo")
    @Enumerated(value = EnumType.STRING)
    private TipoLancamento tipo;
    
    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private TipoStatus status;

    @Column(name = "data_cadastro")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate dataCadastro;
    

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
