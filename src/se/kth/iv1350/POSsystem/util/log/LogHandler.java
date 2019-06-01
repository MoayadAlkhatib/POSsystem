package se.kth.iv1350.POSsystem.util.log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * This class is responsible for the log.
 */
public class LogHandler {

    private static final String LOG_FILE_NAME = "POSsystem-log.txt";

    private PrintWriter logFile;

    /**
     * creates a constructor.
     * @throws IOException Thrown if an error occur when making new PrintWriter.
     */
    public LogHandler() throws IOException {
        logFile = new PrintWriter(
                new FileWriter(LOG_FILE_NAME), true);
    }

    /**
     * Writes a log entry describing a thrown exception.
     *
     * @param e The exception that shall be logged.
     */
    public void logTheException(Exception e) {
        StringBuilder message = new StringBuilder();
        message.append(createTime());
        message.append(", Exception was thrown: ");
        message.append(e.getMessage());
        logFile.println(message);
        e.printStackTrace(logFile);
    }

    private String createTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.
                ofLocalizedDateTime(FormatStyle.MEDIUM);
        return now.format(formatter);

    }
}
