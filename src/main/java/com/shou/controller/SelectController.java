package com.shou.controller;

import com.shou.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SelectController {
    @Autowired
    @Qualifier("selectServiceImpl")
    private SelectService selectService;
}
