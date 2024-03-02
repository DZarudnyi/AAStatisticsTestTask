package dmytro.zarudnyi.statisticstesttask.service.sales.byasin;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin.SalesAndTrafficByAsin;
import dmytro.zarudnyi.statisticstesttask.repository.SalesAndTrafficByAsinRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalesAndTrafficByAsinServiceImpl implements SalesAndTrafficByAsinService {
    private final SalesAndTrafficByAsinRepository salesAndTrafficByAsinRepository;

    @Cacheable(value = "salesandtrafficbyasin")
    @Override
    public List<SalesAndTrafficByAsin> findAll() {
        return salesAndTrafficByAsinRepository.findAll();
    }

    @Cacheable(value = "salesandtrafficbyasin")
    @Override
    public List<SalesAndTrafficByAsin> findByAsin(String asin) {
        return salesAndTrafficByAsinRepository.findByParentAsin(asin);
    }
}
