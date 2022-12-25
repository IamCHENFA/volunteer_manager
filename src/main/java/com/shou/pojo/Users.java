package com.shou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 11937
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private String account;
    private String password;
    private String identity;
}
