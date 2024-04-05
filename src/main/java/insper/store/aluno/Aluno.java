package insper.store.aluno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.sql.Date;

@Builder
@Getter @Setter @Accessors(fluent = true, chain = true)
@AllArgsConstructor @NoArgsConstructor
public class Aluno {
    private String id;
    private String nome;
    private String email;
    private String genero;
    private Date dataNascimento;
    private String cep;
    private String escolaridade;
    private Integer periodo;
    private String ocupacao;
    private Float renda_per_capita;
    private String modalidade;
    private Float distancia_em_km;
    private String oportunidade;
    private String areas_interesse;
    private String descricao;
    
}
