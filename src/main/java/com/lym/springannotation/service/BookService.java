package com.lym.springannotation.service;

import com.lym.springannotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {

//    @Qualifier("bookDao")
//    @Autowired(required = false)
    @Resource(name = "bookDao2")
    private BookDao bookDao;
    public void print() {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" + "bookDao2=" + bookDao + '}';
    }
}
