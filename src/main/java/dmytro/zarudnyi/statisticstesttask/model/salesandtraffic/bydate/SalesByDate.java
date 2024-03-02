package dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.bydate;

import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.AverageSalesPerOrderItem;
import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.AverageSalesPerOrderItemB2B;
import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.AverageSellingPrice;
import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.AverageSellingPriceB2B;
import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.ClaimsAmount;
import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.SalesBy;
import dmytro.zarudnyi.statisticstesttask.model.salesandtraffic.sales.ShippedProductSales;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sales_by")
public class SalesByDate extends SalesBy {
    private AverageSalesPerOrderItem averageSalesPerOrderItem;
    private AverageSalesPerOrderItemB2B averageSalesPerOrderItemB2B;
    private float averageUnitsPerOrderItem;
    private float averageUnitsPerOrderItemB2B;
    private AverageSellingPrice averageSellingPrice;
    private AverageSellingPriceB2B averageSellingPriceB2B;
    private int unitsRefunded;
    private float refundRate;
    private int claimsGranted;
    private ClaimsAmount claimsAmount;
    private ShippedProductSales shippedProductSales;
    private int unitsShipped;
    private int ordersShipped;
}
