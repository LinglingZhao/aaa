import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// import somepackage.PropertyDef;

@Entity
@Table(name = "T_MARKET_COMPETITOR_INFO")
public class CompetitorInfo {

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

    @Column(name = "REGIONAL_AREA", length = 256)
    @PropertyDef(label = "片区")
    private String regionalArea;

    @Column(name = "PROVINCE", length = 256)
    @PropertyDef(label = "省份")
    private String province;

    @Column(name = "MUNICIPALITY", length = 256)
    @PropertyDef(label = "地市")
    private String municipality;

    @Column(name = "BUSINESS_ATTRIBUTE", length = 256)
    @PropertyDef(label = "企业属性")
    private String businessAttribute;

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

    @Column(name = "TECHNICAL_ROUTE", length = 256)
    @PropertyDef(label = "技术路线")
    private String technicalRoute;

    @Column(name = "INDUSTRY_LAYOUT", length = 1024)
    @PropertyDef(label = "产业布局")
    private String industryLayout;

    @Column(name = "SUPPLY_CHAIN_COMPLEMENTARY", length = 512)
    @PropertyDef(label = "供应链配套")
    private String supplyChainComplementary;

    @Column(name = "FINANCIAL_INVESTMENT_INFORMATION", length = 256)
    @PropertyDef(label = "投融资情况")
    private String financialInvestmentInformation;

    @Column(name = "COOPERATION_WITH_OTHER_COMPANIES", length = 512)
    @PropertyDef(label = "其它合作")
    private String cooperationWithOtherCompanies;

    @Column(name = "OTHERS", length = 512)
    @PropertyDef(label = "其他情况")
    private String others;

    @Column(name = "CONCURRENT_ENTERPRISE_RATING", length = 32)
    @PropertyDef(label = "竞争企业评级")
    private String concurrentEnterpriseRating;

    @Column(name = "COMPETITION_FIELD", length = 256)
    @PropertyDef(label = "竞争领域")
    private String competitionField;

    @Column(name = "INDEX_OF_COMPETITIVENESS", length = 32)
    @PropertyDef(label = "竞争指数")
    private String indexOfCompetitiveness;

    // Getters and Setters would typically be included here
}
