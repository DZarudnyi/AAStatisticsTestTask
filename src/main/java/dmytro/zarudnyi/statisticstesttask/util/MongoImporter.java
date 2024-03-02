package dmytro.zarudnyi.statisticstesttask.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoImporter {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private static MongoTemplate mongoTemplate;

    public static void importDocumentsFromJsonFile(File file, String collectionName) {
        //Read each line of the json file. Each file is one observation document.
        List observationDocuments = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file.getPath()));) {
            String line;
            while ((line = br.readLine()) != null) {
                observationDocuments.add(Document.parse(line));
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
        mongoTemplate.getCollection(collectionName).insertMany(observationDocuments);
    }
}
