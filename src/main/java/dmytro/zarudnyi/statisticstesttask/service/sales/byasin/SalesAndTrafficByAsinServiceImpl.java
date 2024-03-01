package dmytro.zarudnyi.statisticstesttask.service.sales.byasin;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin.SalesAndTrafficByAsin;
import dmytro.zarudnyi.statisticstesttask.repository.SalesAndTrafficByAsinRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalesAndTrafficByAsinServiceImpl implements SalesAndTrafficByAsinService {
    private final SalesAndTrafficByAsinRepository salesAndTrafficByAsinRepository;

    @Override
    public List<SalesAndTrafficByAsin> findAll() {
        return salesAndTrafficByAsinRepository.findAll();
    }

    @Override
    public List<SalesAndTrafficByAsin> findByAsin(String asin) {
        return salesAndTrafficByAsinRepository.findByParentAsin(asinadd);
    }
}
