package lesson19;
import java.util.Random;

public class HighImmunityPerson extends Person{
  Random random=new Random();

  public HighImmunityPerson(){
    this.infectionProb=0.1;
  }

  public HighImmunityPerson(int x, int y, Country country){
    super(x,y,country);
    this.infectionProb=0.1;
  }

  /**
  This class represents people with higher immunity whether it be from their upbringing
  or some other factor such as if they're Captain America.
  For the purposes of this simulation, we shall suppose that since these people have
  a higher immunity, they are more skeptical and approximately 4/5 are skeptics and
  1/5 are stay at home.
  **/
  void tryToMove(){
    int randint=random.nextInt(6);
    if(randint!=0){
      tryToMoveRandomly();
    }
  }
}
