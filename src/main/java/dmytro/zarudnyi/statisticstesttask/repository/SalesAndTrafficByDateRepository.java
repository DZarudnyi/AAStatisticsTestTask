package dmytro.zarudnyi.statisticstesttask.repository;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.bydate.SalesAndTrafficByDate;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesAndTrafficByDateRepository
        extends MongoRepository<SalesAndTrafficByDate, String> {
    List<SalesAndTrafficByDate> findByDate(Date date);

    List<SalesAndTrafficByDate> findByDateBetween(Date dateStart, Date dateEnd);
}
