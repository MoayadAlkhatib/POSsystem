package se.kth.iv1350.POSsystem.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ErrorMessageHandler {

    /**
     * Display the error message.
     *
     * @param message The error message.
     */
    void showErrorMsg(String message) {
        StringBuilder errorMessage = new StringBuilder();
        errorMessage.append(createTime());
        errorMessage.append(", ERROR: ");
        errorMessage.append(message);
        System.out.println(errorMessage);
        System.out.println("");

    }

    private String createTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.
                ofLocalizedDateTime(FormatStyle.MEDIUM);
        return now.format(formatter);
    }
}
