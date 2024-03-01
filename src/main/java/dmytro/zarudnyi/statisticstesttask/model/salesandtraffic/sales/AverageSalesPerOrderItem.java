package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.Sales;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sales")
public class AverageSalesPerOrderItem extends Sales {
}
