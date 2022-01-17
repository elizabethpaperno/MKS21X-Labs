public class Wizard extends Adventurer {
    private int powerLevel;
    private int plMax;
    private boolean hasStaff;

    public Wizard(){
	     this("Albus Dumbledore");
    }

    public Wizard(String name){
	     this(name, 1);
    }

    public Wizard(String name, int powerLevel){
      super(name,100+(int)(Math.random()*10));
      if (powerLevel <= 5){
        setPowerLevel(powerLevel);
      }else {
        setPowerLevel(5);
      }
      setHasStaff(false);
      this.plMax = 10;
      //setAttacks(0);
      //System.out.println("For a wizard to have a staff, it must reach a powerLevel of 10. A staff gives you 1.5X damage on all regular attacks, and allows you to perform the special attack.");
      //System.out.println("A wizard upgrades a level when it performs a regular attack ONLY.");
    }

    //warrior methods

    public String attack(Damageable other){
    	 int damage = (int)(Math.random()*30)+1;
       if (getHasStaff()){
         damage *= 1.5;
       }
       other.applyDamage(damage);
       if (getPowerLevel() < 10) {
         setPowerLevel(getPowerLevel() + 1);
       }
       if (!hasStaff){
         updateHasStaff();
       }
       return (this + " attacks " + other + " for " + damage + " damage!");
       //System.out.println(this + ": " + getHP() + " HP");
       //System.out.println(other + ": " + getHP() + " HP");
    }

    public String specialAttack(Damageable other){
      if (hasStaff){
        int damage = (int)(30 + Math.random()*50)+1;
        other.applyDamage(damage);
        return(this + " curses " + other + " for " + damage + " damage!");
      }else{
        return (this + " must have a staff (PL >= 10) for it to perform the special attack.");
      }
    }

    private void updateHasStaff(){
      setHasStaff(true);
    }
    //get methods

    public int getPowerLevel(){
	     return powerLevel;
    }

    public boolean getHasStaff(){
	     return hasStaff;
    }
    //set methods
    public void setPowerLevel(int p){
	     this.powerLevel = p;
    }

    private void setHasStaff(boolean staff){
      if (staff && getPowerLevel() >= 10){
	     this.hasStaff = true;
       //System.out.println(this + " now has a staff");
     } else {
       this.hasStaff = false;
     }
    }
    //return the name of the special resource the class uses
    public String getSpecialName(){
      return "PL";
    }

    //return the value of the current and maximum special resource
    public int getSpecial(){
        return getPowerLevel();
    }
    public int getSpecialMax(){
        return plMax;
    }
}
