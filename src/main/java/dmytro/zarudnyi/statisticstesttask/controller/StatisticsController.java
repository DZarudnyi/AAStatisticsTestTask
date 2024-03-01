package dmytro.zarudnyi.statisticstesttask.controller;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin.SalesAndTrafficByAsin;
import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.bydate.SalesAndTrafficByDate;
import dmytro.zarudnyi.statisticstesttask.service.sales.byasin.SalesAndTrafficByAsinService;
import dmytro.zarudnyi.statisticstesttask.service.sales.bydate.SalesAndTrafficByDateService;
import java.util.Date;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/statistics")
public class StatisticsController {
    private final SalesAndTrafficByDateService salesAndTrafficByDateService;
    private final SalesAndTrafficByAsinService salesAndTrafficByAsinService;

    @GetMapping("/date")
    public List<SalesAndTrafficByDate> getStatisticsForAllTime() {
        return salesAndTrafficByDateService.findAll();
    }
    @GetMapping("/date")
    public List<SalesAndTrafficByDate> getStatisticsBySelectedDate(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date
    ) {
        return salesAndTrafficByDateService.findByDate(date);
    }

    @GetMapping("/asin")
    public List<SalesAndTrafficByAsin> getStatisticsForAllAsin() {
        return salesAndTrafficByAsinService.findAll();
    }

    @GetMapping("/asin")
    public List<SalesAndTrafficByAsin> getStatisticsBySelectedAsins(@RequestParam("asin") String asin) {
        return salesAndTrafficByAsinService.findByAsin(asin);
    }
}
