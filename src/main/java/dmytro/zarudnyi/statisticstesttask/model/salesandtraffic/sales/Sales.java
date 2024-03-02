package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.CurrencyCode;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection =  "sales")
public class Sales {
    @Id
    private String id;
    private float amount;
    private CurrencyCode currencyCode;
}
