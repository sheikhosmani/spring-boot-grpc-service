// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookService.proto

package com.test.grpc.services;

public final class BookServiceOuterClass {
  private BookServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_test_grpc_services_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_test_grpc_services_Book_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_test_grpc_services_BookList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_test_grpc_services_BookList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BookService.proto\022\026com.test.grpc.servi" +
      "ces\"\206\001\n\004Book\022\014\n\004ISBN\030\001 \001(\t\022\r\n\005title\030\002 \001(" +
      "\t\022\016\n\006author\030\003 \001(\t\022\014\n\004page\030\004 \001(\005\022\017\n\007keywo" +
      "rd\030\005 \003(\t\0222\n\010bookType\030\006 \001(\0162 .com.test.gr" +
      "pc.services.BookType\"6\n\010BookList\022*\n\004book" +
      "\030\001 \003(\0132\034.com.test.grpc.services.Book*4\n\010" +
      "BookType\022\010\n\004BOOK\020\000\022\016\n\nNEWS_PAPER\020\001\022\016\n\nCO" +
      "MIC_BOOK\020\0022`\n\013BookService\022Q\n\013createBooks" +
      "\022 .com.test.grpc.services.BookList\032 .com" +
      ".test.grpc.services.BookListB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_test_grpc_services_Book_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_test_grpc_services_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_test_grpc_services_Book_descriptor,
        new java.lang.String[] { "ISBN", "Title", "Author", "Page", "Keyword", "BookType", });
    internal_static_com_test_grpc_services_BookList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_test_grpc_services_BookList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_test_grpc_services_BookList_descriptor,
        new java.lang.String[] { "Book", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}