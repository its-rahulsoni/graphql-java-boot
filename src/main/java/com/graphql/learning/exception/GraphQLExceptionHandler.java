package com.graphql.learning.exception;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolver;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class GraphQLExceptionHandler implements DataFetcherExceptionResolver {

    @Override
    public Mono<List<GraphQLError>> resolveException(Throwable exception, DataFetchingEnvironment env) {
        if (exception instanceof UserNotFoundException e) {
            GraphQLError error = GraphqlErrorBuilder.newError(env)
                    .message(e.getMessage())
                    .errorType(ErrorType.BAD_REQUEST)
                    .build();

            return Mono.just(List.of(error));
        }

        // For unhandled exceptions, fall back to default behavior
        return Mono.empty();
    }
}
