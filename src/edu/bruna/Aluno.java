package edu.bruna;

public class Aluno {
    String nome;
    float nota1;
    float nota2;
    
    void mediaAluno(){
        float media = (nota1 + nota2)/2;
        System.out.println("A média de " + this.nome + " foi :" + media);
    }

    
    public static class AlunoADS extends Aluno{
        float trabalho1;
        float trabalho2;

        public AlunoADS(String nome, float nota1, float nota2, float trabalho1, float trabalho2){
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.trabalho1 = trabalho1;
            this.trabalho2 = trabalho2;
        }

        void mediaAds(){
            float media = (nota1+nota2+trabalho1+trabalho2)/4;
            System.out.println("A média de " + this.nome + " em ADS foi :" + media);
        }
    }
    public static void main(String[] args) {
        AlunoADS Joelma = new AlunoADS("Joelma", 10, 5, 7, 6);
        Joelma.mediaAds();


        // Aluno francisco = new Aluno();
        // francisco.nome = "Francisco";
        // francisco.nota1 = 10;
        // francisco.nota2 = 8;
        // francisco.mediaAluno();
    }
}
