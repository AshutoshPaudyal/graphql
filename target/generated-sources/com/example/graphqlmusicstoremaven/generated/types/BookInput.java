package com.example.graphqlmusicstoremaven.generated.types;

import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class BookInput {
  private String title;

  private String desc;

  private String author;

  private Double price;

  private Integer pages;

  public BookInput() {
  }

  public BookInput(String title, String desc, String author, Double price, Integer pages) {
    this.title = title;
    this.desc = desc;
    this.author = author;
    this.price = price;
    this.pages = pages;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  @Override
  public String toString() {
    return "BookInput{" + "title='" + title + "'," +"desc='" + desc + "'," +"author='" + author + "'," +"price='" + price + "'," +"pages='" + pages + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookInput that = (BookInput) o;
        return java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(desc, that.desc) &&
                            java.util.Objects.equals(author, that.author) &&
                            java.util.Objects.equals(price, that.price) &&
                            java.util.Objects.equals(pages, that.pages);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(title, desc, author, price, pages);
  }

  public static com.example.graphqlmusicstoremaven.generated.types.BookInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String title;

    private String desc;

    private String author;

    private Double price;

    private Integer pages;

    public BookInput build() {
                  com.example.graphqlmusicstoremaven.generated.types.BookInput result = new com.example.graphqlmusicstoremaven.generated.types.BookInput();
                      result.title = this.title;
          result.desc = this.desc;
          result.author = this.author;
          result.price = this.price;
          result.pages = this.pages;
                      return result;
    }

    public com.example.graphqlmusicstoremaven.generated.types.BookInput.Builder title(
        String title) {
      this.title = title;
      return this;
    }

    public com.example.graphqlmusicstoremaven.generated.types.BookInput.Builder desc(String desc) {
      this.desc = desc;
      return this;
    }

    public com.example.graphqlmusicstoremaven.generated.types.BookInput.Builder author(
        String author) {
      this.author = author;
      return this;
    }

    public com.example.graphqlmusicstoremaven.generated.types.BookInput.Builder price(
        Double price) {
      this.price = price;
      return this;
    }

    public com.example.graphqlmusicstoremaven.generated.types.BookInput.Builder pages(
        Integer pages) {
      this.pages = pages;
      return this;
    }
  }
}
