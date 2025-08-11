package stopwatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    @Test
    void givenStopWatch_whenRecord_thenMinutesAreValid() {
        //Arrange
        StopWatch stopWatch = new StopWatch();
        //Act
        stopWatch.record(14);
        //Assert
        int minutes = stopWatch.getMinutes();
        Assertions.assertEquals(14, minutes);
    }
      

    @Test
    void givenStopWatch_whenRecordNegative_thenIgnore() {
        //Arrange
        StopWatch stopWatch = new StopWatch();
        //Act
        stopWatch.record(-5);
        //Assert
        int minutes = stopWatch.getMinutes();
        if (minutes != 0) {
            Assertions.fail("Invalid value");
        }
    }
@Test
    void givenStopWatch_whenRecord_60_Minutes_thenIncreaseHours(){
        // Arrange
        StopWatch stopWatch = new StopWatch();

        // Act
        stopWatch.record(60);

        // Assert
        int minutes = stopWatch.getMinutes();
        int hours = stopWatch.getHours();
        assertEquals(0, minutes);
        assertEquals(1, hours);
    }
}
