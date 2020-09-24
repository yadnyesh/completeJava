package yb.yadnyesh.youtube.time;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class DayOfWeekTest {

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY","THURSDAY"}, mode = EnumSource.Mode.INCLUDE)
    void dayOfWeekShortFormatMatchingTest(DayOfWeek dayOfWeek) {
        assertEquals("T", dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.getDefault()));
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY","THURSDAY"}, mode = EnumSource.Mode.EXCLUDE)
    void dayOfWeekShortFormatNotMatchingTest(DayOfWeek dayOfWeek) {
        assertNotEquals("T", dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.getDefault()));
    }
}
