package util;

import model.domain.Document;

public class PrintSimulator {
    public static void main(String[] args) {
        Printer printer = new Printer();

        //Generating docs with different priorities
        Document doc1 = new Document("Documento1", "Contenido1", 1);
        Document doc2 = new Document("Documento2", "Contenido2", 2);
        Document doc3 = new Document("Documento3", "Contenido3", 3);

        // Setting them as threads then sending them to printer
        Thread threadDoc1 = new Thread(() -> printer.printDocument(doc1));
        Thread threadDoc2 = new Thread(() -> printer.printDocument(doc2));
        Thread threadDoc3 = new Thread(() -> printer.printDocument(doc3));

        // Assign priorities to the threads based on the Document priority
        threadDoc1.setPriority(doc1.getPriority());
        threadDoc2.setPriority(doc2.getPriority());
        threadDoc3.setPriority(doc3.getPriority());

        // Start the printing threads
        threadDoc1.start();
        threadDoc2.start();
        threadDoc3.start();
    }
}
