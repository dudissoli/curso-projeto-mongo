package com.eduarda.workshopmongo;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private int id;
    private String name;
    private String email;

    // 1. O parâmetro "id" no construtor agora recebe um int
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(){
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id; // Como é um tipo primitivo (int), usamos == em vez de Objects.equals
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // 2. O tipo de retorno do Getter agora é int
    public int getId() {
        return id;
    }

    // 3. O parâmetro do Setter agora recebe um int
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}