package lesson19;
import java.util.Random;


public class MixedPopulation extends Population{
	Random random= new Random();
  int numShelterInPlace;
  int numEssential;
  int numOthers;

  public MixedPopulation(int numShelterInPlace, int numEssential, int numOthers){
    super(numShelterInPlace + numEssential + numOthers);
    this.numShelterInPlace = numShelterInPlace;
    this.numEssential = numEssential;
    this.numOthers = numOthers;

  }

  public void createPeople(){
    for(int i=0; i<this.numShelterInPlace; i++){
      this.addPerson(new StayAtHome());
    }
    for(int i=0; i<this.numEssential; i++){
      this.addPerson(new StayAtHomeIfSick());
    }
    
    for(int i=0; i<this.numOthers; i++){
      int randInt=random.nextInt(4);//0,1,2,3,4
    	if (randInt==0){
    		this.addPerson(new Skeptic());
    	}
    	else if(randInt==1){
    		this.addPerson(new FrequentFlier());
    	}
    	else if(randInt==2){
    		this.addPerson(new LowImmunityPerson());
    	}
    	else if(randInt==3){
    		this.addPerson(new HighImmunityPerson());
    	}
    	else if(randInt==4){
    		this.addPerson(new ImmunityLoser());
    	}
    }
    
  }
}
