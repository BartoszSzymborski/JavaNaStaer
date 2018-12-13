package pl.javastart.model;

import pl.javastart.common.Lang;
import pl.javastart.constraint.NotBadWorld;

import javax.validation.constraints.NotNull;

public class Message {
    @NotNull
    private String title;
    @NotBadWorld(lang = {Lang.EN,Lang.PL})
    private String content;

    public Message(@NotNull String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Message() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
