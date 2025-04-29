import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// import somepackage.PropertyDef;

@Entity
@Table(name = "T_MARKET_COMPETITOR_PRODUCT_INFO")
public class CompetitorProductInfo {

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

    @Column(name = "PRODUCT_NAME", length = 256)
    @PropertyDef(label = "产品名称")
    private String productName;

    @Column(name = "PRODUCT_TYPE", length = 100)
    @PropertyDef(label = "产品类型")
    private String productType;

    @Column(name = "DEVELOPMENT_STATUS", length = 256)
    @PropertyDef(label = "在研在产状态")
    private String developmentStatus;

    @Column(name = "PRODUCT_DESCRIPTION", length = 2560)
    @PropertyDef(label = "产品描述")
    private String productDescription;

    @Column(name = "PRODUCT_PIC", length = 256)
    @PropertyDef(label = "产品图片")
    private String productPic;

    @Column(name = "SCENARIOS", length = 256)
    @PropertyDef(label = "应用场景")
    private String scenarios;

    @Column(name = "ASSEMBLY_OBJECT", length = 256)
    @PropertyDef(label = "装机对象")
    private String assemblyObject;

    @Column(name = "DELIVERY_SITUATION", length = 2560)
    @PropertyDef(label = "交付情况")
    private String deliverySituation;

    @Column(name = "RESEARCH_INSTITUTE_CONCURRENCY_PRODUCTS", length = 256)
    @PropertyDef(label = "研究所竞争关联产品")
    private String researchInstituteConcurrencyProducts;


    // Getters and Setters would typically be included here
}
