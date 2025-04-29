import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// import somepackage.PropertyDef;

@Entity
@Table(name = "T_MARKET_COMPETITOR_TYPE")
public class CompetitorType {

    @Id
    @Column(name = "ID", length = 36)
    @PropertyDef(label = "id")
    private String id;

    @Column(name = "ORDER_NUM")
    @PropertyDef(label = "序号")
    private int orderNum;

    @Column(name = "FULL_UNIT_NAME", length = 256)
    @PropertyDef(label = "单位全称")
    private String fullUnitName;

    @Column(name = "COMPETITOR_TYPE", length = 256)
    @PropertyDef(label = "竞争类型")
    private String competitorType;

    @Column(name = "MODEL_TYPE", length = 256)
    @PropertyDef(label = "型号类型")
    private String modelType;

    @Column(name = "RADAR_CHART", length = 256)
    @PropertyDef(label = "雷达图")
    private String radarChart;

    // Getters and Setters would typically be included here
}
