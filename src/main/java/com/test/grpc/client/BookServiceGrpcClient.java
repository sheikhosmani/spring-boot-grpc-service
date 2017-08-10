package com.test.grpc.client;

import com.test.grpc.services.Book;
import com.test.grpc.services.BookList;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.test.grpc.services.BookServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookServiceGrpcClient {


    private Logger logger = LoggerFactory.getLogger(BookServiceGrpcClient.class);

    private BookServiceGrpc.BookServiceBlockingStub bookServiceBlockingStub;

    public BookList createBooks(List<Book> bookList) {

        BookList.Builder builder = BookList.newBuilder();
        bookList.forEach(builder::addBook);
        BookList request = builder.build();

        if (logger.isDebugEnabled()) {
            logger.debug("Request " + request);
        }
        BookList response = bookServiceBlockingStub.createBooks(request);
        if (logger.isDebugEnabled()) {
            logger.debug("Response " + response);
        }
        return response;

    }

    @PostConstruct
    private void initializeClient() {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 7565)
                .usePlaintext(true)
                .build();

        bookServiceBlockingStub = BookServiceGrpc.newBlockingStub(channel);
    }

}
