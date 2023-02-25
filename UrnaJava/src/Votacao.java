public class Votacao {
    //private para usamos o get depois para o encapsulamento em outra classe
   private int LP;
   private int FR;
   private int ISI;
   private int Nulo;
   private int Branco;
   //private int TotalVotos;

    public int getLP() {
        return LP;
    }
    public void AddLP(){
        LP++;
    }


    public int getFR() {
        return FR;
    }
    public void AddFR(){
        FR++;
    }

    public int getISI() {
        return ISI;
    }
    public void AddISI(){
        ISI++;
        }

    public int getNulo() {
        return Nulo;
    }
    public void AddNulo(){
        Nulo++;
    }

    public int getBranco() {
        return Branco;
    }

    public void AddBranco(){
        Branco++;
    }


}
