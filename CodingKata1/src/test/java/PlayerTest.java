import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void Test() {
        assertEquals(1,1);
    }

    @Test
    public void startGame() {
        Tennis tennis = new Tennis();
        assertEquals("love - love", tennis.getScore());
    }

    @Test
    public void playerOneScore() {
        Tennis tennis = new Tennis();
        tennis.addPlayerOneScore();
        assertEquals("15 - love", tennis.getScore());
    }

    @Test
    public void playerTwoScore() {
        Tennis tennis = new Tennis();
        tennis.addPlayerTwoScore();
        assertEquals("love - 15", tennis.getScore());
    }

    @Test
    public void bothPlayersScore() {
        Tennis tennis = new Tennis();
        tennis.addPlayerOneScore();
        tennis.addPlayerTwoScore();
        assertEquals("15 - 15", tennis.getScore());
    }
}