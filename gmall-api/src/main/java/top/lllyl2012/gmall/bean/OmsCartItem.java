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
public class OmsCartItem implements Serializable {

    private static final long serialVersionUID = 1573824698447L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:1
    */
    private Long productId;

    /**
    * 
    * isNullAble:1
    */
    private Long productSkuId;

    /**
    * 
    * isNullAble:1
    */
    private Long memberId;

    /**
    * 购买数量
    * isNullAble:1
    */
    private Integer quantity;

    /**
    * 添加到购物车的价格
    * isNullAble:1
    */
    private java.math.BigDecimal price;

    /**
    * 销售属性1
    * isNullAble:1
    */
    private String sp1;

    /**
    * 销售属性2
    * isNullAble:1
    */
    private String sp2;

    /**
    * 销售属性3
    * isNullAble:1
    */
    private String sp3;

    /**
    * 商品主图
    * isNullAble:1
    */
    private String productPic;

    /**
    * 商品名称
    * isNullAble:1
    */
    private String productName;

    /**
    * 商品副标题（卖点）
    * isNullAble:1
    */
    private String productSubTitle;

    /**
    * 商品sku条码
    * isNullAble:1
    */
    private String productSkuCode;

    /**
    * 会员昵称
    * isNullAble:1
    */
    private String memberNickname;

    /**
    * 创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createDate;

    /**
    * 修改时间
    * isNullAble:1
    */
    private java.time.LocalDateTime modifyDate;

    /**
    * 是否删除
    * isNullAble:1,defaultVal:0
    */
    private Integer deleteStatus;

    /**
    * 商品分类
    * isNullAble:1
    */
    private Long productCategoryId;

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
    * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
    * isNullAble:1
    */
    private String productAttr;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProductId(Long productId){this.productId = productId;}

    public Long getProductId(){return this.productId;}

    public void setProductSkuId(Long productSkuId){this.productSkuId = productSkuId;}

    public Long getProductSkuId(){return this.productSkuId;}

    public void setMemberId(Long memberId){this.memberId = memberId;}

    public Long getMemberId(){return this.memberId;}

    public void setQuantity(Integer quantity){this.quantity = quantity;}

