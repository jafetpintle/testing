package Player;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void play_lossWhenIsLow(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice,3);

        Assert.assertFalse(player.play());
    }
    @Test
    public void play_WinsWhenIsHiger(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice,3);

        Assert.assertTrue(player.play());
    }

}