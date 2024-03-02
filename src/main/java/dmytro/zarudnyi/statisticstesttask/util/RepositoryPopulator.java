package dmytro.zarudnyi.statisticstesttask.util;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@EnableMongoRepositories
@ComponentScan
public class RepositoryPopulator {
//    @Autowired
//    private static final MongoTemplate mongoTemplate;

    public @Bean Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
        Resource sourceData = new ClassPathResource("test_report.json");
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[]{sourceData});
        return factory;
    }

//    public static void importDocumentsFromJsonFile(String fileName, String collectionName) {
//        File file = new File(fileName);
//        //Read each line of the json file. Each file is one observation document.
//        List observationDocuments = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(file.getPath()));) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                observationDocuments.add(Document.parse(line));
//            }
//        } catch (IOException ex) {
//            ex.getMessage();
//        }
//        mongoTemplate.getCollection(collectionName).insertMany(observationDocuments);
//    }
}
