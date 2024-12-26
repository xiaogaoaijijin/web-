//package com.Main.pojo;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Locale;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Student {
//    private Integer id;
//    private String username;
//    private String job;
//    private String image;
//    private String name;
//    private LocalDate workdate;
//    private Short address;
//}


package com.Main.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String username;
    private String job;
    private String image;
    private String name;
    private LocalDate workdate;
    private Short address;
}
