public class Game2{
  public static void main(String[] args) {
    Adventurer a = new Wizard();
    Adventurer b = new Wizard("Harry Potter",5);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");

    b.attack(a);
    b.attack(a);
    b.attack(a);
    b.attack(a);

    a.specialAttack(b); //won't work
    b.specialAttack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");

    b.attack(a);
    }
}
