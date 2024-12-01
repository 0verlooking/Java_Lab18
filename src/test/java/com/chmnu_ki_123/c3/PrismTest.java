package com.chmnu_ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrismTest {

    @Test
    void testGetLateralSurfaceArea() {
        Prism prism = new Prism(5, 10);

        double expectedLateralSurfaceArea = 3 * 5 * 10;
        double actualLateralSurfaceArea = prism.getLateralSurfaceArea();

        assertEquals(expectedLateralSurfaceArea, actualLateralSurfaceArea, 0.001,
                "Lateral surface area should be calculated correctly.");
    }

    @Test
    void testGetVolume() {
        Prism prism = new Prism(5, 10);

        double expectedVolume = (Math.sqrt(3) / 4) * Math.pow(5, 2) * 10;
        double actualVolume = prism.getVolume();

        assertEquals(expectedVolume, actualVolume, 0.001,
                "Volume should be calculated correctly.");
    }

    @Test
    void testInvalidSideLengthAndHeight() {
        assertThrows(IllegalArgumentException.class, () -> new Prism(-5, 10),
                "Side length must be a positive value.");
        assertThrows(IllegalArgumentException.class, () -> new Prism(5, -10),
                "Height must be a positive value.");
        assertThrows(IllegalArgumentException.class, () -> new Prism(-5, -10),
                "Side length and height must be positive values.");
        assertThrows(IllegalArgumentException.class, () -> new Prism(0, 10),
                "Side length must be greater than zero.");
        assertThrows(IllegalArgumentException.class, () -> new Prism(5, 0),
                "Height must be greater than zero.");
    }

    @Test
    void testGetters() {
        Prism prism = new Prism(5, 10);

        assertEquals(5, prism.getSideLength(), 0.001,
                "Side length getter should return the correct value.");
        assertEquals(10, prism.getHeight(), 0.001,
                "Height getter should return the correct value.");
    }

    @Test
    void testSetters() {
        Prism prism = new Prism(5, 10);

        prism.setSideLength(7);
        prism.setHeight(15);

        assertEquals(7, prism.getSideLength(), 0.001,
                "Side length setter should correctly update the value.");
        assertEquals(15, prism.getHeight(), 0.001,
                "Height setter should correctly update the value.");
    }

    @Test
    void testInvalidSetters() {
        Prism prism = new Prism(5, 10);

        assertThrows(IllegalArgumentException.class, () -> prism.setSideLength(-5),
                "Side length must be positive in setter.");
        assertThrows(IllegalArgumentException.class, () -> prism.setHeight(-10),
                "Height must be positive in setter.");
    }
}

