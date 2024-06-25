package com.example.graphqlmusicstoremaven.generated.datafetchers;

import com.example.graphqlmusicstoremaven.generated.types.Book;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class GetBookByIdDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "getBookById"
  )
  public Book getGetBookById(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
