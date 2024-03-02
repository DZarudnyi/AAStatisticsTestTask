package dmytro.zarudnyi.statisticstesttask.service.sales.bydate;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.bydate.SalesAndTrafficByDate;
import dmytro.zarudnyi.statisticstesttask.repository.SalesAndTrafficByDateRepository;
import java.util.Date;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalesAndTrafficByDateServiceImpl implements SalesAndTrafficByDateService {
    private final SalesAndTrafficByDateRepository salesAndTrafficByDateRepository;

    @Cacheable(value = "salesandtrafficbydate")
    @Override
    public List<SalesAndTrafficByDate> findAll() {
        return salesAndTrafficByDateRepository.findAll();
    }

    @Cacheable(value = "salesandtrafficbydate")
    @Override
    public List<SalesAndTrafficByDate> findByDate(Date date) {
        return salesAndTrafficByDateRepository.findByDate(date);
    }
}
