package dmytro.zarudnyi.statisticstesttask.repository;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin.SalesAndTrafficByAsin;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesAndTrafficByAsinRepository
        extends MongoRepository<SalesAndTrafficByAsin, String> {
    List<SalesAndTrafficByAsin> findByParentAsin(String asin);

    List<SalesAndTrafficByAsin> findByParentAsinIn(List<String> asins);
}
