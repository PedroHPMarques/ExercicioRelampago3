public class AlunoEnsinoMedio extends Aluno{

    public String aprovacao(){
        if(this.mediaNotas() >= 6){
            return "Aprovado";
        }
        else
            return "Reprovado";
    }

}
