package insper.store.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.NonNull;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno create(Aluno in) {
        return alunoRepository.save(new AlunoModel(in)).to();
    }

    public Aluno read(@NonNull String id) {
        return alunoRepository.findById(id).map(AlunoModel::to).orElse(null);
    }
    
}
