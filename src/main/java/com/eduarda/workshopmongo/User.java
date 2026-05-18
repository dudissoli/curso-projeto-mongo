package com.eduarda.workshopmongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document(collection = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id; // 1. Alterado de int para String
    private String name;
    private String email;

    // 2. Construtor agora recebe uma String no id
    public User(String id, String name, String email) {
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
        return Objects.equals(id, user.id); // 3. Voltamos a usar Objects.equals para comparar Strings
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // 4. Getter alterado para retornar String
    public String getId() {
        return id;
    }

    // 5. Setter alterado para receber String
    public void setId(String id) {
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