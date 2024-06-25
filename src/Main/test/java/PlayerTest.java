package Main.test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Main.java.Player;

public class PlayerTest {
    
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.defend());
        assertEquals(10, player.attack());
    }

    
    public void testPlayerTakeDamage() {
        Player player = new Player(50, 5, 10);
        player.takeDamage(20);
        assertEquals(30, player.getHealth());
        player.takeDamage(40);
        assertEquals(0, player.getHealth());
    }


	private void assertEquals(int i, int health) {
		// TODO Auto-generated method stub
		
	}
}
