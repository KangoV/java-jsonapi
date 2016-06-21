package com.github.mbarberot.java.jsonapi.test.utils;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Book {
    private String id;
    private String isbn;
    private int pages;
    private Date publication;
    private Author author;
}