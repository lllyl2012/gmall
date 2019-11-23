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
public class PmsSkuInfo implements Serializable {

    private static final long serialVersionUID = 1574497750283L;


    /**
    * 主键
    * 库存id(itemID)
    * isNullAble:0
    */
    private Long id;

    /**
    * 商品id
    * isNullAble:1
    */
    private Long productId;

    /**
    * 价格
    * isNullAble:1
    */
    private Double price;

    /**
    * sku名称
    * isNullAble:1
    */
    private String skuName;

    /**
    * 商品规格描述
    * isNullAble:1
    */
    private String skuDesc;

    /**
    * 
    * isNullAble:1
    */
    private Double weight;

    /**
    * 品牌(冗余)
    * isNullAble:1
    */
    private Long tmId;

    /**
    * 三级分类id（冗余)
    * isNullAble:1
    */
    private Long catalog3Id;

    /**
    * 默认显示图片(冗余)
    * isNullAble:1
    */
    private String skuDefaultImg;

    private List<PmsSkuImage> skuImageList;
    private List<PmsSkuAttrValue> skuAttrValueList;
    private List<PmsSkuSaleAttrValue> skuSaleAttrValueList;

    public List<PmsSkuImage> getSkuImageList() {
        return skuImageList;
    }

    public void setSkuImageList(List<PmsSkuImage> skuImageList) {
        this.skuImageList = skuImageList;
    }

    public List<PmsSkuAttrValue> getSkuAttrValueList() {
        return skuAttrValueList;
    }

    public void setSkuAttrValueList(List<PmsSkuAttrValue> skuAttrValueList) {
        this.skuAttrValueList = skuAttrValueList;
    }

    public List<PmsSkuSaleAttrValue> getSkuSaleAttrValueList() {
        return skuSaleAttrValueList;
    }

    public void setSkuSaleAttrValueList(List<PmsSkuSaleAttrValue> skuSaleAttrValueList) {
        this.skuSaleAttrValueList = skuSaleAttrValueList;
    }

    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProductId(Long productId){this.productId = productId;}

    public Long getProductId(){return this.productId;}

    public void setPrice(Double price){this.price = price;}

    public Double getPrice(){return this.price;}

    public void setSkuName(String skuName){this.skuName = skuName;}

    public String getSkuName(){return this.skuName;}

    public void setSkuDesc(String skuDesc){this.skuDesc = skuDesc;}

    public String getSkuDesc(){return this.skuDesc;}

    public void setWeight(Double weight){this.weight = weight;}

    public Double getWeight(){return this.weight;}

    public void setTmId(Long tmId){this.tmId = tmId;}

    public Long getTmId(){return this.tmId;}

    public void setCatalog3Id(Long catalog3Id){this.catalog3Id = catalog3Id;}

    public Long getCatalog3Id(){return this.catalog3Id;}

    public void setSkuDefaultImg(String skuDefaultImg){this.skuDefaultImg = skuDefaultImg;}

    public String getSkuDefaultImg(){return this.skuDefaultImg;}
    @Override
    public String toString() {
        return "PmsSkuInfo{" +
                "id='" + id + '\'' +
                "productId='" + productId + '\'' +
                "price='" + price + '\'' +
                "skuName='" + skuName + '\'' +
                "skuDesc='" + skuDesc + '\'' +
                "weight='" + weight + '\'' +
                "tmId='" + tmId + '\'' +
                "catalog3Id='" + catalog3Id + '\'' +
                "skuDefaultImg='" + skuDefaultImg + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsSkuInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsSkuInfo set){
            this.set = set;
            return this;
        }

