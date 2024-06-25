package com.example.graphqlmusicstoremaven.generated;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String CreateBook = "createBook";

    public static final String DeleteBookById = "deleteBookById";

    public static final String UpdateBookById = "updateBookById";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String GetAllBooks = "getAllBooks";

    public static final String GetBookById = "getBookById";
  }

  public static class BOOK {
    public static final String TYPE_NAME = "Book";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Desc = "desc";

    public static final String Author = "author";

    public static final String Price = "price";

    public static final String Pages = "pages";
  }

  public static class BOOKINPUT {
    public static final String TYPE_NAME = "BookInput";

    public static final String Title = "title";

    public static final String Desc = "desc";

    public static final String Author = "author";

    public static final String Price = "price";

    public static final String Pages = "pages";
  }
}
