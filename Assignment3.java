//Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

//Use the system ping utility, do not use any deprecated methods.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Assignment3{

    public static double pingMedian(String host) throws IOException {
        Process pingProcess = Runtime.getRuntime().exec("ping " + host);

        BufferedReader input = new BufferedReader(new InputStreamReader(pingProcess.getInputStream()));
        String line = null;
        int count = 0;
        double[] pingTimes = new double[10];

        while ((line = input.readLine()) != null) {
            if (line.startsWith("Reply from")) {
                int startIndex = line.indexOf("time=");
                int endIndex = line.indexOf("ms");
                if (startIndex != -1 && endIndex != -1) {
                    double pingTime = Double.parseDouble(line.substring(startIndex + 5, endIndex));
                    pingTimes[count++] = pingTime;
                }
            }
        }

        input.close();

        double[] trimmedPingTimes = new double[count];
        System.arraycopy(pingTimes, 0, trimmedPingTimes, 0, count);

        Arrays.sort(trimmedPingTimes);

        double median;
        if (count % 2 == 0) {
            median = (trimmedPingTimes[count / 2 - 1] + trimmedPingTimes[count / 2]) / 2;
        } else {
            median = trimmedPingTimes[count / 2];
        }

        return median;
    }
}
