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
public class OmsOrderItem implements Serializable {

    private static final long serialVersionUID = 1573824706244L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 订单id
    * isNullAble:1
    */
    private Long orderId;

    /**
    * 订单编号
    * isNullAble:1
    */
    private String orderSn;

    /**
    * 
    * isNullAble:1
    */
    private Long productId;

    /**
    * 
    * isNullAble:1
    */
    private String productPic;

    /**
    * 
    * isNullAble:1
    */
    private String productName;

    /**
    * 
    * isNullAble:1
    */
    private String productBrand;

    /**
    * 
    * isNullAble:1
    */
    private String productSn;

    /**
    * 销售价格
    * isNullAble:1
    */
    private java.math.BigDecimal productPrice;

    /**
    * 购买数量
    * isNullAble:1
    */
    private Integer productQuantity;

    /**
    * 商品sku编号
    * isNullAble:1
    */
    private Long productSkuId;

    /**
    * 商品sku条码
    * isNullAble:1
    */
    private String productSkuCode;

    /**
    * 商品分类id
    * isNullAble:1
    */
    private Long productCategoryId;

    /**
    * 商品的销售属性
    * isNullAble:1
    */
    private String sp1;

    /**
    * 
    * isNullAble:1
    */
    private String sp2;

    /**
    * 
    * isNullAble:1
    */
    private String sp3;

    /**
    * 商品促销名称
    * isNullAble:1
    */
    private String promotionName;

    /**
    * 商品促销分解金额
    * isNullAble:1
    */
    private java.math.BigDecimal promotionAmount;

    /**
    * 优惠券优惠分解金额
    * isNullAble:1
    */
    private java.math.BigDecimal couponAmount;

    /**
    * 积分优惠分解金额
    * isNullAble:1
    */
    private java.math.BigDecimal integrationAmount;

    /**
    * 该商品经过优惠后的分解金额
    * isNullAble:1
    */
    private java.math.BigDecimal realAmount;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer giftIntegration;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer giftGrowth;

    /**
    * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
    * isNullAble:1
    */
    private String productAttr;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setOrderId(Long orderId){this.orderId = orderId;}

    public Long getOrderId(){return this.orderId;}

    public void setOrderSn(String orderSn){this.orderSn = orderSn;}

    public String getOrderSn(){return this.orderSn;}

    public void setProductId(Long productId){this.productId = productId;}

    public Long getProductId(){return this.productId;}

    public void setProductPic(String productPic){this.productPic = productPic;}

    public String getProductPic(){return this.productPic;}

    public void setProductName(String productName){this.productName = productName;}

    public String getProductName(){return this.productName;}

    public void setProductBrand(String productBrand){this.productBrand = productBrand;}

    public String getProductBrand(){return this.productBrand;}

    public void setProductSn(String productSn){this.productSn = productSn;}

    public String getProductSn(){return this.productSn;}

    public void setProductPrice(java.math.BigDecimal productPrice){this.productPrice = productPrice;}

    public java.math.BigDecimal getProductPrice(){return this.productPrice;}

    public void setProductQuantity(Integer productQuantity){this.productQuantity = productQuantity;}

    public Integer getProductQuantity(){return this.productQuantity;}

    public void setProductSkuId(Long productSkuId){this.productSkuId = productSkuId;}

    public Long getProductSkuId(){return this.productSkuId;}

    public void setProductSkuCode(String productSkuCode){this.productSkuCode = productSkuCode;}

    public String getProductSkuCode(){return this.productSkuCode;}

    public void setProductCategoryId(Long productCategoryId){this.productCategoryId = productCategoryId;}

    public Long getProductCategoryId(){return this.productCategoryId;}

    public void setSp1(String sp1){this.sp1 = sp1;}

    public String getSp1(){return this.sp1;}

    public void setSp2(String sp2){this.sp2 = sp2;}

    public String getSp2(){return this.sp2;}

    public void setSp3(String sp3){this.sp3 = sp3;}

    public String getSp3(){return this.sp3;}

    public void setPromotionName(String promotionName){this.promotionName = promotionName;}

    public String getPromotionName(){return this.promotionName;}

    public void setPromotionAmount(java.math.BigDecimal promotionAmount){this.promotionAmount = promotionAmount;}

    public java.math.BigDecimal getPromotionAmount(){return this.promotionAmount;}

    public void setCouponAmount(java.math.BigDecimal couponAmount){this.couponAmount = couponAmount;}

    public java.math.BigDecimal getCouponAmount(){return this.couponAmount;}

    public void setIntegrationAmount(java.math.BigDecimal integrationAmount){this.integrationAmount = integrationAmount;}

    public java.math.BigDecimal getIntegrationAmount(){return this.integrationAmount;}

    public void setRealAmount(java.math.BigDecimal realAmount){this.realAmount = realAmount;}

    public java.math.BigDecimal getRealAmount(){return this.realAmount;}

    public void setGiftIntegration(Integer giftIntegration){this.giftIntegration = giftIntegration;}

    public Integer getGiftIntegration(){return this.giftIntegration;}

    public void setGiftGrowth(Integer giftGrowth){this.giftGrowth = giftGrowth;}

    public Integer getGiftGrowth(){return this.giftGrowth;}

    public void setProductAttr(String productAttr){this.productAttr = productAttr;}

