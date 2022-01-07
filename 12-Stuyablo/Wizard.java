public class Wizard extends Adventurer {
    private int powerLevel;
    private boolean hasStaff;

    public Wizard(){
	     this("Albus Dumbledore");
    }

    public Wizard(String name){
	     this(name, 1);
    }

    public Wizard(String name, int powerLevel){
      super(name,30+(int)(Math.random()*10));
      setPowerLevel(powerLeve);
      setHasStaff(false);
    }

    //warrior methods

    public void attack(Damageable other){
    	  int damage = (int)(Math.random()*20)+1;

    }

    public void specialAttack(Damageable other){

    }

    //get methods

    public int getPowerLevel(){
	     return powerLevel;
    }

    //set methods
    public void setPowerLevel(int p){
	     this.powerLevel = p;
    }

    public void setHasStaff(boolean staff){
	     this.hasStaff = staff;
    }


}
