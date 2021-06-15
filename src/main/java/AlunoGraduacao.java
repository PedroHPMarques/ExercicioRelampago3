public class AlunoGraduacao extends Aluno{

    public String aprovacao(){
        if(this.mediaNotas() >= 7){
            return "Aprovado";
        }
        else
            return "Reprovado";
    }

}

