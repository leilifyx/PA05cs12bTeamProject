package lesson19;


public class Skeptic extends Person{

  public Skeptic(){}

  public Skeptic(int x, int y, Country country){
    super(x, y, country);
  }

  public void tryToMove(){
    tryToMoveRandomly();
  }
}
