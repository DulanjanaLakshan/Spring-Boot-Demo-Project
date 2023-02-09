package me.dulanjana.demo.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String username;
    private String password;
}
