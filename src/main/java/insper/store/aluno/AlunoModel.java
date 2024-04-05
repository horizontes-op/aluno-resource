package insper.store.aluno;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.sql.Date;

@Entity
@Table(name = "aluno")
@EqualsAndHashCode(of = "id")
@Builder @Getter @Setter @Accessors(chain = true, fluent = true)
@NoArgsConstructor @AllArgsConstructor
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_aluno")
    private String id;

    @Column(name = "tx_nome")
    private String nome;

    @Column(name = "tx_email")
    private String email;

    @Column(name = "tx_genero")
    private String genero;

    @Column(name = "dt_nascimento")
    private Date dataNascimento;

    @Column(name = "tx_cep")
    private String cep;

    @Column(name = "tx_escolaridade")
    private String escolaridade;

    @Column(name = "nr_periodo")
    private Integer periodo;

    @Column(name = "tx_ocupacao")
    private String ocupacao;

    @Column(name = "vl_renda_per_capita")
    private Float renda_per_capita;

    @Column(name = "tx_modalidade")
    private String modalidade;

    @Column(name = "vl_distancia_em_km")
    private Float distancia_em_km;

    @Column(name = "tx_oportunidade")
    private String oportunidade;

    @Column(name = "tx_areas_interesse")
    private String areas_interesse;

    @Column(name = "tx_descricao")
    private String descricao;

    public AlunoModel(Aluno o) {
        this.id = o.id();
        this.nome = o.nome();
        this.email = o.email();
        this.genero = o.genero();
        this.dataNascimento = o.dataNascimento();
        this.cep = o.cep();
        this.escolaridade = o.escolaridade();
        this.periodo = o.periodo();
        this.ocupacao = o.ocupacao();
        this.renda_per_capita = o.renda_per_capita();
        this.modalidade = o.modalidade();
        this.distancia_em_km = o.distancia_em_km();
        this.oportunidade = o.oportunidade();
        this.areas_interesse = o.areas_interesse();
        this.descricao = o.descricao();
    }

    public Aluno to() {
        return Aluno.builder()
            .id(id)
            .nome(nome)
            .email(email)
            .genero(genero)
            .dataNascimento(dataNascimento)
            .cep(cep)
            .escolaridade(escolaridade)
            .periodo(periodo)
            .ocupacao(ocupacao)
            .renda_per_capita(renda_per_capita)
            .modalidade(modalidade)
            .distancia_em_km(distancia_em_km)
            .oportunidade(oportunidade)
            .areas_interesse(areas_interesse)
            .descricao(descricao)
            .build();
    }

}
