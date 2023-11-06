package org.example;
import org.jsoup.*;
import org.jsoup.nodes.Document;

import java.io.IOException;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        Document document = Jsoup.connect("https://300.ya.ru/").get();

    }
}