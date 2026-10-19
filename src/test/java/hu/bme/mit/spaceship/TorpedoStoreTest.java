package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }
    @Test 
    void store_Empty() {
        TorpedoStore store = new TorpedoStore(0);

        boolean result = store.isEmpty();

        assertEquals(true, result);
    }

    @Test 
    void torpedo_Count() {
        TorpedoStore store = new TorpedoStore(67);

        assertNotEquals(69, store.getTorpedoCount());
    }

    @Test 
    void fire_Failure() {
        TorpedoStore store = new TorpedoStore(3, 1);

        boolean result = store.fire(3);

        assertEquals(false, result);
    }
}
