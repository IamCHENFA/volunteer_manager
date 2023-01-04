package com.shou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActScInfo {
//    活动和选择的混合类，方便查询
    private int vid;
    private String vName;
    private String tAccount;
    private int score;

}
