package com.example.graphqlmusicstoremaven.generated.datafetchers;

import com.example.graphqlmusicstoremaven.generated.types.Book;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class GetAllBooksDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "getAllBooks"
  )
  public List<Book> getGetAllBooks(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
