import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    @Test
        void deveRetornarNome(){
        Professor professor = new Professor();
        professor.setNome("Marco");
        assertEquals("Marco",professor.getNome());
    }
    @Test
        void deveRetornarTitulacao(){
        Professor professor = new Professor();
        professor.setTitulacaoMaxima("Mestre");
        assertEquals("Mestre", professor.getTitulacaoMaxima());
    }

}