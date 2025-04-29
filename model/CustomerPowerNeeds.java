import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// import somepackage.PropertyDef;

@Entity
@Table(name = "T_MARKET_CUSTOMER_POWER_NEEDS")
public class CustomerPowerNeeds {

    @Id
    @Column(name = "ID")
    @PropertyDef(label = "id")
    private int id;

    @Column(name = "ORDER_NUM")
    @PropertyDef(label = "序号")
    private int orderNum;

    @Column(name = "FULL_UNIT_NAME", length = 256)
    @PropertyDef(label = "单位全称")
    private String fullUnitName;

    @Column(name = "DOES_REQUIRE_POWER", length = 256)
    @PropertyDef(label = "动力是否需求")
    private String doesRequirePower;

    @Column(name = "POWER_TYPE", length = 256)
    @PropertyDef(label = "动力类型")
    private String powerType;

    @Column(name = "TECHNICAL_REQUISITION_OF_POWER", length = 2560)
    @PropertyDef(label = "动力技术需求")
    private String technicalRequisitionOfPower;

    @Column(name = "DEMAND_OF_POWER_QUANTITY", length = 256)
    @PropertyDef(label = "动力市场需求量 (台)")
    private String demandOfPowerQuantity;

    // Getters and Setters would typically be included here
}
