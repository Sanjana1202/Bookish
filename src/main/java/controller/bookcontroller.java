package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bookcontroller {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("book_register")
    public String bookRegister(){
        return "bookregister";
    }
    @GetMapping("/available_book")
    public String availableBook(){
        return "bookList";
    }
}
