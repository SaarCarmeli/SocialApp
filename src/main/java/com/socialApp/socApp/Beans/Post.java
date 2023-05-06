package com.socialApp.socApp.Beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private int id;
    @Column(length = 150, nullable = false)
    private String title;
    private String body;
    @Column(nullable = false)
    private Date postedOn;
    @Column(nullable = false)
    private boolean isPublic;
}
