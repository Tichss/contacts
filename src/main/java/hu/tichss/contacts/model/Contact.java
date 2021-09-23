package hu.tichss.contacts.model;


import lombok.Data;
import java.util.Date;


@Data

public class Contact {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private Date birthDate;
    private Date createdAt;
}
