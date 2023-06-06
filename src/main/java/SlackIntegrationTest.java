import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

public class SlackIntegrationTest {


    private static String webHooksUrl = "https://hooks.slack.com/services/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";
    private static String oAuthToken = "xoxb-5361693837622-5392064578624-15wr2V4Ufp7yzbzhq7X64UXB";
    private static String slackChannel = "ccm-automation-cart-be";

    public static void main(String[] args) {
        System.out.println("Second message");
        sendMessageToSlack("Second Message");;
    }

    public static void sendMessageToSlack(String message) {
        try {
            StringBuilder msgbuilder = new StringBuilder();

            msgbuilder.append(message);
            Payload payload = Payload.builder().channel(slackChannel).text(msgbuilder.toString()).build();
            WebhookResponse wbResp = Slack.getInstance().send(webHooksUrl, payload);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
