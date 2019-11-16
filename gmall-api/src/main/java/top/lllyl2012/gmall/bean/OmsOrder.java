package top.lllyl2012.gmall.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author volume
*/
public class OmsOrder implements Serializable {

    private static final long serialVersionUID = 1573824704156L;


    /**
    * 主键
    * 订单id
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:0
    */
    private Long memberId;

    /**
    * 
    * isNullAble:1
    */
    private Long couponId;

    /**
    * 订单编号
    * isNullAble:1
    */
    private String orderSn;

    /**
    * 提交时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 用户帐号
    * isNullAble:1
    */
    private String memberUsername;

    /**
    * 订单总金额
    * isNullAble:1
    */
    private java.math.BigDecimal totalAmount;

    /**
    * 应付金额（实际支付金额）
    * isNullAble:1
    */
    private java.math.BigDecimal payAmount;

    /**
    * 运费金额
    * isNullAble:1
    */
    private java.math.BigDecimal freightAmount;

    /**
    * 促销优化金额（促销价、满减、阶梯价）
    * isNullAble:1
    */
    private java.math.BigDecimal promotionAmount;

    /**
    * 积分抵扣金额
    * isNullAble:1
    */
    private java.math.BigDecimal integrationAmount;

    /**
    * 优惠券抵扣金额
    * isNullAble:1
    */
    private java.math.BigDecimal couponAmount;

    /**
    * 管理员后台调整订单使用的折扣金额
    * isNullAble:1
    */
    private java.math.BigDecimal discountAmount;

    /**
    * 支付方式：0->未支付；1->支付宝；2->微信
    * isNullAble:1
    */
    private Integer payType;

    /**
    * 订单来源：0->PC订单；1->app订单
    * isNullAble:1
    */
    private Integer sourceType;

    /**
    * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
    * isNullAble:1
    */
    private Integer status;

    /**
    * 订单类型：0->正常订单；1->秒杀订单
    * isNullAble:1
    */
    private Integer orderType;

    /**
    * 物流公司(配送方式)
    * isNullAble:1
    */
    private String deliveryCompany;

    /**
    * 物流单号
    * isNullAble:1
    */
    private String deliverySn;

    /**
    * 自动确认时间（天）
    * isNullAble:1
    */
    private Integer autoConfirmDay;

    /**
    * 可以获得的积分
    * isNullAble:1
    */
    private Integer integration;

    /**
    * 可以活动的成长值
    * isNullAble:1
    */
    private Integer growth;

    /**
    * 活动信息
    * isNullAble:1
    */
    private String promotionInfo;

    /**
    * 发票类型：0->不开发票；1->电子发票；2->纸质发票
    * isNullAble:1
    */
    private Integer billType;

    /**
    * 发票抬头
    * isNullAble:1
    */
    private String billHeader;

    /**
    * 发票内容
    * isNullAble:1
    */
    private String billContent;

    /**
    * 收票人电话
    * isNullAble:1
    */
    private String billReceiverPhone;

    /**
    * 收票人邮箱
    * isNullAble:1
    */
    private String billReceiverEmail;

    /**
    * 收货人姓名
    * isNullAble:0
    */
    private String receiverName;

    /**
    * 收货人电话
    * isNullAble:0
    */
    private String receiverPhone;

    /**
    * 收货人邮编
    * isNullAble:1
    */
    private String receiverPostCode;

    /**
    * 省份/直辖市
    * isNullAble:1
    */
    private String receiverProvince;

    /**
    * 城市
    * isNullAble:1
    */
    private String receiverCity;

    /**
    * 区
    * isNullAble:1
    */
    private String receiverRegion;

    /**
    * 详细地址
    * isNullAble:1
    */
    private String receiverDetailAddress;

    /**
    * 订单备注
    * isNullAble:1
    */
    private String note;

    /**
    * 确认收货状态：0->未确认；1->已确认
    * isNullAble:1
    */
    private Integer confirmStatus;

    /**
    * 删除状态：0->未删除；1->已删除
    * isNullAble:0,defaultVal:0
    */
    private Integer deleteStatus;

    /**
    * 下单时使用的积分
    * isNullAble:1
    */
    private Integer useIntegration;

    /**
    * 支付时间
    * isNullAble:1
    */
    private java.time.LocalDateTime paymentTime;

    /**
    * 发货时间
    * isNullAble:1
    */
    private java.time.LocalDateTime deliveryTime;

    /**
    * 确认收货时间
    * isNullAble:1
    */
    private java.time.LocalDateTime receiveTime;

    /**
    * 评价时间
    * isNullAble:1
    */
    private java.time.LocalDateTime commentTime;

    /**
    * 修改时间
    * isNullAble:1
    */
    private java.time.LocalDateTime modifyTime;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setMemberId(Long memberId){this.memberId = memberId;}

    public Long getMemberId(){return this.memberId;}

    public void setCouponId(Long couponId){this.couponId = couponId;}

    public Long getCouponId(){return this.couponId;}

    public void setOrderSn(String orderSn){this.orderSn = orderSn;}

