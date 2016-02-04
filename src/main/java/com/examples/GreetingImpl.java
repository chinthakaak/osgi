package com.examples;

/**
 * Created by ka40215 on 2/3/16.
 */
public class GreetingImpl implements Greeting {
    final String m_name;
    GreetingImpl(String name) {
        m_name = name;
    }
    public void sayHello() {
        System.out.println("Hello, " + m_name + "!");
    }
}

