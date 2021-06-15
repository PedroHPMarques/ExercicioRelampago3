import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    @Test
    void deveCalcularaprovacao() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        assertEquals("Aprovado",aluno.aprovacao());
    }
    @Test
    void deveCalcularNaoAprovacao(){
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(6.0f);
        aluno.setNota2(5.0f);
        assertEquals("Reprovado",aluno.aprovacao());
    }
    @Test
    void deveRetornarNome(){
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNome("Pedro");
        assertEquals("Pedro", aluno.getNome());
    }
    @Test
    void deveRetornarMatricula(){
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setMatricula("201976039");
        assertEquals("201976039", aluno.getMatricula());
    }
}