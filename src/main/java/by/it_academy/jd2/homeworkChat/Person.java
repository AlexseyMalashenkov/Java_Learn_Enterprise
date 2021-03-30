package by.it_academy.jd2.homeworkChat;

import java.util.Date;

public class Person {
    private String login;
    private String pass;
    private String fio;
    private Date date;

    public Person(String login, String pass, String fio, Date date) {
        this.login = login;
        this.pass = pass;
        this.fio = fio;
        this.date = date;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
