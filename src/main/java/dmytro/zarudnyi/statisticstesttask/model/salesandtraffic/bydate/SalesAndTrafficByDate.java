package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.bydate;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.traffic.TrafficByDate;
import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sales_and_traffic_by_date")
public class SalesAndTrafficByDate {
    @Id
    private String id;
    private Date date;
    private SalesByDate salesByDate;
    private TrafficByDate trafficByDate;
}
