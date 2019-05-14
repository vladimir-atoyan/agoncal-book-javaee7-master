package org.arquillian.example;

import java.io.PrintStream;

import javax.inject.Inject;

/**
 * A component for creating personal greetings.
 */
public class Greeter {
//    public void greet(PrintStream to, String name) {
//        to.println(createGreeting(name));
//    }
//
//    public String createGreeting(String name) {
//        return "Hello, " + name + "!";
//    }
    
    private PhraseBuilder phraseBuilder;

    @Inject
    public Greeter(PhraseBuilder phraseBuilder) {
        this.phraseBuilder = phraseBuilder;
    }

    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return phraseBuilder.buildPhrase("hello", name);
    }
    
}