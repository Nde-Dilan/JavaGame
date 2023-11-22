public class Player {
    private String name;
    private int totalHealth;
    private int numberOfPotions;



    public void loseHealth(int damage){
    totalHealth = totalHealth - damage;
    totalHealth-=damage;
    }

    public void takePotion(int potion){
        totalHealth+=potion;
        numberOfPotions-=1;

    }
}

//p1 = new Player("jonh", 30)
//p2 = new Player("doe", 50)

//p1.loseHealth(10)


