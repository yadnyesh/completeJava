package yb.yadnyesh.sample;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class FirstTest {

    @Test
    public void sampleTest() {
        log.info("This is my first JUnit test");
        assertEquals(true,2 > 1);
    }
}
