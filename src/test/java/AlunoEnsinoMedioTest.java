import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void deveCalcularaprovacao() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6.0f);
        aluno.setNota2(6.0f);
        assertEquals("Aprovado",aluno.aprovacao());
    }
    @Test
    void deveCalcularNaoAprovacao(){
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6.0f);
        aluno.setNota2(5.0f);
        assertEquals("Reprovado",aluno.aprovacao());
    }
    @Test
    void deveRetornarNome(){
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNome("Pedro");
        assertEquals("Pedro", aluno.getNome());
    }
    @Test
        void deveRetornarMatricula(){
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setMatricula("201976039");
        assertEquals("201976039", aluno.getMatricula());
    }
}