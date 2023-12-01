package util;

import model.domain.Document;

import java.util.Random;

public class Printer {

    /**
     * Method that simulates the printing of a Document
     * @param document - the Document to print
     */
    public void printDocument(Document document) {
        System.out.println("Starting print: " + document);
        try {
            Thread.sleep(new Random().nextInt(3000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Print completed: " + document);
    }
}
