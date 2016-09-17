package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;

/**
 * Created by Josiel on 9/11/16.
 */
public class Profile {

    private String firstName;
    private String lastName;
    private String realName;
    private String email;
    private String skype;
    private String phoneNumber;
    private String image24;
    private String image32;
    private String image48;
    private String image72;
    private String image192;
    private String image512;

    public Profile(JSONObject json){

        if (json.containsKey("firstName")) {
            this.firstName = (String) json.get("firstName");
        }
        if (json.containsKey("lastName")) {
            this.lastName = (String) json.get("lastName");

        }if (json.containsKey("realName")) {
            this.realName = (String) json.get("realName");

        }if (json.containsKey("email")) {
            this.email = (String) json.get("email");

        }if (json.containsKey("skype")) {
            this.skype = (String) json.get("skype");

        }if (json.containsKey("phoneNumber")) {
            this.phoneNumber = (String) json.get("phoneNumber");

        }if (json.containsKey("image24")) {
            this.image24 = (String) json.get("image24");

        }if (json.containsKey("image32")) {
            this.image32 = (String) json.get("image32");

        }if (json.containsKey("image48")) {
            this.image48 = (String) json.get("image48");

        }if (json.containsKey("image72")) {
            this.image72 = (String) json.get("image72");

        }if (json.containsKey("image192")) {
            this.image192 = (String) json.get("image192");

        }if (json.containsKey("image512")) {
            this.image512 = (String) json.get("image512");

        }
    }

    //        "first_name": "Bobby",
//                "last_name": "Tables",
//                "real_name": "Bobby Tables",
//                "email": "bobby@slack.com",
//                "skype": "my-skype-name",
//                "phone": "+1 (123) 456 7890",
//                "image_24": "https:\/\/...",
//                "image_32": "https:\/\/...",
//                "image_48": "https:\/\/...",
//                "image_72": "https:\/\/...",
//                "image_192": "https:\/\/...",
//                "image_512": "https:\/\/..."

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRealName() {
        return realName;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getImage24() {
        return image24;
    }

    public String getImage32() {
        return image32;
    }

    public String getImage48() {
        return image48;
    }

    public String getImage72() {
        return image72;
    }

    public String getImage192() {
        return image192;
    }

    public String getImage512() {
        return image512;
    }




//

}
