package ru.dkadyrov.postmail;

import org.junit.Test;
import ru.dkadyrov.postmail.model.Box;
import ru.dkadyrov.postmail.model.Package;

import static org.junit.Assert.*;

public class PostSimulatorTest {

    private PostSimulator postSimulator = new PostSimulator();

    @Test
    public void whenPackageTallerThanBox_thanFalse() {
        assertFalse(postSimulator.isPackageFitInBox(new Package(2, 2, 2), new Box(1,1,1)));
    }

    @Test
    public void whenPackageSmallerThanBox_thanTrue() {
        assertTrue(postSimulator.isPackageFitInBox(new Package(1, 1, 1), new Box(2,2,2)));
    }

    @Test(expected = IllegalStateException.class)
    public void whenZeroVolumePackage_throwException() {
        postSimulator.isPackageFitInBox(new Package(0, 0, 0), new Box(1,1,1));
        fail();
    }

    @Test(expected = IllegalStateException.class)
    public void whenNegativeSideBox_throwException() {
        postSimulator.isPackageFitInBox(new Package(1,1,1), new Box(-1,-1,-1));
        fail();
    }

    @Test(expected = NullPointerException.class)
    public void whenNullPackage_throwException() {
        postSimulator.isPackageFitInBox(null, new Box(1,1,1));
        fail();
    }

    @Test(expected = NullPointerException.class)
    public void whenNullBox_throwException() {
        postSimulator.isPackageFitInBox(new Package(1,1,1), null);
        fail();
    }
}