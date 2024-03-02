package dmytro.zarudnyi.statisticstesttask.service.sales.bydate;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.bydate.SalesAndTrafficByDate;
import java.util.Date;
import java.util.List;

public interface SalesAndTrafficByDateService {
    List<SalesAndTrafficByDate> findAll();

    List<SalesAndTrafficByDate> findByDate(Date date);

    List<SalesAndTrafficByDate> findByDateBetween(Date dateStart, Date dateEnd);
}
