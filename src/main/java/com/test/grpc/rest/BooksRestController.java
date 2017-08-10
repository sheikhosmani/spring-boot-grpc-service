package com.test.grpc.rest;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.test.grpc.client.TestDataUtil;
import com.test.grpc.client.BookServiceGrpcClient;
import com.test.grpc.services.BookList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksRestController {

    @Autowired
    BookServiceGrpcClient bookServiceGrpcClient;

    @RequestMapping(value = "/test_grpc", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> test() {
        BookList books = bookServiceGrpcClient.createBooks(TestDataUtil.getGrpcTestData());

        String jsonString = "";
        try {
            jsonString = JsonFormat.printer().print(books);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(jsonString, HttpStatus.OK);
    }

}
