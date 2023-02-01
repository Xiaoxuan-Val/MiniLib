package com.minilib.springbootlibrary.request;

import lombok.Data;

@Data
public class CreateBookRequest {
    private String title;

    private String author;

    private String description;

    private String category;

    private String img;

    private String URL;

}
