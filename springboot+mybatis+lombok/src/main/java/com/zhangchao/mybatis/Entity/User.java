package com.zhangchao.mybatis.Entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String id;
    private String name;
    private int age;
    private int gender;
    private BankCard bankCard;
}
