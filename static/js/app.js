// 初始化Vue应用
const { createApp } = Vue;

const app = createApp({
    data() {
        return {
            // 模拟客户数据
            customers: [
                {
                    id: 1,
                    orderNum: 1,
                    fullUnitName: "示例客户公司",
                    abbreviation: "示例客户",
                    regionalArea: "华东",
                    province: "江苏省",
                    municipality: "南京市",
                    businessAttribute: "国有企业",
                    registeredCapitalMillionYuan: "5000",
                    enterpriseSize: "大型",
                    businessDomain: "电力、制造",
                    enterpriseProfile: "这是一家大型国有企业",
                    powerNeeds: [
                        {
                            id: 1,
                            orderNum: 1,
                            fullUnitName: "示例客户公司",
                            powerDemand: true,
                            powerType: "工业用电",
                            technicalRequirements: "高稳定性",
                            marketDemandQuantity: 50
                        }
                    ],
                    products: [
                        {
                            id: 1,
                            orderNum: 1,
                            fullUnitName: "示例客户公司",
                            productName: "电力设备",
                            productType: "工业设备",
                            productDescription: "高性能电力设备",
                            matchingPower: "工业用电"
                        }
                    ]
                }
            ],
            // 模拟竞争对手数据
            competitors: [
                {
                    id: 1,
                    orderNum: 1,
                    belongingGroup: "示例集团",
                    fullUnitName: "示例竞争对手公司",
                    abbreviation: "示例对手",
                    regionalArea: "华东",
                    province: "浙江省",
                    municipality: "杭州市",
                    businessAttribute: "民营企业",
                    registeredCapitalMillionYuan: "3000",
                    enterpriseSize: "中型",
                    businessDomain: "电力、能源",
                    enterpriseProfile: "这是一家专注于电力领域的民营企业",
                    technicalRoute: "高效节能",
                    industryLayout: "全国布局",
                    supplyChainComplementary: "完整供应链",
                    financialInvestmentInformation: "A轮融资",
                    cooperationWithOtherCompanies: "与多家企业合作",
                    concurrentEnterpriseRating: "A级",
                    competitionField: "电力设备",
                    indexOfCompetitiveness: "85"
                }
            ]
        }
    },
    mounted() {
        // 初始化图表
        this.initCustomerChart();
        this.initCompetitorChart();
    },
    methods: {
        // 初始化客户分析图表
        initCustomerChart() {
            const chart = echarts.init(document.getElementById('customer-chart'));
            const option = {
                title: {
                    text: '客户分析'
                },
                tooltip: {},
                legend: {
                    data: ['客户数量']
                },
                xAxis: {
                    data: this.customers.map(c => c.abbreviation)
                },
                yAxis: {},
                series: [{
                    name: '注册资本(万元)',
                    type: 'bar',
                    data: this.customers.map(c => parseInt(c.registeredCapitalMillionYuan))
                }]
            };
            chart.setOption(option);
        },
        // 初始化竞争对手分析图表
        initCompetitorChart() {
            const chart = echarts.init(document.getElementById('competitor-chart'));
            const option = {
                title: {
                    text: '竞争对手分析'
                },
                tooltip: {},
                legend: {
                    data: ['竞争指数']
                },
                xAxis: {
                    data: this.competitors.map(c => c.abbreviation)
                },
                yAxis: {},
                series: [{
                    name: '竞争指数',
                    type: 'bar',
                    data: this.competitors.map(c => parseInt(c.indexOfCompetitiveness))
                }]
            };
            chart.setOption(option);
        },
        // 模拟API请求
        async fetchCustomers() {
            // 模拟POST请求
            return new Promise(resolve => {
                setTimeout(() => {
                    resolve(this.customers);
                }, 500);
            });
        },
        async fetchCompetitors() {
            // 模拟POST请求
            return new Promise(resolve => {
                setTimeout(() => {
                    resolve(this.competitors);
                }, 500);
            });
        }
    }
});

app.mount('#app');