    public String getOrderSn(){return this.orderSn;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setMemberUsername(String memberUsername){this.memberUsername = memberUsername;}

    public String getMemberUsername(){return this.memberUsername;}

    public void setTotalAmount(java.math.BigDecimal totalAmount){this.totalAmount = totalAmount;}

    public java.math.BigDecimal getTotalAmount(){return this.totalAmount;}

    public void setPayAmount(java.math.BigDecimal payAmount){this.payAmount = payAmount;}

    public java.math.BigDecimal getPayAmount(){return this.payAmount;}

    public void setFreightAmount(java.math.BigDecimal freightAmount){this.freightAmount = freightAmount;}

    public java.math.BigDecimal getFreightAmount(){return this.freightAmount;}

    public void setPromotionAmount(java.math.BigDecimal promotionAmount){this.promotionAmount = promotionAmount;}

    public java.math.BigDecimal getPromotionAmount(){return this.promotionAmount;}

    public void setIntegrationAmount(java.math.BigDecimal integrationAmount){this.integrationAmount = integrationAmount;}

    public java.math.BigDecimal getIntegrationAmount(){return this.integrationAmount;}

    public void setCouponAmount(java.math.BigDecimal couponAmount){this.couponAmount = couponAmount;}

    public java.math.BigDecimal getCouponAmount(){return this.couponAmount;}

    public void setDiscountAmount(java.math.BigDecimal discountAmount){this.discountAmount = discountAmount;}

    public java.math.BigDecimal getDiscountAmount(){return this.discountAmount;}

    public void setPayType(Integer payType){this.payType = payType;}

    public Integer getPayType(){return this.payType;}

    public void setSourceType(Integer sourceType){this.sourceType = sourceType;}

    public Integer getSourceType(){return this.sourceType;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setOrderType(Integer orderType){this.orderType = orderType;}

    public Integer getOrderType(){return this.orderType;}

    public void setDeliveryCompany(String deliveryCompany){this.deliveryCompany = deliveryCompany;}

    public String getDeliveryCompany(){return this.deliveryCompany;}

    public void setDeliverySn(String deliverySn){this.deliverySn = deliverySn;}

    public String getDeliverySn(){return this.deliverySn;}

    public void setAutoConfirmDay(Integer autoConfirmDay){this.autoConfirmDay = autoConfirmDay;}

    public Integer getAutoConfirmDay(){return this.autoConfirmDay;}

    public void setIntegration(Integer integration){this.integration = integration;}

    public Integer getIntegration(){return this.integration;}

    public void setGrowth(Integer growth){this.growth = growth;}

    public Integer getGrowth(){return this.growth;}

    public void setPromotionInfo(String promotionInfo){this.promotionInfo = promotionInfo;}

    public String getPromotionInfo(){return this.promotionInfo;}

    public void setBillType(Integer billType){this.billType = billType;}

    public Integer getBillType(){return this.billType;}

    public void setBillHeader(String billHeader){this.billHeader = billHeader;}

    public String getBillHeader(){return this.billHeader;}

    public void setBillContent(String billContent){this.billContent = billContent;}

    public String getBillContent(){return this.billContent;}

    public void setBillReceiverPhone(String billReceiverPhone){this.billReceiverPhone = billReceiverPhone;}

    public String getBillReceiverPhone(){return this.billReceiverPhone;}

    public void setBillReceiverEmail(String billReceiverEmail){this.billReceiverEmail = billReceiverEmail;}

    public String getBillReceiverEmail(){return this.billReceiverEmail;}

    public void setReceiverName(String receiverName){this.receiverName = receiverName;}

    public String getReceiverName(){return this.receiverName;}

    public void setReceiverPhone(String receiverPhone){this.receiverPhone = receiverPhone;}

    public String getReceiverPhone(){return this.receiverPhone;}

    public void setReceiverPostCode(String receiverPostCode){this.receiverPostCode = receiverPostCode;}

    public String getReceiverPostCode(){return this.receiverPostCode;}

    public void setReceiverProvince(String receiverProvince){this.receiverProvince = receiverProvince;}

    public String getReceiverProvince(){return this.receiverProvince;}

    public void setReceiverCity(String receiverCity){this.receiverCity = receiverCity;}

    public String getReceiverCity(){return this.receiverCity;}

    public void setReceiverRegion(String receiverRegion){this.receiverRegion = receiverRegion;}

    public String getReceiverRegion(){return this.receiverRegion;}

    public void setReceiverDetailAddress(String receiverDetailAddress){this.receiverDetailAddress = receiverDetailAddress;}

    public String getReceiverDetailAddress(){return this.receiverDetailAddress;}

    public void setNote(String note){this.note = note;}

    public String getNote(){return this.note;}

    public void setConfirmStatus(Integer confirmStatus){this.confirmStatus = confirmStatus;}

    public Integer getConfirmStatus(){return this.confirmStatus;}

    public void setDeleteStatus(Integer deleteStatus){this.deleteStatus = deleteStatus;}

    public Integer getDeleteStatus(){return this.deleteStatus;}

    public void setUseIntegration(Integer useIntegration){this.useIntegration = useIntegration;}

    public Integer getUseIntegration(){return this.useIntegration;}

    public void setPaymentTime(java.time.LocalDateTime paymentTime){this.paymentTime = paymentTime;}

    public java.time.LocalDateTime getPaymentTime(){return this.paymentTime;}

    public void setDeliveryTime(java.time.LocalDateTime deliveryTime){this.deliveryTime = deliveryTime;}

    public java.time.LocalDateTime getDeliveryTime(){return this.deliveryTime;}

    public void setReceiveTime(java.time.LocalDateTime receiveTime){this.receiveTime = receiveTime;}

    public java.time.LocalDateTime getReceiveTime(){return this.receiveTime;}

    public void setCommentTime(java.time.LocalDateTime commentTime){this.commentTime = commentTime;}

    public java.time.LocalDateTime getCommentTime(){return this.commentTime;}

    public void setModifyTime(java.time.LocalDateTime modifyTime){this.modifyTime = modifyTime;}

    public java.time.LocalDateTime getModifyTime(){return this.modifyTime;}
    @Override
    public String toString() {
        return "OmsOrder{" +
                "id='" + id + '\'' +
                "memberId='" + memberId + '\'' +
                "couponId='" + couponId + '\'' +
                "orderSn='" + orderSn + '\'' +
                "createTime='" + createTime + '\'' +
                "memberUsername='" + memberUsername + '\'' +
                "totalAmount='" + totalAmount + '\'' +
                "payAmount='" + payAmount + '\'' +
                "freightAmount='" + freightAmount + '\'' +
                "promotionAmount='" + promotionAmount + '\'' +
                "integrationAmount='" + integrationAmount + '\'' +
                "couponAmount='" + couponAmount + '\'' +
                "discountAmount='" + discountAmount + '\'' +
                "payType='" + payType + '\'' +
                "sourceType='" + sourceType + '\'' +
                "status='" + status + '\'' +
                "orderType='" + orderType + '\'' +
                "deliveryCompany='" + deliveryCompany + '\'' +
                "deliverySn='" + deliverySn + '\'' +
                "autoConfirmDay='" + autoConfirmDay + '\'' +
                "integration='" + integration + '\'' +
                "growth='" + growth + '\'' +
                "promotionInfo='" + promotionInfo + '\'' +
                "billType='" + billType + '\'' +
                "billHeader='" + billHeader + '\'' +
                "billContent='" + billContent + '\'' +
                "billReceiverPhone='" + billReceiverPhone + '\'' +
                "billReceiverEmail='" + billReceiverEmail + '\'' +
                "receiverName='" + receiverName + '\'' +
                "receiverPhone='" + receiverPhone + '\'' +
                "receiverPostCode='" + receiverPostCode + '\'' +
                "receiverProvince='" + receiverProvince + '\'' +
                "receiverCity='" + receiverCity + '\'' +
                "receiverRegion='" + receiverRegion + '\'' +
                "receiverDetailAddress='" + receiverDetailAddress + '\'' +
                "note='" + note + '\'' +
                "confirmStatus='" + confirmStatus + '\'' +
                "deleteStatus='" + deleteStatus + '\'' +
                "useIntegration='" + useIntegration + '\'' +
                "paymentTime='" + paymentTime + '\'' +
                "deliveryTime='" + deliveryTime + '\'' +
                "receiveTime='" + receiveTime + '\'' +
                "commentTime='" + commentTime + '\'' +
                "modifyTime='" + modifyTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private OmsOrder set;

        private ConditionBuilder where;

        public UpdateBuilder set(OmsOrder set){
            this.set = set;
            return this;
        }

        public OmsOrder getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends OmsOrder{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> memberIdList;

        public List<Long> getMemberIdList(){return this.memberIdList;}

        private Long memberIdSt;

        private Long memberIdEd;

        public Long getMemberIdSt(){return this.memberIdSt;}

        public Long getMemberIdEd(){return this.memberIdEd;}

        private List<Long> couponIdList;

        public List<Long> getCouponIdList(){return this.couponIdList;}

        private Long couponIdSt;

        private Long couponIdEd;

        public Long getCouponIdSt(){return this.couponIdSt;}

        public Long getCouponIdEd(){return this.couponIdEd;}

        private List<String> orderSnList;

        public List<String> getOrderSnList(){return this.orderSnList;}


        private List<String> fuzzyOrderSn;

        public List<String> getFuzzyOrderSn(){return this.fuzzyOrderSn;}

        private List<String> rightFuzzyOrderSn;

        public List<String> getRightFuzzyOrderSn(){return this.rightFuzzyOrderSn;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> memberUsernameList;

        public List<String> getMemberUsernameList(){return this.memberUsernameList;}


        private List<String> fuzzyMemberUsername;

        public List<String> getFuzzyMemberUsername(){return this.fuzzyMemberUsername;}

        private List<String> rightFuzzyMemberUsername;

        public List<String> getRightFuzzyMemberUsername(){return this.rightFuzzyMemberUsername;}
        private List<java.math.BigDecimal> totalAmountList;

        public List<java.math.BigDecimal> getTotalAmountList(){return this.totalAmountList;}

        private java.math.BigDecimal totalAmountSt;

        private java.math.BigDecimal totalAmountEd;

        public java.math.BigDecimal getTotalAmountSt(){return this.totalAmountSt;}

        public java.math.BigDecimal getTotalAmountEd(){return this.totalAmountEd;}

        private List<java.math.BigDecimal> payAmountList;

        public List<java.math.BigDecimal> getPayAmountList(){return this.payAmountList;}

        private java.math.BigDecimal payAmountSt;

        private java.math.BigDecimal payAmountEd;

        public java.math.BigDecimal getPayAmountSt(){return this.payAmountSt;}

        public java.math.BigDecimal getPayAmountEd(){return this.payAmountEd;}

        private List<java.math.BigDecimal> freightAmountList;

        public List<java.math.BigDecimal> getFreightAmountList(){return this.freightAmountList;}

        private java.math.BigDecimal freightAmountSt;

        private java.math.BigDecimal freightAmountEd;

        public java.math.BigDecimal getFreightAmountSt(){return this.freightAmountSt;}

        public java.math.BigDecimal getFreightAmountEd(){return this.freightAmountEd;}

        private List<java.math.BigDecimal> promotionAmountList;

        public List<java.math.BigDecimal> getPromotionAmountList(){return this.promotionAmountList;}

        private java.math.BigDecimal promotionAmountSt;

        private java.math.BigDecimal promotionAmountEd;

        public java.math.BigDecimal getPromotionAmountSt(){return this.promotionAmountSt;}

        public java.math.BigDecimal getPromotionAmountEd(){return this.promotionAmountEd;}

        private List<java.math.BigDecimal> integrationAmountList;

        public List<java.math.BigDecimal> getIntegrationAmountList(){return this.integrationAmountList;}

        private java.math.BigDecimal integrationAmountSt;

        private java.math.BigDecimal integrationAmountEd;

        public java.math.BigDecimal getIntegrationAmountSt(){return this.integrationAmountSt;}

        public java.math.BigDecimal getIntegrationAmountEd(){return this.integrationAmountEd;}

        private List<java.math.BigDecimal> couponAmountList;

        public List<java.math.BigDecimal> getCouponAmountList(){return this.couponAmountList;}

        private java.math.BigDecimal couponAmountSt;

        private java.math.BigDecimal couponAmountEd;

        public java.math.BigDecimal getCouponAmountSt(){return this.couponAmountSt;}

        public java.math.BigDecimal getCouponAmountEd(){return this.couponAmountEd;}

        private List<java.math.BigDecimal> discountAmountList;

        public List<java.math.BigDecimal> getDiscountAmountList(){return this.discountAmountList;}

        private java.math.BigDecimal discountAmountSt;

        private java.math.BigDecimal discountAmountEd;

        public java.math.BigDecimal getDiscountAmountSt(){return this.discountAmountSt;}

        public java.math.BigDecimal getDiscountAmountEd(){return this.discountAmountEd;}

        private List<Integer> payTypeList;

        public List<Integer> getPayTypeList(){return this.payTypeList;}

        private Integer payTypeSt;

        private Integer payTypeEd;

        public Integer getPayTypeSt(){return this.payTypeSt;}

        public Integer getPayTypeEd(){return this.payTypeEd;}

        private List<Integer> sourceTypeList;

        public List<Integer> getSourceTypeList(){return this.sourceTypeList;}

        private Integer sourceTypeSt;

        private Integer sourceTypeEd;

        public Integer getSourceTypeSt(){return this.sourceTypeSt;}

        public Integer getSourceTypeEd(){return this.sourceTypeEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<Integer> orderTypeList;

        public List<Integer> getOrderTypeList(){return this.orderTypeList;}

        private Integer orderTypeSt;

        private Integer orderTypeEd;

        public Integer getOrderTypeSt(){return this.orderTypeSt;}

        public Integer getOrderTypeEd(){return this.orderTypeEd;}

        private List<String> deliveryCompanyList;

        public List<String> getDeliveryCompanyList(){return this.deliveryCompanyList;}


        private List<String> fuzzyDeliveryCompany;

        public List<String> getFuzzyDeliveryCompany(){return this.fuzzyDeliveryCompany;}

        private List<String> rightFuzzyDeliveryCompany;

        public List<String> getRightFuzzyDeliveryCompany(){return this.rightFuzzyDeliveryCompany;}
        private List<String> deliverySnList;

        public List<String> getDeliverySnList(){return this.deliverySnList;}


        private List<String> fuzzyDeliverySn;

        public List<String> getFuzzyDeliverySn(){return this.fuzzyDeliverySn;}

        private List<String> rightFuzzyDeliverySn;

        public List<String> getRightFuzzyDeliverySn(){return this.rightFuzzyDeliverySn;}
        private List<Integer> autoConfirmDayList;

        public List<Integer> getAutoConfirmDayList(){return this.autoConfirmDayList;}

        private Integer autoConfirmDaySt;

        private Integer autoConfirmDayEd;

        public Integer getAutoConfirmDaySt(){return this.autoConfirmDaySt;}

        public Integer getAutoConfirmDayEd(){return this.autoConfirmDayEd;}

        private List<Integer> integrationList;

        public List<Integer> getIntegrationList(){return this.integrationList;}

        private Integer integrationSt;

        private Integer integrationEd;

        public Integer getIntegrationSt(){return this.integrationSt;}

        public Integer getIntegrationEd(){return this.integrationEd;}

        private List<Integer> growthList;

        public List<Integer> getGrowthList(){return this.growthList;}

        private Integer growthSt;

        private Integer growthEd;

        public Integer getGrowthSt(){return this.growthSt;}

        public Integer getGrowthEd(){return this.growthEd;}

        private List<String> promotionInfoList;

        public List<String> getPromotionInfoList(){return this.promotionInfoList;}


        private List<String> fuzzyPromotionInfo;

        public List<String> getFuzzyPromotionInfo(){return this.fuzzyPromotionInfo;}

        private List<String> rightFuzzyPromotionInfo;

        public List<String> getRightFuzzyPromotionInfo(){return this.rightFuzzyPromotionInfo;}
        private List<Integer> billTypeList;

        public List<Integer> getBillTypeList(){return this.billTypeList;}

        private Integer billTypeSt;

        private Integer billTypeEd;

        public Integer getBillTypeSt(){return this.billTypeSt;}

        public Integer getBillTypeEd(){return this.billTypeEd;}

        private List<String> billHeaderList;

        public List<String> getBillHeaderList(){return this.billHeaderList;}


        private List<String> fuzzyBillHeader;

        public List<String> getFuzzyBillHeader(){return this.fuzzyBillHeader;}

        private List<String> rightFuzzyBillHeader;

        public List<String> getRightFuzzyBillHeader(){return this.rightFuzzyBillHeader;}
        private List<String> billContentList;

        public List<String> getBillContentList(){return this.billContentList;}


        private List<String> fuzzyBillContent;

        public List<String> getFuzzyBillContent(){return this.fuzzyBillContent;}

        private List<String> rightFuzzyBillContent;

        public List<String> getRightFuzzyBillContent(){return this.rightFuzzyBillContent;}
        private List<String> billReceiverPhoneList;

        public List<String> getBillReceiverPhoneList(){return this.billReceiverPhoneList;}


        private List<String> fuzzyBillReceiverPhone;

        public List<String> getFuzzyBillReceiverPhone(){return this.fuzzyBillReceiverPhone;}

        private List<String> rightFuzzyBillReceiverPhone;

        public List<String> getRightFuzzyBillReceiverPhone(){return this.rightFuzzyBillReceiverPhone;}
        private List<String> billReceiverEmailList;

        public List<String> getBillReceiverEmailList(){return this.billReceiverEmailList;}


        private List<String> fuzzyBillReceiverEmail;

        public List<String> getFuzzyBillReceiverEmail(){return this.fuzzyBillReceiverEmail;}

        private List<String> rightFuzzyBillReceiverEmail;

        public List<String> getRightFuzzyBillReceiverEmail(){return this.rightFuzzyBillReceiverEmail;}
        private List<String> receiverNameList;

        public List<String> getReceiverNameList(){return this.receiverNameList;}


        private List<String> fuzzyReceiverName;

        public List<String> getFuzzyReceiverName(){return this.fuzzyReceiverName;}

        private List<String> rightFuzzyReceiverName;

        public List<String> getRightFuzzyReceiverName(){return this.rightFuzzyReceiverName;}
        private List<String> receiverPhoneList;

        public List<String> getReceiverPhoneList(){return this.receiverPhoneList;}


        private List<String> fuzzyReceiverPhone;

        public List<String> getFuzzyReceiverPhone(){return this.fuzzyReceiverPhone;}

        private List<String> rightFuzzyReceiverPhone;

        public List<String> getRightFuzzyReceiverPhone(){return this.rightFuzzyReceiverPhone;}
        private List<String> receiverPostCodeList;

        public List<String> getReceiverPostCodeList(){return this.receiverPostCodeList;}


        private List<String> fuzzyReceiverPostCode;

        public List<String> getFuzzyReceiverPostCode(){return this.fuzzyReceiverPostCode;}

        private List<String> rightFuzzyReceiverPostCode;

        public List<String> getRightFuzzyReceiverPostCode(){return this.rightFuzzyReceiverPostCode;}
        private List<String> receiverProvinceList;

        public List<String> getReceiverProvinceList(){return this.receiverProvinceList;}


        private List<String> fuzzyReceiverProvince;

        public List<String> getFuzzyReceiverProvince(){return this.fuzzyReceiverProvince;}

        private List<String> rightFuzzyReceiverProvince;

        public List<String> getRightFuzzyReceiverProvince(){return this.rightFuzzyReceiverProvince;}
        private List<String> receiverCityList;

        public List<String> getReceiverCityList(){return this.receiverCityList;}


        private List<String> fuzzyReceiverCity;

        public List<String> getFuzzyReceiverCity(){return this.fuzzyReceiverCity;}

        private List<String> rightFuzzyReceiverCity;

        public List<String> getRightFuzzyReceiverCity(){return this.rightFuzzyReceiverCity;}
        private List<String> receiverRegionList;

        public List<String> getReceiverRegionList(){return this.receiverRegionList;}


        private List<String> fuzzyReceiverRegion;

        public List<String> getFuzzyReceiverRegion(){return this.fuzzyReceiverRegion;}

        private List<String> rightFuzzyReceiverRegion;

        public List<String> getRightFuzzyReceiverRegion(){return this.rightFuzzyReceiverRegion;}
        private List<String> receiverDetailAddressList;

        public List<String> getReceiverDetailAddressList(){return this.receiverDetailAddressList;}


        private List<String> fuzzyReceiverDetailAddress;

        public List<String> getFuzzyReceiverDetailAddress(){return this.fuzzyReceiverDetailAddress;}

        private List<String> rightFuzzyReceiverDetailAddress;

        public List<String> getRightFuzzyReceiverDetailAddress(){return this.rightFuzzyReceiverDetailAddress;}
        private List<String> noteList;

        public List<String> getNoteList(){return this.noteList;}


        private List<String> fuzzyNote;

        public List<String> getFuzzyNote(){return this.fuzzyNote;}

        private List<String> rightFuzzyNote;

        public List<String> getRightFuzzyNote(){return this.rightFuzzyNote;}
        private List<Integer> confirmStatusList;

        public List<Integer> getConfirmStatusList(){return this.confirmStatusList;}

        private Integer confirmStatusSt;

        private Integer confirmStatusEd;

        public Integer getConfirmStatusSt(){return this.confirmStatusSt;}

        public Integer getConfirmStatusEd(){return this.confirmStatusEd;}

        private List<Integer> deleteStatusList;

        public List<Integer> getDeleteStatusList(){return this.deleteStatusList;}

        private Integer deleteStatusSt;

        private Integer deleteStatusEd;

        public Integer getDeleteStatusSt(){return this.deleteStatusSt;}

        public Integer getDeleteStatusEd(){return this.deleteStatusEd;}

        private List<Integer> useIntegrationList;

        public List<Integer> getUseIntegrationList(){return this.useIntegrationList;}

        private Integer useIntegrationSt;

        private Integer useIntegrationEd;

        public Integer getUseIntegrationSt(){return this.useIntegrationSt;}

        public Integer getUseIntegrationEd(){return this.useIntegrationEd;}

        private List<java.time.LocalDateTime> paymentTimeList;

        public List<java.time.LocalDateTime> getPaymentTimeList(){return this.paymentTimeList;}

        private java.time.LocalDateTime paymentTimeSt;

        private java.time.LocalDateTime paymentTimeEd;

        public java.time.LocalDateTime getPaymentTimeSt(){return this.paymentTimeSt;}

        public java.time.LocalDateTime getPaymentTimeEd(){return this.paymentTimeEd;}

        private List<java.time.LocalDateTime> deliveryTimeList;

        public List<java.time.LocalDateTime> getDeliveryTimeList(){return this.deliveryTimeList;}

        private java.time.LocalDateTime deliveryTimeSt;

        private java.time.LocalDateTime deliveryTimeEd;

        public java.time.LocalDateTime getDeliveryTimeSt(){return this.deliveryTimeSt;}

        public java.time.LocalDateTime getDeliveryTimeEd(){return this.deliveryTimeEd;}

        private List<java.time.LocalDateTime> receiveTimeList;

        public List<java.time.LocalDateTime> getReceiveTimeList(){return this.receiveTimeList;}

        private java.time.LocalDateTime receiveTimeSt;

        private java.time.LocalDateTime receiveTimeEd;

        public java.time.LocalDateTime getReceiveTimeSt(){return this.receiveTimeSt;}

        public java.time.LocalDateTime getReceiveTimeEd(){return this.receiveTimeEd;}

        private List<java.time.LocalDateTime> commentTimeList;

        public List<java.time.LocalDateTime> getCommentTimeList(){return this.commentTimeList;}

        private java.time.LocalDateTime commentTimeSt;

        private java.time.LocalDateTime commentTimeEd;

        public java.time.LocalDateTime getCommentTimeSt(){return this.commentTimeSt;}

        public java.time.LocalDateTime getCommentTimeEd(){return this.commentTimeEd;}

        private List<java.time.LocalDateTime> modifyTimeList;

        public List<java.time.LocalDateTime> getModifyTimeList(){return this.modifyTimeList;}

        private java.time.LocalDateTime modifyTimeSt;

        private java.time.LocalDateTime modifyTimeEd;

        public java.time.LocalDateTime getModifyTimeSt(){return this.modifyTimeSt;}

        public java.time.LocalDateTime getModifyTimeEd(){return this.modifyTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder memberIdBetWeen(Long memberIdSt,Long memberIdEd){
            this.memberIdSt = memberIdSt;
            this.memberIdEd = memberIdEd;
            return this;
        }

        public QueryBuilder memberIdGreaterEqThan(Long memberIdSt){
            this.memberIdSt = memberIdSt;
            return this;
        }
        public QueryBuilder memberIdLessEqThan(Long memberIdEd){
            this.memberIdEd = memberIdEd;
            return this;
        }


        public QueryBuilder memberId(Long memberId){
            setMemberId(memberId);
            return this;
        }

        public QueryBuilder memberIdList(Long ... memberId){
            this.memberIdList = solveNullList(memberId);
            return this;
        }

        public QueryBuilder memberIdList(List<Long> memberId){
            this.memberIdList = memberId;
            return this;
        }

        public QueryBuilder fetchMemberId(){
            setFetchFields("fetchFields","memberId");
            return this;
        }

        public QueryBuilder excludeMemberId(){
            setFetchFields("excludeFields","memberId");
            return this;
        }

        public QueryBuilder couponIdBetWeen(Long couponIdSt,Long couponIdEd){
            this.couponIdSt = couponIdSt;
            this.couponIdEd = couponIdEd;
            return this;
        }

        public QueryBuilder couponIdGreaterEqThan(Long couponIdSt){
            this.couponIdSt = couponIdSt;
            return this;
        }
        public QueryBuilder couponIdLessEqThan(Long couponIdEd){
            this.couponIdEd = couponIdEd;
            return this;
        }


        public QueryBuilder couponId(Long couponId){
            setCouponId(couponId);
            return this;
        }

        public QueryBuilder couponIdList(Long ... couponId){
            this.couponIdList = solveNullList(couponId);
            return this;
        }

        public QueryBuilder couponIdList(List<Long> couponId){
            this.couponIdList = couponId;
            return this;
        }

        public QueryBuilder fetchCouponId(){
            setFetchFields("fetchFields","couponId");
            return this;
        }

        public QueryBuilder excludeCouponId(){
            setFetchFields("excludeFields","couponId");
            return this;
        }

        public QueryBuilder fuzzyOrderSn (List<String> fuzzyOrderSn){
            this.fuzzyOrderSn = fuzzyOrderSn;
            return this;
        }

        public QueryBuilder fuzzyOrderSn (String ... fuzzyOrderSn){
            this.fuzzyOrderSn = solveNullList(fuzzyOrderSn);
            return this;
        }

        public QueryBuilder rightFuzzyOrderSn (List<String> rightFuzzyOrderSn){
            this.rightFuzzyOrderSn = rightFuzzyOrderSn;
            return this;
        }

        public QueryBuilder rightFuzzyOrderSn (String ... rightFuzzyOrderSn){
            this.rightFuzzyOrderSn = solveNullList(rightFuzzyOrderSn);
            return this;
        }

        public QueryBuilder orderSn(String orderSn){
            setOrderSn(orderSn);
            return this;
        }

        public QueryBuilder orderSnList(String ... orderSn){
            this.orderSnList = solveNullList(orderSn);
            return this;
        }

        public QueryBuilder orderSnList(List<String> orderSn){
            this.orderSnList = orderSn;
            return this;
        }

        public QueryBuilder fetchOrderSn(){
            setFetchFields("fetchFields","orderSn");
            return this;
        }

        public QueryBuilder excludeOrderSn(){
            setFetchFields("excludeFields","orderSn");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder fuzzyMemberUsername (List<String> fuzzyMemberUsername){
            this.fuzzyMemberUsername = fuzzyMemberUsername;
            return this;
        }

        public QueryBuilder fuzzyMemberUsername (String ... fuzzyMemberUsername){
            this.fuzzyMemberUsername = solveNullList(fuzzyMemberUsername);
            return this;
        }

        public QueryBuilder rightFuzzyMemberUsername (List<String> rightFuzzyMemberUsername){
            this.rightFuzzyMemberUsername = rightFuzzyMemberUsername;
            return this;
        }

        public QueryBuilder rightFuzzyMemberUsername (String ... rightFuzzyMemberUsername){
            this.rightFuzzyMemberUsername = solveNullList(rightFuzzyMemberUsername);
            return this;
        }

        public QueryBuilder memberUsername(String memberUsername){
            setMemberUsername(memberUsername);
            return this;
        }

        public QueryBuilder memberUsernameList(String ... memberUsername){
            this.memberUsernameList = solveNullList(memberUsername);
            return this;
        }

        public QueryBuilder memberUsernameList(List<String> memberUsername){
            this.memberUsernameList = memberUsername;
            return this;
        }

        public QueryBuilder fetchMemberUsername(){
            setFetchFields("fetchFields","memberUsername");
            return this;
        }

        public QueryBuilder excludeMemberUsername(){
            setFetchFields("excludeFields","memberUsername");
            return this;
        }

        public QueryBuilder totalAmountBetWeen(java.math.BigDecimal totalAmountSt,java.math.BigDecimal totalAmountEd){
            this.totalAmountSt = totalAmountSt;
            this.totalAmountEd = totalAmountEd;
            return this;
        }

        public QueryBuilder totalAmountGreaterEqThan(java.math.BigDecimal totalAmountSt){
            this.totalAmountSt = totalAmountSt;
            return this;
        }
        public QueryBuilder totalAmountLessEqThan(java.math.BigDecimal totalAmountEd){
            this.totalAmountEd = totalAmountEd;
            return this;
        }


        public QueryBuilder totalAmount(java.math.BigDecimal totalAmount){
            setTotalAmount(totalAmount);
            return this;
        }

        public QueryBuilder totalAmountList(java.math.BigDecimal ... totalAmount){
            this.totalAmountList = solveNullList(totalAmount);
            return this;
        }

        public QueryBuilder totalAmountList(List<java.math.BigDecimal> totalAmount){
            this.totalAmountList = totalAmount;
            return this;
        }

        public QueryBuilder fetchTotalAmount(){
            setFetchFields("fetchFields","totalAmount");
            return this;
        }

        public QueryBuilder excludeTotalAmount(){
            setFetchFields("excludeFields","totalAmount");
            return this;
        }

        public QueryBuilder payAmountBetWeen(java.math.BigDecimal payAmountSt,java.math.BigDecimal payAmountEd){
            this.payAmountSt = payAmountSt;
            this.payAmountEd = payAmountEd;
            return this;
        }

        public QueryBuilder payAmountGreaterEqThan(java.math.BigDecimal payAmountSt){
            this.payAmountSt = payAmountSt;
            return this;
        }
        public QueryBuilder payAmountLessEqThan(java.math.BigDecimal payAmountEd){
            this.payAmountEd = payAmountEd;
            return this;
        }


        public QueryBuilder payAmount(java.math.BigDecimal payAmount){
            setPayAmount(payAmount);
            return this;
        }

        public QueryBuilder payAmountList(java.math.BigDecimal ... payAmount){
            this.payAmountList = solveNullList(payAmount);
            return this;
        }

        public QueryBuilder payAmountList(List<java.math.BigDecimal> payAmount){
            this.payAmountList = payAmount;
            return this;
        }

        public QueryBuilder fetchPayAmount(){
            setFetchFields("fetchFields","payAmount");
            return this;
        }

        public QueryBuilder excludePayAmount(){
            setFetchFields("excludeFields","payAmount");
            return this;
        }

        public QueryBuilder freightAmountBetWeen(java.math.BigDecimal freightAmountSt,java.math.BigDecimal freightAmountEd){
            this.freightAmountSt = freightAmountSt;
            this.freightAmountEd = freightAmountEd;
            return this;
        }

        public QueryBuilder freightAmountGreaterEqThan(java.math.BigDecimal freightAmountSt){
            this.freightAmountSt = freightAmountSt;
            return this;
        }
        public QueryBuilder freightAmountLessEqThan(java.math.BigDecimal freightAmountEd){
            this.freightAmountEd = freightAmountEd;
            return this;
        }


        public QueryBuilder freightAmount(java.math.BigDecimal freightAmount){
            setFreightAmount(freightAmount);
            return this;
        }

        public QueryBuilder freightAmountList(java.math.BigDecimal ... freightAmount){
            this.freightAmountList = solveNullList(freightAmount);
            return this;
        }

        public QueryBuilder freightAmountList(List<java.math.BigDecimal> freightAmount){
            this.freightAmountList = freightAmount;
            return this;
        }

        public QueryBuilder fetchFreightAmount(){
            setFetchFields("fetchFields","freightAmount");
            return this;
        }

        public QueryBuilder excludeFreightAmount(){
            setFetchFields("excludeFields","freightAmount");
            return this;
        }

        public QueryBuilder promotionAmountBetWeen(java.math.BigDecimal promotionAmountSt,java.math.BigDecimal promotionAmountEd){
            this.promotionAmountSt = promotionAmountSt;
            this.promotionAmountEd = promotionAmountEd;
            return this;
        }

        public QueryBuilder promotionAmountGreaterEqThan(java.math.BigDecimal promotionAmountSt){
            this.promotionAmountSt = promotionAmountSt;
            return this;
        }
        public QueryBuilder promotionAmountLessEqThan(java.math.BigDecimal promotionAmountEd){
            this.promotionAmountEd = promotionAmountEd;
            return this;
        }


        public QueryBuilder promotionAmount(java.math.BigDecimal promotionAmount){
            setPromotionAmount(promotionAmount);
            return this;
        }

        public QueryBuilder promotionAmountList(java.math.BigDecimal ... promotionAmount){
            this.promotionAmountList = solveNullList(promotionAmount);
            return this;
        }

        public QueryBuilder promotionAmountList(List<java.math.BigDecimal> promotionAmount){
            this.promotionAmountList = promotionAmount;
            return this;
        }

        public QueryBuilder fetchPromotionAmount(){
            setFetchFields("fetchFields","promotionAmount");
            return this;
        }

        public QueryBuilder excludePromotionAmount(){
            setFetchFields("excludeFields","promotionAmount");
            return this;
        }

        public QueryBuilder integrationAmountBetWeen(java.math.BigDecimal integrationAmountSt,java.math.BigDecimal integrationAmountEd){
            this.integrationAmountSt = integrationAmountSt;
            this.integrationAmountEd = integrationAmountEd;
            return this;
        }

        public QueryBuilder integrationAmountGreaterEqThan(java.math.BigDecimal integrationAmountSt){
            this.integrationAmountSt = integrationAmountSt;
            return this;
        }
        public QueryBuilder integrationAmountLessEqThan(java.math.BigDecimal integrationAmountEd){
            this.integrationAmountEd = integrationAmountEd;
            return this;
        }


        public QueryBuilder integrationAmount(java.math.BigDecimal integrationAmount){
            setIntegrationAmount(integrationAmount);
            return this;
        }

        public QueryBuilder integrationAmountList(java.math.BigDecimal ... integrationAmount){
            this.integrationAmountList = solveNullList(integrationAmount);
            return this;
        }

        public QueryBuilder integrationAmountList(List<java.math.BigDecimal> integrationAmount){
            this.integrationAmountList = integrationAmount;
            return this;
        }

        public QueryBuilder fetchIntegrationAmount(){
            setFetchFields("fetchFields","integrationAmount");
            return this;
        }

        public QueryBuilder excludeIntegrationAmount(){
            setFetchFields("excludeFields","integrationAmount");
            return this;
        }

        public QueryBuilder couponAmountBetWeen(java.math.BigDecimal couponAmountSt,java.math.BigDecimal couponAmountEd){
            this.couponAmountSt = couponAmountSt;
            this.couponAmountEd = couponAmountEd;
            return this;
        }

        public QueryBuilder couponAmountGreaterEqThan(java.math.BigDecimal couponAmountSt){
            this.couponAmountSt = couponAmountSt;
            return this;
        }
        public QueryBuilder couponAmountLessEqThan(java.math.BigDecimal couponAmountEd){
            this.couponAmountEd = couponAmountEd;
            return this;
        }


        public QueryBuilder couponAmount(java.math.BigDecimal couponAmount){
            setCouponAmount(couponAmount);
            return this;
        }

        public QueryBuilder couponAmountList(java.math.BigDecimal ... couponAmount){
            this.couponAmountList = solveNullList(couponAmount);
            return this;
        }

        public QueryBuilder couponAmountList(List<java.math.BigDecimal> couponAmount){
            this.couponAmountList = couponAmount;
            return this;
        }

        public QueryBuilder fetchCouponAmount(){
            setFetchFields("fetchFields","couponAmount");
            return this;
        }

        public QueryBuilder excludeCouponAmount(){
            setFetchFields("excludeFields","couponAmount");
            return this;
        }

        public QueryBuilder discountAmountBetWeen(java.math.BigDecimal discountAmountSt,java.math.BigDecimal discountAmountEd){
            this.discountAmountSt = discountAmountSt;
            this.discountAmountEd = discountAmountEd;
            return this;
        }

        public QueryBuilder discountAmountGreaterEqThan(java.math.BigDecimal discountAmountSt){
            this.discountAmountSt = discountAmountSt;
            return this;
        }
        public QueryBuilder discountAmountLessEqThan(java.math.BigDecimal discountAmountEd){
            this.discountAmountEd = discountAmountEd;
            return this;
        }


        public QueryBuilder discountAmount(java.math.BigDecimal discountAmount){
            setDiscountAmount(discountAmount);
            return this;
        }

        public QueryBuilder discountAmountList(java.math.BigDecimal ... discountAmount){
            this.discountAmountList = solveNullList(discountAmount);
            return this;
        }

        public QueryBuilder discountAmountList(List<java.math.BigDecimal> discountAmount){
            this.discountAmountList = discountAmount;
            return this;
        }

        public QueryBuilder fetchDiscountAmount(){
            setFetchFields("fetchFields","discountAmount");
            return this;
        }

        public QueryBuilder excludeDiscountAmount(){
            setFetchFields("excludeFields","discountAmount");
            return this;
        }

        public QueryBuilder payTypeBetWeen(Integer payTypeSt,Integer payTypeEd){
            this.payTypeSt = payTypeSt;
            this.payTypeEd = payTypeEd;
            return this;
        }

        public QueryBuilder payTypeGreaterEqThan(Integer payTypeSt){
            this.payTypeSt = payTypeSt;
            return this;
        }
        public QueryBuilder payTypeLessEqThan(Integer payTypeEd){
            this.payTypeEd = payTypeEd;
            return this;
        }


        public QueryBuilder payType(Integer payType){
            setPayType(payType);
            return this;
        }

        public QueryBuilder payTypeList(Integer ... payType){
            this.payTypeList = solveNullList(payType);
            return this;
        }

        public QueryBuilder payTypeList(List<Integer> payType){
            this.payTypeList = payType;
            return this;
        }

        public QueryBuilder fetchPayType(){
            setFetchFields("fetchFields","payType");
            return this;
        }

        public QueryBuilder excludePayType(){
            setFetchFields("excludeFields","payType");
            return this;
        }

        public QueryBuilder sourceTypeBetWeen(Integer sourceTypeSt,Integer sourceTypeEd){
            this.sourceTypeSt = sourceTypeSt;
            this.sourceTypeEd = sourceTypeEd;
            return this;
        }

        public QueryBuilder sourceTypeGreaterEqThan(Integer sourceTypeSt){
            this.sourceTypeSt = sourceTypeSt;
            return this;
        }
        public QueryBuilder sourceTypeLessEqThan(Integer sourceTypeEd){
            this.sourceTypeEd = sourceTypeEd;
            return this;
        }


        public QueryBuilder sourceType(Integer sourceType){
            setSourceType(sourceType);
            return this;
        }

        public QueryBuilder sourceTypeList(Integer ... sourceType){
            this.sourceTypeList = solveNullList(sourceType);
            return this;
        }

        public QueryBuilder sourceTypeList(List<Integer> sourceType){
            this.sourceTypeList = sourceType;
            return this;
        }

        public QueryBuilder fetchSourceType(){
            setFetchFields("fetchFields","sourceType");
            return this;
        }

        public QueryBuilder excludeSourceType(){
            setFetchFields("excludeFields","sourceType");
            return this;
        }

        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder orderTypeBetWeen(Integer orderTypeSt,Integer orderTypeEd){
            this.orderTypeSt = orderTypeSt;
            this.orderTypeEd = orderTypeEd;
            return this;
        }

        public QueryBuilder orderTypeGreaterEqThan(Integer orderTypeSt){
            this.orderTypeSt = orderTypeSt;
            return this;
        }
        public QueryBuilder orderTypeLessEqThan(Integer orderTypeEd){
            this.orderTypeEd = orderTypeEd;
            return this;
        }


        public QueryBuilder orderType(Integer orderType){
            setOrderType(orderType);
            return this;
        }

        public QueryBuilder orderTypeList(Integer ... orderType){
            this.orderTypeList = solveNullList(orderType);
            return this;
        }

        public QueryBuilder orderTypeList(List<Integer> orderType){
            this.orderTypeList = orderType;
            return this;
        }

        public QueryBuilder fetchOrderType(){
            setFetchFields("fetchFields","orderType");
            return this;
        }

        public QueryBuilder excludeOrderType(){
            setFetchFields("excludeFields","orderType");
            return this;
        }

        public QueryBuilder fuzzyDeliveryCompany (List<String> fuzzyDeliveryCompany){
            this.fuzzyDeliveryCompany = fuzzyDeliveryCompany;
            return this;
        }

        public QueryBuilder fuzzyDeliveryCompany (String ... fuzzyDeliveryCompany){
            this.fuzzyDeliveryCompany = solveNullList(fuzzyDeliveryCompany);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryCompany (List<String> rightFuzzyDeliveryCompany){
            this.rightFuzzyDeliveryCompany = rightFuzzyDeliveryCompany;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryCompany (String ... rightFuzzyDeliveryCompany){
            this.rightFuzzyDeliveryCompany = solveNullList(rightFuzzyDeliveryCompany);
            return this;
        }

        public QueryBuilder deliveryCompany(String deliveryCompany){
            setDeliveryCompany(deliveryCompany);
            return this;
        }

        public QueryBuilder deliveryCompanyList(String ... deliveryCompany){
            this.deliveryCompanyList = solveNullList(deliveryCompany);
            return this;
        }

        public QueryBuilder deliveryCompanyList(List<String> deliveryCompany){
            this.deliveryCompanyList = deliveryCompany;
            return this;
        }

        public QueryBuilder fetchDeliveryCompany(){
            setFetchFields("fetchFields","deliveryCompany");
            return this;
        }

        public QueryBuilder excludeDeliveryCompany(){
            setFetchFields("excludeFields","deliveryCompany");
            return this;
        }

        public QueryBuilder fuzzyDeliverySn (List<String> fuzzyDeliverySn){
            this.fuzzyDeliverySn = fuzzyDeliverySn;
            return this;
        }

        public QueryBuilder fuzzyDeliverySn (String ... fuzzyDeliverySn){
            this.fuzzyDeliverySn = solveNullList(fuzzyDeliverySn);
            return this;
        }

        public QueryBuilder rightFuzzyDeliverySn (List<String> rightFuzzyDeliverySn){
            this.rightFuzzyDeliverySn = rightFuzzyDeliverySn;
            return this;
        }

        public QueryBuilder rightFuzzyDeliverySn (String ... rightFuzzyDeliverySn){
            this.rightFuzzyDeliverySn = solveNullList(rightFuzzyDeliverySn);
            return this;
        }

        public QueryBuilder deliverySn(String deliverySn){
            setDeliverySn(deliverySn);
            return this;
        }

        public QueryBuilder deliverySnList(String ... deliverySn){
            this.deliverySnList = solveNullList(deliverySn);
            return this;
        }

        public QueryBuilder deliverySnList(List<String> deliverySn){
            this.deliverySnList = deliverySn;
            return this;
        }

        public QueryBuilder fetchDeliverySn(){
            setFetchFields("fetchFields","deliverySn");
            return this;
        }

        public QueryBuilder excludeDeliverySn(){
            setFetchFields("excludeFields","deliverySn");
            return this;
        }

        public QueryBuilder autoConfirmDayBetWeen(Integer autoConfirmDaySt,Integer autoConfirmDayEd){
            this.autoConfirmDaySt = autoConfirmDaySt;
            this.autoConfirmDayEd = autoConfirmDayEd;
            return this;
        }

        public QueryBuilder autoConfirmDayGreaterEqThan(Integer autoConfirmDaySt){
            this.autoConfirmDaySt = autoConfirmDaySt;
            return this;
        }
        public QueryBuilder autoConfirmDayLessEqThan(Integer autoConfirmDayEd){
            this.autoConfirmDayEd = autoConfirmDayEd;
            return this;
        }


        public QueryBuilder autoConfirmDay(Integer autoConfirmDay){
            setAutoConfirmDay(autoConfirmDay);
            return this;
        }

        public QueryBuilder autoConfirmDayList(Integer ... autoConfirmDay){
            this.autoConfirmDayList = solveNullList(autoConfirmDay);
            return this;
        }

        public QueryBuilder autoConfirmDayList(List<Integer> autoConfirmDay){
            this.autoConfirmDayList = autoConfirmDay;
            return this;
        }

        public QueryBuilder fetchAutoConfirmDay(){
            setFetchFields("fetchFields","autoConfirmDay");
            return this;
        }

        public QueryBuilder excludeAutoConfirmDay(){
            setFetchFields("excludeFields","autoConfirmDay");
            return this;
        }

        public QueryBuilder integrationBetWeen(Integer integrationSt,Integer integrationEd){
            this.integrationSt = integrationSt;
            this.integrationEd = integrationEd;
            return this;
        }

        public QueryBuilder integrationGreaterEqThan(Integer integrationSt){
            this.integrationSt = integrationSt;
            return this;
        }
        public QueryBuilder integrationLessEqThan(Integer integrationEd){
            this.integrationEd = integrationEd;
            return this;
        }


        public QueryBuilder integration(Integer integration){
            setIntegration(integration);
            return this;
        }

        public QueryBuilder integrationList(Integer ... integration){
            this.integrationList = solveNullList(integration);
            return this;
        }

        public QueryBuilder integrationList(List<Integer> integration){
            this.integrationList = integration;
            return this;
        }

        public QueryBuilder fetchIntegration(){
            setFetchFields("fetchFields","integration");
            return this;
        }

        public QueryBuilder excludeIntegration(){
            setFetchFields("excludeFields","integration");
            return this;
        }

        public QueryBuilder growthBetWeen(Integer growthSt,Integer growthEd){
            this.growthSt = growthSt;
            this.growthEd = growthEd;
            return this;
        }

        public QueryBuilder growthGreaterEqThan(Integer growthSt){
            this.growthSt = growthSt;
            return this;
        }
        public QueryBuilder growthLessEqThan(Integer growthEd){
            this.growthEd = growthEd;
            return this;
        }


        public QueryBuilder growth(Integer growth){
            setGrowth(growth);
            return this;
        }

        public QueryBuilder growthList(Integer ... growth){
            this.growthList = solveNullList(growth);
            return this;
        }

        public QueryBuilder growthList(List<Integer> growth){
            this.growthList = growth;
            return this;
        }

        public QueryBuilder fetchGrowth(){
            setFetchFields("fetchFields","growth");
            return this;
        }

        public QueryBuilder excludeGrowth(){
            setFetchFields("excludeFields","growth");
            return this;
        }

        public QueryBuilder fuzzyPromotionInfo (List<String> fuzzyPromotionInfo){
            this.fuzzyPromotionInfo = fuzzyPromotionInfo;
            return this;
        }

        public QueryBuilder fuzzyPromotionInfo (String ... fuzzyPromotionInfo){
            this.fuzzyPromotionInfo = solveNullList(fuzzyPromotionInfo);
            return this;
        }

        public QueryBuilder rightFuzzyPromotionInfo (List<String> rightFuzzyPromotionInfo){
            this.rightFuzzyPromotionInfo = rightFuzzyPromotionInfo;
            return this;
        }

        public QueryBuilder rightFuzzyPromotionInfo (String ... rightFuzzyPromotionInfo){
            this.rightFuzzyPromotionInfo = solveNullList(rightFuzzyPromotionInfo);
            return this;
        }

        public QueryBuilder promotionInfo(String promotionInfo){
            setPromotionInfo(promotionInfo);
            return this;
        }

        public QueryBuilder promotionInfoList(String ... promotionInfo){
            this.promotionInfoList = solveNullList(promotionInfo);
            return this;
        }

        public QueryBuilder promotionInfoList(List<String> promotionInfo){
            this.promotionInfoList = promotionInfo;
            return this;
        }

        public QueryBuilder fetchPromotionInfo(){
            setFetchFields("fetchFields","promotionInfo");
            return this;
        }

        public QueryBuilder excludePromotionInfo(){
            setFetchFields("excludeFields","promotionInfo");
            return this;
        }

        public QueryBuilder billTypeBetWeen(Integer billTypeSt,Integer billTypeEd){
            this.billTypeSt = billTypeSt;
            this.billTypeEd = billTypeEd;
            return this;
        }

        public QueryBuilder billTypeGreaterEqThan(Integer billTypeSt){
            this.billTypeSt = billTypeSt;
            return this;
        }
        public QueryBuilder billTypeLessEqThan(Integer billTypeEd){
            this.billTypeEd = billTypeEd;
            return this;
        }


        public QueryBuilder billType(Integer billType){
            setBillType(billType);
            return this;
        }

        public QueryBuilder billTypeList(Integer ... billType){
            this.billTypeList = solveNullList(billType);
            return this;
        }

        public QueryBuilder billTypeList(List<Integer> billType){
            this.billTypeList = billType;
            return this;
        }

        public QueryBuilder fetchBillType(){
            setFetchFields("fetchFields","billType");
            return this;
        }

        public QueryBuilder excludeBillType(){
            setFetchFields("excludeFields","billType");
            return this;
        }

        public QueryBuilder fuzzyBillHeader (List<String> fuzzyBillHeader){
            this.fuzzyBillHeader = fuzzyBillHeader;
            return this;
        }

        public QueryBuilder fuzzyBillHeader (String ... fuzzyBillHeader){
            this.fuzzyBillHeader = solveNullList(fuzzyBillHeader);
            return this;
        }

        public QueryBuilder rightFuzzyBillHeader (List<String> rightFuzzyBillHeader){
            this.rightFuzzyBillHeader = rightFuzzyBillHeader;
            return this;
        }

        public QueryBuilder rightFuzzyBillHeader (String ... rightFuzzyBillHeader){
            this.rightFuzzyBillHeader = solveNullList(rightFuzzyBillHeader);
            return this;
        }

        public QueryBuilder billHeader(String billHeader){
            setBillHeader(billHeader);
            return this;
        }

        public QueryBuilder billHeaderList(String ... billHeader){
            this.billHeaderList = solveNullList(billHeader);
            return this;
        }

        public QueryBuilder billHeaderList(List<String> billHeader){
            this.billHeaderList = billHeader;
            return this;
        }

        public QueryBuilder fetchBillHeader(){
            setFetchFields("fetchFields","billHeader");
            return this;
        }

        public QueryBuilder excludeBillHeader(){
            setFetchFields("excludeFields","billHeader");
            return this;
        }

        public QueryBuilder fuzzyBillContent (List<String> fuzzyBillContent){
            this.fuzzyBillContent = fuzzyBillContent;
            return this;
        }

        public QueryBuilder fuzzyBillContent (String ... fuzzyBillContent){
            this.fuzzyBillContent = solveNullList(fuzzyBillContent);
            return this;
        }

        public QueryBuilder rightFuzzyBillContent (List<String> rightFuzzyBillContent){
            this.rightFuzzyBillContent = rightFuzzyBillContent;
            return this;
        }

        public QueryBuilder rightFuzzyBillContent (String ... rightFuzzyBillContent){
            this.rightFuzzyBillContent = solveNullList(rightFuzzyBillContent);
            return this;
        }

        public QueryBuilder billContent(String billContent){
            setBillContent(billContent);
            return this;
        }

        public QueryBuilder billContentList(String ... billContent){
            this.billContentList = solveNullList(billContent);
            return this;
        }

        public QueryBuilder billContentList(List<String> billContent){
            this.billContentList = billContent;
            return this;
        }

        public QueryBuilder fetchBillContent(){
            setFetchFields("fetchFields","billContent");
            return this;
        }

        public QueryBuilder excludeBillContent(){
            setFetchFields("excludeFields","billContent");
            return this;
        }

        public QueryBuilder fuzzyBillReceiverPhone (List<String> fuzzyBillReceiverPhone){
            this.fuzzyBillReceiverPhone = fuzzyBillReceiverPhone;
            return this;
        }

        public QueryBuilder fuzzyBillReceiverPhone (String ... fuzzyBillReceiverPhone){
            this.fuzzyBillReceiverPhone = solveNullList(fuzzyBillReceiverPhone);
            return this;
        }

        public QueryBuilder rightFuzzyBillReceiverPhone (List<String> rightFuzzyBillReceiverPhone){
            this.rightFuzzyBillReceiverPhone = rightFuzzyBillReceiverPhone;
            return this;
        }

        public QueryBuilder rightFuzzyBillReceiverPhone (String ... rightFuzzyBillReceiverPhone){
            this.rightFuzzyBillReceiverPhone = solveNullList(rightFuzzyBillReceiverPhone);
            return this;
        }

        public QueryBuilder billReceiverPhone(String billReceiverPhone){
            setBillReceiverPhone(billReceiverPhone);
            return this;
        }

        public QueryBuilder billReceiverPhoneList(String ... billReceiverPhone){
            this.billReceiverPhoneList = solveNullList(billReceiverPhone);
            return this;
        }

        public QueryBuilder billReceiverPhoneList(List<String> billReceiverPhone){
            this.billReceiverPhoneList = billReceiverPhone;
            return this;
        }

        public QueryBuilder fetchBillReceiverPhone(){
            setFetchFields("fetchFields","billReceiverPhone");
            return this;
        }

        public QueryBuilder excludeBillReceiverPhone(){
            setFetchFields("excludeFields","billReceiverPhone");
            return this;
        }

        public QueryBuilder fuzzyBillReceiverEmail (List<String> fuzzyBillReceiverEmail){
            this.fuzzyBillReceiverEmail = fuzzyBillReceiverEmail;
            return this;
        }

        public QueryBuilder fuzzyBillReceiverEmail (String ... fuzzyBillReceiverEmail){
            this.fuzzyBillReceiverEmail = solveNullList(fuzzyBillReceiverEmail);
            return this;
        }

        public QueryBuilder rightFuzzyBillReceiverEmail (List<String> rightFuzzyBillReceiverEmail){
            this.rightFuzzyBillReceiverEmail = rightFuzzyBillReceiverEmail;
            return this;
        }

        public QueryBuilder rightFuzzyBillReceiverEmail (String ... rightFuzzyBillReceiverEmail){
            this.rightFuzzyBillReceiverEmail = solveNullList(rightFuzzyBillReceiverEmail);
            return this;
        }

        public QueryBuilder billReceiverEmail(String billReceiverEmail){
            setBillReceiverEmail(billReceiverEmail);
            return this;
        }

        public QueryBuilder billReceiverEmailList(String ... billReceiverEmail){
            this.billReceiverEmailList = solveNullList(billReceiverEmail);
            return this;
        }

        public QueryBuilder billReceiverEmailList(List<String> billReceiverEmail){
            this.billReceiverEmailList = billReceiverEmail;
            return this;
        }

        public QueryBuilder fetchBillReceiverEmail(){
            setFetchFields("fetchFields","billReceiverEmail");
            return this;
        }

        public QueryBuilder excludeBillReceiverEmail(){
            setFetchFields("excludeFields","billReceiverEmail");
            return this;
        }

        public QueryBuilder fuzzyReceiverName (List<String> fuzzyReceiverName){
            this.fuzzyReceiverName = fuzzyReceiverName;
            return this;
        }

        public QueryBuilder fuzzyReceiverName (String ... fuzzyReceiverName){
            this.fuzzyReceiverName = solveNullList(fuzzyReceiverName);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverName (List<String> rightFuzzyReceiverName){
            this.rightFuzzyReceiverName = rightFuzzyReceiverName;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverName (String ... rightFuzzyReceiverName){
            this.rightFuzzyReceiverName = solveNullList(rightFuzzyReceiverName);
            return this;
        }

        public QueryBuilder receiverName(String receiverName){
            setReceiverName(receiverName);
            return this;
        }

        public QueryBuilder receiverNameList(String ... receiverName){
            this.receiverNameList = solveNullList(receiverName);
            return this;
        }

        public QueryBuilder receiverNameList(List<String> receiverName){
            this.receiverNameList = receiverName;
            return this;
        }

        public QueryBuilder fetchReceiverName(){
            setFetchFields("fetchFields","receiverName");
            return this;
        }

        public QueryBuilder excludeReceiverName(){
            setFetchFields("excludeFields","receiverName");
            return this;
        }

        public QueryBuilder fuzzyReceiverPhone (List<String> fuzzyReceiverPhone){
            this.fuzzyReceiverPhone = fuzzyReceiverPhone;
            return this;
        }

        public QueryBuilder fuzzyReceiverPhone (String ... fuzzyReceiverPhone){
            this.fuzzyReceiverPhone = solveNullList(fuzzyReceiverPhone);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverPhone (List<String> rightFuzzyReceiverPhone){
            this.rightFuzzyReceiverPhone = rightFuzzyReceiverPhone;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverPhone (String ... rightFuzzyReceiverPhone){
            this.rightFuzzyReceiverPhone = solveNullList(rightFuzzyReceiverPhone);
            return this;
        }

        public QueryBuilder receiverPhone(String receiverPhone){
            setReceiverPhone(receiverPhone);
            return this;
        }

        public QueryBuilder receiverPhoneList(String ... receiverPhone){
            this.receiverPhoneList = solveNullList(receiverPhone);
            return this;
        }

        public QueryBuilder receiverPhoneList(List<String> receiverPhone){
            this.receiverPhoneList = receiverPhone;
            return this;
        }

        public QueryBuilder fetchReceiverPhone(){
            setFetchFields("fetchFields","receiverPhone");
            return this;
        }

        public QueryBuilder excludeReceiverPhone(){
            setFetchFields("excludeFields","receiverPhone");
            return this;
        }

        public QueryBuilder fuzzyReceiverPostCode (List<String> fuzzyReceiverPostCode){
            this.fuzzyReceiverPostCode = fuzzyReceiverPostCode;
            return this;
        }

        public QueryBuilder fuzzyReceiverPostCode (String ... fuzzyReceiverPostCode){
            this.fuzzyReceiverPostCode = solveNullList(fuzzyReceiverPostCode);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverPostCode (List<String> rightFuzzyReceiverPostCode){
            this.rightFuzzyReceiverPostCode = rightFuzzyReceiverPostCode;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverPostCode (String ... rightFuzzyReceiverPostCode){
            this.rightFuzzyReceiverPostCode = solveNullList(rightFuzzyReceiverPostCode);
            return this;
        }

        public QueryBuilder receiverPostCode(String receiverPostCode){
            setReceiverPostCode(receiverPostCode);
            return this;
        }

        public QueryBuilder receiverPostCodeList(String ... receiverPostCode){
            this.receiverPostCodeList = solveNullList(receiverPostCode);
            return this;
        }

        public QueryBuilder receiverPostCodeList(List<String> receiverPostCode){
            this.receiverPostCodeList = receiverPostCode;
            return this;
        }

        public QueryBuilder fetchReceiverPostCode(){
            setFetchFields("fetchFields","receiverPostCode");
            return this;
        }

        public QueryBuilder excludeReceiverPostCode(){
            setFetchFields("excludeFields","receiverPostCode");
            return this;
        }

        public QueryBuilder fuzzyReceiverProvince (List<String> fuzzyReceiverProvince){
            this.fuzzyReceiverProvince = fuzzyReceiverProvince;
            return this;
        }

        public QueryBuilder fuzzyReceiverProvince (String ... fuzzyReceiverProvince){
            this.fuzzyReceiverProvince = solveNullList(fuzzyReceiverProvince);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverProvince (List<String> rightFuzzyReceiverProvince){
            this.rightFuzzyReceiverProvince = rightFuzzyReceiverProvince;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverProvince (String ... rightFuzzyReceiverProvince){
            this.rightFuzzyReceiverProvince = solveNullList(rightFuzzyReceiverProvince);
            return this;
        }

        public QueryBuilder receiverProvince(String receiverProvince){
            setReceiverProvince(receiverProvince);
            return this;
        }

        public QueryBuilder receiverProvinceList(String ... receiverProvince){
            this.receiverProvinceList = solveNullList(receiverProvince);
            return this;
        }

        public QueryBuilder receiverProvinceList(List<String> receiverProvince){
            this.receiverProvinceList = receiverProvince;
            return this;
        }

        public QueryBuilder fetchReceiverProvince(){
            setFetchFields("fetchFields","receiverProvince");
            return this;
        }

        public QueryBuilder excludeReceiverProvince(){
            setFetchFields("excludeFields","receiverProvince");
            return this;
        }

        public QueryBuilder fuzzyReceiverCity (List<String> fuzzyReceiverCity){
            this.fuzzyReceiverCity = fuzzyReceiverCity;
            return this;
        }

        public QueryBuilder fuzzyReceiverCity (String ... fuzzyReceiverCity){
            this.fuzzyReceiverCity = solveNullList(fuzzyReceiverCity);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverCity (List<String> rightFuzzyReceiverCity){
            this.rightFuzzyReceiverCity = rightFuzzyReceiverCity;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverCity (String ... rightFuzzyReceiverCity){
            this.rightFuzzyReceiverCity = solveNullList(rightFuzzyReceiverCity);
            return this;
        }

        public QueryBuilder receiverCity(String receiverCity){
            setReceiverCity(receiverCity);
            return this;
        }

        public QueryBuilder receiverCityList(String ... receiverCity){
            this.receiverCityList = solveNullList(receiverCity);
            return this;
        }

        public QueryBuilder receiverCityList(List<String> receiverCity){
            this.receiverCityList = receiverCity;
            return this;
        }

        public QueryBuilder fetchReceiverCity(){
            setFetchFields("fetchFields","receiverCity");
            return this;
        }

        public QueryBuilder excludeReceiverCity(){
            setFetchFields("excludeFields","receiverCity");
            return this;
        }

        public QueryBuilder fuzzyReceiverRegion (List<String> fuzzyReceiverRegion){
            this.fuzzyReceiverRegion = fuzzyReceiverRegion;
            return this;
        }

        public QueryBuilder fuzzyReceiverRegion (String ... fuzzyReceiverRegion){
            this.fuzzyReceiverRegion = solveNullList(fuzzyReceiverRegion);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverRegion (List<String> rightFuzzyReceiverRegion){
            this.rightFuzzyReceiverRegion = rightFuzzyReceiverRegion;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverRegion (String ... rightFuzzyReceiverRegion){
            this.rightFuzzyReceiverRegion = solveNullList(rightFuzzyReceiverRegion);
            return this;
        }

        public QueryBuilder receiverRegion(String receiverRegion){
            setReceiverRegion(receiverRegion);
            return this;
        }

        public QueryBuilder receiverRegionList(String ... receiverRegion){
            this.receiverRegionList = solveNullList(receiverRegion);
            return this;
        }

        public QueryBuilder receiverRegionList(List<String> receiverRegion){
            this.receiverRegionList = receiverRegion;
            return this;
        }

        public QueryBuilder fetchReceiverRegion(){
            setFetchFields("fetchFields","receiverRegion");
            return this;
        }

        public QueryBuilder excludeReceiverRegion(){
            setFetchFields("excludeFields","receiverRegion");
            return this;
        }

        public QueryBuilder fuzzyReceiverDetailAddress (List<String> fuzzyReceiverDetailAddress){
            this.fuzzyReceiverDetailAddress = fuzzyReceiverDetailAddress;
            return this;
        }

        public QueryBuilder fuzzyReceiverDetailAddress (String ... fuzzyReceiverDetailAddress){
            this.fuzzyReceiverDetailAddress = solveNullList(fuzzyReceiverDetailAddress);
            return this;
        }

        public QueryBuilder rightFuzzyReceiverDetailAddress (List<String> rightFuzzyReceiverDetailAddress){
            this.rightFuzzyReceiverDetailAddress = rightFuzzyReceiverDetailAddress;
            return this;
        }

        public QueryBuilder rightFuzzyReceiverDetailAddress (String ... rightFuzzyReceiverDetailAddress){
            this.rightFuzzyReceiverDetailAddress = solveNullList(rightFuzzyReceiverDetailAddress);
            return this;
        }

        public QueryBuilder receiverDetailAddress(String receiverDetailAddress){
            setReceiverDetailAddress(receiverDetailAddress);
            return this;
        }

        public QueryBuilder receiverDetailAddressList(String ... receiverDetailAddress){
            this.receiverDetailAddressList = solveNullList(receiverDetailAddress);
            return this;
        }

        public QueryBuilder receiverDetailAddressList(List<String> receiverDetailAddress){
            this.receiverDetailAddressList = receiverDetailAddress;
            return this;
        }

        public QueryBuilder fetchReceiverDetailAddress(){
            setFetchFields("fetchFields","receiverDetailAddress");
            return this;
        }

        public QueryBuilder excludeReceiverDetailAddress(){
            setFetchFields("excludeFields","receiverDetailAddress");
            return this;
        }

        public QueryBuilder fuzzyNote (List<String> fuzzyNote){
            this.fuzzyNote = fuzzyNote;
            return this;
        }

        public QueryBuilder fuzzyNote (String ... fuzzyNote){
            this.fuzzyNote = solveNullList(fuzzyNote);
            return this;
        }

        public QueryBuilder rightFuzzyNote (List<String> rightFuzzyNote){
            this.rightFuzzyNote = rightFuzzyNote;
            return this;
        }

        public QueryBuilder rightFuzzyNote (String ... rightFuzzyNote){
            this.rightFuzzyNote = solveNullList(rightFuzzyNote);
            return this;
        }

        public QueryBuilder note(String note){
            setNote(note);
            return this;
        }

        public QueryBuilder noteList(String ... note){
            this.noteList = solveNullList(note);
            return this;
        }

        public QueryBuilder noteList(List<String> note){
            this.noteList = note;
            return this;
        }

        public QueryBuilder fetchNote(){
            setFetchFields("fetchFields","note");
            return this;
        }

        public QueryBuilder excludeNote(){
            setFetchFields("excludeFields","note");
            return this;
        }

        public QueryBuilder confirmStatusBetWeen(Integer confirmStatusSt,Integer confirmStatusEd){
            this.confirmStatusSt = confirmStatusSt;
            this.confirmStatusEd = confirmStatusEd;
            return this;
        }

        public QueryBuilder confirmStatusGreaterEqThan(Integer confirmStatusSt){
            this.confirmStatusSt = confirmStatusSt;
            return this;
        }
        public QueryBuilder confirmStatusLessEqThan(Integer confirmStatusEd){
            this.confirmStatusEd = confirmStatusEd;
            return this;
        }


        public QueryBuilder confirmStatus(Integer confirmStatus){
            setConfirmStatus(confirmStatus);
            return this;
        }

        public QueryBuilder confirmStatusList(Integer ... confirmStatus){
            this.confirmStatusList = solveNullList(confirmStatus);
            return this;
        }

        public QueryBuilder confirmStatusList(List<Integer> confirmStatus){
            this.confirmStatusList = confirmStatus;
            return this;
        }

        public QueryBuilder fetchConfirmStatus(){
            setFetchFields("fetchFields","confirmStatus");
            return this;
        }

        public QueryBuilder excludeConfirmStatus(){
            setFetchFields("excludeFields","confirmStatus");
            return this;
        }

        public QueryBuilder deleteStatusBetWeen(Integer deleteStatusSt,Integer deleteStatusEd){
            this.deleteStatusSt = deleteStatusSt;
            this.deleteStatusEd = deleteStatusEd;
            return this;
        }

        public QueryBuilder deleteStatusGreaterEqThan(Integer deleteStatusSt){
            this.deleteStatusSt = deleteStatusSt;
            return this;
        }
        public QueryBuilder deleteStatusLessEqThan(Integer deleteStatusEd){
            this.deleteStatusEd = deleteStatusEd;
            return this;
        }


        public QueryBuilder deleteStatus(Integer deleteStatus){
            setDeleteStatus(deleteStatus);
            return this;
        }

        public QueryBuilder deleteStatusList(Integer ... deleteStatus){
            this.deleteStatusList = solveNullList(deleteStatus);
            return this;
        }

        public QueryBuilder deleteStatusList(List<Integer> deleteStatus){
            this.deleteStatusList = deleteStatus;
            return this;
        }

        public QueryBuilder fetchDeleteStatus(){
            setFetchFields("fetchFields","deleteStatus");
            return this;
        }

        public QueryBuilder excludeDeleteStatus(){
            setFetchFields("excludeFields","deleteStatus");
            return this;
        }

        public QueryBuilder useIntegrationBetWeen(Integer useIntegrationSt,Integer useIntegrationEd){
            this.useIntegrationSt = useIntegrationSt;
            this.useIntegrationEd = useIntegrationEd;
            return this;
        }

        public QueryBuilder useIntegrationGreaterEqThan(Integer useIntegrationSt){
            this.useIntegrationSt = useIntegrationSt;
            return this;
        }
        public QueryBuilder useIntegrationLessEqThan(Integer useIntegrationEd){
            this.useIntegrationEd = useIntegrationEd;
            return this;
        }


        public QueryBuilder useIntegration(Integer useIntegration){
            setUseIntegration(useIntegration);
            return this;
        }

        public QueryBuilder useIntegrationList(Integer ... useIntegration){
            this.useIntegrationList = solveNullList(useIntegration);
            return this;
        }

        public QueryBuilder useIntegrationList(List<Integer> useIntegration){
            this.useIntegrationList = useIntegration;
            return this;
        }

        public QueryBuilder fetchUseIntegration(){
            setFetchFields("fetchFields","useIntegration");
            return this;
        }

        public QueryBuilder excludeUseIntegration(){
            setFetchFields("excludeFields","useIntegration");
            return this;
        }

        public QueryBuilder paymentTimeBetWeen(java.time.LocalDateTime paymentTimeSt,java.time.LocalDateTime paymentTimeEd){
            this.paymentTimeSt = paymentTimeSt;
            this.paymentTimeEd = paymentTimeEd;
            return this;
        }

        public QueryBuilder paymentTimeGreaterEqThan(java.time.LocalDateTime paymentTimeSt){
            this.paymentTimeSt = paymentTimeSt;
            return this;
        }
        public QueryBuilder paymentTimeLessEqThan(java.time.LocalDateTime paymentTimeEd){
            this.paymentTimeEd = paymentTimeEd;
            return this;
        }


        public QueryBuilder paymentTime(java.time.LocalDateTime paymentTime){
            setPaymentTime(paymentTime);
            return this;
        }

        public QueryBuilder paymentTimeList(java.time.LocalDateTime ... paymentTime){
            this.paymentTimeList = solveNullList(paymentTime);
            return this;
        }

        public QueryBuilder paymentTimeList(List<java.time.LocalDateTime> paymentTime){
            this.paymentTimeList = paymentTime;
            return this;
        }

        public QueryBuilder fetchPaymentTime(){
            setFetchFields("fetchFields","paymentTime");
            return this;
        }

        public QueryBuilder excludePaymentTime(){
            setFetchFields("excludeFields","paymentTime");
            return this;
        }

        public QueryBuilder deliveryTimeBetWeen(java.time.LocalDateTime deliveryTimeSt,java.time.LocalDateTime deliveryTimeEd){
            this.deliveryTimeSt = deliveryTimeSt;
            this.deliveryTimeEd = deliveryTimeEd;
            return this;
        }

        public QueryBuilder deliveryTimeGreaterEqThan(java.time.LocalDateTime deliveryTimeSt){
            this.deliveryTimeSt = deliveryTimeSt;
            return this;
        }
        public QueryBuilder deliveryTimeLessEqThan(java.time.LocalDateTime deliveryTimeEd){
            this.deliveryTimeEd = deliveryTimeEd;
            return this;
        }


        public QueryBuilder deliveryTime(java.time.LocalDateTime deliveryTime){
            setDeliveryTime(deliveryTime);
            return this;
        }

        public QueryBuilder deliveryTimeList(java.time.LocalDateTime ... deliveryTime){
            this.deliveryTimeList = solveNullList(deliveryTime);
            return this;
        }

        public QueryBuilder deliveryTimeList(List<java.time.LocalDateTime> deliveryTime){
            this.deliveryTimeList = deliveryTime;
            return this;
        }

        public QueryBuilder fetchDeliveryTime(){
            setFetchFields("fetchFields","deliveryTime");
            return this;
        }

        public QueryBuilder excludeDeliveryTime(){
            setFetchFields("excludeFields","deliveryTime");
            return this;
        }

        public QueryBuilder receiveTimeBetWeen(java.time.LocalDateTime receiveTimeSt,java.time.LocalDateTime receiveTimeEd){
            this.receiveTimeSt = receiveTimeSt;
            this.receiveTimeEd = receiveTimeEd;
            return this;
        }

        public QueryBuilder receiveTimeGreaterEqThan(java.time.LocalDateTime receiveTimeSt){
            this.receiveTimeSt = receiveTimeSt;
            return this;
        }
        public QueryBuilder receiveTimeLessEqThan(java.time.LocalDateTime receiveTimeEd){
            this.receiveTimeEd = receiveTimeEd;
            return this;
        }


        public QueryBuilder receiveTime(java.time.LocalDateTime receiveTime){
            setReceiveTime(receiveTime);
            return this;
        }

        public QueryBuilder receiveTimeList(java.time.LocalDateTime ... receiveTime){
            this.receiveTimeList = solveNullList(receiveTime);
            return this;
        }

        public QueryBuilder receiveTimeList(List<java.time.LocalDateTime> receiveTime){
            this.receiveTimeList = receiveTime;
            return this;
        }

        public QueryBuilder fetchReceiveTime(){
            setFetchFields("fetchFields","receiveTime");
            return this;
        }

        public QueryBuilder excludeReceiveTime(){
            setFetchFields("excludeFields","receiveTime");
            return this;
        }

        public QueryBuilder commentTimeBetWeen(java.time.LocalDateTime commentTimeSt,java.time.LocalDateTime commentTimeEd){
            this.commentTimeSt = commentTimeSt;
            this.commentTimeEd = commentTimeEd;
            return this;
        }

        public QueryBuilder commentTimeGreaterEqThan(java.time.LocalDateTime commentTimeSt){
            this.commentTimeSt = commentTimeSt;
            return this;
        }
        public QueryBuilder commentTimeLessEqThan(java.time.LocalDateTime commentTimeEd){
            this.commentTimeEd = commentTimeEd;
            return this;
        }


        public QueryBuilder commentTime(java.time.LocalDateTime commentTime){
            setCommentTime(commentTime);
            return this;
        }

        public QueryBuilder commentTimeList(java.time.LocalDateTime ... commentTime){
            this.commentTimeList = solveNullList(commentTime);
            return this;
        }

        public QueryBuilder commentTimeList(List<java.time.LocalDateTime> commentTime){
            this.commentTimeList = commentTime;
            return this;
        }

        public QueryBuilder fetchCommentTime(){
            setFetchFields("fetchFields","commentTime");
            return this;
        }

        public QueryBuilder excludeCommentTime(){
            setFetchFields("excludeFields","commentTime");
            return this;
        }

        public QueryBuilder modifyTimeBetWeen(java.time.LocalDateTime modifyTimeSt,java.time.LocalDateTime modifyTimeEd){
            this.modifyTimeSt = modifyTimeSt;
            this.modifyTimeEd = modifyTimeEd;
            return this;
        }

        public QueryBuilder modifyTimeGreaterEqThan(java.time.LocalDateTime modifyTimeSt){
            this.modifyTimeSt = modifyTimeSt;
            return this;
        }
        public QueryBuilder modifyTimeLessEqThan(java.time.LocalDateTime modifyTimeEd){
            this.modifyTimeEd = modifyTimeEd;
            return this;
        }


        public QueryBuilder modifyTime(java.time.LocalDateTime modifyTime){
            setModifyTime(modifyTime);
            return this;
        }

        public QueryBuilder modifyTimeList(java.time.LocalDateTime ... modifyTime){
            this.modifyTimeList = solveNullList(modifyTime);
            return this;
        }

        public QueryBuilder modifyTimeList(List<java.time.LocalDateTime> modifyTime){
            this.modifyTimeList = modifyTime;
            return this;
        }

        public QueryBuilder fetchModifyTime(){
            setFetchFields("fetchFields","modifyTime");
            return this;
        }

        public QueryBuilder excludeModifyTime(){
            setFetchFields("excludeFields","modifyTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public OmsOrder build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> memberIdList;

        public List<Long> getMemberIdList(){return this.memberIdList;}

        private Long memberIdSt;

        private Long memberIdEd;

        public Long getMemberIdSt(){return this.memberIdSt;}

        public Long getMemberIdEd(){return this.memberIdEd;}

        private List<Long> couponIdList;

        public List<Long> getCouponIdList(){return this.couponIdList;}

        private Long couponIdSt;

        private Long couponIdEd;

        public Long getCouponIdSt(){return this.couponIdSt;}

        public Long getCouponIdEd(){return this.couponIdEd;}

        private List<String> orderSnList;

        public List<String> getOrderSnList(){return this.orderSnList;}


        private List<String> fuzzyOrderSn;

        public List<String> getFuzzyOrderSn(){return this.fuzzyOrderSn;}

        private List<String> rightFuzzyOrderSn;

        public List<String> getRightFuzzyOrderSn(){return this.rightFuzzyOrderSn;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> memberUsernameList;

        public List<String> getMemberUsernameList(){return this.memberUsernameList;}


        private List<String> fuzzyMemberUsername;

        public List<String> getFuzzyMemberUsername(){return this.fuzzyMemberUsername;}

        private List<String> rightFuzzyMemberUsername;

        public List<String> getRightFuzzyMemberUsername(){return this.rightFuzzyMemberUsername;}
        private List<java.math.BigDecimal> totalAmountList;

        public List<java.math.BigDecimal> getTotalAmountList(){return this.totalAmountList;}

        private java.math.BigDecimal totalAmountSt;

        private java.math.BigDecimal totalAmountEd;

        public java.math.BigDecimal getTotalAmountSt(){return this.totalAmountSt;}

        public java.math.BigDecimal getTotalAmountEd(){return this.totalAmountEd;}

        private List<java.math.BigDecimal> payAmountList;

        public List<java.math.BigDecimal> getPayAmountList(){return this.payAmountList;}

        private java.math.BigDecimal payAmountSt;

        private java.math.BigDecimal payAmountEd;

        public java.math.BigDecimal getPayAmountSt(){return this.payAmountSt;}

        public java.math.BigDecimal getPayAmountEd(){return this.payAmountEd;}

        private List<java.math.BigDecimal> freightAmountList;

        public List<java.math.BigDecimal> getFreightAmountList(){return this.freightAmountList;}

        private java.math.BigDecimal freightAmountSt;

        private java.math.BigDecimal freightAmountEd;

        public java.math.BigDecimal getFreightAmountSt(){return this.freightAmountSt;}

        public java.math.BigDecimal getFreightAmountEd(){return this.freightAmountEd;}

        private List<java.math.BigDecimal> promotionAmountList;

        public List<java.math.BigDecimal> getPromotionAmountList(){return this.promotionAmountList;}

        private java.math.BigDecimal promotionAmountSt;

        private java.math.BigDecimal promotionAmountEd;

        public java.math.BigDecimal getPromotionAmountSt(){return this.promotionAmountSt;}

        public java.math.BigDecimal getPromotionAmountEd(){return this.promotionAmountEd;}

        private List<java.math.BigDecimal> integrationAmountList;

        public List<java.math.BigDecimal> getIntegrationAmountList(){return this.integrationAmountList;}

        private java.math.BigDecimal integrationAmountSt;

        private java.math.BigDecimal integrationAmountEd;

        public java.math.BigDecimal getIntegrationAmountSt(){return this.integrationAmountSt;}

        public java.math.BigDecimal getIntegrationAmountEd(){return this.integrationAmountEd;}

        private List<java.math.BigDecimal> couponAmountList;

        public List<java.math.BigDecimal> getCouponAmountList(){return this.couponAmountList;}

        private java.math.BigDecimal couponAmountSt;

        private java.math.BigDecimal couponAmountEd;

        public java.math.BigDecimal getCouponAmountSt(){return this.couponAmountSt;}

        public java.math.BigDecimal getCouponAmountEd(){return this.couponAmountEd;}

        private List<java.math.BigDecimal> discountAmountList;

        public List<java.math.BigDecimal> getDiscountAmountList(){return this.discountAmountList;}

        private java.math.BigDecimal discountAmountSt;

        private java.math.BigDecimal discountAmountEd;

        public java.math.BigDecimal getDiscountAmountSt(){return this.discountAmountSt;}

        public java.math.BigDecimal getDiscountAmountEd(){return this.discountAmountEd;}

        private List<Integer> payTypeList;

        public List<Integer> getPayTypeList(){return this.payTypeList;}

        private Integer payTypeSt;

        private Integer payTypeEd;

        public Integer getPayTypeSt(){return this.payTypeSt;}

        public Integer getPayTypeEd(){return this.payTypeEd;}

        private List<Integer> sourceTypeList;

        public List<Integer> getSourceTypeList(){return this.sourceTypeList;}

        private Integer sourceTypeSt;

        private Integer sourceTypeEd;

        public Integer getSourceTypeSt(){return this.sourceTypeSt;}

        public Integer getSourceTypeEd(){return this.sourceTypeEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<Integer> orderTypeList;

        public List<Integer> getOrderTypeList(){return this.orderTypeList;}

        private Integer orderTypeSt;

        private Integer orderTypeEd;

        public Integer getOrderTypeSt(){return this.orderTypeSt;}

        public Integer getOrderTypeEd(){return this.orderTypeEd;}

        private List<String> deliveryCompanyList;

        public List<String> getDeliveryCompanyList(){return this.deliveryCompanyList;}


        private List<String> fuzzyDeliveryCompany;

        public List<String> getFuzzyDeliveryCompany(){return this.fuzzyDeliveryCompany;}

        private List<String> rightFuzzyDeliveryCompany;

        public List<String> getRightFuzzyDeliveryCompany(){return this.rightFuzzyDeliveryCompany;}
        private List<String> deliverySnList;

        public List<String> getDeliverySnList(){return this.deliverySnList;}


        private List<String> fuzzyDeliverySn;

        public List<String> getFuzzyDeliverySn(){return this.fuzzyDeliverySn;}

        private List<String> rightFuzzyDeliverySn;

        public List<String> getRightFuzzyDeliverySn(){return this.rightFuzzyDeliverySn;}
        private List<Integer> autoConfirmDayList;

        public List<Integer> getAutoConfirmDayList(){return this.autoConfirmDayList;}

        private Integer autoConfirmDaySt;

        private Integer autoConfirmDayEd;

        public Integer getAutoConfirmDaySt(){return this.autoConfirmDaySt;}

        public Integer getAutoConfirmDayEd(){return this.autoConfirmDayEd;}

        private List<Integer> integrationList;

        public List<Integer> getIntegrationList(){return this.integrationList;}

        private Integer integrationSt;

        private Integer integrationEd;

        public Integer getIntegrationSt(){return this.integrationSt;}

        public Integer getIntegrationEd(){return this.integrationEd;}

        private List<Integer> growthList;

        public List<Integer> getGrowthList(){return this.growthList;}

        private Integer growthSt;

        private Integer growthEd;

        public Integer getGrowthSt(){return this.growthSt;}

        public Integer getGrowthEd(){return this.growthEd;}

        private List<String> promotionInfoList;

        public List<String> getPromotionInfoList(){return this.promotionInfoList;}


        private List<String> fuzzyPromotionInfo;

        public List<String> getFuzzyPromotionInfo(){return this.fuzzyPromotionInfo;}

        private List<String> rightFuzzyPromotionInfo;

        public List<String> getRightFuzzyPromotionInfo(){return this.rightFuzzyPromotionInfo;}
        private List<Integer> billTypeList;

        public List<Integer> getBillTypeList(){return this.billTypeList;}

        private Integer billTypeSt;

        private Integer billTypeEd;

        public Integer getBillTypeSt(){return this.billTypeSt;}

        public Integer getBillTypeEd(){return this.billTypeEd;}

        private List<String> billHeaderList;

        public List<String> getBillHeaderList(){return this.billHeaderList;}


        private List<String> fuzzyBillHeader;

        public List<String> getFuzzyBillHeader(){return this.fuzzyBillHeader;}

        private List<String> rightFuzzyBillHeader;

        public List<String> getRightFuzzyBillHeader(){return this.rightFuzzyBillHeader;}
        private List<String> billContentList;

        public List<String> getBillContentList(){return this.billContentList;}


        private List<String> fuzzyBillContent;

        public List<String> getFuzzyBillContent(){return this.fuzzyBillContent;}

        private List<String> rightFuzzyBillContent;

        public List<String> getRightFuzzyBillContent(){return this.rightFuzzyBillContent;}
        private List<String> billReceiverPhoneList;

        public List<String> getBillReceiverPhoneList(){return this.billReceiverPhoneList;}


        private List<String> fuzzyBillReceiverPhone;

        public List<String> getFuzzyBillReceiverPhone(){return this.fuzzyBillReceiverPhone;}

        private List<String> rightFuzzyBillReceiverPhone;

        public List<String> getRightFuzzyBillReceiverPhone(){return this.rightFuzzyBillReceiverPhone;}
        private List<String> billReceiverEmailList;

        public List<String> getBillReceiverEmailList(){return this.billReceiverEmailList;}


        private List<String> fuzzyBillReceiverEmail;

        public List<String> getFuzzyBillReceiverEmail(){return this.fuzzyBillReceiverEmail;}

        private List<String> rightFuzzyBillReceiverEmail;

        public List<String> getRightFuzzyBillReceiverEmail(){return this.rightFuzzyBillReceiverEmail;}
        private List<String> receiverNameList;

        public List<String> getReceiverNameList(){return this.receiverNameList;}


        private List<String> fuzzyReceiverName;

        public List<String> getFuzzyReceiverName(){return this.fuzzyReceiverName;}

        private List<String> rightFuzzyReceiverName;

        public List<String> getRightFuzzyReceiverName(){return this.rightFuzzyReceiverName;}
        private List<String> receiverPhoneList;

        public List<String> getReceiverPhoneList(){return this.receiverPhoneList;}


        private List<String> fuzzyReceiverPhone;

        public List<String> getFuzzyReceiverPhone(){return this.fuzzyReceiverPhone;}

        private List<String> rightFuzzyReceiverPhone;

        public List<String> getRightFuzzyReceiverPhone(){return this.rightFuzzyReceiverPhone;}
        private List<String> receiverPostCodeList;

        public List<String> getReceiverPostCodeList(){return this.receiverPostCodeList;}


        private List<String> fuzzyReceiverPostCode;

        public List<String> getFuzzyReceiverPostCode(){return this.fuzzyReceiverPostCode;}

        private List<String> rightFuzzyReceiverPostCode;

        public List<String> getRightFuzzyReceiverPostCode(){return this.rightFuzzyReceiverPostCode;}
        private List<String> receiverProvinceList;

        public List<String> getReceiverProvinceList(){return this.receiverProvinceList;}


        private List<String> fuzzyReceiverProvince;

        public List<String> getFuzzyReceiverProvince(){return this.fuzzyReceiverProvince;}

        private List<String> rightFuzzyReceiverProvince;

        public List<String> getRightFuzzyReceiverProvince(){return this.rightFuzzyReceiverProvince;}
        private List<String> receiverCityList;

        public List<String> getReceiverCityList(){return this.receiverCityList;}


        private List<String> fuzzyReceiverCity;

        public List<String> getFuzzyReceiverCity(){return this.fuzzyReceiverCity;}

        private List<String> rightFuzzyReceiverCity;

        public List<String> getRightFuzzyReceiverCity(){return this.rightFuzzyReceiverCity;}
        private List<String> receiverRegionList;

        public List<String> getReceiverRegionList(){return this.receiverRegionList;}


        private List<String> fuzzyReceiverRegion;

        public List<String> getFuzzyReceiverRegion(){return this.fuzzyReceiverRegion;}

        private List<String> rightFuzzyReceiverRegion;

        public List<String> getRightFuzzyReceiverRegion(){return this.rightFuzzyReceiverRegion;}
        private List<String> receiverDetailAddressList;

        public List<String> getReceiverDetailAddressList(){return this.receiverDetailAddressList;}


        private List<String> fuzzyReceiverDetailAddress;

        public List<String> getFuzzyReceiverDetailAddress(){return this.fuzzyReceiverDetailAddress;}

        private List<String> rightFuzzyReceiverDetailAddress;

        public List<String> getRightFuzzyReceiverDetailAddress(){return this.rightFuzzyReceiverDetailAddress;}
        private List<String> noteList;

        public List<String> getNoteList(){return this.noteList;}


        private List<String> fuzzyNote;

        public List<String> getFuzzyNote(){return this.fuzzyNote;}

        private List<String> rightFuzzyNote;

        public List<String> getRightFuzzyNote(){return this.rightFuzzyNote;}
        private List<Integer> confirmStatusList;

        public List<Integer> getConfirmStatusList(){return this.confirmStatusList;}

        private Integer confirmStatusSt;

        private Integer confirmStatusEd;

        public Integer getConfirmStatusSt(){return this.confirmStatusSt;}

        public Integer getConfirmStatusEd(){return this.confirmStatusEd;}

        private List<Integer> deleteStatusList;

        public List<Integer> getDeleteStatusList(){return this.deleteStatusList;}

        private Integer deleteStatusSt;

        private Integer deleteStatusEd;

        public Integer getDeleteStatusSt(){return this.deleteStatusSt;}

        public Integer getDeleteStatusEd(){return this.deleteStatusEd;}

        private List<Integer> useIntegrationList;

        public List<Integer> getUseIntegrationList(){return this.useIntegrationList;}

        private Integer useIntegrationSt;

        private Integer useIntegrationEd;

        public Integer getUseIntegrationSt(){return this.useIntegrationSt;}

        public Integer getUseIntegrationEd(){return this.useIntegrationEd;}

        private List<java.time.LocalDateTime> paymentTimeList;

        public List<java.time.LocalDateTime> getPaymentTimeList(){return this.paymentTimeList;}

        private java.time.LocalDateTime paymentTimeSt;

        private java.time.LocalDateTime paymentTimeEd;

        public java.time.LocalDateTime getPaymentTimeSt(){return this.paymentTimeSt;}

        public java.time.LocalDateTime getPaymentTimeEd(){return this.paymentTimeEd;}

        private List<java.time.LocalDateTime> deliveryTimeList;

        public List<java.time.LocalDateTime> getDeliveryTimeList(){return this.deliveryTimeList;}

        private java.time.LocalDateTime deliveryTimeSt;

        private java.time.LocalDateTime deliveryTimeEd;

        public java.time.LocalDateTime getDeliveryTimeSt(){return this.deliveryTimeSt;}

        public java.time.LocalDateTime getDeliveryTimeEd(){return this.deliveryTimeEd;}

        private List<java.time.LocalDateTime> receiveTimeList;

        public List<java.time.LocalDateTime> getReceiveTimeList(){return this.receiveTimeList;}

        private java.time.LocalDateTime receiveTimeSt;

        private java.time.LocalDateTime receiveTimeEd;

        public java.time.LocalDateTime getReceiveTimeSt(){return this.receiveTimeSt;}

        public java.time.LocalDateTime getReceiveTimeEd(){return this.receiveTimeEd;}

        private List<java.time.LocalDateTime> commentTimeList;

        public List<java.time.LocalDateTime> getCommentTimeList(){return this.commentTimeList;}

        private java.time.LocalDateTime commentTimeSt;

        private java.time.LocalDateTime commentTimeEd;

        public java.time.LocalDateTime getCommentTimeSt(){return this.commentTimeSt;}

        public java.time.LocalDateTime getCommentTimeEd(){return this.commentTimeEd;}

        private List<java.time.LocalDateTime> modifyTimeList;

        public List<java.time.LocalDateTime> getModifyTimeList(){return this.modifyTimeList;}

        private java.time.LocalDateTime modifyTimeSt;

        private java.time.LocalDateTime modifyTimeEd;

        public java.time.LocalDateTime getModifyTimeSt(){return this.modifyTimeSt;}

        public java.time.LocalDateTime getModifyTimeEd(){return this.modifyTimeEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder memberIdBetWeen(Long memberIdSt,Long memberIdEd){
            this.memberIdSt = memberIdSt;
            this.memberIdEd = memberIdEd;
            return this;
        }

        public ConditionBuilder memberIdGreaterEqThan(Long memberIdSt){
            this.memberIdSt = memberIdSt;
            return this;
        }
        public ConditionBuilder memberIdLessEqThan(Long memberIdEd){
            this.memberIdEd = memberIdEd;
            return this;
        }


        public ConditionBuilder memberIdList(Long ... memberId){
            this.memberIdList = solveNullList(memberId);
            return this;
        }

        public ConditionBuilder memberIdList(List<Long> memberId){
            this.memberIdList = memberId;
            return this;
        }

        public ConditionBuilder couponIdBetWeen(Long couponIdSt,Long couponIdEd){
            this.couponIdSt = couponIdSt;
            this.couponIdEd = couponIdEd;
            return this;
        }

        public ConditionBuilder couponIdGreaterEqThan(Long couponIdSt){
            this.couponIdSt = couponIdSt;
            return this;
        }
        public ConditionBuilder couponIdLessEqThan(Long couponIdEd){
            this.couponIdEd = couponIdEd;
            return this;
        }


        public ConditionBuilder couponIdList(Long ... couponId){
            this.couponIdList = solveNullList(couponId);
            return this;
        }

        public ConditionBuilder couponIdList(List<Long> couponId){
            this.couponIdList = couponId;
            return this;
        }

        public ConditionBuilder fuzzyOrderSn (List<String> fuzzyOrderSn){
            this.fuzzyOrderSn = fuzzyOrderSn;
            return this;
        }

        public ConditionBuilder fuzzyOrderSn (String ... fuzzyOrderSn){
            this.fuzzyOrderSn = solveNullList(fuzzyOrderSn);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderSn (List<String> rightFuzzyOrderSn){
            this.rightFuzzyOrderSn = rightFuzzyOrderSn;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderSn (String ... rightFuzzyOrderSn){
            this.rightFuzzyOrderSn = solveNullList(rightFuzzyOrderSn);
            return this;
        }

        public ConditionBuilder orderSnList(String ... orderSn){
            this.orderSnList = solveNullList(orderSn);
            return this;
        }

        public ConditionBuilder orderSnList(List<String> orderSn){
            this.orderSnList = orderSn;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder fuzzyMemberUsername (List<String> fuzzyMemberUsername){
            this.fuzzyMemberUsername = fuzzyMemberUsername;
            return this;
        }

        public ConditionBuilder fuzzyMemberUsername (String ... fuzzyMemberUsername){
            this.fuzzyMemberUsername = solveNullList(fuzzyMemberUsername);
            return this;
        }

        public ConditionBuilder rightFuzzyMemberUsername (List<String> rightFuzzyMemberUsername){
            this.rightFuzzyMemberUsername = rightFuzzyMemberUsername;
            return this;
        }

        public ConditionBuilder rightFuzzyMemberUsername (String ... rightFuzzyMemberUsername){
            this.rightFuzzyMemberUsername = solveNullList(rightFuzzyMemberUsername);
            return this;
        }

        public ConditionBuilder memberUsernameList(String ... memberUsername){
            this.memberUsernameList = solveNullList(memberUsername);
            return this;
        }

        public ConditionBuilder memberUsernameList(List<String> memberUsername){
            this.memberUsernameList = memberUsername;
            return this;
        }

        public ConditionBuilder totalAmountBetWeen(java.math.BigDecimal totalAmountSt,java.math.BigDecimal totalAmountEd){
            this.totalAmountSt = totalAmountSt;
            this.totalAmountEd = totalAmountEd;
            return this;
        }

        public ConditionBuilder totalAmountGreaterEqThan(java.math.BigDecimal totalAmountSt){
            this.totalAmountSt = totalAmountSt;
            return this;
        }
        public ConditionBuilder totalAmountLessEqThan(java.math.BigDecimal totalAmountEd){
            this.totalAmountEd = totalAmountEd;
            return this;
        }


        public ConditionBuilder totalAmountList(java.math.BigDecimal ... totalAmount){
            this.totalAmountList = solveNullList(totalAmount);
            return this;
        }

        public ConditionBuilder totalAmountList(List<java.math.BigDecimal> totalAmount){
            this.totalAmountList = totalAmount;
            return this;
        }

        public ConditionBuilder payAmountBetWeen(java.math.BigDecimal payAmountSt,java.math.BigDecimal payAmountEd){
            this.payAmountSt = payAmountSt;
            this.payAmountEd = payAmountEd;
            return this;
        }

        public ConditionBuilder payAmountGreaterEqThan(java.math.BigDecimal payAmountSt){
            this.payAmountSt = payAmountSt;
            return this;
        }
        public ConditionBuilder payAmountLessEqThan(java.math.BigDecimal payAmountEd){
            this.payAmountEd = payAmountEd;
            return this;
        }


        public ConditionBuilder payAmountList(java.math.BigDecimal ... payAmount){
            this.payAmountList = solveNullList(payAmount);
            return this;
        }

        public ConditionBuilder payAmountList(List<java.math.BigDecimal> payAmount){
            this.payAmountList = payAmount;
            return this;
        }

        public ConditionBuilder freightAmountBetWeen(java.math.BigDecimal freightAmountSt,java.math.BigDecimal freightAmountEd){
            this.freightAmountSt = freightAmountSt;
            this.freightAmountEd = freightAmountEd;
            return this;
        }

        public ConditionBuilder freightAmountGreaterEqThan(java.math.BigDecimal freightAmountSt){
            this.freightAmountSt = freightAmountSt;
            return this;
        }
        public ConditionBuilder freightAmountLessEqThan(java.math.BigDecimal freightAmountEd){
            this.freightAmountEd = freightAmountEd;
            return this;
        }


        public ConditionBuilder freightAmountList(java.math.BigDecimal ... freightAmount){
            this.freightAmountList = solveNullList(freightAmount);
            return this;
        }

        public ConditionBuilder freightAmountList(List<java.math.BigDecimal> freightAmount){
            this.freightAmountList = freightAmount;
            return this;
        }

        public ConditionBuilder promotionAmountBetWeen(java.math.BigDecimal promotionAmountSt,java.math.BigDecimal promotionAmountEd){
            this.promotionAmountSt = promotionAmountSt;
            this.promotionAmountEd = promotionAmountEd;
            return this;
        }

        public ConditionBuilder promotionAmountGreaterEqThan(java.math.BigDecimal promotionAmountSt){
            this.promotionAmountSt = promotionAmountSt;
            return this;
        }
        public ConditionBuilder promotionAmountLessEqThan(java.math.BigDecimal promotionAmountEd){
            this.promotionAmountEd = promotionAmountEd;
            return this;
        }


        public ConditionBuilder promotionAmountList(java.math.BigDecimal ... promotionAmount){
            this.promotionAmountList = solveNullList(promotionAmount);
            return this;
        }

        public ConditionBuilder promotionAmountList(List<java.math.BigDecimal> promotionAmount){
            this.promotionAmountList = promotionAmount;
            return this;
        }

        public ConditionBuilder integrationAmountBetWeen(java.math.BigDecimal integrationAmountSt,java.math.BigDecimal integrationAmountEd){
            this.integrationAmountSt = integrationAmountSt;
            this.integrationAmountEd = integrationAmountEd;
            return this;
        }

        public ConditionBuilder integrationAmountGreaterEqThan(java.math.BigDecimal integrationAmountSt){
            this.integrationAmountSt = integrationAmountSt;
            return this;
        }
        public ConditionBuilder integrationAmountLessEqThan(java.math.BigDecimal integrationAmountEd){
            this.integrationAmountEd = integrationAmountEd;
            return this;
        }


        public ConditionBuilder integrationAmountList(java.math.BigDecimal ... integrationAmount){
            this.integrationAmountList = solveNullList(integrationAmount);
            return this;
        }

        public ConditionBuilder integrationAmountList(List<java.math.BigDecimal> integrationAmount){
            this.integrationAmountList = integrationAmount;
            return this;
        }

        public ConditionBuilder couponAmountBetWeen(java.math.BigDecimal couponAmountSt,java.math.BigDecimal couponAmountEd){
            this.couponAmountSt = couponAmountSt;
            this.couponAmountEd = couponAmountEd;
            return this;
        }

        public ConditionBuilder couponAmountGreaterEqThan(java.math.BigDecimal couponAmountSt){
            this.couponAmountSt = couponAmountSt;
            return this;
        }
        public ConditionBuilder couponAmountLessEqThan(java.math.BigDecimal couponAmountEd){
            this.couponAmountEd = couponAmountEd;
            return this;
        }


        public ConditionBuilder couponAmountList(java.math.BigDecimal ... couponAmount){
            this.couponAmountList = solveNullList(couponAmount);
            return this;
        }

        public ConditionBuilder couponAmountList(List<java.math.BigDecimal> couponAmount){
            this.couponAmountList = couponAmount;
            return this;
        }

        public ConditionBuilder discountAmountBetWeen(java.math.BigDecimal discountAmountSt,java.math.BigDecimal discountAmountEd){
            this.discountAmountSt = discountAmountSt;
            this.discountAmountEd = discountAmountEd;
            return this;
        }

        public ConditionBuilder discountAmountGreaterEqThan(java.math.BigDecimal discountAmountSt){
            this.discountAmountSt = discountAmountSt;
            return this;
        }
        public ConditionBuilder discountAmountLessEqThan(java.math.BigDecimal discountAmountEd){
            this.discountAmountEd = discountAmountEd;
            return this;
        }


        public ConditionBuilder discountAmountList(java.math.BigDecimal ... discountAmount){
            this.discountAmountList = solveNullList(discountAmount);
            return this;
        }

        public ConditionBuilder discountAmountList(List<java.math.BigDecimal> discountAmount){
            this.discountAmountList = discountAmount;
            return this;
        }

        public ConditionBuilder payTypeBetWeen(Integer payTypeSt,Integer payTypeEd){
            this.payTypeSt = payTypeSt;
            this.payTypeEd = payTypeEd;
            return this;
        }

        public ConditionBuilder payTypeGreaterEqThan(Integer payTypeSt){
            this.payTypeSt = payTypeSt;
            return this;
        }
        public ConditionBuilder payTypeLessEqThan(Integer payTypeEd){
            this.payTypeEd = payTypeEd;
            return this;
        }


        public ConditionBuilder payTypeList(Integer ... payType){
            this.payTypeList = solveNullList(payType);
            return this;
        }

        public ConditionBuilder payTypeList(List<Integer> payType){
            this.payTypeList = payType;
            return this;
        }

        public ConditionBuilder sourceTypeBetWeen(Integer sourceTypeSt,Integer sourceTypeEd){
            this.sourceTypeSt = sourceTypeSt;
            this.sourceTypeEd = sourceTypeEd;
            return this;
        }

        public ConditionBuilder sourceTypeGreaterEqThan(Integer sourceTypeSt){
            this.sourceTypeSt = sourceTypeSt;
            return this;
        }
        public ConditionBuilder sourceTypeLessEqThan(Integer sourceTypeEd){
            this.sourceTypeEd = sourceTypeEd;
            return this;
        }


        public ConditionBuilder sourceTypeList(Integer ... sourceType){
            this.sourceTypeList = solveNullList(sourceType);
            return this;
        }

        public ConditionBuilder sourceTypeList(List<Integer> sourceType){
            this.sourceTypeList = sourceType;
            return this;
        }

        public ConditionBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public ConditionBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public ConditionBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public ConditionBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder orderTypeBetWeen(Integer orderTypeSt,Integer orderTypeEd){
            this.orderTypeSt = orderTypeSt;
            this.orderTypeEd = orderTypeEd;
            return this;
        }

        public ConditionBuilder orderTypeGreaterEqThan(Integer orderTypeSt){
            this.orderTypeSt = orderTypeSt;
            return this;
        }
        public ConditionBuilder orderTypeLessEqThan(Integer orderTypeEd){
            this.orderTypeEd = orderTypeEd;
            return this;
        }


        public ConditionBuilder orderTypeList(Integer ... orderType){
            this.orderTypeList = solveNullList(orderType);
            return this;
        }

        public ConditionBuilder orderTypeList(List<Integer> orderType){
            this.orderTypeList = orderType;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryCompany (List<String> fuzzyDeliveryCompany){
            this.fuzzyDeliveryCompany = fuzzyDeliveryCompany;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryCompany (String ... fuzzyDeliveryCompany){
            this.fuzzyDeliveryCompany = solveNullList(fuzzyDeliveryCompany);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryCompany (List<String> rightFuzzyDeliveryCompany){
            this.rightFuzzyDeliveryCompany = rightFuzzyDeliveryCompany;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryCompany (String ... rightFuzzyDeliveryCompany){
            this.rightFuzzyDeliveryCompany = solveNullList(rightFuzzyDeliveryCompany);
            return this;
        }

        public ConditionBuilder deliveryCompanyList(String ... deliveryCompany){
            this.deliveryCompanyList = solveNullList(deliveryCompany);
            return this;
        }

        public ConditionBuilder deliveryCompanyList(List<String> deliveryCompany){
            this.deliveryCompanyList = deliveryCompany;
            return this;
        }

        public ConditionBuilder fuzzyDeliverySn (List<String> fuzzyDeliverySn){
            this.fuzzyDeliverySn = fuzzyDeliverySn;
            return this;
        }

        public ConditionBuilder fuzzyDeliverySn (String ... fuzzyDeliverySn){
            this.fuzzyDeliverySn = solveNullList(fuzzyDeliverySn);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliverySn (List<String> rightFuzzyDeliverySn){
            this.rightFuzzyDeliverySn = rightFuzzyDeliverySn;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliverySn (String ... rightFuzzyDeliverySn){
            this.rightFuzzyDeliverySn = solveNullList(rightFuzzyDeliverySn);
            return this;
        }

        public ConditionBuilder deliverySnList(String ... deliverySn){
            this.deliverySnList = solveNullList(deliverySn);
            return this;
        }

        public ConditionBuilder deliverySnList(List<String> deliverySn){
            this.deliverySnList = deliverySn;
            return this;
        }

        public ConditionBuilder autoConfirmDayBetWeen(Integer autoConfirmDaySt,Integer autoConfirmDayEd){
            this.autoConfirmDaySt = autoConfirmDaySt;
            this.autoConfirmDayEd = autoConfirmDayEd;
            return this;
        }

        public ConditionBuilder autoConfirmDayGreaterEqThan(Integer autoConfirmDaySt){
            this.autoConfirmDaySt = autoConfirmDaySt;
            return this;
        }
        public ConditionBuilder autoConfirmDayLessEqThan(Integer autoConfirmDayEd){
            this.autoConfirmDayEd = autoConfirmDayEd;
            return this;
        }


        public ConditionBuilder autoConfirmDayList(Integer ... autoConfirmDay){
            this.autoConfirmDayList = solveNullList(autoConfirmDay);
            return this;
        }

        public ConditionBuilder autoConfirmDayList(List<Integer> autoConfirmDay){
            this.autoConfirmDayList = autoConfirmDay;
            return this;
        }

        public ConditionBuilder integrationBetWeen(Integer integrationSt,Integer integrationEd){
            this.integrationSt = integrationSt;
            this.integrationEd = integrationEd;
            return this;
        }

        public ConditionBuilder integrationGreaterEqThan(Integer integrationSt){
            this.integrationSt = integrationSt;
            return this;
        }
        public ConditionBuilder integrationLessEqThan(Integer integrationEd){
            this.integrationEd = integrationEd;
            return this;
        }


        public ConditionBuilder integrationList(Integer ... integration){
            this.integrationList = solveNullList(integration);
            return this;
        }

        public ConditionBuilder integrationList(List<Integer> integration){
            this.integrationList = integration;
            return this;
        }

        public ConditionBuilder growthBetWeen(Integer growthSt,Integer growthEd){
            this.growthSt = growthSt;
            this.growthEd = growthEd;
            return this;
        }

        public ConditionBuilder growthGreaterEqThan(Integer growthSt){
            this.growthSt = growthSt;
            return this;
        }
        public ConditionBuilder growthLessEqThan(Integer growthEd){
            this.growthEd = growthEd;
            return this;
        }


        public ConditionBuilder growthList(Integer ... growth){
            this.growthList = solveNullList(growth);
            return this;
        }

        public ConditionBuilder growthList(List<Integer> growth){
            this.growthList = growth;
            return this;
        }

        public ConditionBuilder fuzzyPromotionInfo (List<String> fuzzyPromotionInfo){
            this.fuzzyPromotionInfo = fuzzyPromotionInfo;
            return this;
        }

        public ConditionBuilder fuzzyPromotionInfo (String ... fuzzyPromotionInfo){
            this.fuzzyPromotionInfo = solveNullList(fuzzyPromotionInfo);
            return this;
        }

        public ConditionBuilder rightFuzzyPromotionInfo (List<String> rightFuzzyPromotionInfo){
            this.rightFuzzyPromotionInfo = rightFuzzyPromotionInfo;
            return this;
        }

        public ConditionBuilder rightFuzzyPromotionInfo (String ... rightFuzzyPromotionInfo){
            this.rightFuzzyPromotionInfo = solveNullList(rightFuzzyPromotionInfo);
            return this;
        }

        public ConditionBuilder promotionInfoList(String ... promotionInfo){
            this.promotionInfoList = solveNullList(promotionInfo);
            return this;
        }

        public ConditionBuilder promotionInfoList(List<String> promotionInfo){
            this.promotionInfoList = promotionInfo;
            return this;
        }

        public ConditionBuilder billTypeBetWeen(Integer billTypeSt,Integer billTypeEd){
            this.billTypeSt = billTypeSt;
            this.billTypeEd = billTypeEd;
            return this;
        }

        public ConditionBuilder billTypeGreaterEqThan(Integer billTypeSt){
            this.billTypeSt = billTypeSt;
            return this;
        }
        public ConditionBuilder billTypeLessEqThan(Integer billTypeEd){
            this.billTypeEd = billTypeEd;
            return this;
        }


        public ConditionBuilder billTypeList(Integer ... billType){
            this.billTypeList = solveNullList(billType);
            return this;
        }

        public ConditionBuilder billTypeList(List<Integer> billType){
            this.billTypeList = billType;
            return this;
        }

        public ConditionBuilder fuzzyBillHeader (List<String> fuzzyBillHeader){
            this.fuzzyBillHeader = fuzzyBillHeader;
            return this;
        }

        public ConditionBuilder fuzzyBillHeader (String ... fuzzyBillHeader){
            this.fuzzyBillHeader = solveNullList(fuzzyBillHeader);
            return this;
        }

        public ConditionBuilder rightFuzzyBillHeader (List<String> rightFuzzyBillHeader){
            this.rightFuzzyBillHeader = rightFuzzyBillHeader;
            return this;
        }

        public ConditionBuilder rightFuzzyBillHeader (String ... rightFuzzyBillHeader){
            this.rightFuzzyBillHeader = solveNullList(rightFuzzyBillHeader);
            return this;
        }

        public ConditionBuilder billHeaderList(String ... billHeader){
            this.billHeaderList = solveNullList(billHeader);
            return this;
        }

        public ConditionBuilder billHeaderList(List<String> billHeader){
            this.billHeaderList = billHeader;
            return this;
        }

        public ConditionBuilder fuzzyBillContent (List<String> fuzzyBillContent){
            this.fuzzyBillContent = fuzzyBillContent;
            return this;
        }

        public ConditionBuilder fuzzyBillContent (String ... fuzzyBillContent){
            this.fuzzyBillContent = solveNullList(fuzzyBillContent);
            return this;
        }

        public ConditionBuilder rightFuzzyBillContent (List<String> rightFuzzyBillContent){
            this.rightFuzzyBillContent = rightFuzzyBillContent;
            return this;
        }

        public ConditionBuilder rightFuzzyBillContent (String ... rightFuzzyBillContent){
            this.rightFuzzyBillContent = solveNullList(rightFuzzyBillContent);
            return this;
        }

        public ConditionBuilder billContentList(String ... billContent){
            this.billContentList = solveNullList(billContent);
            return this;
        }

        public ConditionBuilder billContentList(List<String> billContent){
            this.billContentList = billContent;
            return this;
        }

        public ConditionBuilder fuzzyBillReceiverPhone (List<String> fuzzyBillReceiverPhone){
            this.fuzzyBillReceiverPhone = fuzzyBillReceiverPhone;
            return this;
        }

        public ConditionBuilder fuzzyBillReceiverPhone (String ... fuzzyBillReceiverPhone){
            this.fuzzyBillReceiverPhone = solveNullList(fuzzyBillReceiverPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyBillReceiverPhone (List<String> rightFuzzyBillReceiverPhone){
            this.rightFuzzyBillReceiverPhone = rightFuzzyBillReceiverPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyBillReceiverPhone (String ... rightFuzzyBillReceiverPhone){
            this.rightFuzzyBillReceiverPhone = solveNullList(rightFuzzyBillReceiverPhone);
            return this;
        }

        public ConditionBuilder billReceiverPhoneList(String ... billReceiverPhone){
            this.billReceiverPhoneList = solveNullList(billReceiverPhone);
            return this;
        }

        public ConditionBuilder billReceiverPhoneList(List<String> billReceiverPhone){
            this.billReceiverPhoneList = billReceiverPhone;
            return this;
        }

        public ConditionBuilder fuzzyBillReceiverEmail (List<String> fuzzyBillReceiverEmail){
            this.fuzzyBillReceiverEmail = fuzzyBillReceiverEmail;
            return this;
        }

        public ConditionBuilder fuzzyBillReceiverEmail (String ... fuzzyBillReceiverEmail){
            this.fuzzyBillReceiverEmail = solveNullList(fuzzyBillReceiverEmail);
            return this;
        }

        public ConditionBuilder rightFuzzyBillReceiverEmail (List<String> rightFuzzyBillReceiverEmail){
            this.rightFuzzyBillReceiverEmail = rightFuzzyBillReceiverEmail;
            return this;
        }

        public ConditionBuilder rightFuzzyBillReceiverEmail (String ... rightFuzzyBillReceiverEmail){
            this.rightFuzzyBillReceiverEmail = solveNullList(rightFuzzyBillReceiverEmail);
            return this;
        }

        public ConditionBuilder billReceiverEmailList(String ... billReceiverEmail){
            this.billReceiverEmailList = solveNullList(billReceiverEmail);
            return this;
        }

        public ConditionBuilder billReceiverEmailList(List<String> billReceiverEmail){
            this.billReceiverEmailList = billReceiverEmail;
            return this;
        }

        public ConditionBuilder fuzzyReceiverName (List<String> fuzzyReceiverName){
            this.fuzzyReceiverName = fuzzyReceiverName;
            return this;
        }

        public ConditionBuilder fuzzyReceiverName (String ... fuzzyReceiverName){
            this.fuzzyReceiverName = solveNullList(fuzzyReceiverName);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverName (List<String> rightFuzzyReceiverName){
            this.rightFuzzyReceiverName = rightFuzzyReceiverName;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverName (String ... rightFuzzyReceiverName){
            this.rightFuzzyReceiverName = solveNullList(rightFuzzyReceiverName);
            return this;
        }

        public ConditionBuilder receiverNameList(String ... receiverName){
            this.receiverNameList = solveNullList(receiverName);
            return this;
        }

        public ConditionBuilder receiverNameList(List<String> receiverName){
            this.receiverNameList = receiverName;
            return this;
        }

        public ConditionBuilder fuzzyReceiverPhone (List<String> fuzzyReceiverPhone){
            this.fuzzyReceiverPhone = fuzzyReceiverPhone;
            return this;
        }

        public ConditionBuilder fuzzyReceiverPhone (String ... fuzzyReceiverPhone){
            this.fuzzyReceiverPhone = solveNullList(fuzzyReceiverPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverPhone (List<String> rightFuzzyReceiverPhone){
            this.rightFuzzyReceiverPhone = rightFuzzyReceiverPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverPhone (String ... rightFuzzyReceiverPhone){
            this.rightFuzzyReceiverPhone = solveNullList(rightFuzzyReceiverPhone);
            return this;
        }

        public ConditionBuilder receiverPhoneList(String ... receiverPhone){
            this.receiverPhoneList = solveNullList(receiverPhone);
            return this;
        }

        public ConditionBuilder receiverPhoneList(List<String> receiverPhone){
            this.receiverPhoneList = receiverPhone;
            return this;
        }

        public ConditionBuilder fuzzyReceiverPostCode (List<String> fuzzyReceiverPostCode){
            this.fuzzyReceiverPostCode = fuzzyReceiverPostCode;
            return this;
        }

        public ConditionBuilder fuzzyReceiverPostCode (String ... fuzzyReceiverPostCode){
            this.fuzzyReceiverPostCode = solveNullList(fuzzyReceiverPostCode);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverPostCode (List<String> rightFuzzyReceiverPostCode){
            this.rightFuzzyReceiverPostCode = rightFuzzyReceiverPostCode;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverPostCode (String ... rightFuzzyReceiverPostCode){
            this.rightFuzzyReceiverPostCode = solveNullList(rightFuzzyReceiverPostCode);
            return this;
        }

        public ConditionBuilder receiverPostCodeList(String ... receiverPostCode){
            this.receiverPostCodeList = solveNullList(receiverPostCode);
            return this;
        }

        public ConditionBuilder receiverPostCodeList(List<String> receiverPostCode){
            this.receiverPostCodeList = receiverPostCode;
            return this;
        }

        public ConditionBuilder fuzzyReceiverProvince (List<String> fuzzyReceiverProvince){
            this.fuzzyReceiverProvince = fuzzyReceiverProvince;
            return this;
        }

        public ConditionBuilder fuzzyReceiverProvince (String ... fuzzyReceiverProvince){
            this.fuzzyReceiverProvince = solveNullList(fuzzyReceiverProvince);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverProvince (List<String> rightFuzzyReceiverProvince){
            this.rightFuzzyReceiverProvince = rightFuzzyReceiverProvince;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverProvince (String ... rightFuzzyReceiverProvince){
            this.rightFuzzyReceiverProvince = solveNullList(rightFuzzyReceiverProvince);
            return this;
        }

        public ConditionBuilder receiverProvinceList(String ... receiverProvince){
            this.receiverProvinceList = solveNullList(receiverProvince);
            return this;
        }

        public ConditionBuilder receiverProvinceList(List<String> receiverProvince){
            this.receiverProvinceList = receiverProvince;
            return this;
        }

        public ConditionBuilder fuzzyReceiverCity (List<String> fuzzyReceiverCity){
            this.fuzzyReceiverCity = fuzzyReceiverCity;
            return this;
        }

        public ConditionBuilder fuzzyReceiverCity (String ... fuzzyReceiverCity){
            this.fuzzyReceiverCity = solveNullList(fuzzyReceiverCity);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverCity (List<String> rightFuzzyReceiverCity){
            this.rightFuzzyReceiverCity = rightFuzzyReceiverCity;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverCity (String ... rightFuzzyReceiverCity){
            this.rightFuzzyReceiverCity = solveNullList(rightFuzzyReceiverCity);
            return this;
        }

        public ConditionBuilder receiverCityList(String ... receiverCity){
            this.receiverCityList = solveNullList(receiverCity);
            return this;
        }

        public ConditionBuilder receiverCityList(List<String> receiverCity){
            this.receiverCityList = receiverCity;
            return this;
        }

        public ConditionBuilder fuzzyReceiverRegion (List<String> fuzzyReceiverRegion){
            this.fuzzyReceiverRegion = fuzzyReceiverRegion;
            return this;
        }

        public ConditionBuilder fuzzyReceiverRegion (String ... fuzzyReceiverRegion){
            this.fuzzyReceiverRegion = solveNullList(fuzzyReceiverRegion);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverRegion (List<String> rightFuzzyReceiverRegion){
            this.rightFuzzyReceiverRegion = rightFuzzyReceiverRegion;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverRegion (String ... rightFuzzyReceiverRegion){
            this.rightFuzzyReceiverRegion = solveNullList(rightFuzzyReceiverRegion);
            return this;
        }

        public ConditionBuilder receiverRegionList(String ... receiverRegion){
            this.receiverRegionList = solveNullList(receiverRegion);
            return this;
        }

        public ConditionBuilder receiverRegionList(List<String> receiverRegion){
            this.receiverRegionList = receiverRegion;
            return this;
        }

        public ConditionBuilder fuzzyReceiverDetailAddress (List<String> fuzzyReceiverDetailAddress){
            this.fuzzyReceiverDetailAddress = fuzzyReceiverDetailAddress;
            return this;
        }

        public ConditionBuilder fuzzyReceiverDetailAddress (String ... fuzzyReceiverDetailAddress){
            this.fuzzyReceiverDetailAddress = solveNullList(fuzzyReceiverDetailAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverDetailAddress (List<String> rightFuzzyReceiverDetailAddress){
            this.rightFuzzyReceiverDetailAddress = rightFuzzyReceiverDetailAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiverDetailAddress (String ... rightFuzzyReceiverDetailAddress){
            this.rightFuzzyReceiverDetailAddress = solveNullList(rightFuzzyReceiverDetailAddress);
            return this;
        }

        public ConditionBuilder receiverDetailAddressList(String ... receiverDetailAddress){
            this.receiverDetailAddressList = solveNullList(receiverDetailAddress);
            return this;
        }

        public ConditionBuilder receiverDetailAddressList(List<String> receiverDetailAddress){
            this.receiverDetailAddressList = receiverDetailAddress;
            return this;
        }

        public ConditionBuilder fuzzyNote (List<String> fuzzyNote){
            this.fuzzyNote = fuzzyNote;
            return this;
        }

        public ConditionBuilder fuzzyNote (String ... fuzzyNote){
            this.fuzzyNote = solveNullList(fuzzyNote);
            return this;
        }

        public ConditionBuilder rightFuzzyNote (List<String> rightFuzzyNote){
            this.rightFuzzyNote = rightFuzzyNote;
            return this;
        }

        public ConditionBuilder rightFuzzyNote (String ... rightFuzzyNote){
            this.rightFuzzyNote = solveNullList(rightFuzzyNote);
            return this;
        }

        public ConditionBuilder noteList(String ... note){
            this.noteList = solveNullList(note);
            return this;
        }

        public ConditionBuilder noteList(List<String> note){
            this.noteList = note;
            return this;
        }

        public ConditionBuilder confirmStatusBetWeen(Integer confirmStatusSt,Integer confirmStatusEd){
            this.confirmStatusSt = confirmStatusSt;
            this.confirmStatusEd = confirmStatusEd;
            return this;
        }

        public ConditionBuilder confirmStatusGreaterEqThan(Integer confirmStatusSt){
            this.confirmStatusSt = confirmStatusSt;
            return this;
        }
        public ConditionBuilder confirmStatusLessEqThan(Integer confirmStatusEd){
            this.confirmStatusEd = confirmStatusEd;
            return this;
        }


        public ConditionBuilder confirmStatusList(Integer ... confirmStatus){
            this.confirmStatusList = solveNullList(confirmStatus);
            return this;
        }

        public ConditionBuilder confirmStatusList(List<Integer> confirmStatus){
            this.confirmStatusList = confirmStatus;
            return this;
        }

        public ConditionBuilder deleteStatusBetWeen(Integer deleteStatusSt,Integer deleteStatusEd){
            this.deleteStatusSt = deleteStatusSt;
            this.deleteStatusEd = deleteStatusEd;
            return this;
        }

        public ConditionBuilder deleteStatusGreaterEqThan(Integer deleteStatusSt){
            this.deleteStatusSt = deleteStatusSt;
            return this;
        }
        public ConditionBuilder deleteStatusLessEqThan(Integer deleteStatusEd){
            this.deleteStatusEd = deleteStatusEd;
            return this;
        }


        public ConditionBuilder deleteStatusList(Integer ... deleteStatus){
            this.deleteStatusList = solveNullList(deleteStatus);
            return this;
        }

        public ConditionBuilder deleteStatusList(List<Integer> deleteStatus){
            this.deleteStatusList = deleteStatus;
            return this;
        }

        public ConditionBuilder useIntegrationBetWeen(Integer useIntegrationSt,Integer useIntegrationEd){
            this.useIntegrationSt = useIntegrationSt;
            this.useIntegrationEd = useIntegrationEd;
            return this;
        }

        public ConditionBuilder useIntegrationGreaterEqThan(Integer useIntegrationSt){
            this.useIntegrationSt = useIntegrationSt;
            return this;
        }
        public ConditionBuilder useIntegrationLessEqThan(Integer useIntegrationEd){
            this.useIntegrationEd = useIntegrationEd;
            return this;
        }


        public ConditionBuilder useIntegrationList(Integer ... useIntegration){
            this.useIntegrationList = solveNullList(useIntegration);
            return this;
        }

        public ConditionBuilder useIntegrationList(List<Integer> useIntegration){
            this.useIntegrationList = useIntegration;
            return this;
        }

        public ConditionBuilder paymentTimeBetWeen(java.time.LocalDateTime paymentTimeSt,java.time.LocalDateTime paymentTimeEd){
            this.paymentTimeSt = paymentTimeSt;
            this.paymentTimeEd = paymentTimeEd;
            return this;
        }

        public ConditionBuilder paymentTimeGreaterEqThan(java.time.LocalDateTime paymentTimeSt){
            this.paymentTimeSt = paymentTimeSt;
            return this;
        }
        public ConditionBuilder paymentTimeLessEqThan(java.time.LocalDateTime paymentTimeEd){
            this.paymentTimeEd = paymentTimeEd;
            return this;
        }


        public ConditionBuilder paymentTimeList(java.time.LocalDateTime ... paymentTime){
            this.paymentTimeList = solveNullList(paymentTime);
            return this;
        }

        public ConditionBuilder paymentTimeList(List<java.time.LocalDateTime> paymentTime){
            this.paymentTimeList = paymentTime;
            return this;
        }

        public ConditionBuilder deliveryTimeBetWeen(java.time.LocalDateTime deliveryTimeSt,java.time.LocalDateTime deliveryTimeEd){
            this.deliveryTimeSt = deliveryTimeSt;
            this.deliveryTimeEd = deliveryTimeEd;
            return this;
        }

        public ConditionBuilder deliveryTimeGreaterEqThan(java.time.LocalDateTime deliveryTimeSt){
            this.deliveryTimeSt = deliveryTimeSt;
            return this;
        }
        public ConditionBuilder deliveryTimeLessEqThan(java.time.LocalDateTime deliveryTimeEd){
            this.deliveryTimeEd = deliveryTimeEd;
            return this;
        }


        public ConditionBuilder deliveryTimeList(java.time.LocalDateTime ... deliveryTime){
            this.deliveryTimeList = solveNullList(deliveryTime);
            return this;
        }

        public ConditionBuilder deliveryTimeList(List<java.time.LocalDateTime> deliveryTime){
            this.deliveryTimeList = deliveryTime;
            return this;
        }

        public ConditionBuilder receiveTimeBetWeen(java.time.LocalDateTime receiveTimeSt,java.time.LocalDateTime receiveTimeEd){
            this.receiveTimeSt = receiveTimeSt;
            this.receiveTimeEd = receiveTimeEd;
            return this;
        }

        public ConditionBuilder receiveTimeGreaterEqThan(java.time.LocalDateTime receiveTimeSt){
            this.receiveTimeSt = receiveTimeSt;
            return this;
        }
        public ConditionBuilder receiveTimeLessEqThan(java.time.LocalDateTime receiveTimeEd){
            this.receiveTimeEd = receiveTimeEd;
            return this;
        }


        public ConditionBuilder receiveTimeList(java.time.LocalDateTime ... receiveTime){
            this.receiveTimeList = solveNullList(receiveTime);
            return this;
        }

        public ConditionBuilder receiveTimeList(List<java.time.LocalDateTime> receiveTime){
            this.receiveTimeList = receiveTime;
            return this;
        }

        public ConditionBuilder commentTimeBetWeen(java.time.LocalDateTime commentTimeSt,java.time.LocalDateTime commentTimeEd){
            this.commentTimeSt = commentTimeSt;
            this.commentTimeEd = commentTimeEd;
            return this;
        }

        public ConditionBuilder commentTimeGreaterEqThan(java.time.LocalDateTime commentTimeSt){
            this.commentTimeSt = commentTimeSt;
            return this;
        }
        public ConditionBuilder commentTimeLessEqThan(java.time.LocalDateTime commentTimeEd){
            this.commentTimeEd = commentTimeEd;
            return this;
        }


        public ConditionBuilder commentTimeList(java.time.LocalDateTime ... commentTime){
            this.commentTimeList = solveNullList(commentTime);
            return this;
        }

        public ConditionBuilder commentTimeList(List<java.time.LocalDateTime> commentTime){
            this.commentTimeList = commentTime;
            return this;
        }

        public ConditionBuilder modifyTimeBetWeen(java.time.LocalDateTime modifyTimeSt,java.time.LocalDateTime modifyTimeEd){
            this.modifyTimeSt = modifyTimeSt;
            this.modifyTimeEd = modifyTimeEd;
            return this;
        }

        public ConditionBuilder modifyTimeGreaterEqThan(java.time.LocalDateTime modifyTimeSt){
            this.modifyTimeSt = modifyTimeSt;
            return this;
        }
        public ConditionBuilder modifyTimeLessEqThan(java.time.LocalDateTime modifyTimeEd){
            this.modifyTimeEd = modifyTimeEd;
            return this;
        }


        public ConditionBuilder modifyTimeList(java.time.LocalDateTime ... modifyTime){
            this.modifyTimeList = solveNullList(modifyTime);
            return this;
        }

        public ConditionBuilder modifyTimeList(List<java.time.LocalDateTime> modifyTime){
            this.modifyTimeList = modifyTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private OmsOrder obj;

        public Builder(){
            this.obj = new OmsOrder();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder memberId(Long memberId){
            this.obj.setMemberId(memberId);
            return this;
        }
        public Builder couponId(Long couponId){
            this.obj.setCouponId(couponId);
            return this;
        }
        public Builder orderSn(String orderSn){
            this.obj.setOrderSn(orderSn);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder memberUsername(String memberUsername){
            this.obj.setMemberUsername(memberUsername);
            return this;
        }
        public Builder totalAmount(java.math.BigDecimal totalAmount){
            this.obj.setTotalAmount(totalAmount);
            return this;
        }
        public Builder payAmount(java.math.BigDecimal payAmount){
            this.obj.setPayAmount(payAmount);
            return this;
        }
        public Builder freightAmount(java.math.BigDecimal freightAmount){
            this.obj.setFreightAmount(freightAmount);
            return this;
        }
        public Builder promotionAmount(java.math.BigDecimal promotionAmount){
            this.obj.setPromotionAmount(promotionAmount);
            return this;
        }
        public Builder integrationAmount(java.math.BigDecimal integrationAmount){
            this.obj.setIntegrationAmount(integrationAmount);
            return this;
        }
        public Builder couponAmount(java.math.BigDecimal couponAmount){
            this.obj.setCouponAmount(couponAmount);
            return this;
        }
        public Builder discountAmount(java.math.BigDecimal discountAmount){
            this.obj.setDiscountAmount(discountAmount);
            return this;
        }
        public Builder payType(Integer payType){
            this.obj.setPayType(payType);
            return this;
        }
        public Builder sourceType(Integer sourceType){
            this.obj.setSourceType(sourceType);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder orderType(Integer orderType){
            this.obj.setOrderType(orderType);
            return this;
        }
        public Builder deliveryCompany(String deliveryCompany){
            this.obj.setDeliveryCompany(deliveryCompany);
            return this;
        }
        public Builder deliverySn(String deliverySn){
            this.obj.setDeliverySn(deliverySn);
            return this;
        }
        public Builder autoConfirmDay(Integer autoConfirmDay){
            this.obj.setAutoConfirmDay(autoConfirmDay);
            return this;
        }
        public Builder integration(Integer integration){
            this.obj.setIntegration(integration);
            return this;
        }
        public Builder growth(Integer growth){
            this.obj.setGrowth(growth);
            return this;
        }
        public Builder promotionInfo(String promotionInfo){
            this.obj.setPromotionInfo(promotionInfo);
            return this;
        }
        public Builder billType(Integer billType){
            this.obj.setBillType(billType);
            return this;
        }
        public Builder billHeader(String billHeader){
            this.obj.setBillHeader(billHeader);
            return this;
        }
        public Builder billContent(String billContent){
            this.obj.setBillContent(billContent);
            return this;
        }
        public Builder billReceiverPhone(String billReceiverPhone){
            this.obj.setBillReceiverPhone(billReceiverPhone);
            return this;
        }
        public Builder billReceiverEmail(String billReceiverEmail){
            this.obj.setBillReceiverEmail(billReceiverEmail);
            return this;
        }
        public Builder receiverName(String receiverName){
            this.obj.setReceiverName(receiverName);
            return this;
        }
        public Builder receiverPhone(String receiverPhone){
            this.obj.setReceiverPhone(receiverPhone);
            return this;
        }
        public Builder receiverPostCode(String receiverPostCode){
            this.obj.setReceiverPostCode(receiverPostCode);
            return this;
        }
        public Builder receiverProvince(String receiverProvince){
            this.obj.setReceiverProvince(receiverProvince);
            return this;
        }
        public Builder receiverCity(String receiverCity){
            this.obj.setReceiverCity(receiverCity);
            return this;
        }
        public Builder receiverRegion(String receiverRegion){
            this.obj.setReceiverRegion(receiverRegion);
            return this;
        }
        public Builder receiverDetailAddress(String receiverDetailAddress){
            this.obj.setReceiverDetailAddress(receiverDetailAddress);
            return this;
        }
        public Builder note(String note){
            this.obj.setNote(note);
            return this;
        }
        public Builder confirmStatus(Integer confirmStatus){
            this.obj.setConfirmStatus(confirmStatus);
            return this;
        }
        public Builder deleteStatus(Integer deleteStatus){
            this.obj.setDeleteStatus(deleteStatus);
            return this;
        }
        public Builder useIntegration(Integer useIntegration){
            this.obj.setUseIntegration(useIntegration);
            return this;
        }
        public Builder paymentTime(java.time.LocalDateTime paymentTime){
            this.obj.setPaymentTime(paymentTime);
            return this;
        }
        public Builder deliveryTime(java.time.LocalDateTime deliveryTime){
            this.obj.setDeliveryTime(deliveryTime);
            return this;
        }
        public Builder receiveTime(java.time.LocalDateTime receiveTime){
            this.obj.setReceiveTime(receiveTime);
            return this;
        }
        public Builder commentTime(java.time.LocalDateTime commentTime){
            this.obj.setCommentTime(commentTime);
            return this;
        }
        public Builder modifyTime(java.time.LocalDateTime modifyTime){
            this.obj.setModifyTime(modifyTime);
            return this;
        }
        public OmsOrder build(){return obj;}
    }

}
