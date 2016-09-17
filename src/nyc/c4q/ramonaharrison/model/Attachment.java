package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {

    // TODO: implement private fields for each of the following attachment JSON keys:
    private String fallback;
    private String color;
    private String pretext;
    private String authorName;
    private String authorLink;
    private String authorIcon;
    private String title;
    private String titleLink;
    private String text;
    private List<Field> fields;
    private String imageUrl;
    private String thumbUrl;
    private String footer;
    private String footerIcon;
    private long ts;

    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json


        if (json.containsKey("fallback")) {
            this.fallback = (String) json.get("fallback");
        }

        if (json.containsKey("fields")) {
            JSONArray jsonFields = (JSONArray) json.get("fields");
            this.fields = new ArrayList<>();
            for (int i = 0; i < jsonFields.size(); i++){
                Field field = new Field((JSONObject) jsonFields.get(i));
                this.fields.add(field);
            }
        }

        if (json.containsKey("ts")){
            this.ts = (Long) json.get("ts");
        }

    }
        public String getFallback() {
            return fallback;

        }public String getColor() {
            return color;

        }public String getPretext() {
            return pretext;

        }public String getAuthorName() {
            return authorName;

        }public String getAuthorLink() {
            return authorLink;

        }public String getAuthorIcon() {
            return authorIcon;

        }public String getTitle() {
            return title;

        }public String getTitleLink() {
            return titleLink;

        }public String getText() {
            return text;

        }public String getImageUrl() {
            return imageUrl;

        }public String getThumbUrl() {
            return thumbUrl;

        }public String getFooter() {
            return footer;

        }public String getFooterIcon() {
            return footerIcon;

        }public long getTs() {
            return ts;
        }

    // TODO add getters to access private fields

}