    public String getProductAttr(){return this.productAttr;}
    @Override
    public String toString() {
        return "OmsOrderItem{" +
                "id='" + id + '\'' +
                "orderId='" + orderId + '\'' +
                "orderSn='" + orderSn + '\'' +
                "productId='" + productId + '\'' +
                "productPic='" + productPic + '\'' +
                "productName='" + productName + '\'' +
                "productBrand='" + productBrand + '\'' +
                "productSn='" + productSn + '\'' +
                "productPrice='" + productPrice + '\'' +
                "productQuantity='" + productQuantity + '\'' +
                "productSkuId='" + productSkuId + '\'' +
                "productSkuCode='" + productSkuCode + '\'' +
                "productCategoryId='" + productCategoryId + '\'' +
                "sp1='" + sp1 + '\'' +
                "sp2='" + sp2 + '\'' +
                "sp3='" + sp3 + '\'' +
                "promotionName='" + promotionName + '\'' +
                "promotionAmount='" + promotionAmount + '\'' +
                "couponAmount='" + couponAmount + '\'' +
                "integrationAmount='" + integrationAmount + '\'' +
                "realAmount='" + realAmount + '\'' +
                "giftIntegration='" + giftIntegration + '\'' +
                "giftGrowth='" + giftGrowth + '\'' +
                "productAttr='" + productAttr + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private OmsOrderItem set;

        private ConditionBuilder where;

        public UpdateBuilder set(OmsOrderItem set){
            this.set = set;
            return this;
        }

        public OmsOrderItem getSet(){
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

    public static class QueryBuilder extends OmsOrderItem{
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

        private List<Long> orderIdList;

        public List<Long> getOrderIdList(){return this.orderIdList;}

        private Long orderIdSt;

        private Long orderIdEd;

        public Long getOrderIdSt(){return this.orderIdSt;}

        public Long getOrderIdEd(){return this.orderIdEd;}

        private List<String> orderSnList;

        public List<String> getOrderSnList(){return this.orderSnList;}


        private List<String> fuzzyOrderSn;

        public List<String> getFuzzyOrderSn(){return this.fuzzyOrderSn;}

        private List<String> rightFuzzyOrderSn;

        public List<String> getRightFuzzyOrderSn(){return this.rightFuzzyOrderSn;}
        private List<Long> productIdList;

        public List<Long> getProductIdList(){return this.productIdList;}

        private Long productIdSt;

        private Long productIdEd;

        public Long getProductIdSt(){return this.productIdSt;}

        public Long getProductIdEd(){return this.productIdEd;}

        private List<String> productPicList;

        public List<String> getProductPicList(){return this.productPicList;}


        private List<String> fuzzyProductPic;

        public List<String> getFuzzyProductPic(){return this.fuzzyProductPic;}

        private List<String> rightFuzzyProductPic;

        public List<String> getRightFuzzyProductPic(){return this.rightFuzzyProductPic;}
        private List<String> productNameList;

        public List<String> getProductNameList(){return this.productNameList;}


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){return this.fuzzyProductName;}

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){return this.rightFuzzyProductName;}
        private List<String> productBrandList;

        public List<String> getProductBrandList(){return this.productBrandList;}


        private List<String> fuzzyProductBrand;

        public List<String> getFuzzyProductBrand(){return this.fuzzyProductBrand;}

        private List<String> rightFuzzyProductBrand;

        public List<String> getRightFuzzyProductBrand(){return this.rightFuzzyProductBrand;}
        private List<String> productSnList;

        public List<String> getProductSnList(){return this.productSnList;}


        private List<String> fuzzyProductSn;

        public List<String> getFuzzyProductSn(){return this.fuzzyProductSn;}

        private List<String> rightFuzzyProductSn;

        public List<String> getRightFuzzyProductSn(){return this.rightFuzzyProductSn;}
        private List<java.math.BigDecimal> productPriceList;

        public List<java.math.BigDecimal> getProductPriceList(){return this.productPriceList;}

        private java.math.BigDecimal productPriceSt;

        private java.math.BigDecimal productPriceEd;

        public java.math.BigDecimal getProductPriceSt(){return this.productPriceSt;}

        public java.math.BigDecimal getProductPriceEd(){return this.productPriceEd;}

        private List<Integer> productQuantityList;

        public List<Integer> getProductQuantityList(){return this.productQuantityList;}

        private Integer productQuantitySt;

        private Integer productQuantityEd;

        public Integer getProductQuantitySt(){return this.productQuantitySt;}

        public Integer getProductQuantityEd(){return this.productQuantityEd;}

        private List<Long> productSkuIdList;

        public List<Long> getProductSkuIdList(){return this.productSkuIdList;}

        private Long productSkuIdSt;

        private Long productSkuIdEd;

        public Long getProductSkuIdSt(){return this.productSkuIdSt;}

        public Long getProductSkuIdEd(){return this.productSkuIdEd;}

        private List<String> productSkuCodeList;

        public List<String> getProductSkuCodeList(){return this.productSkuCodeList;}


        private List<String> fuzzyProductSkuCode;

        public List<String> getFuzzyProductSkuCode(){return this.fuzzyProductSkuCode;}

        private List<String> rightFuzzyProductSkuCode;

        public List<String> getRightFuzzyProductSkuCode(){return this.rightFuzzyProductSkuCode;}
        private List<Long> productCategoryIdList;

        public List<Long> getProductCategoryIdList(){return this.productCategoryIdList;}

        private Long productCategoryIdSt;

        private Long productCategoryIdEd;

        public Long getProductCategoryIdSt(){return this.productCategoryIdSt;}

        public Long getProductCategoryIdEd(){return this.productCategoryIdEd;}

        private List<String> sp1List;

        public List<String> getSp1List(){return this.sp1List;}


        private List<String> fuzzySp1;

        public List<String> getFuzzySp1(){return this.fuzzySp1;}

        private List<String> rightFuzzySp1;

        public List<String> getRightFuzzySp1(){return this.rightFuzzySp1;}
        private List<String> sp2List;

        public List<String> getSp2List(){return this.sp2List;}


        private List<String> fuzzySp2;

        public List<String> getFuzzySp2(){return this.fuzzySp2;}

        private List<String> rightFuzzySp2;

        public List<String> getRightFuzzySp2(){return this.rightFuzzySp2;}
        private List<String> sp3List;

        public List<String> getSp3List(){return this.sp3List;}


        private List<String> fuzzySp3;

        public List<String> getFuzzySp3(){return this.fuzzySp3;}

        private List<String> rightFuzzySp3;

        public List<String> getRightFuzzySp3(){return this.rightFuzzySp3;}
        private List<String> promotionNameList;

        public List<String> getPromotionNameList(){return this.promotionNameList;}


        private List<String> fuzzyPromotionName;

        public List<String> getFuzzyPromotionName(){return this.fuzzyPromotionName;}

        private List<String> rightFuzzyPromotionName;

        public List<String> getRightFuzzyPromotionName(){return this.rightFuzzyPromotionName;}
        private List<java.math.BigDecimal> promotionAmountList;

        public List<java.math.BigDecimal> getPromotionAmountList(){return this.promotionAmountList;}

        private java.math.BigDecimal promotionAmountSt;

        private java.math.BigDecimal promotionAmountEd;

        public java.math.BigDecimal getPromotionAmountSt(){return this.promotionAmountSt;}

        public java.math.BigDecimal getPromotionAmountEd(){return this.promotionAmountEd;}

        private List<java.math.BigDecimal> couponAmountList;

        public List<java.math.BigDecimal> getCouponAmountList(){return this.couponAmountList;}

        private java.math.BigDecimal couponAmountSt;

        private java.math.BigDecimal couponAmountEd;

        public java.math.BigDecimal getCouponAmountSt(){return this.couponAmountSt;}

        public java.math.BigDecimal getCouponAmountEd(){return this.couponAmountEd;}

        private List<java.math.BigDecimal> integrationAmountList;

        public List<java.math.BigDecimal> getIntegrationAmountList(){return this.integrationAmountList;}

        private java.math.BigDecimal integrationAmountSt;

        private java.math.BigDecimal integrationAmountEd;

        public java.math.BigDecimal getIntegrationAmountSt(){return this.integrationAmountSt;}

        public java.math.BigDecimal getIntegrationAmountEd(){return this.integrationAmountEd;}

        private List<java.math.BigDecimal> realAmountList;

        public List<java.math.BigDecimal> getRealAmountList(){return this.realAmountList;}

        private java.math.BigDecimal realAmountSt;

        private java.math.BigDecimal realAmountEd;

        public java.math.BigDecimal getRealAmountSt(){return this.realAmountSt;}

        public java.math.BigDecimal getRealAmountEd(){return this.realAmountEd;}

        private List<Integer> giftIntegrationList;

        public List<Integer> getGiftIntegrationList(){return this.giftIntegrationList;}

        private Integer giftIntegrationSt;

        private Integer giftIntegrationEd;

        public Integer getGiftIntegrationSt(){return this.giftIntegrationSt;}

        public Integer getGiftIntegrationEd(){return this.giftIntegrationEd;}

        private List<Integer> giftGrowthList;

        public List<Integer> getGiftGrowthList(){return this.giftGrowthList;}

        private Integer giftGrowthSt;

        private Integer giftGrowthEd;

        public Integer getGiftGrowthSt(){return this.giftGrowthSt;}

        public Integer getGiftGrowthEd(){return this.giftGrowthEd;}

        private List<String> productAttrList;

        public List<String> getProductAttrList(){return this.productAttrList;}


        private List<String> fuzzyProductAttr;

        public List<String> getFuzzyProductAttr(){return this.fuzzyProductAttr;}

        private List<String> rightFuzzyProductAttr;

        public List<String> getRightFuzzyProductAttr(){return this.rightFuzzyProductAttr;}
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

        public QueryBuilder orderIdBetWeen(Long orderIdSt,Long orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public QueryBuilder orderIdGreaterEqThan(Long orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public QueryBuilder orderIdLessEqThan(Long orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public QueryBuilder orderId(Long orderId){
            setOrderId(orderId);
            return this;
        }

        public QueryBuilder orderIdList(Long ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public QueryBuilder orderIdList(List<Long> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public QueryBuilder fetchOrderId(){
            setFetchFields("fetchFields","orderId");
            return this;
        }

        public QueryBuilder excludeOrderId(){
            setFetchFields("excludeFields","orderId");
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

        public QueryBuilder productIdBetWeen(Long productIdSt,Long productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public QueryBuilder productIdGreaterEqThan(Long productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public QueryBuilder productIdLessEqThan(Long productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public QueryBuilder productId(Long productId){
            setProductId(productId);
            return this;
        }

        public QueryBuilder productIdList(Long ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public QueryBuilder productIdList(List<Long> productId){
            this.productIdList = productId;
            return this;
        }

        public QueryBuilder fetchProductId(){
            setFetchFields("fetchFields","productId");
            return this;
        }

        public QueryBuilder excludeProductId(){
            setFetchFields("excludeFields","productId");
            return this;
        }

        public QueryBuilder fuzzyProductPic (List<String> fuzzyProductPic){
            this.fuzzyProductPic = fuzzyProductPic;
            return this;
        }

        public QueryBuilder fuzzyProductPic (String ... fuzzyProductPic){
            this.fuzzyProductPic = solveNullList(fuzzyProductPic);
            return this;
        }

        public QueryBuilder rightFuzzyProductPic (List<String> rightFuzzyProductPic){
            this.rightFuzzyProductPic = rightFuzzyProductPic;
            return this;
        }

        public QueryBuilder rightFuzzyProductPic (String ... rightFuzzyProductPic){
            this.rightFuzzyProductPic = solveNullList(rightFuzzyProductPic);
            return this;
        }

        public QueryBuilder productPic(String productPic){
            setProductPic(productPic);
            return this;
        }

        public QueryBuilder productPicList(String ... productPic){
            this.productPicList = solveNullList(productPic);
            return this;
        }

        public QueryBuilder productPicList(List<String> productPic){
            this.productPicList = productPic;
            return this;
        }

        public QueryBuilder fetchProductPic(){
            setFetchFields("fetchFields","productPic");
            return this;
        }

        public QueryBuilder excludeProductPic(){
            setFetchFields("excludeFields","productPic");
            return this;
        }

        public QueryBuilder fuzzyProductName (List<String> fuzzyProductName){
            this.fuzzyProductName = fuzzyProductName;
            return this;
        }

        public QueryBuilder fuzzyProductName (String ... fuzzyProductName){
            this.fuzzyProductName = solveNullList(fuzzyProductName);
            return this;
        }

        public QueryBuilder rightFuzzyProductName (List<String> rightFuzzyProductName){
            this.rightFuzzyProductName = rightFuzzyProductName;
            return this;
        }

        public QueryBuilder rightFuzzyProductName (String ... rightFuzzyProductName){
            this.rightFuzzyProductName = solveNullList(rightFuzzyProductName);
            return this;
        }

        public QueryBuilder productName(String productName){
            setProductName(productName);
            return this;
        }

        public QueryBuilder productNameList(String ... productName){
            this.productNameList = solveNullList(productName);
            return this;
        }

        public QueryBuilder productNameList(List<String> productName){
            this.productNameList = productName;
            return this;
        }

        public QueryBuilder fetchProductName(){
            setFetchFields("fetchFields","productName");
            return this;
        }

        public QueryBuilder excludeProductName(){
            setFetchFields("excludeFields","productName");
            return this;
        }

        public QueryBuilder fuzzyProductBrand (List<String> fuzzyProductBrand){
            this.fuzzyProductBrand = fuzzyProductBrand;
            return this;
        }

        public QueryBuilder fuzzyProductBrand (String ... fuzzyProductBrand){
            this.fuzzyProductBrand = solveNullList(fuzzyProductBrand);
            return this;
        }

        public QueryBuilder rightFuzzyProductBrand (List<String> rightFuzzyProductBrand){
            this.rightFuzzyProductBrand = rightFuzzyProductBrand;
            return this;
        }

        public QueryBuilder rightFuzzyProductBrand (String ... rightFuzzyProductBrand){
            this.rightFuzzyProductBrand = solveNullList(rightFuzzyProductBrand);
            return this;
        }

        public QueryBuilder productBrand(String productBrand){
            setProductBrand(productBrand);
            return this;
        }

        public QueryBuilder productBrandList(String ... productBrand){
            this.productBrandList = solveNullList(productBrand);
            return this;
        }

        public QueryBuilder productBrandList(List<String> productBrand){
            this.productBrandList = productBrand;
            return this;
        }

        public QueryBuilder fetchProductBrand(){
            setFetchFields("fetchFields","productBrand");
            return this;
        }

        public QueryBuilder excludeProductBrand(){
            setFetchFields("excludeFields","productBrand");
            return this;
        }

        public QueryBuilder fuzzyProductSn (List<String> fuzzyProductSn){
            this.fuzzyProductSn = fuzzyProductSn;
            return this;
        }

        public QueryBuilder fuzzyProductSn (String ... fuzzyProductSn){
            this.fuzzyProductSn = solveNullList(fuzzyProductSn);
            return this;
        }

        public QueryBuilder rightFuzzyProductSn (List<String> rightFuzzyProductSn){
            this.rightFuzzyProductSn = rightFuzzyProductSn;
            return this;
        }

        public QueryBuilder rightFuzzyProductSn (String ... rightFuzzyProductSn){
            this.rightFuzzyProductSn = solveNullList(rightFuzzyProductSn);
            return this;
        }

        public QueryBuilder productSn(String productSn){
            setProductSn(productSn);
            return this;
        }

        public QueryBuilder productSnList(String ... productSn){
            this.productSnList = solveNullList(productSn);
            return this;
        }

        public QueryBuilder productSnList(List<String> productSn){
            this.productSnList = productSn;
            return this;
        }

        public QueryBuilder fetchProductSn(){
            setFetchFields("fetchFields","productSn");
            return this;
        }

        public QueryBuilder excludeProductSn(){
            setFetchFields("excludeFields","productSn");
            return this;
        }

        public QueryBuilder productPriceBetWeen(java.math.BigDecimal productPriceSt,java.math.BigDecimal productPriceEd){
            this.productPriceSt = productPriceSt;
            this.productPriceEd = productPriceEd;
            return this;
        }

        public QueryBuilder productPriceGreaterEqThan(java.math.BigDecimal productPriceSt){
            this.productPriceSt = productPriceSt;
            return this;
        }
        public QueryBuilder productPriceLessEqThan(java.math.BigDecimal productPriceEd){
            this.productPriceEd = productPriceEd;
            return this;
        }


        public QueryBuilder productPrice(java.math.BigDecimal productPrice){
            setProductPrice(productPrice);
            return this;
        }

        public QueryBuilder productPriceList(java.math.BigDecimal ... productPrice){
            this.productPriceList = solveNullList(productPrice);
            return this;
        }

        public QueryBuilder productPriceList(List<java.math.BigDecimal> productPrice){
            this.productPriceList = productPrice;
            return this;
        }

        public QueryBuilder fetchProductPrice(){
            setFetchFields("fetchFields","productPrice");
            return this;
        }

        public QueryBuilder excludeProductPrice(){
            setFetchFields("excludeFields","productPrice");
            return this;
        }

        public QueryBuilder productQuantityBetWeen(Integer productQuantitySt,Integer productQuantityEd){
            this.productQuantitySt = productQuantitySt;
            this.productQuantityEd = productQuantityEd;
            return this;
        }

        public QueryBuilder productQuantityGreaterEqThan(Integer productQuantitySt){
            this.productQuantitySt = productQuantitySt;
            return this;
        }
        public QueryBuilder productQuantityLessEqThan(Integer productQuantityEd){
            this.productQuantityEd = productQuantityEd;
            return this;
        }


        public QueryBuilder productQuantity(Integer productQuantity){
            setProductQuantity(productQuantity);
            return this;
        }

        public QueryBuilder productQuantityList(Integer ... productQuantity){
            this.productQuantityList = solveNullList(productQuantity);
            return this;
        }

        public QueryBuilder productQuantityList(List<Integer> productQuantity){
            this.productQuantityList = productQuantity;
            return this;
        }

        public QueryBuilder fetchProductQuantity(){
            setFetchFields("fetchFields","productQuantity");
            return this;
        }

        public QueryBuilder excludeProductQuantity(){
            setFetchFields("excludeFields","productQuantity");
            return this;
        }

        public QueryBuilder productSkuIdBetWeen(Long productSkuIdSt,Long productSkuIdEd){
            this.productSkuIdSt = productSkuIdSt;
            this.productSkuIdEd = productSkuIdEd;
            return this;
        }

        public QueryBuilder productSkuIdGreaterEqThan(Long productSkuIdSt){
            this.productSkuIdSt = productSkuIdSt;
            return this;
        }
        public QueryBuilder productSkuIdLessEqThan(Long productSkuIdEd){
            this.productSkuIdEd = productSkuIdEd;
            return this;
        }


        public QueryBuilder productSkuId(Long productSkuId){
            setProductSkuId(productSkuId);
            return this;
        }

        public QueryBuilder productSkuIdList(Long ... productSkuId){
            this.productSkuIdList = solveNullList(productSkuId);
            return this;
        }

        public QueryBuilder productSkuIdList(List<Long> productSkuId){
            this.productSkuIdList = productSkuId;
            return this;
        }

        public QueryBuilder fetchProductSkuId(){
            setFetchFields("fetchFields","productSkuId");
            return this;
        }

        public QueryBuilder excludeProductSkuId(){
            setFetchFields("excludeFields","productSkuId");
            return this;
        }

        public QueryBuilder fuzzyProductSkuCode (List<String> fuzzyProductSkuCode){
            this.fuzzyProductSkuCode = fuzzyProductSkuCode;
            return this;
        }

        public QueryBuilder fuzzyProductSkuCode (String ... fuzzyProductSkuCode){
            this.fuzzyProductSkuCode = solveNullList(fuzzyProductSkuCode);
            return this;
        }

        public QueryBuilder rightFuzzyProductSkuCode (List<String> rightFuzzyProductSkuCode){
            this.rightFuzzyProductSkuCode = rightFuzzyProductSkuCode;
            return this;
        }

        public QueryBuilder rightFuzzyProductSkuCode (String ... rightFuzzyProductSkuCode){
            this.rightFuzzyProductSkuCode = solveNullList(rightFuzzyProductSkuCode);
            return this;
        }

        public QueryBuilder productSkuCode(String productSkuCode){
            setProductSkuCode(productSkuCode);
            return this;
        }

        public QueryBuilder productSkuCodeList(String ... productSkuCode){
            this.productSkuCodeList = solveNullList(productSkuCode);
            return this;
        }

        public QueryBuilder productSkuCodeList(List<String> productSkuCode){
            this.productSkuCodeList = productSkuCode;
            return this;
        }

        public QueryBuilder fetchProductSkuCode(){
            setFetchFields("fetchFields","productSkuCode");
            return this;
        }

        public QueryBuilder excludeProductSkuCode(){
            setFetchFields("excludeFields","productSkuCode");
            return this;
        }

        public QueryBuilder productCategoryIdBetWeen(Long productCategoryIdSt,Long productCategoryIdEd){
            this.productCategoryIdSt = productCategoryIdSt;
            this.productCategoryIdEd = productCategoryIdEd;
            return this;
        }

        public QueryBuilder productCategoryIdGreaterEqThan(Long productCategoryIdSt){
            this.productCategoryIdSt = productCategoryIdSt;
            return this;
        }
        public QueryBuilder productCategoryIdLessEqThan(Long productCategoryIdEd){
            this.productCategoryIdEd = productCategoryIdEd;
            return this;
        }


        public QueryBuilder productCategoryId(Long productCategoryId){
            setProductCategoryId(productCategoryId);
            return this;
        }

        public QueryBuilder productCategoryIdList(Long ... productCategoryId){
            this.productCategoryIdList = solveNullList(productCategoryId);
            return this;
        }

        public QueryBuilder productCategoryIdList(List<Long> productCategoryId){
            this.productCategoryIdList = productCategoryId;
            return this;
        }

        public QueryBuilder fetchProductCategoryId(){
            setFetchFields("fetchFields","productCategoryId");
            return this;
        }

        public QueryBuilder excludeProductCategoryId(){
            setFetchFields("excludeFields","productCategoryId");
            return this;
        }

        public QueryBuilder fuzzySp1 (List<String> fuzzySp1){
            this.fuzzySp1 = fuzzySp1;
            return this;
        }

        public QueryBuilder fuzzySp1 (String ... fuzzySp1){
            this.fuzzySp1 = solveNullList(fuzzySp1);
            return this;
        }

        public QueryBuilder rightFuzzySp1 (List<String> rightFuzzySp1){
            this.rightFuzzySp1 = rightFuzzySp1;
            return this;
        }

        public QueryBuilder rightFuzzySp1 (String ... rightFuzzySp1){
            this.rightFuzzySp1 = solveNullList(rightFuzzySp1);
            return this;
        }

        public QueryBuilder sp1(String sp1){
            setSp1(sp1);
            return this;
        }

        public QueryBuilder sp1List(String ... sp1){
            this.sp1List = solveNullList(sp1);
            return this;
        }

        public QueryBuilder sp1List(List<String> sp1){
            this.sp1List = sp1;
            return this;
        }

        public QueryBuilder fetchSp1(){
            setFetchFields("fetchFields","sp1");
            return this;
        }

        public QueryBuilder excludeSp1(){
            setFetchFields("excludeFields","sp1");
            return this;
        }

        public QueryBuilder fuzzySp2 (List<String> fuzzySp2){
            this.fuzzySp2 = fuzzySp2;
            return this;
        }

        public QueryBuilder fuzzySp2 (String ... fuzzySp2){
            this.fuzzySp2 = solveNullList(fuzzySp2);
            return this;
        }

        public QueryBuilder rightFuzzySp2 (List<String> rightFuzzySp2){
            this.rightFuzzySp2 = rightFuzzySp2;
            return this;
        }

        public QueryBuilder rightFuzzySp2 (String ... rightFuzzySp2){
            this.rightFuzzySp2 = solveNullList(rightFuzzySp2);
            return this;
        }

        public QueryBuilder sp2(String sp2){
            setSp2(sp2);
            return this;
        }

        public QueryBuilder sp2List(String ... sp2){
            this.sp2List = solveNullList(sp2);
            return this;
        }

        public QueryBuilder sp2List(List<String> sp2){
            this.sp2List = sp2;
            return this;
        }

        public QueryBuilder fetchSp2(){
            setFetchFields("fetchFields","sp2");
            return this;
        }

        public QueryBuilder excludeSp2(){
            setFetchFields("excludeFields","sp2");
            return this;
        }

        public QueryBuilder fuzzySp3 (List<String> fuzzySp3){
            this.fuzzySp3 = fuzzySp3;
            return this;
        }

        public QueryBuilder fuzzySp3 (String ... fuzzySp3){
            this.fuzzySp3 = solveNullList(fuzzySp3);
            return this;
        }

        public QueryBuilder rightFuzzySp3 (List<String> rightFuzzySp3){
            this.rightFuzzySp3 = rightFuzzySp3;
            return this;
        }

        public QueryBuilder rightFuzzySp3 (String ... rightFuzzySp3){
            this.rightFuzzySp3 = solveNullList(rightFuzzySp3);
            return this;
        }

        public QueryBuilder sp3(String sp3){
            setSp3(sp3);
            return this;
        }

        public QueryBuilder sp3List(String ... sp3){
            this.sp3List = solveNullList(sp3);
            return this;
        }

        public QueryBuilder sp3List(List<String> sp3){
            this.sp3List = sp3;
            return this;
        }

        public QueryBuilder fetchSp3(){
            setFetchFields("fetchFields","sp3");
            return this;
        }

        public QueryBuilder excludeSp3(){
            setFetchFields("excludeFields","sp3");
            return this;
        }

        public QueryBuilder fuzzyPromotionName (List<String> fuzzyPromotionName){
            this.fuzzyPromotionName = fuzzyPromotionName;
            return this;
        }

        public QueryBuilder fuzzyPromotionName (String ... fuzzyPromotionName){
            this.fuzzyPromotionName = solveNullList(fuzzyPromotionName);
            return this;
        }

        public QueryBuilder rightFuzzyPromotionName (List<String> rightFuzzyPromotionName){
            this.rightFuzzyPromotionName = rightFuzzyPromotionName;
            return this;
        }

        public QueryBuilder rightFuzzyPromotionName (String ... rightFuzzyPromotionName){
            this.rightFuzzyPromotionName = solveNullList(rightFuzzyPromotionName);
            return this;
        }

        public QueryBuilder promotionName(String promotionName){
            setPromotionName(promotionName);
            return this;
        }

        public QueryBuilder promotionNameList(String ... promotionName){
            this.promotionNameList = solveNullList(promotionName);
            return this;
        }

        public QueryBuilder promotionNameList(List<String> promotionName){
            this.promotionNameList = promotionName;
            return this;
        }

        public QueryBuilder fetchPromotionName(){
            setFetchFields("fetchFields","promotionName");
            return this;
        }

        public QueryBuilder excludePromotionName(){
            setFetchFields("excludeFields","promotionName");
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

        public QueryBuilder realAmountBetWeen(java.math.BigDecimal realAmountSt,java.math.BigDecimal realAmountEd){
            this.realAmountSt = realAmountSt;
            this.realAmountEd = realAmountEd;
            return this;
        }

        public QueryBuilder realAmountGreaterEqThan(java.math.BigDecimal realAmountSt){
            this.realAmountSt = realAmountSt;
            return this;
        }
        public QueryBuilder realAmountLessEqThan(java.math.BigDecimal realAmountEd){
            this.realAmountEd = realAmountEd;
            return this;
        }


        public QueryBuilder realAmount(java.math.BigDecimal realAmount){
            setRealAmount(realAmount);
            return this;
        }

        public QueryBuilder realAmountList(java.math.BigDecimal ... realAmount){
            this.realAmountList = solveNullList(realAmount);
            return this;
        }

        public QueryBuilder realAmountList(List<java.math.BigDecimal> realAmount){
            this.realAmountList = realAmount;
            return this;
        }

        public QueryBuilder fetchRealAmount(){
            setFetchFields("fetchFields","realAmount");
            return this;
        }

        public QueryBuilder excludeRealAmount(){
            setFetchFields("excludeFields","realAmount");
            return this;
        }

        public QueryBuilder giftIntegrationBetWeen(Integer giftIntegrationSt,Integer giftIntegrationEd){
            this.giftIntegrationSt = giftIntegrationSt;
            this.giftIntegrationEd = giftIntegrationEd;
            return this;
        }

        public QueryBuilder giftIntegrationGreaterEqThan(Integer giftIntegrationSt){
            this.giftIntegrationSt = giftIntegrationSt;
            return this;
        }
        public QueryBuilder giftIntegrationLessEqThan(Integer giftIntegrationEd){
            this.giftIntegrationEd = giftIntegrationEd;
            return this;
        }


        public QueryBuilder giftIntegration(Integer giftIntegration){
            setGiftIntegration(giftIntegration);
            return this;
        }

        public QueryBuilder giftIntegrationList(Integer ... giftIntegration){
            this.giftIntegrationList = solveNullList(giftIntegration);
            return this;
        }

        public QueryBuilder giftIntegrationList(List<Integer> giftIntegration){
            this.giftIntegrationList = giftIntegration;
            return this;
        }

        public QueryBuilder fetchGiftIntegration(){
            setFetchFields("fetchFields","giftIntegration");
            return this;
        }

        public QueryBuilder excludeGiftIntegration(){
            setFetchFields("excludeFields","giftIntegration");
            return this;
        }

        public QueryBuilder giftGrowthBetWeen(Integer giftGrowthSt,Integer giftGrowthEd){
            this.giftGrowthSt = giftGrowthSt;
            this.giftGrowthEd = giftGrowthEd;
            return this;
        }

        public QueryBuilder giftGrowthGreaterEqThan(Integer giftGrowthSt){
            this.giftGrowthSt = giftGrowthSt;
            return this;
        }
        public QueryBuilder giftGrowthLessEqThan(Integer giftGrowthEd){
            this.giftGrowthEd = giftGrowthEd;
            return this;
        }


        public QueryBuilder giftGrowth(Integer giftGrowth){
            setGiftGrowth(giftGrowth);
            return this;
        }

        public QueryBuilder giftGrowthList(Integer ... giftGrowth){
            this.giftGrowthList = solveNullList(giftGrowth);
            return this;
        }

        public QueryBuilder giftGrowthList(List<Integer> giftGrowth){
            this.giftGrowthList = giftGrowth;
            return this;
        }

        public QueryBuilder fetchGiftGrowth(){
            setFetchFields("fetchFields","giftGrowth");
            return this;
        }

        public QueryBuilder excludeGiftGrowth(){
            setFetchFields("excludeFields","giftGrowth");
            return this;
        }

        public QueryBuilder fuzzyProductAttr (List<String> fuzzyProductAttr){
            this.fuzzyProductAttr = fuzzyProductAttr;
            return this;
        }

        public QueryBuilder fuzzyProductAttr (String ... fuzzyProductAttr){
            this.fuzzyProductAttr = solveNullList(fuzzyProductAttr);
            return this;
        }

        public QueryBuilder rightFuzzyProductAttr (List<String> rightFuzzyProductAttr){
            this.rightFuzzyProductAttr = rightFuzzyProductAttr;
            return this;
        }

        public QueryBuilder rightFuzzyProductAttr (String ... rightFuzzyProductAttr){
            this.rightFuzzyProductAttr = solveNullList(rightFuzzyProductAttr);
            return this;
        }

        public QueryBuilder productAttr(String productAttr){
            setProductAttr(productAttr);
            return this;
        }

        public QueryBuilder productAttrList(String ... productAttr){
            this.productAttrList = solveNullList(productAttr);
            return this;
        }

        public QueryBuilder productAttrList(List<String> productAttr){
            this.productAttrList = productAttr;
            return this;
        }

        public QueryBuilder fetchProductAttr(){
            setFetchFields("fetchFields","productAttr");
            return this;
        }

        public QueryBuilder excludeProductAttr(){
            setFetchFields("excludeFields","productAttr");
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

        public OmsOrderItem build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> orderIdList;

        public List<Long> getOrderIdList(){return this.orderIdList;}

        private Long orderIdSt;

        private Long orderIdEd;

        public Long getOrderIdSt(){return this.orderIdSt;}

        public Long getOrderIdEd(){return this.orderIdEd;}

        private List<String> orderSnList;

        public List<String> getOrderSnList(){return this.orderSnList;}


        private List<String> fuzzyOrderSn;

        public List<String> getFuzzyOrderSn(){return this.fuzzyOrderSn;}

        private List<String> rightFuzzyOrderSn;

        public List<String> getRightFuzzyOrderSn(){return this.rightFuzzyOrderSn;}
        private List<Long> productIdList;

        public List<Long> getProductIdList(){return this.productIdList;}

        private Long productIdSt;

        private Long productIdEd;

        public Long getProductIdSt(){return this.productIdSt;}

        public Long getProductIdEd(){return this.productIdEd;}

        private List<String> productPicList;

        public List<String> getProductPicList(){return this.productPicList;}


        private List<String> fuzzyProductPic;

        public List<String> getFuzzyProductPic(){return this.fuzzyProductPic;}

        private List<String> rightFuzzyProductPic;

        public List<String> getRightFuzzyProductPic(){return this.rightFuzzyProductPic;}
        private List<String> productNameList;

        public List<String> getProductNameList(){return this.productNameList;}


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){return this.fuzzyProductName;}

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){return this.rightFuzzyProductName;}
        private List<String> productBrandList;

        public List<String> getProductBrandList(){return this.productBrandList;}


        private List<String> fuzzyProductBrand;

        public List<String> getFuzzyProductBrand(){return this.fuzzyProductBrand;}

        private List<String> rightFuzzyProductBrand;

        public List<String> getRightFuzzyProductBrand(){return this.rightFuzzyProductBrand;}
        private List<String> productSnList;

        public List<String> getProductSnList(){return this.productSnList;}


        private List<String> fuzzyProductSn;

        public List<String> getFuzzyProductSn(){return this.fuzzyProductSn;}

        private List<String> rightFuzzyProductSn;

        public List<String> getRightFuzzyProductSn(){return this.rightFuzzyProductSn;}
        private List<java.math.BigDecimal> productPriceList;

        public List<java.math.BigDecimal> getProductPriceList(){return this.productPriceList;}

        private java.math.BigDecimal productPriceSt;

        private java.math.BigDecimal productPriceEd;

        public java.math.BigDecimal getProductPriceSt(){return this.productPriceSt;}

        public java.math.BigDecimal getProductPriceEd(){return this.productPriceEd;}

        private List<Integer> productQuantityList;

        public List<Integer> getProductQuantityList(){return this.productQuantityList;}

        private Integer productQuantitySt;

        private Integer productQuantityEd;

        public Integer getProductQuantitySt(){return this.productQuantitySt;}

        public Integer getProductQuantityEd(){return this.productQuantityEd;}

        private List<Long> productSkuIdList;

        public List<Long> getProductSkuIdList(){return this.productSkuIdList;}

        private Long productSkuIdSt;

        private Long productSkuIdEd;

        public Long getProductSkuIdSt(){return this.productSkuIdSt;}

        public Long getProductSkuIdEd(){return this.productSkuIdEd;}

        private List<String> productSkuCodeList;

        public List<String> getProductSkuCodeList(){return this.productSkuCodeList;}


        private List<String> fuzzyProductSkuCode;

        public List<String> getFuzzyProductSkuCode(){return this.fuzzyProductSkuCode;}

        private List<String> rightFuzzyProductSkuCode;

        public List<String> getRightFuzzyProductSkuCode(){return this.rightFuzzyProductSkuCode;}
        private List<Long> productCategoryIdList;

        public List<Long> getProductCategoryIdList(){return this.productCategoryIdList;}

        private Long productCategoryIdSt;

        private Long productCategoryIdEd;

        public Long getProductCategoryIdSt(){return this.productCategoryIdSt;}

        public Long getProductCategoryIdEd(){return this.productCategoryIdEd;}

        private List<String> sp1List;

        public List<String> getSp1List(){return this.sp1List;}


        private List<String> fuzzySp1;

        public List<String> getFuzzySp1(){return this.fuzzySp1;}

        private List<String> rightFuzzySp1;

        public List<String> getRightFuzzySp1(){return this.rightFuzzySp1;}
        private List<String> sp2List;

        public List<String> getSp2List(){return this.sp2List;}


        private List<String> fuzzySp2;

        public List<String> getFuzzySp2(){return this.fuzzySp2;}

        private List<String> rightFuzzySp2;

        public List<String> getRightFuzzySp2(){return this.rightFuzzySp2;}
        private List<String> sp3List;

        public List<String> getSp3List(){return this.sp3List;}


        private List<String> fuzzySp3;

        public List<String> getFuzzySp3(){return this.fuzzySp3;}

        private List<String> rightFuzzySp3;

        public List<String> getRightFuzzySp3(){return this.rightFuzzySp3;}
        private List<String> promotionNameList;

        public List<String> getPromotionNameList(){return this.promotionNameList;}


        private List<String> fuzzyPromotionName;

        public List<String> getFuzzyPromotionName(){return this.fuzzyPromotionName;}

        private List<String> rightFuzzyPromotionName;

        public List<String> getRightFuzzyPromotionName(){return this.rightFuzzyPromotionName;}
        private List<java.math.BigDecimal> promotionAmountList;

        public List<java.math.BigDecimal> getPromotionAmountList(){return this.promotionAmountList;}

        private java.math.BigDecimal promotionAmountSt;

        private java.math.BigDecimal promotionAmountEd;

        public java.math.BigDecimal getPromotionAmountSt(){return this.promotionAmountSt;}

        public java.math.BigDecimal getPromotionAmountEd(){return this.promotionAmountEd;}

        private List<java.math.BigDecimal> couponAmountList;

        public List<java.math.BigDecimal> getCouponAmountList(){return this.couponAmountList;}

        private java.math.BigDecimal couponAmountSt;

        private java.math.BigDecimal couponAmountEd;

        public java.math.BigDecimal getCouponAmountSt(){return this.couponAmountSt;}

        public java.math.BigDecimal getCouponAmountEd(){return this.couponAmountEd;}

        private List<java.math.BigDecimal> integrationAmountList;

        public List<java.math.BigDecimal> getIntegrationAmountList(){return this.integrationAmountList;}

        private java.math.BigDecimal integrationAmountSt;

        private java.math.BigDecimal integrationAmountEd;

        public java.math.BigDecimal getIntegrationAmountSt(){return this.integrationAmountSt;}

        public java.math.BigDecimal getIntegrationAmountEd(){return this.integrationAmountEd;}

        private List<java.math.BigDecimal> realAmountList;

        public List<java.math.BigDecimal> getRealAmountList(){return this.realAmountList;}

        private java.math.BigDecimal realAmountSt;

        private java.math.BigDecimal realAmountEd;

        public java.math.BigDecimal getRealAmountSt(){return this.realAmountSt;}

        public java.math.BigDecimal getRealAmountEd(){return this.realAmountEd;}

        private List<Integer> giftIntegrationList;

        public List<Integer> getGiftIntegrationList(){return this.giftIntegrationList;}

        private Integer giftIntegrationSt;

        private Integer giftIntegrationEd;

        public Integer getGiftIntegrationSt(){return this.giftIntegrationSt;}

        public Integer getGiftIntegrationEd(){return this.giftIntegrationEd;}

        private List<Integer> giftGrowthList;

        public List<Integer> getGiftGrowthList(){return this.giftGrowthList;}

        private Integer giftGrowthSt;

        private Integer giftGrowthEd;

        public Integer getGiftGrowthSt(){return this.giftGrowthSt;}

        public Integer getGiftGrowthEd(){return this.giftGrowthEd;}

        private List<String> productAttrList;

        public List<String> getProductAttrList(){return this.productAttrList;}


        private List<String> fuzzyProductAttr;

        public List<String> getFuzzyProductAttr(){return this.fuzzyProductAttr;}

        private List<String> rightFuzzyProductAttr;

        public List<String> getRightFuzzyProductAttr(){return this.rightFuzzyProductAttr;}

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

        public ConditionBuilder orderIdBetWeen(Long orderIdSt,Long orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public ConditionBuilder orderIdGreaterEqThan(Long orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public ConditionBuilder orderIdLessEqThan(Long orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public ConditionBuilder orderIdList(Long ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public ConditionBuilder orderIdList(List<Long> orderId){
            this.orderIdList = orderId;
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

        public ConditionBuilder productIdBetWeen(Long productIdSt,Long productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public ConditionBuilder productIdGreaterEqThan(Long productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public ConditionBuilder productIdLessEqThan(Long productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public ConditionBuilder productIdList(Long ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public ConditionBuilder productIdList(List<Long> productId){
            this.productIdList = productId;
            return this;
        }

        public ConditionBuilder fuzzyProductPic (List<String> fuzzyProductPic){
            this.fuzzyProductPic = fuzzyProductPic;
            return this;
        }

        public ConditionBuilder fuzzyProductPic (String ... fuzzyProductPic){
            this.fuzzyProductPic = solveNullList(fuzzyProductPic);
            return this;
        }

        public ConditionBuilder rightFuzzyProductPic (List<String> rightFuzzyProductPic){
            this.rightFuzzyProductPic = rightFuzzyProductPic;
            return this;
        }

        public ConditionBuilder rightFuzzyProductPic (String ... rightFuzzyProductPic){
            this.rightFuzzyProductPic = solveNullList(rightFuzzyProductPic);
            return this;
        }

        public ConditionBuilder productPicList(String ... productPic){
            this.productPicList = solveNullList(productPic);
            return this;
        }

        public ConditionBuilder productPicList(List<String> productPic){
            this.productPicList = productPic;
            return this;
        }

        public ConditionBuilder fuzzyProductName (List<String> fuzzyProductName){
            this.fuzzyProductName = fuzzyProductName;
            return this;
        }

        public ConditionBuilder fuzzyProductName (String ... fuzzyProductName){
            this.fuzzyProductName = solveNullList(fuzzyProductName);
            return this;
        }

        public ConditionBuilder rightFuzzyProductName (List<String> rightFuzzyProductName){
            this.rightFuzzyProductName = rightFuzzyProductName;
            return this;
        }

        public ConditionBuilder rightFuzzyProductName (String ... rightFuzzyProductName){
            this.rightFuzzyProductName = solveNullList(rightFuzzyProductName);
            return this;
        }

        public ConditionBuilder productNameList(String ... productName){
            this.productNameList = solveNullList(productName);
            return this;
        }

        public ConditionBuilder productNameList(List<String> productName){
            this.productNameList = productName;
            return this;
        }

        public ConditionBuilder fuzzyProductBrand (List<String> fuzzyProductBrand){
            this.fuzzyProductBrand = fuzzyProductBrand;
            return this;
        }

        public ConditionBuilder fuzzyProductBrand (String ... fuzzyProductBrand){
            this.fuzzyProductBrand = solveNullList(fuzzyProductBrand);
            return this;
        }

        public ConditionBuilder rightFuzzyProductBrand (List<String> rightFuzzyProductBrand){
            this.rightFuzzyProductBrand = rightFuzzyProductBrand;
            return this;
        }

        public ConditionBuilder rightFuzzyProductBrand (String ... rightFuzzyProductBrand){
            this.rightFuzzyProductBrand = solveNullList(rightFuzzyProductBrand);
            return this;
        }

        public ConditionBuilder productBrandList(String ... productBrand){
            this.productBrandList = solveNullList(productBrand);
            return this;
        }

        public ConditionBuilder productBrandList(List<String> productBrand){
            this.productBrandList = productBrand;
            return this;
        }

        public ConditionBuilder fuzzyProductSn (List<String> fuzzyProductSn){
            this.fuzzyProductSn = fuzzyProductSn;
            return this;
        }

        public ConditionBuilder fuzzyProductSn (String ... fuzzyProductSn){
            this.fuzzyProductSn = solveNullList(fuzzyProductSn);
            return this;
        }

        public ConditionBuilder rightFuzzyProductSn (List<String> rightFuzzyProductSn){
            this.rightFuzzyProductSn = rightFuzzyProductSn;
            return this;
        }

        public ConditionBuilder rightFuzzyProductSn (String ... rightFuzzyProductSn){
            this.rightFuzzyProductSn = solveNullList(rightFuzzyProductSn);
            return this;
        }

        public ConditionBuilder productSnList(String ... productSn){
            this.productSnList = solveNullList(productSn);
            return this;
        }

        public ConditionBuilder productSnList(List<String> productSn){
            this.productSnList = productSn;
            return this;
        }

        public ConditionBuilder productPriceBetWeen(java.math.BigDecimal productPriceSt,java.math.BigDecimal productPriceEd){
            this.productPriceSt = productPriceSt;
            this.productPriceEd = productPriceEd;
            return this;
        }

        public ConditionBuilder productPriceGreaterEqThan(java.math.BigDecimal productPriceSt){
            this.productPriceSt = productPriceSt;
            return this;
        }
        public ConditionBuilder productPriceLessEqThan(java.math.BigDecimal productPriceEd){
            this.productPriceEd = productPriceEd;
            return this;
        }


        public ConditionBuilder productPriceList(java.math.BigDecimal ... productPrice){
            this.productPriceList = solveNullList(productPrice);
            return this;
        }

        public ConditionBuilder productPriceList(List<java.math.BigDecimal> productPrice){
            this.productPriceList = productPrice;
            return this;
        }

        public ConditionBuilder productQuantityBetWeen(Integer productQuantitySt,Integer productQuantityEd){
            this.productQuantitySt = productQuantitySt;
            this.productQuantityEd = productQuantityEd;
            return this;
        }

        public ConditionBuilder productQuantityGreaterEqThan(Integer productQuantitySt){
            this.productQuantitySt = productQuantitySt;
            return this;
        }
        public ConditionBuilder productQuantityLessEqThan(Integer productQuantityEd){
            this.productQuantityEd = productQuantityEd;
            return this;
        }


        public ConditionBuilder productQuantityList(Integer ... productQuantity){
            this.productQuantityList = solveNullList(productQuantity);
            return this;
        }

        public ConditionBuilder productQuantityList(List<Integer> productQuantity){
            this.productQuantityList = productQuantity;
            return this;
        }

        public ConditionBuilder productSkuIdBetWeen(Long productSkuIdSt,Long productSkuIdEd){
            this.productSkuIdSt = productSkuIdSt;
            this.productSkuIdEd = productSkuIdEd;
            return this;
        }

        public ConditionBuilder productSkuIdGreaterEqThan(Long productSkuIdSt){
            this.productSkuIdSt = productSkuIdSt;
            return this;
        }
        public ConditionBuilder productSkuIdLessEqThan(Long productSkuIdEd){
            this.productSkuIdEd = productSkuIdEd;
            return this;
        }


        public ConditionBuilder productSkuIdList(Long ... productSkuId){
            this.productSkuIdList = solveNullList(productSkuId);
            return this;
        }

        public ConditionBuilder productSkuIdList(List<Long> productSkuId){
            this.productSkuIdList = productSkuId;
            return this;
        }

        public ConditionBuilder fuzzyProductSkuCode (List<String> fuzzyProductSkuCode){
            this.fuzzyProductSkuCode = fuzzyProductSkuCode;
            return this;
        }

        public ConditionBuilder fuzzyProductSkuCode (String ... fuzzyProductSkuCode){
            this.fuzzyProductSkuCode = solveNullList(fuzzyProductSkuCode);
            return this;
        }

        public ConditionBuilder rightFuzzyProductSkuCode (List<String> rightFuzzyProductSkuCode){
            this.rightFuzzyProductSkuCode = rightFuzzyProductSkuCode;
            return this;
        }

        public ConditionBuilder rightFuzzyProductSkuCode (String ... rightFuzzyProductSkuCode){
            this.rightFuzzyProductSkuCode = solveNullList(rightFuzzyProductSkuCode);
            return this;
        }

        public ConditionBuilder productSkuCodeList(String ... productSkuCode){
            this.productSkuCodeList = solveNullList(productSkuCode);
            return this;
        }

        public ConditionBuilder productSkuCodeList(List<String> productSkuCode){
            this.productSkuCodeList = productSkuCode;
            return this;
        }

        public ConditionBuilder productCategoryIdBetWeen(Long productCategoryIdSt,Long productCategoryIdEd){
            this.productCategoryIdSt = productCategoryIdSt;
            this.productCategoryIdEd = productCategoryIdEd;
            return this;
        }

        public ConditionBuilder productCategoryIdGreaterEqThan(Long productCategoryIdSt){
            this.productCategoryIdSt = productCategoryIdSt;
            return this;
        }
        public ConditionBuilder productCategoryIdLessEqThan(Long productCategoryIdEd){
            this.productCategoryIdEd = productCategoryIdEd;
            return this;
        }


        public ConditionBuilder productCategoryIdList(Long ... productCategoryId){
            this.productCategoryIdList = solveNullList(productCategoryId);
            return this;
        }

        public ConditionBuilder productCategoryIdList(List<Long> productCategoryId){
            this.productCategoryIdList = productCategoryId;
            return this;
        }

        public ConditionBuilder fuzzySp1 (List<String> fuzzySp1){
            this.fuzzySp1 = fuzzySp1;
            return this;
        }

        public ConditionBuilder fuzzySp1 (String ... fuzzySp1){
            this.fuzzySp1 = solveNullList(fuzzySp1);
            return this;
        }

        public ConditionBuilder rightFuzzySp1 (List<String> rightFuzzySp1){
            this.rightFuzzySp1 = rightFuzzySp1;
            return this;
        }

        public ConditionBuilder rightFuzzySp1 (String ... rightFuzzySp1){
            this.rightFuzzySp1 = solveNullList(rightFuzzySp1);
            return this;
        }

        public ConditionBuilder sp1List(String ... sp1){
            this.sp1List = solveNullList(sp1);
            return this;
        }

        public ConditionBuilder sp1List(List<String> sp1){
            this.sp1List = sp1;
            return this;
        }

        public ConditionBuilder fuzzySp2 (List<String> fuzzySp2){
            this.fuzzySp2 = fuzzySp2;
            return this;
        }

        public ConditionBuilder fuzzySp2 (String ... fuzzySp2){
            this.fuzzySp2 = solveNullList(fuzzySp2);
            return this;
        }

        public ConditionBuilder rightFuzzySp2 (List<String> rightFuzzySp2){
            this.rightFuzzySp2 = rightFuzzySp2;
            return this;
        }

        public ConditionBuilder rightFuzzySp2 (String ... rightFuzzySp2){
            this.rightFuzzySp2 = solveNullList(rightFuzzySp2);
            return this;
        }

        public ConditionBuilder sp2List(String ... sp2){
            this.sp2List = solveNullList(sp2);
            return this;
        }

        public ConditionBuilder sp2List(List<String> sp2){
            this.sp2List = sp2;
            return this;
        }

        public ConditionBuilder fuzzySp3 (List<String> fuzzySp3){
            this.fuzzySp3 = fuzzySp3;
            return this;
        }

        public ConditionBuilder fuzzySp3 (String ... fuzzySp3){
            this.fuzzySp3 = solveNullList(fuzzySp3);
            return this;
        }

        public ConditionBuilder rightFuzzySp3 (List<String> rightFuzzySp3){
            this.rightFuzzySp3 = rightFuzzySp3;
            return this;
        }

        public ConditionBuilder rightFuzzySp3 (String ... rightFuzzySp3){
            this.rightFuzzySp3 = solveNullList(rightFuzzySp3);
            return this;
        }

        public ConditionBuilder sp3List(String ... sp3){
            this.sp3List = solveNullList(sp3);
            return this;
        }

        public ConditionBuilder sp3List(List<String> sp3){
            this.sp3List = sp3;
            return this;
        }

        public ConditionBuilder fuzzyPromotionName (List<String> fuzzyPromotionName){
            this.fuzzyPromotionName = fuzzyPromotionName;
            return this;
        }

        public ConditionBuilder fuzzyPromotionName (String ... fuzzyPromotionName){
            this.fuzzyPromotionName = solveNullList(fuzzyPromotionName);
            return this;
        }

        public ConditionBuilder rightFuzzyPromotionName (List<String> rightFuzzyPromotionName){
            this.rightFuzzyPromotionName = rightFuzzyPromotionName;
            return this;
        }

        public ConditionBuilder rightFuzzyPromotionName (String ... rightFuzzyPromotionName){
            this.rightFuzzyPromotionName = solveNullList(rightFuzzyPromotionName);
            return this;
        }

        public ConditionBuilder promotionNameList(String ... promotionName){
            this.promotionNameList = solveNullList(promotionName);
            return this;
        }

        public ConditionBuilder promotionNameList(List<String> promotionName){
            this.promotionNameList = promotionName;
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

        public ConditionBuilder realAmountBetWeen(java.math.BigDecimal realAmountSt,java.math.BigDecimal realAmountEd){
            this.realAmountSt = realAmountSt;
            this.realAmountEd = realAmountEd;
            return this;
        }

        public ConditionBuilder realAmountGreaterEqThan(java.math.BigDecimal realAmountSt){
            this.realAmountSt = realAmountSt;
            return this;
        }
        public ConditionBuilder realAmountLessEqThan(java.math.BigDecimal realAmountEd){
            this.realAmountEd = realAmountEd;
            return this;
        }


        public ConditionBuilder realAmountList(java.math.BigDecimal ... realAmount){
            this.realAmountList = solveNullList(realAmount);
            return this;
        }

        public ConditionBuilder realAmountList(List<java.math.BigDecimal> realAmount){
            this.realAmountList = realAmount;
            return this;
        }

        public ConditionBuilder giftIntegrationBetWeen(Integer giftIntegrationSt,Integer giftIntegrationEd){
            this.giftIntegrationSt = giftIntegrationSt;
            this.giftIntegrationEd = giftIntegrationEd;
            return this;
        }

        public ConditionBuilder giftIntegrationGreaterEqThan(Integer giftIntegrationSt){
            this.giftIntegrationSt = giftIntegrationSt;
            return this;
        }
        public ConditionBuilder giftIntegrationLessEqThan(Integer giftIntegrationEd){
            this.giftIntegrationEd = giftIntegrationEd;
            return this;
        }


        public ConditionBuilder giftIntegrationList(Integer ... giftIntegration){
            this.giftIntegrationList = solveNullList(giftIntegration);
            return this;
        }

        public ConditionBuilder giftIntegrationList(List<Integer> giftIntegration){
            this.giftIntegrationList = giftIntegration;
            return this;
        }

        public ConditionBuilder giftGrowthBetWeen(Integer giftGrowthSt,Integer giftGrowthEd){
            this.giftGrowthSt = giftGrowthSt;
            this.giftGrowthEd = giftGrowthEd;
            return this;
        }

        public ConditionBuilder giftGrowthGreaterEqThan(Integer giftGrowthSt){
            this.giftGrowthSt = giftGrowthSt;
            return this;
        }
        public ConditionBuilder giftGrowthLessEqThan(Integer giftGrowthEd){
            this.giftGrowthEd = giftGrowthEd;
            return this;
        }


        public ConditionBuilder giftGrowthList(Integer ... giftGrowth){
            this.giftGrowthList = solveNullList(giftGrowth);
            return this;
        }

        public ConditionBuilder giftGrowthList(List<Integer> giftGrowth){
            this.giftGrowthList = giftGrowth;
            return this;
        }

        public ConditionBuilder fuzzyProductAttr (List<String> fuzzyProductAttr){
            this.fuzzyProductAttr = fuzzyProductAttr;
            return this;
        }

        public ConditionBuilder fuzzyProductAttr (String ... fuzzyProductAttr){
            this.fuzzyProductAttr = solveNullList(fuzzyProductAttr);
            return this;
        }

        public ConditionBuilder rightFuzzyProductAttr (List<String> rightFuzzyProductAttr){
            this.rightFuzzyProductAttr = rightFuzzyProductAttr;
            return this;
        }

        public ConditionBuilder rightFuzzyProductAttr (String ... rightFuzzyProductAttr){
            this.rightFuzzyProductAttr = solveNullList(rightFuzzyProductAttr);
            return this;
        }

        public ConditionBuilder productAttrList(String ... productAttr){
            this.productAttrList = solveNullList(productAttr);
            return this;
        }

        public ConditionBuilder productAttrList(List<String> productAttr){
            this.productAttrList = productAttr;
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

        private OmsOrderItem obj;

        public Builder(){
            this.obj = new OmsOrderItem();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder orderId(Long orderId){
            this.obj.setOrderId(orderId);
            return this;
        }
        public Builder orderSn(String orderSn){
            this.obj.setOrderSn(orderSn);
            return this;
        }
        public Builder productId(Long productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder productPic(String productPic){
            this.obj.setProductPic(productPic);
            return this;
        }
        public Builder productName(String productName){
            this.obj.setProductName(productName);
            return this;
        }
        public Builder productBrand(String productBrand){
            this.obj.setProductBrand(productBrand);
            return this;
        }
        public Builder productSn(String productSn){
            this.obj.setProductSn(productSn);
            return this;
        }
        public Builder productPrice(java.math.BigDecimal productPrice){
            this.obj.setProductPrice(productPrice);
            return this;
        }
        public Builder productQuantity(Integer productQuantity){
            this.obj.setProductQuantity(productQuantity);
            return this;
        }
        public Builder productSkuId(Long productSkuId){
            this.obj.setProductSkuId(productSkuId);
            return this;
        }
        public Builder productSkuCode(String productSkuCode){
            this.obj.setProductSkuCode(productSkuCode);
            return this;
        }
        public Builder productCategoryId(Long productCategoryId){
            this.obj.setProductCategoryId(productCategoryId);
            return this;
        }
        public Builder sp1(String sp1){
            this.obj.setSp1(sp1);
            return this;
        }
        public Builder sp2(String sp2){
            this.obj.setSp2(sp2);
            return this;
        }
        public Builder sp3(String sp3){
            this.obj.setSp3(sp3);
            return this;
        }
        public Builder promotionName(String promotionName){
            this.obj.setPromotionName(promotionName);
            return this;
        }
        public Builder promotionAmount(java.math.BigDecimal promotionAmount){
            this.obj.setPromotionAmount(promotionAmount);
            return this;
        }
        public Builder couponAmount(java.math.BigDecimal couponAmount){
            this.obj.setCouponAmount(couponAmount);
            return this;
        }
        public Builder integrationAmount(java.math.BigDecimal integrationAmount){
            this.obj.setIntegrationAmount(integrationAmount);
            return this;
        }
        public Builder realAmount(java.math.BigDecimal realAmount){
            this.obj.setRealAmount(realAmount);
            return this;
        }
        public Builder giftIntegration(Integer giftIntegration){
            this.obj.setGiftIntegration(giftIntegration);
            return this;
        }
        public Builder giftGrowth(Integer giftGrowth){
            this.obj.setGiftGrowth(giftGrowth);
            return this;
        }
        public Builder productAttr(String productAttr){
            this.obj.setProductAttr(productAttr);
            return this;
        }
        public OmsOrderItem build(){return obj;}
    }

}
