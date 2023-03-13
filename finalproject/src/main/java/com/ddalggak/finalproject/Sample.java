package com.ddalggak.finalproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Tag(name = "스웨거 테스트", description = "스웨거 테스트 api")
@RestController

public class Sample {
//    @Operation(summary = "get swagger", description = "스웨거 get 메서드 체크")
//    @GetMapping("/get")
@RequestMapping("/sample")
    public String greeting(){
        return "sample!";
    }
}
