package nyc.c4q.ramonaharrison;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

//        myBot.testApi();
//
//        myBot.listChannels();

//        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

//         Post "Hello, world!" to the #bots channel
        myBot.sendMessageToBotsChannel("Hello");

//         Post a pineapple photo to the #bots channel
      //  myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");

    }
}