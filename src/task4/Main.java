package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String key= br.readLine();
        if (key.equals("pro")){
            DocumentWorker proVersion = new ProDocumentWorker();
            System.out.println("proVersion");
            proVersion.openDocument();
            proVersion.editDocument();
            proVersion.saveDocument();
        } else if (key.equals("exp")){
            DocumentWorker expVersion= new ExpertDocumentWorker();
            System.out.println("expVersion");
            expVersion.openDocument();
            expVersion.editDocument();
            expVersion.saveDocument();
        } else {
            DocumentWorker freeVersion = new DocumentWorker();
            System.out.println("freeVersion");
            freeVersion.openDocument();
            freeVersion.editDocument();
            freeVersion.saveDocument();
        }
    }
}
