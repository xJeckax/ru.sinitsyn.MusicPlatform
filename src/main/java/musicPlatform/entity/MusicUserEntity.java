package musicPlatform.entity;

import musicPlatform.enums.MusicUserEntitlement;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class MusicUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private String password;
    private String email;
    @Enumerated(value = EnumType.STRING)
    private MusicUserEntitlement musicUserEntitlement;

    public MusicUserEntitlement getMusicUserEntitlement() {
        return musicUserEntitlement;
    }

    public void setMusicUserEntitlement(MusicUserEntitlement musicUserEntitlement) {
        this.musicUserEntitlement = musicUserEntitlement;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
