package nyc.c4q.ramonaharrison;

import java.util.*;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import nyc.c4q.ramonaharrison.model.Message;
import nyc.c4q.ramonaharrison.network.Slack;
import nyc.c4q.ramonaharrison.network.response.ListMessagesResponse;
import nyc.c4q.ramonaharrison.util.Token;
import sun.misc.resources.Messages;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Bot aBot = new Bot();
//        aBot.listChannels();
//        while (true) {
//
//            Slack.getHolidaysForToday();
//            if (Slack.giphySearch() != null) {
//                aBot.sendMessageToBotsChannel("You have entered the guessing game command! Type 'hint' for another gif related to the next holiday, or 'give up' for the answer. Good luck!");
//                aBot.sendMessageToBotsChannel(Slack.giphySearch());
//            }
//            Slack.guessingGame();
//        }
//    }
Token token = new Token ();
        System.out.println(token.findApiToken());

    }
}
