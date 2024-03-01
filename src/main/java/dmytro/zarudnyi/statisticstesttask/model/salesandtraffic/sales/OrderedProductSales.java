package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sales")
public class OrderedProductSales extends Sales {
}
