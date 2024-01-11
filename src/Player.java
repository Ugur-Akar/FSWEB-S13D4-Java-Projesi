public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int hp, Weapon weapon){
        this.name = name;
        healthPercentage = hp;
        checkHealthPercentage();
        this.weapon = weapon;
    }

    private void checkHealthPercentage(){
        healthPercentage = Math.min(healthPercentage, 100);
    }

    public int healthRemaining(){
        return  healthPercentage;
    }

    public void loseHealth(int damage){
        healthPercentage -= damage;
        if(healthPercentage <= 0){
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion){
        healthPercentage += healthPotion;
        checkHealthPercentage();
    }
}
