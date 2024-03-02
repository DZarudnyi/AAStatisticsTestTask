package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.SalesBy;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sales_by")
public class SalesByAsin extends SalesBy {
}
