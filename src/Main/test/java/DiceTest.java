package Main.test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Main.java.Dice;

public class DiceTest {
    
    public void testDiceRoll() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
