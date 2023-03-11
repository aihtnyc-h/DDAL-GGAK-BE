package com.ddalggak.finalproject.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessCode {
    //todo 상세코드 작성

    /*200 OK : 에러 없이 전송 성공*/


    /*201 CREATED : REQUEST COMPLETE, RESOURCE SUCCESSFULLY CREATED*/
    CREATED_SUCCESSFULLY(HttpStatus.CREATED, "successfully joined")
    ;

    private final HttpStatus httpStatus;
    private final String detail;
}
