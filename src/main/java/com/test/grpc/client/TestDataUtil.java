package com.test.grpc.client;

import com.test.grpc.services.Book;
import com.test.grpc.services.BookType;

import java.util.LinkedList;
import java.util.List;

public class TestDataUtil {

    private static List<Book> grpcBookList = new LinkedList<>();

    static {

        for (int i = 0; i < 10; i++) {
            Book.Builder builder = Book.newBuilder()
                    .setISBN("ISBN " + i)
                    .setAuthor("Author " + i)
                    .setBookType(BookType.BOOK)
                    .setPage((int)(Math.random() * 100))
                    .setTitle("Title " + i);

            for (int j = 0; j < 3; j++) {
                builder.addKeyword("keyword - " + i + " - " + j);
            }
            grpcBookList.add(builder.build());
        }

    }

    public static List<Book> getGrpcTestData() {
        return grpcBookList;
    }

}
