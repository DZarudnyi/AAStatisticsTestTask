package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.byasin;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.SalesBy;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sales_by")
public class SalesByAsin extends SalesBy {
}
