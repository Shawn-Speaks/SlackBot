package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:

    private String id;
    private String name;
    private boolean deleted;
    private String color;
    private boolean isAdmin;
    private boolean isOwner;
    private String twoFactorType;
    private Profile profile;
    private boolean isPrimaryOwner;
    private boolean isRestricted;
    private boolean isUltraRestricted;
    private boolean has2Fa;
    private boolean hasFiles;


    public User(JSONObject json) {
        // oTODO: parse a user from the incoming json
        if (json.containsKey("id")){
            this.id = (String) json.get("id");
        }
        if (json.containsKey("name")){
            this.name = (String) json.get("name");
        }
        if (json.containsKey("deleted")){
            this.deleted = (boolean) json.get("deleted");
        }
        if (json.containsKey("color")){
            this.color = (String) json.get("color");
        }
        if (json.containsKey("isAdmin")){
            this.isAdmin = (boolean) json.get("isAdmin");
        }
        if (json.containsKey("isOwner")){
            this.isOwner = (boolean) json.get("isOwner");
        }
        if (json.containsKey("twoFactorType")){
            this.twoFactorType = (String) json.get("twoFactorType");
        }
        if (json.containsKey(profile)){
            this.profile = (Profile) json.get(profile);
        }
        if (json.containsKey("isPrimaryOwner")){
            this.isPrimaryOwner = (boolean) json.get("isPrimaryOwner");
        }
        if (json.containsKey("isRestricted")){
            this.isRestricted = (boolean) json.get("isRestricted");
        }
        if (json.containsKey("isUltraRestricted")){
            this.isUltraRestricted = (boolean) json.get("isUltraRestricted");
        }
        if (json.containsKey("has2Fa")){
            this.has2Fa = (boolean) json.get("has2Fa");
        }
        if (json.containsKey("hasFiles")){
            this.hasFiles = (boolean) json.get("hasFiles");
        }

    }

    // oTODO add getters to access private fields


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getColor() {
        return color;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public String getTwoFactorType() {
        return twoFactorType;
    }

    public Profile getProfile() {
        return profile;
    }

    public boolean isPrimaryOwner() {
        return isPrimaryOwner;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public boolean isUltraRestricted() {
        return isUltraRestricted;
    }

    public boolean isHas2Fa() {
        return has2Fa;
    }

    public boolean isHasFiles() {
        return hasFiles;
    }


}
