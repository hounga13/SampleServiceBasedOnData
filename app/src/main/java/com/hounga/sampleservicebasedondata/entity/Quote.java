package com.hounga.sampleservicebasedondata.entity;

public class Quote {
    private String quote;
    private String quoteTrans;

    private String author;
    private String authorTrans;

    public Quote(String quote, String quoteTrans, String author, String authorTrans) {
        this.quote = quote;
        this.quoteTrans = quoteTrans;

        this.author = author;
        this.authorTrans = authorTrans;
    }

    public String getQuote() {
        return quote;
    }

    public String getQuoteTrans() {
        return quoteTrans;
    }

    public String getAuthor() {
        return author;
    }

    public String getAuthorTrans() {
        return authorTrans;
    }
}
