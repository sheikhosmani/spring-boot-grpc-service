package com.test.grpc;

import com.test.grpc.services.BookList;
import io.grpc.stub.StreamObserver;
import com.test.grpc.services.BookServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GRpcService
public class BookGrpcService extends BookServiceGrpc.BookServiceImplBase {

    private Logger logger = LoggerFactory.getLogger(BookGrpcService.class);

    @Override
    public void createBooks(BookList request, StreamObserver<BookList> responseObserver) {
        logger.debug("Request " + request);

        BookList.Builder responseBuilder = BookList.newBuilder();

        request.getBookList().forEach(responseBuilder::addBook);

        BookList bookListResponse = responseBuilder.build();

        logger.debug("Response " + bookListResponse);

        responseObserver.onNext(bookListResponse);
        responseObserver.onCompleted();
    }

}
