package Kolejki;

public class Client {
    private String nickname;


    public Client(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
