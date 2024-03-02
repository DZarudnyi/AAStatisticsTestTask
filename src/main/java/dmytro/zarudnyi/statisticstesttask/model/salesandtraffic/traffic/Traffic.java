package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.traffic;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "traffic")
public class Traffic {
    @Id
    private String id;
    private Long browserPageViews;
    private Long browserPageViewsB2B;
    private Long mobileAppPageViews;
    private Long mobileAppPageViewsB2B;
    private Long pageViews;
    private Long pageViewsB2B;
    private Long browserSessions;
    private Long browserSessionsB2B;
    private Long mobileAppSessions;
    private Long mobileAppSessionsB2B;
    private Long sessions;
    private Long sessionsB2B;
    private float buyBoxPercentage;
    private float buyBoxPercentageB2B;
    private float unitSessionPercentage;
    private float unitSessionPercentageB2B;
}
