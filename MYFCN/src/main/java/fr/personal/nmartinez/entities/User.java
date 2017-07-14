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

    // fields

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

    // constructors

    public User(){}

    public User(UserBuilder builder){
        this.id = builder.id;
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.fantasyElevens = builder.fantasyElevens;
    }

    // getters & setters

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

    // builder

    public static class UserBuilder{

        private int id;
        private String nickname;
        private String password;
        private List<FantasyEleven> fantasyElevens;

        public UserBuilder(){}

        public UserBuilder id(int id){
            this.id = id;
            return this;
        }

        public UserBuilder nickname(String nickname){
            this.nickname = nickname;
            return this;
        }

        public UserBuilder password(String password){
            this.password = password;
            return this;
        }

        public UserBuilder fantasyElevens(List<FantasyEleven> fantasyElevens){
            this.fantasyElevens = fantasyElevens;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
