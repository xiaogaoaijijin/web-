package com.Main.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kaoqin {
    private Integer id;
    private String name;
    private String shangban;
    private String xiaban;
    private Short chidao;
    private Short zaotui;
    private String mounth;
    private Integer jifen;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}