        public PmsSkuInfo getSet(){
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

    public static class QueryBuilder extends PmsSkuInfo{
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

        private List<Double> priceList;

        public List<Double> getPriceList(){return this.priceList;}

        private Double priceSt;

        private Double priceEd;

        public Double getPriceSt(){return this.priceSt;}

        public Double getPriceEd(){return this.priceEd;}

        private List<String> skuNameList;

        public List<String> getSkuNameList(){return this.skuNameList;}


        private List<String> fuzzySkuName;

        public List<String> getFuzzySkuName(){return this.fuzzySkuName;}

        private List<String> rightFuzzySkuName;

        public List<String> getRightFuzzySkuName(){return this.rightFuzzySkuName;}
        private List<String> skuDescList;

        public List<String> getSkuDescList(){return this.skuDescList;}


        private List<String> fuzzySkuDesc;

        public List<String> getFuzzySkuDesc(){return this.fuzzySkuDesc;}

        private List<String> rightFuzzySkuDesc;

        public List<String> getRightFuzzySkuDesc(){return this.rightFuzzySkuDesc;}
        private List<Double> weightList;

        public List<Double> getWeightList(){return this.weightList;}

        private Double weightSt;

        private Double weightEd;

        public Double getWeightSt(){return this.weightSt;}

        public Double getWeightEd(){return this.weightEd;}

        private List<Long> tmIdList;

        public List<Long> getTmIdList(){return this.tmIdList;}

        private Long tmIdSt;

        private Long tmIdEd;

        public Long getTmIdSt(){return this.tmIdSt;}

        public Long getTmIdEd(){return this.tmIdEd;}

        private List<Long> catalog3IdList;

        public List<Long> getCatalog3IdList(){return this.catalog3IdList;}

        private Long catalog3IdSt;

        private Long catalog3IdEd;

        public Long getCatalog3IdSt(){return this.catalog3IdSt;}

        public Long getCatalog3IdEd(){return this.catalog3IdEd;}

        private List<String> skuDefaultImgList;

        public List<String> getSkuDefaultImgList(){return this.skuDefaultImgList;}


        private List<String> fuzzySkuDefaultImg;

        public List<String> getFuzzySkuDefaultImg(){return this.fuzzySkuDefaultImg;}

        private List<String> rightFuzzySkuDefaultImg;

        public List<String> getRightFuzzySkuDefaultImg(){return this.rightFuzzySkuDefaultImg;}
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

        public QueryBuilder priceBetWeen(Double priceSt,Double priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(Double priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(Double priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(Double price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(Double ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<Double> price){
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

        public QueryBuilder fuzzySkuName (List<String> fuzzySkuName){
            this.fuzzySkuName = fuzzySkuName;
            return this;
        }

        public QueryBuilder fuzzySkuName (String ... fuzzySkuName){
            this.fuzzySkuName = solveNullList(fuzzySkuName);
            return this;
        }

        public QueryBuilder rightFuzzySkuName (List<String> rightFuzzySkuName){
            this.rightFuzzySkuName = rightFuzzySkuName;
            return this;
        }

        public QueryBuilder rightFuzzySkuName (String ... rightFuzzySkuName){
            this.rightFuzzySkuName = solveNullList(rightFuzzySkuName);
            return this;
        }

        public QueryBuilder skuName(String skuName){
            setSkuName(skuName);
            return this;
        }

        public QueryBuilder skuNameList(String ... skuName){
            this.skuNameList = solveNullList(skuName);
            return this;
        }

        public QueryBuilder skuNameList(List<String> skuName){
            this.skuNameList = skuName;
            return this;
        }

        public QueryBuilder fetchSkuName(){
            setFetchFields("fetchFields","skuName");
            return this;
        }

        public QueryBuilder excludeSkuName(){
            setFetchFields("excludeFields","skuName");
            return this;
        }

        public QueryBuilder fuzzySkuDesc (List<String> fuzzySkuDesc){
            this.fuzzySkuDesc = fuzzySkuDesc;
            return this;
        }

        public QueryBuilder fuzzySkuDesc (String ... fuzzySkuDesc){
            this.fuzzySkuDesc = solveNullList(fuzzySkuDesc);
            return this;
        }

        public QueryBuilder rightFuzzySkuDesc (List<String> rightFuzzySkuDesc){
            this.rightFuzzySkuDesc = rightFuzzySkuDesc;
            return this;
        }

        public QueryBuilder rightFuzzySkuDesc (String ... rightFuzzySkuDesc){
            this.rightFuzzySkuDesc = solveNullList(rightFuzzySkuDesc);
            return this;
        }

        public QueryBuilder skuDesc(String skuDesc){
            setSkuDesc(skuDesc);
            return this;
        }

        public QueryBuilder skuDescList(String ... skuDesc){
            this.skuDescList = solveNullList(skuDesc);
            return this;
        }

        public QueryBuilder skuDescList(List<String> skuDesc){
            this.skuDescList = skuDesc;
            return this;
        }

        public QueryBuilder fetchSkuDesc(){
            setFetchFields("fetchFields","skuDesc");
            return this;
        }

        public QueryBuilder excludeSkuDesc(){
            setFetchFields("excludeFields","skuDesc");
            return this;
        }

        public QueryBuilder weightBetWeen(Double weightSt,Double weightEd){
            this.weightSt = weightSt;
            this.weightEd = weightEd;
            return this;
        }

        public QueryBuilder weightGreaterEqThan(Double weightSt){
            this.weightSt = weightSt;
            return this;
        }
        public QueryBuilder weightLessEqThan(Double weightEd){
            this.weightEd = weightEd;
            return this;
        }


        public QueryBuilder weight(Double weight){
            setWeight(weight);
            return this;
        }

        public QueryBuilder weightList(Double ... weight){
            this.weightList = solveNullList(weight);
            return this;
        }

        public QueryBuilder weightList(List<Double> weight){
            this.weightList = weight;
            return this;
        }

        public QueryBuilder fetchWeight(){
            setFetchFields("fetchFields","weight");
            return this;
        }

        public QueryBuilder excludeWeight(){
            setFetchFields("excludeFields","weight");
            return this;
        }

        public QueryBuilder tmIdBetWeen(Long tmIdSt,Long tmIdEd){
            this.tmIdSt = tmIdSt;
            this.tmIdEd = tmIdEd;
            return this;
        }

        public QueryBuilder tmIdGreaterEqThan(Long tmIdSt){
            this.tmIdSt = tmIdSt;
            return this;
        }
        public QueryBuilder tmIdLessEqThan(Long tmIdEd){
            this.tmIdEd = tmIdEd;
            return this;
        }


        public QueryBuilder tmId(Long tmId){
            setTmId(tmId);
            return this;
        }

        public QueryBuilder tmIdList(Long ... tmId){
            this.tmIdList = solveNullList(tmId);
            return this;
        }

        public QueryBuilder tmIdList(List<Long> tmId){
            this.tmIdList = tmId;
            return this;
        }

        public QueryBuilder fetchTmId(){
            setFetchFields("fetchFields","tmId");
            return this;
        }

        public QueryBuilder excludeTmId(){
            setFetchFields("excludeFields","tmId");
            return this;
        }

        public QueryBuilder catalog3IdBetWeen(Long catalog3IdSt,Long catalog3IdEd){
            this.catalog3IdSt = catalog3IdSt;
            this.catalog3IdEd = catalog3IdEd;
            return this;
        }

        public QueryBuilder catalog3IdGreaterEqThan(Long catalog3IdSt){
            this.catalog3IdSt = catalog3IdSt;
            return this;
        }
        public QueryBuilder catalog3IdLessEqThan(Long catalog3IdEd){
            this.catalog3IdEd = catalog3IdEd;
            return this;
        }


        public QueryBuilder catalog3Id(Long catalog3Id){
            setCatalog3Id(catalog3Id);
            return this;
        }

        public QueryBuilder catalog3IdList(Long ... catalog3Id){
            this.catalog3IdList = solveNullList(catalog3Id);
            return this;
        }

        public QueryBuilder catalog3IdList(List<Long> catalog3Id){
            this.catalog3IdList = catalog3Id;
            return this;
        }

        public QueryBuilder fetchCatalog3Id(){
            setFetchFields("fetchFields","catalog3Id");
            return this;
        }

        public QueryBuilder excludeCatalog3Id(){
            setFetchFields("excludeFields","catalog3Id");
            return this;
        }

        public QueryBuilder fuzzySkuDefaultImg (List<String> fuzzySkuDefaultImg){
            this.fuzzySkuDefaultImg = fuzzySkuDefaultImg;
            return this;
        }

        public QueryBuilder fuzzySkuDefaultImg (String ... fuzzySkuDefaultImg){
            this.fuzzySkuDefaultImg = solveNullList(fuzzySkuDefaultImg);
            return this;
        }

        public QueryBuilder rightFuzzySkuDefaultImg (List<String> rightFuzzySkuDefaultImg){
            this.rightFuzzySkuDefaultImg = rightFuzzySkuDefaultImg;
            return this;
        }

        public QueryBuilder rightFuzzySkuDefaultImg (String ... rightFuzzySkuDefaultImg){
            this.rightFuzzySkuDefaultImg = solveNullList(rightFuzzySkuDefaultImg);
            return this;
        }

        public QueryBuilder skuDefaultImg(String skuDefaultImg){
            setSkuDefaultImg(skuDefaultImg);
            return this;
        }

        public QueryBuilder skuDefaultImgList(String ... skuDefaultImg){
            this.skuDefaultImgList = solveNullList(skuDefaultImg);
            return this;
        }

        public QueryBuilder skuDefaultImgList(List<String> skuDefaultImg){
            this.skuDefaultImgList = skuDefaultImg;
            return this;
        }

        public QueryBuilder fetchSkuDefaultImg(){
            setFetchFields("fetchFields","skuDefaultImg");
            return this;
        }

        public QueryBuilder excludeSkuDefaultImg(){
            setFetchFields("excludeFields","skuDefaultImg");
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

        public PmsSkuInfo build(){return this;}
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

        private List<Double> priceList;

        public List<Double> getPriceList(){return this.priceList;}

        private Double priceSt;

        private Double priceEd;

        public Double getPriceSt(){return this.priceSt;}

        public Double getPriceEd(){return this.priceEd;}

        private List<String> skuNameList;

        public List<String> getSkuNameList(){return this.skuNameList;}


        private List<String> fuzzySkuName;

        public List<String> getFuzzySkuName(){return this.fuzzySkuName;}

        private List<String> rightFuzzySkuName;

        public List<String> getRightFuzzySkuName(){return this.rightFuzzySkuName;}
        private List<String> skuDescList;

        public List<String> getSkuDescList(){return this.skuDescList;}


        private List<String> fuzzySkuDesc;

        public List<String> getFuzzySkuDesc(){return this.fuzzySkuDesc;}

        private List<String> rightFuzzySkuDesc;

        public List<String> getRightFuzzySkuDesc(){return this.rightFuzzySkuDesc;}
        private List<Double> weightList;

        public List<Double> getWeightList(){return this.weightList;}

        private Double weightSt;

        private Double weightEd;

        public Double getWeightSt(){return this.weightSt;}

        public Double getWeightEd(){return this.weightEd;}

        private List<Long> tmIdList;

        public List<Long> getTmIdList(){return this.tmIdList;}

        private Long tmIdSt;

        private Long tmIdEd;

        public Long getTmIdSt(){return this.tmIdSt;}

        public Long getTmIdEd(){return this.tmIdEd;}

        private List<Long> catalog3IdList;

        public List<Long> getCatalog3IdList(){return this.catalog3IdList;}

        private Long catalog3IdSt;

        private Long catalog3IdEd;

        public Long getCatalog3IdSt(){return this.catalog3IdSt;}

        public Long getCatalog3IdEd(){return this.catalog3IdEd;}

        private List<String> skuDefaultImgList;

        public List<String> getSkuDefaultImgList(){return this.skuDefaultImgList;}


        private List<String> fuzzySkuDefaultImg;

        public List<String> getFuzzySkuDefaultImg(){return this.fuzzySkuDefaultImg;}

        private List<String> rightFuzzySkuDefaultImg;

        public List<String> getRightFuzzySkuDefaultImg(){return this.rightFuzzySkuDefaultImg;}

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

        public ConditionBuilder priceBetWeen(Double priceSt,Double priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(Double priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(Double priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(Double ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<Double> price){
            this.priceList = price;
            return this;
        }

        public ConditionBuilder fuzzySkuName (List<String> fuzzySkuName){
            this.fuzzySkuName = fuzzySkuName;
            return this;
        }

        public ConditionBuilder fuzzySkuName (String ... fuzzySkuName){
            this.fuzzySkuName = solveNullList(fuzzySkuName);
            return this;
        }

        public ConditionBuilder rightFuzzySkuName (List<String> rightFuzzySkuName){
            this.rightFuzzySkuName = rightFuzzySkuName;
            return this;
        }

        public ConditionBuilder rightFuzzySkuName (String ... rightFuzzySkuName){
            this.rightFuzzySkuName = solveNullList(rightFuzzySkuName);
            return this;
        }

        public ConditionBuilder skuNameList(String ... skuName){
            this.skuNameList = solveNullList(skuName);
            return this;
        }

        public ConditionBuilder skuNameList(List<String> skuName){
            this.skuNameList = skuName;
            return this;
        }

        public ConditionBuilder fuzzySkuDesc (List<String> fuzzySkuDesc){
            this.fuzzySkuDesc = fuzzySkuDesc;
            return this;
        }

        public ConditionBuilder fuzzySkuDesc (String ... fuzzySkuDesc){
            this.fuzzySkuDesc = solveNullList(fuzzySkuDesc);
            return this;
        }

        public ConditionBuilder rightFuzzySkuDesc (List<String> rightFuzzySkuDesc){
            this.rightFuzzySkuDesc = rightFuzzySkuDesc;
            return this;
        }

        public ConditionBuilder rightFuzzySkuDesc (String ... rightFuzzySkuDesc){
            this.rightFuzzySkuDesc = solveNullList(rightFuzzySkuDesc);
            return this;
        }

        public ConditionBuilder skuDescList(String ... skuDesc){
            this.skuDescList = solveNullList(skuDesc);
            return this;
        }

        public ConditionBuilder skuDescList(List<String> skuDesc){
            this.skuDescList = skuDesc;
            return this;
        }

        public ConditionBuilder weightBetWeen(Double weightSt,Double weightEd){
            this.weightSt = weightSt;
            this.weightEd = weightEd;
            return this;
        }

        public ConditionBuilder weightGreaterEqThan(Double weightSt){
            this.weightSt = weightSt;
            return this;
        }
        public ConditionBuilder weightLessEqThan(Double weightEd){
            this.weightEd = weightEd;
            return this;
        }


        public ConditionBuilder weightList(Double ... weight){
            this.weightList = solveNullList(weight);
            return this;
        }

        public ConditionBuilder weightList(List<Double> weight){
            this.weightList = weight;
            return this;
        }

        public ConditionBuilder tmIdBetWeen(Long tmIdSt,Long tmIdEd){
            this.tmIdSt = tmIdSt;
            this.tmIdEd = tmIdEd;
            return this;
        }

        public ConditionBuilder tmIdGreaterEqThan(Long tmIdSt){
            this.tmIdSt = tmIdSt;
            return this;
        }
        public ConditionBuilder tmIdLessEqThan(Long tmIdEd){
            this.tmIdEd = tmIdEd;
            return this;
        }


        public ConditionBuilder tmIdList(Long ... tmId){
            this.tmIdList = solveNullList(tmId);
            return this;
        }

        public ConditionBuilder tmIdList(List<Long> tmId){
            this.tmIdList = tmId;
            return this;
        }

        public ConditionBuilder catalog3IdBetWeen(Long catalog3IdSt,Long catalog3IdEd){
            this.catalog3IdSt = catalog3IdSt;
            this.catalog3IdEd = catalog3IdEd;
            return this;
        }

        public ConditionBuilder catalog3IdGreaterEqThan(Long catalog3IdSt){
            this.catalog3IdSt = catalog3IdSt;
            return this;
        }
        public ConditionBuilder catalog3IdLessEqThan(Long catalog3IdEd){
            this.catalog3IdEd = catalog3IdEd;
            return this;
        }


        public ConditionBuilder catalog3IdList(Long ... catalog3Id){
            this.catalog3IdList = solveNullList(catalog3Id);
            return this;
        }

        public ConditionBuilder catalog3IdList(List<Long> catalog3Id){
            this.catalog3IdList = catalog3Id;
            return this;
        }

        public ConditionBuilder fuzzySkuDefaultImg (List<String> fuzzySkuDefaultImg){
            this.fuzzySkuDefaultImg = fuzzySkuDefaultImg;
            return this;
        }

        public ConditionBuilder fuzzySkuDefaultImg (String ... fuzzySkuDefaultImg){
            this.fuzzySkuDefaultImg = solveNullList(fuzzySkuDefaultImg);
            return this;
        }

        public ConditionBuilder rightFuzzySkuDefaultImg (List<String> rightFuzzySkuDefaultImg){
            this.rightFuzzySkuDefaultImg = rightFuzzySkuDefaultImg;
            return this;
        }

        public ConditionBuilder rightFuzzySkuDefaultImg (String ... rightFuzzySkuDefaultImg){
            this.rightFuzzySkuDefaultImg = solveNullList(rightFuzzySkuDefaultImg);
            return this;
        }

        public ConditionBuilder skuDefaultImgList(String ... skuDefaultImg){
            this.skuDefaultImgList = solveNullList(skuDefaultImg);
            return this;
        }

        public ConditionBuilder skuDefaultImgList(List<String> skuDefaultImg){
            this.skuDefaultImgList = skuDefaultImg;
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

        private PmsSkuInfo obj;

        public Builder(){
            this.obj = new PmsSkuInfo();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder productId(Long productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder price(Double price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder skuName(String skuName){
            this.obj.setSkuName(skuName);
            return this;
        }
        public Builder skuDesc(String skuDesc){
            this.obj.setSkuDesc(skuDesc);
            return this;
        }
        public Builder weight(Double weight){
            this.obj.setWeight(weight);
            return this;
        }
        public Builder tmId(Long tmId){
            this.obj.setTmId(tmId);
            return this;
        }
        public Builder catalog3Id(Long catalog3Id){
            this.obj.setCatalog3Id(catalog3Id);
            return this;
        }
        public Builder skuDefaultImg(String skuDefaultImg){
            this.obj.setSkuDefaultImg(skuDefaultImg);
            return this;
        }
        public PmsSkuInfo build(){return obj;}
    }

}
