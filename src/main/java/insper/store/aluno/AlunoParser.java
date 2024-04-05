package insper.store.aluno;

public class AlunoParser {

    public static Aluno to(AlunoIn in) {
        return Aluno.builder()
            .nome(in.nome())
            .email(in.email())
            .genero(in.genero())
            .dataNascimento(in.dataNascimento())
            .cep(in.cep())
            .escolaridade(in.escolaridade())
            .periodo(in.periodo())
            .ocupacao(in.ocupacao())
            .renda_per_capita(in.renda_per_capita())
            .modalidade(in.modalidade())
            .distancia_em_km(in.distancia_em_km())
            .oportunidade(in.oportunidade())
            .areas_interesse(in.areas_interesse())
            .descricao(in.descricao())
            .build();
    }

    public static AlunoOut to(Aluno aluno) {
        return AlunoOut.builder()
            .id(aluno.id())
            .nome(aluno.nome())
            .dataNascimento(aluno.dataNascimento())
            .cep(aluno.cep())
            .genero(aluno.genero())
            .areas_interesse(aluno.areas_interesse())
            .descricao(aluno.descricao())
            .ocupacao(aluno.ocupacao())
            .renda_per_capita(aluno.renda_per_capita())
            .build();
    }
    
}
