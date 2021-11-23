package com.example.mongospringapi;

import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.ValidationMessage;
import org.assertj.core.internal.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

class Sample extends BaseJsonSchemaValidatorTest {

    @Test
    void test() throws IOException {
       /* JsonSchema schema = getJsonSchemaFromStringContent("{\"enum\":[1, 2, 3, 4],\"enumErrorCode\":\"Not in the list\"}");
        JsonNode node = getJsonNodeFromStringContent("7");
        Set<ValidationMessage> errors = schema.validate(node);
        assertThat(errors.size(), is(1));
    */
        // With automatic version detection
        JsonNode schemaNode = getJsonNodeFromStringContent(
            "{\"$schema\": \"http://json-schema.org/draft-06/schema#\", \"properties\": { \"id\": {\"type\": \"number\"}}}");
        JsonSchema schema = getJsonSchemaFromJsonNodeAutomaticVersion(schemaNode);
        
        schema.initializeValidators(); // by default all schemas are loaded lazily. You can load them eagerly via
                                       // initializeValidators() 
        
        JsonNode node = getJsonNodeFromStringContent("{\"id\": \"2\"}");
        Set<ValidationMessage> errors = schema.validate(node);
        assertThat(errors.size(),is(1));
    }
}