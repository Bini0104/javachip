package com.ohgiraffers.test.controller;

import com.ohgiraffers.hw2.model.comparator.AscCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager {

  //기본 생성자 - ArrayList<BookDTO> 인스턴스 생성
  public BookManager(){
    List<BookDTO> bookDTOList = new ArrayList<BookDTO>();
  }

  ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();

  // 전달받은 BookDTO 객체를 생성자시 선언한 ArrayList객체에 추가
  public void addBook(BookDTO book) {
    this.bookList.add(new BookDTO(book.getCategory(), book.getTitle(), book.getAuthor()));
    this.bookList.sort(new AscCategory());
    for (BookDTO bookDTO : bookList) {
      System.out.println( "bookList after add : " + bookDTO);
    }
  }

  //전달받은 도서 번호로 ArrayList 안에 있는 정보 삭제
  public void deleteBook(int index) {
    this.bookList.remove(index);
    for (BookDTO bookDTO : bookList) {
      System.out.println( "bookList after delete : " + bookDTO);
    }
  }

  //전달받은 도서 제목으로 도서를 검색하고 결과값 반환
  public int searchBook(String bTitle) {
    int bookCount = 0;

    for (int i = 0; i < this.bookList.size(); i++) {
      if (this.bookList.get(i).getTitle().equals(bTitle)) {
        bookCount++;
      }
    }
    return bookCount;
  }

  //전달받은 인덱스에 있는 도서정보 출력
  public void printBook(int index) {
    System.out.println(this.bookList.get(index));
  }

  //도서 목록 전체 출력
  public void displayAll() {
    System.out.println( "현재 전체 도서 목록 : " + this.bookList.size() + "권 입니다.");

    this.printBookList(this.bookList);
  }

  // 전달받은 (도서? 카테고리?)번호를 기준으로 해당 카테고리순으로 정렬해서 ArrayList<BookDTO>에 담아서 리턴
  public ArrayList<BookDTO> sortedBookList(int select) { //입력받은 번호에 해당하는 카테고리 도서 목록만 출력
    //정렬 관련 메소드 호출 필요
    ArrayList<BookDTO> sortedList = new ArrayList<>();
    // 매개변수 select가 카테고리라면
    // 1. 입력한 번호에 해당하는 카테고리 도서 목록에 접근
    //this.bookList.get()
    System.out.println("입력한 번호 : " + select + "이고, 해당 카테고리 : " + (select == 1 ? "인문" : select == 2 ? "자연과학" : select == 3 ? "의료" : "기타")+"입니다. ");
    for (int i = 0; i < this.bookList.size(); i++) {

      if (this.bookList.get(i).getCategory() == select) { //true or false
        sortedList.add(this.bookList.get(i));
      }
    }
    return sortedList;
  }

  // 전달받은 ArrayList<BookDTO>를 향상된 for문을 이용하여 출력
  public void printBookList(ArrayList<BookDTO> br) {
    br.sort(new AscCategory());
    for (BookDTO book : br) {
      System.out.println(book);
    }
  }
}