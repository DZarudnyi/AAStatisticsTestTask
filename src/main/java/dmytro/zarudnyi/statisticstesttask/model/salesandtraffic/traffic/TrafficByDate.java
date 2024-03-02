package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.traffic;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "traffic")
public class TrafficByDate extends Traffic {
    private Long averageOfferCount;
    private Long averageParentItems;
    private Long feedbackReceived;
    private Long negativeFeedbackReceived;
    private Long receivedNegativeFeedbackRate;
    private float orderItemSessionPercentage;
    private float orderItemSessionPercentageB2B;
}
