package fr.personal.nmartinez.dtos;

import fr.personal.nmartinez.entities.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 14/07/2017.
 */
public class UserDto implements Serializable {

    public static final String ID_MEMBER = "id";
    public static final String NICKNAME_MEMBER = "nickname";
    public static final String PASSWORD_MEMBER = "password";
    public static final String FANTASY_ELEVENS_MEMBER = "fantasyElevens";

    private int id;
    private String nickname;
    private String password;
    private List<FantasyElevenDto> fantasyElevens;

    public UserDto(){}

    public UserDto(User user){
        this.id = user.getId();
        this.nickname = user.getNickname();
        this.password = user.getPassword();
        this.fantasyElevens = FantasyElevenDto.fromFantasyElevens(user.getFantasyElevens());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<FantasyElevenDto> getFantasyElevens() {
        return fantasyElevens;
    }

    public void setFantasyElevens(List<FantasyElevenDto> fantasyElevens) {
        this.fantasyElevens = fantasyElevens;
    }
}
