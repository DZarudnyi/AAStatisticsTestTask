package dmytro.zarudnyi.statisticstesttask.service.sales.byasin;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin.SalesAndTrafficByAsin;
import java.util.List;

public interface SalesAndTrafficByAsinService {
    List<SalesAndTrafficByAsin> findAll();

    List<SalesAndTrafficByAsin> findByAsin(String asin);

    List<SalesAndTrafficByAsin> findByAsinIn(List<String> asins);
}
