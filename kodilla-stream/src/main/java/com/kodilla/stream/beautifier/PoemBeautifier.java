package com.kodilla.stream.beautifier;

public class PoemBeautifier{
    public void beautify(String text, String deco, PoemDecorator decorator) {
        String result = decorator.decorate(deco);
        System.out.println(result + " " + text + " " + result);
    }

    public void beautifyToUpCase(String text, String deco, PoemDecorator decorator) {
        String result = decorator.decorate(deco);
        System.out.println(result.toUpperCase() + " " + text.toUpperCase() + " " + result.toUpperCase());
    }
}
