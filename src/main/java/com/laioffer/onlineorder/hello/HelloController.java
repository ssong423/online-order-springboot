package com.laioffer.onlineorder.hello;

import net.datafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    // 不可以有两个function的mapping一样（ambiguous）
    @GetMapping("/hello")
//    public String sayHello() {
//        Faker faker = new Faker();
//        String name = faker.name().fullName();
//        String company = faker.company().name();
//        String street = faker.address().streetAddress();
//        String city = faker.address().city();
//        String state = faker.address().state();
//        String bookTitle = faker.book().title();
//        String bookAuthor = faker.book().author();
//
//
//        String template = "This is %s. I work at %s. I live at %s in %s %s. My favorite book is %s by %s.";
//        return template.formatted(
//                name,
//                company,
//                street,
//                city,
//                state,
//                bookTitle,
//                bookAuthor
//        );
//
//    }
//    public Person sayHello() {
//        Faker faker = new Faker();
//        String name = faker.name().fullName();
//        String company = faker.company().name();
//        String street = faker.address().streetAddress();
//        String city = faker.address().city();
//        String state = faker.address().state();
//        String bookTitle = faker.book().title();
//        String bookAuthor = faker.book().author();
//
//
//        return new Person(name, company, new Address(street, city, state, null), new Book(bookTitle, bookAuthor));
//    }

    public Person sayHello(@RequestParam(required = false) String name) {
        if (name == null) {
            name = "Guest";
        }
        Faker faker = new Faker();
        String company = faker.company().name();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String bookTitle = faker.book().title();
        String bookAuthor = faker.book().author();


        return new Person(name, company, new Address(street, city, state, null), new Book(bookTitle, bookAuthor));
    }



@GetMapping("/goodbye")
    public String sayGoodBye() {
        return "Goodbye World!";
    }

}
