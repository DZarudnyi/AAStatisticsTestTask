package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.traffic;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "traffic")
public class TrafficByAsin extends Traffic {
    private float browserSessionPercentage;
    private float browserSessionPercentageB2B;
    private float mobileAppSessionPercentage;
    private float mobileAppSessionPercentageB2B;
    private float sessionPercentage;
    private  float sessionPercentageB2B;
    private float browserPageViewsPercentage;
    private float browserPageViewsPercentageB2B;
    private float mobileAppPageViewsPercentage;
    private float mobileAppPageViewsPercentageB2B;
    private float pageViewsPercentage;
    private float pageViewsPercentageB2B;
}
