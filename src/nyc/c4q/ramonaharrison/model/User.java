package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 * <p>
 * A class representing a user.
 * See https://api.slack.com/types/user
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:
    // "id"
    // "name"
    // "deleted"
    // "color"
    // "profile"
    // "is_admin"
    // "is_owner"
    // "is_primary_owner"
    // "is_restricted"
    // "is_ultra_restricted"
    // "has_2fa"
    // "two_factor_type"
    // "has_files"

    private String id;
    private String name;
    private Boolean deleted;
    private String color;
    private Profile profile;
    private Boolean isAdmin;
    private Boolean isOwner;
    private Boolean isPrimaryOwner;
    private Boolean isRestricted;
    private Boolean isUltraRestricted;
    private Boolean has2FA;
    private Boolean twoFactorType;
    private Boolean hasFiles;

    public User(JSONObject json) {

        if (json.containsKey("id")) {
            this.id = (String) json.get("id");
        }
        if (json.containsKey("name")) {
            this.name = (String) json.get("name");

        }
        if (json.containsKey("deleted")) {
            this.deleted = (Boolean) json.get("deleted");

        }
        if (json.containsKey("color")) {
            this.color = (String) json.get("color");

        }
        if (json.containsKey("profile")) {
            this.profile = (Profile) json.get("profile");

        }
        if (json.containsKey("isAdmin")) {
            this.isAdmin = (Boolean) json.get("isAdmin");

        }
        if (json.containsKey("isOwner")) {
            this.isOwner = (Boolean) json.get("isOwner");

        }
        if (json.containsKey("isPrimaryOwner")) {
            this.isPrimaryOwner = (Boolean) json.get("isPrimaryOwner");

        }
        if (json.containsKey("isRestricted")) {
            this.isRestricted = (Boolean) json.get("isRestricted");

        }
        if (json.containsKey("isUltraRestricted")) {
            this.isUltraRestricted = (Boolean) json.get("isUltraRestricted");

        }
        if (json.containsKey("has2FA")) {
            this.has2FA = (Boolean) json.get("has2FA");

        }
        if (json.containsKey("twoFactorType")) {
            this.twoFactorType = (Boolean) json.get("twoFactorType");

        }
        if (json.containsKey("hasFiles")) {
            this.hasFiles = (Boolean) json.get("hasFiles");

        }
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public String getColor() {
        return color;
    }

    public Profile getProfile() {
        return profile;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public Boolean getOwner() {
        return isOwner;
    }

    public Boolean getPrimaryOwner() {
        return isPrimaryOwner;
    }

    public Boolean getRestricted() {
        return isRestricted;
    }

    public Boolean getUltraRetricted() {
        return isUltraRestricted;
    }

    public Boolean getHas2FA() {
        return has2FA;
    }

    public Boolean getTwoFactorType() {
        return twoFactorType;
    }

    public Boolean getHasFiles() {
        return hasFiles;
    }

    // TODO: parse a user from the incoming json

    // TODO add getters to access private fields
}
