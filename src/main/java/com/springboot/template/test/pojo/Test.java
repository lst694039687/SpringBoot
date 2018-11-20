package com.springboot.template.test.pojo;

public class Test {
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("test{");
        sb.append("test='").append(test).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
