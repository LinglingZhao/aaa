import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_MARKET_CUSTOMER_PRODUCT_INFO")
public class CustomerProductInfo {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "ORDER_NUM")
    @PropertyDef(label = "序号")
    private int orderNum;

    @Column(name = "FULL_UNIT_NAME", length = 256)
    @PropertyDef(label = "单位全称")
    private String fullUnitName;

    @Column(name = "PRODUCT_NAME", length = 256)
    @PropertyDef(label = "产品名称")
    private String productName;

    @Column(name = "PRODUCT_TYPE", length = 256)
    @PropertyDef(label = "产品类型")
    private String productType;

    @Column(name = "PRODUCT_DESCRIPTION", length = 2048)
    @PropertyDef(label = "产品描述")
    private String productDescription;

    @Column(name = "PRODUCT_ASSEMBLY_POWER", length = 256)
    @PropertyDef(label = "产品配套动力")
    private String productAssemblyPower;

    // Getters and Setters would typically be included here
}
