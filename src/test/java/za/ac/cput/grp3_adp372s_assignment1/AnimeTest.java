package za.ac.cput.grp3_adp372s_assignment1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class AnimeTest {
    Anime character1 = new Anime("Goku",1000);
    Anime character2 = new Anime("Vegeta",900);
    Anime character3 = character1;

    //Test for object equality
    @Test
    public void testObjectEquality(){
        assertEquals(1000,character1.getPowerLevel());
    }

    //Test for object identity
    @Test
    public void testObjectIdentity(){
        assertSame(character3, character1);
        assertNotSame(character1, character2);
    }

    //Test for failure
    @Test
    public void failedTest(){
        assertSame(character3, character2);

    }

    //Test for timeout
    @Timeout(20)
    @Test
    public void timeOut(){
        assertSame(character3, character1);
        assertNotSame(character1, character2);
    }

    //Test for disability
    @Disabled
    @Test
    public void Disabled(){
        assertSame(character3, character2);
    }

}