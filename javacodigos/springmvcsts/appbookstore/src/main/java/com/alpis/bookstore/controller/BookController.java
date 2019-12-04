package com.alpis.bookstore.controller;

//import java.lang.annotation.Annotation;
import com.alpis.bookstore.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("list_book.html")
public class BookController {
 
@RequestMapping(method = RequestMethod.GET)
public ModelAndView bookListController() {
 BookService bookManager = new BookService();
 ModelAndView modelAndView = new ModelAndView("booklist");
 modelAndView.addObject("booklist", bookManager.getBookList());
 return modelAndView;

}
}
/*

 //import java.lang.annotation.Annotation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
import com.alpis.bookstore.service.BookService;
 
 public class BookController implements Controller{
 
 @Override
 public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
 BookService bookservice = new BookService();
ModelAndView modelAndView = new ModelAndView("booklist");
modelAndView.addObject("booklist", bookservice.getBookList());
return modelAndView;
}


}
 */