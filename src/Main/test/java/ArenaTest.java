package Main.test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Main.java.Arena;
import Main.java.Player;

public class ArenaTest {
    
    public void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        arena.fight();

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
