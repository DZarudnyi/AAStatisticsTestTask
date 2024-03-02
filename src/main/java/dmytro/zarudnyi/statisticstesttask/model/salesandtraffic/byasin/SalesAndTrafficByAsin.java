package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.traffic.TrafficByAsin;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sales_and_traffic_by_asin")
public class SalesAndTrafficByAsin {
    @Id
    private String id;
    private String parentAsin;
    private SalesByAsin salesByAsin;
    private TrafficByAsin trafficByAsin;
}
