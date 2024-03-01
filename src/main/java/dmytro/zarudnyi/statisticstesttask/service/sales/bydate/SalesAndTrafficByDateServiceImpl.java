package dmytro.zarudnyi.statisticstesttask.service.sales.bydate;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.bydate.SalesAndTrafficByDate;
import dmytro.zarudnyi.statisticstesttask.repository.SalesAndTrafficByDateRepository;
import java.util.Date;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalesAndTrafficByDateServiceImpl implements SalesAndTrafficByDateService {
    private final SalesAndTrafficByDateRepository salesAndTrafficByDateRepository;

    @Override
    public List<SalesAndTrafficByDate> findAll() {
        return salesAndTrafficByDateRepository.findAll();
    }

    @Override
    public List<SalesAndTrafficByDate> findByDate(Date date) {
        return salesAndTrafficByDateRepository.findByDate(date);
    }
}
