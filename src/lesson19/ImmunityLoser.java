package lesson19;
//This class represents people who lose their immunity after a set period of time
public class ImmunityLoser extends Person{

  public ImmunityLoser(){
    if (this.recovered && (this.age - this.infectionTime - this.recoveryTime > 5)){
      this.recovered = false;
    }}

  public ImmunityLoser (int x, int y, Country Country){
    if (this.recovered && (this.age - this.infectionTime - this.recoveryTime > 5)){
      this.recovered = false;
    }}

    //This person assumes that they are immune to the virus given the fact that they have recovered, but for some reason have lost their immunity to the virus and may become reinfected.
    //So for this simulation we chose to have them continue to move randomly
  public void tryToMove(){
      tryToMoveRandomly();
  }
}
