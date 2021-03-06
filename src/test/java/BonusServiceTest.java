import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long actual = service.calculate(1000_60, true);
        long expected = 30;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long actual = service.calculate(1000_60, false);
        long expected = 10;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long actual = service.calculate(800000_00, true);
        long expected = 500;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long actual = service.calculate(800000_00, false);
        long expected = 500;

        assertEquals(expected, actual);
    }
}