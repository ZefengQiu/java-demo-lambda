package javaDataScreamingDemo;

import java.util.*;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;

/**
 * Handler for requests to Lambda function.
 */

public class App implements RequestHandler<SQSEvent, String> {

    @Override
    public String handleRequest(SQSEvent input, Context context) {
        System.out.println("get message!");
        List<SQSMessage> records = input.getRecords();

        for (SQSMessage record : records) {
            System.out.println(record.getBody());
        }

        return "Ok";
    }
}
