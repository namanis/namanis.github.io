package com.alpis.bookstore.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
 
 
import com.alpis.bookstore.model.Book;
 @Component
 public class BookValidator implements Validator {
 @Override
 public boolean supports(Class<?> clazz) {
 return Book.class.equals(clazz);
 }
 
 @Override
 public void validate(Object obj, Errors errors) {
 Book book = (Book)obj;
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookTitle", "field.required", "Campo exigido");
 if(!errors.hasFieldErrors("bookTitle")) {
 if(book.getBookTitle().isEmpty())
 errors.rejectValue("Title", "", "Cannot be left empty!");
 }
 }
 
 
 }