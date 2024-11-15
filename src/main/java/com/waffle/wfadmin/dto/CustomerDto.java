package com.waffle.wfadmin.dto;

import lombok.Data;

import java.time.LocalDateTime;

public class CustomerDto {

    @Data
    public static class Request {
        private String loginId;
        private String password;
        private String name;
        private String birth;
    }

    @Data
    public static class Response {
        private Long id;
        private String loginId;
        private String password;
        private String name;
        private String birth;
        private LocalDateTime regDate;
    }
}
