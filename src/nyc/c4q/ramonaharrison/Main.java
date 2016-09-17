package nyc.c4q.ramonaharrison;

import java.util.*;
import nyc.c4q.ramonaharrison.model.Message;
import nyc.c4q.ramonaharrison.network.Slack;
import sun.misc.resources.Messages;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bot aBot = new Bot();

        aBot.testApi();
        aBot.readMessages("C2BLV9LV6");
            Slack.getHolidaysForToday();

//        Calendar cal = Calendar.getInstance();
//        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
//
//        String dayOfMonthStr = String.valueOf(dayOfMonth);
//        System.out.println(dayOfMonth);
//
//
//        Calendar cal = Calendar.getInstance();
//        int currentYear = cal.get(Calendar.YEAR);
//
//        String year = String.valueOf(currentYear);
//        System.out.println(year);







        // Post a pineapple photo to the #bots channel
//        myBot.sendMessage(");
//        myBot.sendMessage("someString");
    }
}
