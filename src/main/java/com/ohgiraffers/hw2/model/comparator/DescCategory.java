package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {

  @Override
  public int compare(BookDTO b1, BookDTO b2) {
    int result = 0;

    if (b1.getCategory() > b2.getCategory()) {
      result = -1;
    } else if (b1.getCategory() < b2.getCategory()) {
      result = 1;
    } else {
      result = 0;
    }
    return result;
  }


}
