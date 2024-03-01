package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.traffic.TrafficByAsin;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sales_and_traffic_by_asin")
public class SalesAndTrafficByAsin {
    @Id
    private String id;
    private String parentAsin;
    private SalesByAsin salesByAsin;
    private TrafficByAsin trafficByAsin;
}
