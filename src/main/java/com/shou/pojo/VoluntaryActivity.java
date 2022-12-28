package com.shou.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoluntaryActivity {

    private int vid;
    private String vName;
    private String managementTeacherAccount;
    private String vInfo;

}
