package musicPlatform.dto;

public class MusicUserDto {

    private Long userId;
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private String password;
    private String email;
    private String musicUserEntitlement;

    public String getMusicUserEntitlement() {
        return musicUserEntitlement;
    }

    public void setMusicUserEntitlement(String musicUserEntitlement) {
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
