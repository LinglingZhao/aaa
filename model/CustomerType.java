import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_MARKET_CUSTOMER_TYPE")
public class CustomerType {

    @Id
    @Column(name = "ID", length = 36)
    private String id;

    @Column(name = "ORDER_NUM")
    @PropertyDef(label = "序号")
    private int orderNum;

    @Column(name = "FULL_UNIT_NAME", length = 256)
    @PropertyDef(label = "单位全称")
    private String fullUnitName;

    @Column(name = "CUSTOMER_TYPE", length = 256)
    @PropertyDef(label = "客户类型")
    private String customerType;

    @Column(name = "MODEL_TYPE", length = 256)
    @PropertyDef(label = "型号类型")
    private String modelType;

    @Column(name = "RADAR_CHART", length = 256)
    @PropertyDef(label = "雷达图")
    private String radarChart;

    // Getters and Setters would typically be included here
}
