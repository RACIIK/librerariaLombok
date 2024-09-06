 package com.lombok.app;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.java.Log;

import java.time.LocalDate;
import java.util.Objects;

@Data
@AllArgsConstructor()
@NoArgsConstructor
@FieldDefaults (level = AccessLevel.PUBLIC)
@Builder
@Log
public class Person {

     Long id ;
     String name;
     String lastname;
     String email;
     Integer age;
     Integer phoneNumber;
     LocalDate dateOfBirth;
}
