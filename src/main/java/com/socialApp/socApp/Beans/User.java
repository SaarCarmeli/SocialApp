package com.socialApp.socApp.Beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(length = 45, nullable = false, unique = true)
    private String userName;
    @Column(length = 45, nullable = false)
    private String password;
    @Column(length = 45, nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private boolean isOnline;
    @Column(nullable = false)
    private Date lastLogin;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Post> posts;
}
