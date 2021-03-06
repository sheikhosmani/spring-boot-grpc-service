// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookService.proto

package com.test.grpc.services;

/**
 * Protobuf enum {@code com.test.grpc.services.BookType}
 */
public enum BookType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BOOK = 0;</code>
   */
  BOOK(0),
  /**
   * <code>NEWS_PAPER = 1;</code>
   */
  NEWS_PAPER(1),
  /**
   * <code>COMIC_BOOK = 2;</code>
   */
  COMIC_BOOK(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BOOK = 0;</code>
   */
  public static final int BOOK_VALUE = 0;
  /**
   * <code>NEWS_PAPER = 1;</code>
   */
  public static final int NEWS_PAPER_VALUE = 1;
  /**
   * <code>COMIC_BOOK = 2;</code>
   */
  public static final int COMIC_BOOK_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static BookType valueOf(int value) {
    return forNumber(value);
  }

  public static BookType forNumber(int value) {
    switch (value) {
      case 0: return BOOK;
      case 1: return NEWS_PAPER;
      case 2: return COMIC_BOOK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BookType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BookType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BookType>() {
          public BookType findValueByNumber(int number) {
            return BookType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.test.grpc.services.BookServiceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final BookType[] VALUES = values();

  public static BookType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BookType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.test.grpc.services.BookType)
}

