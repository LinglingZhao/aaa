import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// import somepackage.PropertyDef;

@Entity
@Table(name = "T_MARKET_CUSTOMER_INFO")
public class CustomerInfo {

    @Id
    private int id;

    @Column(name = "ORDER_NUM")
    @PropertyDef(label = "序号")
    private int orderNum;

    @Column(name = "BELONGING_GROUP", length = 256)
    @PropertyDef(label = "隶属集团")
    private String belongingGroup;

    @Column(name = "FULL_UNIT_NAME", length = 256)
    @PropertyDef(label = "单位全称")
    private String fullUnitName;

    @Column(name = "ABBREVIATION", length = 256)
    @PropertyDef(label = "单位简称")
    private String abbreviation;

    @Column(name = "RESPONSIBLE_PERSON", length = 256)
    @PropertyDef(label = "负责人")
    private String responsiblePerson;

    @Column(name = "PRIMARY_OPERATION_DOMAIN", length = 256)
    @PropertyDef(label = "所属主要运营领域")
    private String primaryOperationDomain;

    @Column(name = "UNIT_CODE", length = 256)
    @PropertyDef(label = "单位编号")
    private String unitCode;

    @Column(name = "PRIMARY_OPERATION_MODEL", length = 256)
    @PropertyDef(label = "所属主要运营机型")
    private String primaryOperationModel;

    @Column(name = "REGIONAL_AREA", length = 256)
    @PropertyDef(label = "片区")
    private String regionalArea;

    @Column(name = "PROVINCE", length = 256)
    @PropertyDef(label = "省份")
    private String province;

    @Column(name = "MUNICIPALITY", length = 256)
    @PropertyDef(label = "地市")
    private String municipality;

    @Column(name = "CUSTOMER_NATURE", length = 256)
    @PropertyDef(label = "客户性质")
    private String customerNature;

    @Column(name = "CUSTOMER_TYPE", length = 256)
    @PropertyDef(label = "客户类型")
    private String customerType;

    @Column(name = "IS_COMPETITION", length = 256)
    @PropertyDef(label = "是否竞争")
    private String isCompetition;

    @Column(name = "COMPETITORS", length = 256)
    @PropertyDef(label = "竞争对手")
    private String competitors;

    @Column(name = "REGISTERED_CAPITAL_MILLION_YUAN", length = 256)
    @PropertyDef(label = "注册资本 (万元)")
    private String registeredCapitalMillionYuan;

    @Column(name = "ENTERPRISE_SIZE", length = 600)
    @PropertyDef(label = "企业规模")
    private String enterpriseSize;

    @Column(name = "BUSINESS_DOMAIN", length = 600)
    @PropertyDef(label = "业务领域")
    private String businessDomain;

    @Column(name = "ENTERPRISE_PROFILE", length = 800)
    @PropertyDef(label = "企业简介")
    private String enterpriseProfile;

    @Column(name = "IS_CONNECT", length = 256)
    @PropertyDef(label = "是否对接")
    private String isConnect;

    @Column(name = "CONNECTION_ATTITUDE", length = 256)
    @PropertyDef(label = "对接态度")
    private String connectionAttitude;

    @Column(name = "NEGATIVE_REASONS", length = 500)
    @PropertyDef(label = "非积极态度主要原因")
    private String negativeReasons;

    @Column(name = "CONTACT_INFORMATION", length = 256)
    @PropertyDef(label = "联系方式")
    private String contactInformation;

    @Column(name = "DEPARTMENT_CONTACT", length = 256)
    @PropertyDef(label = "部门对接人")
    private String departmentContact;

    @Column(name = "VISIT_RECORD", length = 2560)
    @PropertyDef(label = "走访记录")
    private String visitRecord;

    @Column(name = "COOPERATION_AGREEMENT_STATUS", length = 1000)
    @PropertyDef(label = "合作协议情况")
    private String cooperationAgreementStatus;

    @Column(name = "SUBSEQUENT_ATTENTION", length = 2560)
    @PropertyDef(label = "后续关注")
    private String subsequentAttention;

    @Column(name = "EVALUATION_SCORE_1", length = 8)
    @PropertyDef(label = "评分1")
    private int evaluationScore1;

    @Column(name = "EVALUATION_SCORE_2", length = 8)
    @PropertyDef(label = "评分2")
    private int evaluationScore2;

    @Column(name = "EVALUATION_SCORE_3", length = 8)
    @PropertyDef(label = "评分3")
    private int evaluationScore3;

    @Column(name = "EVALUATION_SCORE_4", length = 8)
    @PropertyDef(label = "评分4")
    private int evaluationScore4;

    // Getters and Setters would typically be included here
}
