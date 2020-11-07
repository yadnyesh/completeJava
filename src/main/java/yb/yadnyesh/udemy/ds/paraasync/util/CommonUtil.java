package yb.yadnyesh.udemy.ds.paraasync.util;

import org.apache.commons.lang3.time.StopWatch;

import static java.lang.Thread.sleep;
import static yb.yadnyesh.udemy.ds.paraasync.util.LoggerUtil.log;

public class CommonUtil {

    public static StopWatch stopWatch = new StopWatch();

    public static void delay(long delayMilliseconds) {
        try {
            sleep(delayMilliseconds);
        } catch (Exception e) {
            log("Exception is :" + e.getMessage());
        }
    }

    public static String transForm(String s) {
        CommonUtil.delay(500);
        return s.toUpperCase();
    }

    public static void startTimer() {
        stopWatch.start();
    }

    public static void timeTaken() {
        stopWatch.stop();
        log("Total time take: " + stopWatch.getTime());
    }

    public void stopWatchReset() {
        stopWatch.reset();
    }

    public static int noOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }

}
