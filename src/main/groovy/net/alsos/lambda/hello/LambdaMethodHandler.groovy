package net.alsos.lambda.hello

import com.amazonaws.services.lambda.runtime.Context

class LambdaMethodHandler {
    String handleRequest(input, Context context) {
        context.getLogger().log("Input: $input")
        "Hello there ${input.firstName} ${input.lastName}"
    }
}
