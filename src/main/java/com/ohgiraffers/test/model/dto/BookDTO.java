package com.ohgiraffers.test.model.dto;

public class BookDTO {

  private int bNo; // 도서 번호
  private int category; // 도서분류코드
  private String title; // 도서 제목
  private String author; // 도서 저자

  // 기본 생성자
  public BookDTO(){}

  // 카테고리, 제목, 저자
  public BookDTO(int category, String title, String author) {
    this.category = category;
    this.title = title;
    this.author = author;
  }

  // setter() 와 getter()

  // 도서 번호
  public void setbNo(int bNo) {
    this.bNo = bNo;
  }

  public int getbNo() {
    return this.bNo;
  }


  // 도서 분류코드
  public void setCategory(int category) {
    this.category = category;
  }

  public int getCategory() {
    return this.category;
  }

  // 도서 제목
  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle(){
    return this.title;
  }

  // 도서 저자
  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }

  //필드 값 문자열 합친 후 리턴 category 분류 별로 출력
  //1 : 인문 / 2 : 자연과학 / 3 : 의료 / 4 : 기타

  @Override
  public String toString() {
    return category +" : " + (category == 1 ? "인문" : category == 2 ? "자연과학" : category == 3 ? "의료" : "기타") +
            ", 도서 제목 : '" + title + '\'' +
            ", 도서 저자 : '" + author + '\'';
  }
}
