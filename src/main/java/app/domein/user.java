package app.domein;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class user {

    public String user_id;
    public String password;
    public String nickname;
    public String comment;

    public user(String user_id, String password, String nickname, String comment){
        this.user_id = user_id;
        this.password =password;
        this.nickname = nickname;
        this.comment = comment;
    }

}
