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
}
