package com.example.hexagonal.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Post {

    private Long id;

    private String title;

    private String content;

    private Member writer;

    public void updatePost(String content){
        this.content = content;
    }
}
