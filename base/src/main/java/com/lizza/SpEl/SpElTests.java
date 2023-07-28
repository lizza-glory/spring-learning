package com.lizza.SpEl;

import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class SpElTests {

    private final static ExpressionParser PARSER = new SpelExpressionParser();

    private final static SimpleEvaluationContext CONTEXT = SimpleEvaluationContext.forReadWriteDataBinding().build();

    @Test
    public void test1() throws Exception {
        Record record = Record.builder().applicationId(12345678L).build();
        String spEl = "#root.${applicationId}";
        Object value = PARSER.parseExpression(spEl).getValue(CONTEXT, record, Object.class);
        System.out.println(value);
    }
}
