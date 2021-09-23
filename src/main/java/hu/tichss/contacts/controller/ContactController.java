package hu.tichss.contacts.controller;

import hu.tichss.contacts.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@Slf4j
@RequestMapping("/contact")
public class ContactController {


    @GetMapping("/create")
    public String showContactCreateForm(Contact contact){
        return "contact-create";
    }

    @PostMapping("/create")
    public String createContact(Contact contact){
        log.info(contact.toString());
        return "contact-create";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

}
