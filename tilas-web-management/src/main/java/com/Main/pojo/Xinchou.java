package com.Main.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Xinchou {
    private Integer id;
    private String name;
    private Integer jiben;
    private Integer gangwei;
    private Integer jixiao;
    private Integer yingfa;
    private Integer shebao;
    private Integer gongji;
    private Integer shifa;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}

