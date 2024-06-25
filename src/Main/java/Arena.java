package Main.java;

public class Arena {
    private Player player1;
    private Player player2;
    private Dice dice;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
    }

    public void fight() {
        Player attacker = (player1.getHealth() < player2.getHealth()) ? player1 : player2;
        Player defender = (attacker == player1) ? player2 : player1;

        while (attacker.isAlive() && defender.isAlive()) {
            takeTurn(attacker, defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println("Winner: " + (attacker.isAlive() ? attacker : defender));
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        int damage = attacker.attack() * attackRoll - defender.defend() * defendRoll;
        if (damage > 0) {
            defender.takeDamage(damage);
        }

        System.out.println(attacker + " attacks " + defender + " and deals " + damage + " damage");
        System.out.println(defender + " health is now " + defender.getHealth());
    }
}
