package fr.personal.nmartinez.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 03/07/2017.
 */

@Entity
public class User implements Serializable {

    public static final String GENERATOR = "UserGenerator";

    @TableGenerator(
            name = User.GENERATOR,
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = User.GENERATOR)
    private int id;

    private String nickname;

    private String password;

    @OneToMany
    private List<FantasyEleven> fantasyElevens;

    public User(){}

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

    public List<FantasyEleven> getFantasyElevens() {
        return fantasyElevens;
    }

    public void setFantasyElevens(List<FantasyEleven> fantasyElevens) {
        this.fantasyElevens = fantasyElevens;
    }
}