    public Integer getQuantity(){return this.quantity;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setSp1(String sp1){this.sp1 = sp1;}

    public String getSp1(){return this.sp1;}

    public void setSp2(String sp2){this.sp2 = sp2;}

    public String getSp2(){return this.sp2;}

    public void setSp3(String sp3){this.sp3 = sp3;}

    public String getSp3(){return this.sp3;}

    public void setProductPic(String productPic){this.productPic = productPic;}

    public String getProductPic(){return this.productPic;}

    public void setProductName(String productName){this.productName = productName;}

    public String getProductName(){return this.productName;}

    public void setProductSubTitle(String productSubTitle){this.productSubTitle = productSubTitle;}

    public String getProductSubTitle(){return this.productSubTitle;}

    public void setProductSkuCode(String productSkuCode){this.productSkuCode = productSkuCode;}

    public String getProductSkuCode(){return this.productSkuCode;}

    public void setMemberNickname(String memberNickname){this.memberNickname = memberNickname;}

    public String getMemberNickname(){return this.memberNickname;}

    public void setCreateDate(java.time.LocalDateTime createDate){this.createDate = createDate;}

    public java.time.LocalDateTime getCreateDate(){return this.createDate;}

    public void setModifyDate(java.time.LocalDateTime modifyDate){this.modifyDate = modifyDate;}

    public java.time.LocalDateTime getModifyDate(){return this.modifyDate;}

    public void setDeleteStatus(Integer deleteStatus){this.deleteStatus = deleteStatus;}

    public Integer getDeleteStatus(){return this.deleteStatus;}

    public void setProductCategoryId(Long productCategoryId){this.productCategoryId = productCategoryId;}

    public Long getProductCategoryId(){return this.productCategoryId;}

    public void setProductBrand(String productBrand){this.productBrand = productBrand;}

    public String getProductBrand(){return this.productBrand;}

    public void setProductSn(String productSn){this.productSn = productSn;}

    public String getProductSn(){return this.productSn;}

    public void setProductAttr(String productAttr){this.productAttr = productAttr;}

    public String getProductAttr(){return this.productAttr;}
    @Override
    public String toString() {
        return "OmsCartItem{" +
                "id='" + id + '\'' +
                "productId='" + productId + '\'' +
                "productSkuId='" + productSkuId + '\'' +
                "memberId='" + memberId + '\'' +
                "quantity='" + quantity + '\'' +
                "price='" + price + '\'' +
                "sp1='" + sp1 + '\'' +
                "sp2='" + sp2 + '\'' +
                "sp3='" + sp3 + '\'' +
                "productPic='" + productPic + '\'' +
                "productName='" + productName + '\'' +
                "productSubTitle='" + productSubTitle + '\'' +
                "productSkuCode='" + productSkuCode + '\'' +
                "memberNickname='" + memberNickname + '\'' +
                "createDate='" + createDate + '\'' +
                "modifyDate='" + modifyDate + '\'' +
                "deleteStatus='" + deleteStatus + '\'' +
                "productCategoryId='" + productCategoryId + '\'' +
                "productBrand='" + productBrand + '\'' +
                "productSn='" + productSn + '\'' +
                "productAttr='" + productAttr + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private OmsCartItem set;

        private ConditionBuilder where;

        public UpdateBuilder set(OmsCartItem set){
            this.set = set;
            return this;
        }

        public OmsCartItem getSet(){
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

    public static class QueryBuilder extends OmsCartItem{
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

        private List<Long> productIdList;

        public List<Long> getProductIdList(){return this.productIdList;}

        private Long productIdSt;

        private Long productIdEd;

        public Long getProductIdSt(){return this.productIdSt;}

        public Long getProductIdEd(){return this.productIdEd;}

        private List<Long> productSkuIdList;

        public List<Long> getProductSkuIdList(){return this.productSkuIdList;}

        private Long productSkuIdSt;

        private Long productSkuIdEd;

        public Long getProductSkuIdSt(){return this.productSkuIdSt;}

        public Long getProductSkuIdEd(){return this.productSkuIdEd;}

        private List<Long> memberIdList;

        public List<Long> getMemberIdList(){return this.memberIdList;}

        private Long memberIdSt;

        private Long memberIdEd;

        public Long getMemberIdSt(){return this.memberIdSt;}

        public Long getMemberIdEd(){return this.memberIdEd;}

        private List<Integer> quantityList;

        public List<Integer> getQuantityList(){return this.quantityList;}

        private Integer quantitySt;

        private Integer quantityEd;

        public Integer getQuantitySt(){return this.quantitySt;}

        public Integer getQuantityEd(){return this.quantityEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

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
        private List<String> productSubTitleList;

        public List<String> getProductSubTitleList(){return this.productSubTitleList;}


        private List<String> fuzzyProductSubTitle;

        public List<String> getFuzzyProductSubTitle(){return this.fuzzyProductSubTitle;}

        private List<String> rightFuzzyProductSubTitle;

        public List<String> getRightFuzzyProductSubTitle(){return this.rightFuzzyProductSubTitle;}
        private List<String> productSkuCodeList;

        public List<String> getProductSkuCodeList(){return this.productSkuCodeList;}


        private List<String> fuzzyProductSkuCode;

        public List<String> getFuzzyProductSkuCode(){return this.fuzzyProductSkuCode;}

        private List<String> rightFuzzyProductSkuCode;

        public List<String> getRightFuzzyProductSkuCode(){return this.rightFuzzyProductSkuCode;}
        private List<String> memberNicknameList;

        public List<String> getMemberNicknameList(){return this.memberNicknameList;}


        private List<String> fuzzyMemberNickname;

        public List<String> getFuzzyMemberNickname(){return this.fuzzyMemberNickname;}

        private List<String> rightFuzzyMemberNickname;

        public List<String> getRightFuzzyMemberNickname(){return this.rightFuzzyMemberNickname;}
        private List<java.time.LocalDateTime> createDateList;

        public List<java.time.LocalDateTime> getCreateDateList(){return this.createDateList;}

        private java.time.LocalDateTime createDateSt;

        private java.time.LocalDateTime createDateEd;

        public java.time.LocalDateTime getCreateDateSt(){return this.createDateSt;}

        public java.time.LocalDateTime getCreateDateEd(){return this.createDateEd;}

        private List<java.time.LocalDateTime> modifyDateList;

        public List<java.time.LocalDateTime> getModifyDateList(){return this.modifyDateList;}

        private java.time.LocalDateTime modifyDateSt;

        private java.time.LocalDateTime modifyDateEd;

        public java.time.LocalDateTime getModifyDateSt(){return this.modifyDateSt;}

        public java.time.LocalDateTime getModifyDateEd(){return this.modifyDateEd;}

        private List<Integer> deleteStatusList;

        public List<Integer> getDeleteStatusList(){return this.deleteStatusList;}

        private Integer deleteStatusSt;

        private Integer deleteStatusEd;

        public Integer getDeleteStatusSt(){return this.deleteStatusSt;}

        public Integer getDeleteStatusEd(){return this.deleteStatusEd;}

        private List<Long> productCategoryIdList;

        public List<Long> getProductCategoryIdList(){return this.productCategoryIdList;}

        private Long productCategoryIdSt;

        private Long productCategoryIdEd;

        public Long getProductCategoryIdSt(){return this.productCategoryIdSt;}

        public Long getProductCategoryIdEd(){return this.productCategoryIdEd;}

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

        public QueryBuilder quantityBetWeen(Integer quantitySt,Integer quantityEd){
            this.quantitySt = quantitySt;
            this.quantityEd = quantityEd;
            return this;
        }

        public QueryBuilder quantityGreaterEqThan(Integer quantitySt){
            this.quantitySt = quantitySt;
            return this;
        }
        public QueryBuilder quantityLessEqThan(Integer quantityEd){
            this.quantityEd = quantityEd;
            return this;
        }


        public QueryBuilder quantity(Integer quantity){
            setQuantity(quantity);
            return this;
        }

        public QueryBuilder quantityList(Integer ... quantity){
            this.quantityList = solveNullList(quantity);
            return this;
        }

        public QueryBuilder quantityList(List<Integer> quantity){
            this.quantityList = quantity;
            return this;
        }

        public QueryBuilder fetchQuantity(){
            setFetchFields("fetchFields","quantity");
            return this;
        }

        public QueryBuilder excludeQuantity(){
            setFetchFields("excludeFields","quantity");
            return this;
        }

        public QueryBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(java.math.BigDecimal price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
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

        public QueryBuilder fuzzyProductSubTitle (List<String> fuzzyProductSubTitle){
            this.fuzzyProductSubTitle = fuzzyProductSubTitle;
            return this;
        }

        public QueryBuilder fuzzyProductSubTitle (String ... fuzzyProductSubTitle){
            this.fuzzyProductSubTitle = solveNullList(fuzzyProductSubTitle);
            return this;
        }

        public QueryBuilder rightFuzzyProductSubTitle (List<String> rightFuzzyProductSubTitle){
            this.rightFuzzyProductSubTitle = rightFuzzyProductSubTitle;
            return this;
        }

        public QueryBuilder rightFuzzyProductSubTitle (String ... rightFuzzyProductSubTitle){
            this.rightFuzzyProductSubTitle = solveNullList(rightFuzzyProductSubTitle);
            return this;
        }

        public QueryBuilder productSubTitle(String productSubTitle){
            setProductSubTitle(productSubTitle);
            return this;
        }

        public QueryBuilder productSubTitleList(String ... productSubTitle){
            this.productSubTitleList = solveNullList(productSubTitle);
            return this;
        }

        public QueryBuilder productSubTitleList(List<String> productSubTitle){
            this.productSubTitleList = productSubTitle;
            return this;
        }

        public QueryBuilder fetchProductSubTitle(){
            setFetchFields("fetchFields","productSubTitle");
            return this;
        }

        public QueryBuilder excludeProductSubTitle(){
            setFetchFields("excludeFields","productSubTitle");
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

        public QueryBuilder fuzzyMemberNickname (List<String> fuzzyMemberNickname){
            this.fuzzyMemberNickname = fuzzyMemberNickname;
            return this;
        }

        public QueryBuilder fuzzyMemberNickname (String ... fuzzyMemberNickname){
            this.fuzzyMemberNickname = solveNullList(fuzzyMemberNickname);
            return this;
        }

        public QueryBuilder rightFuzzyMemberNickname (List<String> rightFuzzyMemberNickname){
            this.rightFuzzyMemberNickname = rightFuzzyMemberNickname;
            return this;
        }

        public QueryBuilder rightFuzzyMemberNickname (String ... rightFuzzyMemberNickname){
            this.rightFuzzyMemberNickname = solveNullList(rightFuzzyMemberNickname);
            return this;
        }

        public QueryBuilder memberNickname(String memberNickname){
            setMemberNickname(memberNickname);
            return this;
        }

        public QueryBuilder memberNicknameList(String ... memberNickname){
            this.memberNicknameList = solveNullList(memberNickname);
            return this;
        }

        public QueryBuilder memberNicknameList(List<String> memberNickname){
            this.memberNicknameList = memberNickname;
            return this;
        }

        public QueryBuilder fetchMemberNickname(){
            setFetchFields("fetchFields","memberNickname");
            return this;
        }

        public QueryBuilder excludeMemberNickname(){
            setFetchFields("excludeFields","memberNickname");
            return this;
        }

        public QueryBuilder createDateBetWeen(java.time.LocalDateTime createDateSt,java.time.LocalDateTime createDateEd){
            this.createDateSt = createDateSt;
            this.createDateEd = createDateEd;
            return this;
        }

        public QueryBuilder createDateGreaterEqThan(java.time.LocalDateTime createDateSt){
            this.createDateSt = createDateSt;
            return this;
        }
        public QueryBuilder createDateLessEqThan(java.time.LocalDateTime createDateEd){
            this.createDateEd = createDateEd;
            return this;
        }


        public QueryBuilder createDate(java.time.LocalDateTime createDate){
            setCreateDate(createDate);
            return this;
        }

        public QueryBuilder createDateList(java.time.LocalDateTime ... createDate){
            this.createDateList = solveNullList(createDate);
            return this;
        }

        public QueryBuilder createDateList(List<java.time.LocalDateTime> createDate){
            this.createDateList = createDate;
            return this;
        }

        public QueryBuilder fetchCreateDate(){
            setFetchFields("fetchFields","createDate");
            return this;
        }

        public QueryBuilder excludeCreateDate(){
            setFetchFields("excludeFields","createDate");
            return this;
        }

        public QueryBuilder modifyDateBetWeen(java.time.LocalDateTime modifyDateSt,java.time.LocalDateTime modifyDateEd){
            this.modifyDateSt = modifyDateSt;
            this.modifyDateEd = modifyDateEd;
            return this;
        }

        public QueryBuilder modifyDateGreaterEqThan(java.time.LocalDateTime modifyDateSt){
            this.modifyDateSt = modifyDateSt;
            return this;
        }
        public QueryBuilder modifyDateLessEqThan(java.time.LocalDateTime modifyDateEd){
            this.modifyDateEd = modifyDateEd;
            return this;
        }


        public QueryBuilder modifyDate(java.time.LocalDateTime modifyDate){
            setModifyDate(modifyDate);
            return this;
        }

        public QueryBuilder modifyDateList(java.time.LocalDateTime ... modifyDate){
            this.modifyDateList = solveNullList(modifyDate);
            return this;
        }

        public QueryBuilder modifyDateList(List<java.time.LocalDateTime> modifyDate){
            this.modifyDateList = modifyDate;
            return this;
        }

        public QueryBuilder fetchModifyDate(){
            setFetchFields("fetchFields","modifyDate");
            return this;
        }

        public QueryBuilder excludeModifyDate(){
            setFetchFields("excludeFields","modifyDate");
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

        public OmsCartItem build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> productIdList;

        public List<Long> getProductIdList(){return this.productIdList;}

        private Long productIdSt;

        private Long productIdEd;

        public Long getProductIdSt(){return this.productIdSt;}

        public Long getProductIdEd(){return this.productIdEd;}

        private List<Long> productSkuIdList;

        public List<Long> getProductSkuIdList(){return this.productSkuIdList;}

        private Long productSkuIdSt;

        private Long productSkuIdEd;

        public Long getProductSkuIdSt(){return this.productSkuIdSt;}

        public Long getProductSkuIdEd(){return this.productSkuIdEd;}

        private List<Long> memberIdList;

        public List<Long> getMemberIdList(){return this.memberIdList;}

        private Long memberIdSt;

        private Long memberIdEd;

        public Long getMemberIdSt(){return this.memberIdSt;}

        public Long getMemberIdEd(){return this.memberIdEd;}

        private List<Integer> quantityList;

        public List<Integer> getQuantityList(){return this.quantityList;}

        private Integer quantitySt;

        private Integer quantityEd;

        public Integer getQuantitySt(){return this.quantitySt;}

        public Integer getQuantityEd(){return this.quantityEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

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
        private List<String> productSubTitleList;

        public List<String> getProductSubTitleList(){return this.productSubTitleList;}


        private List<String> fuzzyProductSubTitle;

        public List<String> getFuzzyProductSubTitle(){return this.fuzzyProductSubTitle;}

        private List<String> rightFuzzyProductSubTitle;

        public List<String> getRightFuzzyProductSubTitle(){return this.rightFuzzyProductSubTitle;}
        private List<String> productSkuCodeList;

        public List<String> getProductSkuCodeList(){return this.productSkuCodeList;}


        private List<String> fuzzyProductSkuCode;

        public List<String> getFuzzyProductSkuCode(){return this.fuzzyProductSkuCode;}

        private List<String> rightFuzzyProductSkuCode;

        public List<String> getRightFuzzyProductSkuCode(){return this.rightFuzzyProductSkuCode;}
        private List<String> memberNicknameList;

        public List<String> getMemberNicknameList(){return this.memberNicknameList;}


        private List<String> fuzzyMemberNickname;

        public List<String> getFuzzyMemberNickname(){return this.fuzzyMemberNickname;}

        private List<String> rightFuzzyMemberNickname;

        public List<String> getRightFuzzyMemberNickname(){return this.rightFuzzyMemberNickname;}
        private List<java.time.LocalDateTime> createDateList;

        public List<java.time.LocalDateTime> getCreateDateList(){return this.createDateList;}

        private java.time.LocalDateTime createDateSt;

        private java.time.LocalDateTime createDateEd;

        public java.time.LocalDateTime getCreateDateSt(){return this.createDateSt;}

        public java.time.LocalDateTime getCreateDateEd(){return this.createDateEd;}

        private List<java.time.LocalDateTime> modifyDateList;

        public List<java.time.LocalDateTime> getModifyDateList(){return this.modifyDateList;}

        private java.time.LocalDateTime modifyDateSt;

        private java.time.LocalDateTime modifyDateEd;

        public java.time.LocalDateTime getModifyDateSt(){return this.modifyDateSt;}

        public java.time.LocalDateTime getModifyDateEd(){return this.modifyDateEd;}

        private List<Integer> deleteStatusList;

        public List<Integer> getDeleteStatusList(){return this.deleteStatusList;}

        private Integer deleteStatusSt;

        private Integer deleteStatusEd;

        public Integer getDeleteStatusSt(){return this.deleteStatusSt;}

        public Integer getDeleteStatusEd(){return this.deleteStatusEd;}

        private List<Long> productCategoryIdList;

        public List<Long> getProductCategoryIdList(){return this.productCategoryIdList;}

        private Long productCategoryIdSt;

        private Long productCategoryIdEd;

        public Long getProductCategoryIdSt(){return this.productCategoryIdSt;}

        public Long getProductCategoryIdEd(){return this.productCategoryIdEd;}

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

        public ConditionBuilder quantityBetWeen(Integer quantitySt,Integer quantityEd){
            this.quantitySt = quantitySt;
            this.quantityEd = quantityEd;
            return this;
        }

        public ConditionBuilder quantityGreaterEqThan(Integer quantitySt){
            this.quantitySt = quantitySt;
            return this;
        }
        public ConditionBuilder quantityLessEqThan(Integer quantityEd){
            this.quantityEd = quantityEd;
            return this;
        }


        public ConditionBuilder quantityList(Integer ... quantity){
            this.quantityList = solveNullList(quantity);
            return this;
        }

        public ConditionBuilder quantityList(List<Integer> quantity){
            this.quantityList = quantity;
            return this;
        }

        public ConditionBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
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

        public ConditionBuilder fuzzyProductSubTitle (List<String> fuzzyProductSubTitle){
            this.fuzzyProductSubTitle = fuzzyProductSubTitle;
            return this;
        }

        public ConditionBuilder fuzzyProductSubTitle (String ... fuzzyProductSubTitle){
            this.fuzzyProductSubTitle = solveNullList(fuzzyProductSubTitle);
            return this;
        }

        public ConditionBuilder rightFuzzyProductSubTitle (List<String> rightFuzzyProductSubTitle){
            this.rightFuzzyProductSubTitle = rightFuzzyProductSubTitle;
            return this;
        }

        public ConditionBuilder rightFuzzyProductSubTitle (String ... rightFuzzyProductSubTitle){
            this.rightFuzzyProductSubTitle = solveNullList(rightFuzzyProductSubTitle);
            return this;
        }

        public ConditionBuilder productSubTitleList(String ... productSubTitle){
            this.productSubTitleList = solveNullList(productSubTitle);
            return this;
        }

        public ConditionBuilder productSubTitleList(List<String> productSubTitle){
            this.productSubTitleList = productSubTitle;
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

        public ConditionBuilder fuzzyMemberNickname (List<String> fuzzyMemberNickname){
            this.fuzzyMemberNickname = fuzzyMemberNickname;
            return this;
        }

        public ConditionBuilder fuzzyMemberNickname (String ... fuzzyMemberNickname){
            this.fuzzyMemberNickname = solveNullList(fuzzyMemberNickname);
            return this;
        }

        public ConditionBuilder rightFuzzyMemberNickname (List<String> rightFuzzyMemberNickname){
            this.rightFuzzyMemberNickname = rightFuzzyMemberNickname;
            return this;
        }

        public ConditionBuilder rightFuzzyMemberNickname (String ... rightFuzzyMemberNickname){
            this.rightFuzzyMemberNickname = solveNullList(rightFuzzyMemberNickname);
            return this;
        }

        public ConditionBuilder memberNicknameList(String ... memberNickname){
            this.memberNicknameList = solveNullList(memberNickname);
            return this;
        }

        public ConditionBuilder memberNicknameList(List<String> memberNickname){
            this.memberNicknameList = memberNickname;
            return this;
        }

        public ConditionBuilder createDateBetWeen(java.time.LocalDateTime createDateSt,java.time.LocalDateTime createDateEd){
            this.createDateSt = createDateSt;
            this.createDateEd = createDateEd;
            return this;
        }

        public ConditionBuilder createDateGreaterEqThan(java.time.LocalDateTime createDateSt){
            this.createDateSt = createDateSt;
            return this;
        }
        public ConditionBuilder createDateLessEqThan(java.time.LocalDateTime createDateEd){
            this.createDateEd = createDateEd;
            return this;
        }


        public ConditionBuilder createDateList(java.time.LocalDateTime ... createDate){
            this.createDateList = solveNullList(createDate);
            return this;
        }

        public ConditionBuilder createDateList(List<java.time.LocalDateTime> createDate){
            this.createDateList = createDate;
            return this;
        }

        public ConditionBuilder modifyDateBetWeen(java.time.LocalDateTime modifyDateSt,java.time.LocalDateTime modifyDateEd){
            this.modifyDateSt = modifyDateSt;
            this.modifyDateEd = modifyDateEd;
            return this;
        }

        public ConditionBuilder modifyDateGreaterEqThan(java.time.LocalDateTime modifyDateSt){
            this.modifyDateSt = modifyDateSt;
            return this;
        }
        public ConditionBuilder modifyDateLessEqThan(java.time.LocalDateTime modifyDateEd){
            this.modifyDateEd = modifyDateEd;
            return this;
        }


        public ConditionBuilder modifyDateList(java.time.LocalDateTime ... modifyDate){
            this.modifyDateList = solveNullList(modifyDate);
            return this;
        }

        public ConditionBuilder modifyDateList(List<java.time.LocalDateTime> modifyDate){
            this.modifyDateList = modifyDate;
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

        private OmsCartItem obj;

        public Builder(){
            this.obj = new OmsCartItem();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder productId(Long productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder productSkuId(Long productSkuId){
            this.obj.setProductSkuId(productSkuId);
            return this;
        }
        public Builder memberId(Long memberId){
            this.obj.setMemberId(memberId);
            return this;
        }
        public Builder quantity(Integer quantity){
            this.obj.setQuantity(quantity);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
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
        public Builder productPic(String productPic){
            this.obj.setProductPic(productPic);
            return this;
        }
        public Builder productName(String productName){
            this.obj.setProductName(productName);
            return this;
        }
        public Builder productSubTitle(String productSubTitle){
            this.obj.setProductSubTitle(productSubTitle);
            return this;
        }
        public Builder productSkuCode(String productSkuCode){
            this.obj.setProductSkuCode(productSkuCode);
            return this;
        }
        public Builder memberNickname(String memberNickname){
            this.obj.setMemberNickname(memberNickname);
            return this;
        }
        public Builder createDate(java.time.LocalDateTime createDate){
            this.obj.setCreateDate(createDate);
            return this;
        }
        public Builder modifyDate(java.time.LocalDateTime modifyDate){
            this.obj.setModifyDate(modifyDate);
            return this;
        }
        public Builder deleteStatus(Integer deleteStatus){
            this.obj.setDeleteStatus(deleteStatus);
            return this;
        }
        public Builder productCategoryId(Long productCategoryId){
            this.obj.setProductCategoryId(productCategoryId);
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
        public Builder productAttr(String productAttr){
            this.obj.setProductAttr(productAttr);
            return this;
        }
        public OmsCartItem build(){return obj;}
    }

}
