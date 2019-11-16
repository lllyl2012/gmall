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
public class PmsSkuImage implements Serializable {

    private static final long serialVersionUID = 1573824745508L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * 商品id
    * isNullAble:1
    */
    private Long skuId;

    /**
    * 图片名称（冗余）
    * isNullAble:1
    */
    private String imgName;

    /**
    * 图片路径(冗余)
    * isNullAble:1
    */
    private String imgUrl;

    /**
    * 商品图片id
    * isNullAble:1
    */
    private Long productImgId;

    /**
    * 是否默认
    * isNullAble:1,defaultVal:0
    */
    private String isDefault;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setSkuId(Long skuId){this.skuId = skuId;}

    public Long getSkuId(){return this.skuId;}

    public void setImgName(String imgName){this.imgName = imgName;}

    public String getImgName(){return this.imgName;}

    public void setImgUrl(String imgUrl){this.imgUrl = imgUrl;}

    public String getImgUrl(){return this.imgUrl;}

    public void setProductImgId(Long productImgId){this.productImgId = productImgId;}

    public Long getProductImgId(){return this.productImgId;}

    public void setIsDefault(String isDefault){this.isDefault = isDefault;}

    public String getIsDefault(){return this.isDefault;}
    @Override
    public String toString() {
        return "PmsSkuImage{" +
                "id='" + id + '\'' +
                "skuId='" + skuId + '\'' +
                "imgName='" + imgName + '\'' +
                "imgUrl='" + imgUrl + '\'' +
                "productImgId='" + productImgId + '\'' +
                "isDefault='" + isDefault + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsSkuImage set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsSkuImage set){
            this.set = set;
            return this;
        }

        public PmsSkuImage getSet(){
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

    public static class QueryBuilder extends PmsSkuImage{
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

        private List<Long> skuIdList;

        public List<Long> getSkuIdList(){return this.skuIdList;}

        private Long skuIdSt;

        private Long skuIdEd;

        public Long getSkuIdSt(){return this.skuIdSt;}

        public Long getSkuIdEd(){return this.skuIdEd;}

        private List<String> imgNameList;

        public List<String> getImgNameList(){return this.imgNameList;}


        private List<String> fuzzyImgName;

        public List<String> getFuzzyImgName(){return this.fuzzyImgName;}

        private List<String> rightFuzzyImgName;

        public List<String> getRightFuzzyImgName(){return this.rightFuzzyImgName;}
        private List<String> imgUrlList;

        public List<String> getImgUrlList(){return this.imgUrlList;}


        private List<String> fuzzyImgUrl;

        public List<String> getFuzzyImgUrl(){return this.fuzzyImgUrl;}

        private List<String> rightFuzzyImgUrl;

        public List<String> getRightFuzzyImgUrl(){return this.rightFuzzyImgUrl;}
        private List<Long> productImgIdList;

        public List<Long> getProductImgIdList(){return this.productImgIdList;}

        private Long productImgIdSt;

        private Long productImgIdEd;

        public Long getProductImgIdSt(){return this.productImgIdSt;}

        public Long getProductImgIdEd(){return this.productImgIdEd;}

        private List<String> isDefaultList;

        public List<String> getIsDefaultList(){return this.isDefaultList;}


        private List<String> fuzzyIsDefault;

        public List<String> getFuzzyIsDefault(){return this.fuzzyIsDefault;}

        private List<String> rightFuzzyIsDefault;

        public List<String> getRightFuzzyIsDefault(){return this.rightFuzzyIsDefault;}
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

        public QueryBuilder skuIdBetWeen(Long skuIdSt,Long skuIdEd){
            this.skuIdSt = skuIdSt;
            this.skuIdEd = skuIdEd;
            return this;
        }

        public QueryBuilder skuIdGreaterEqThan(Long skuIdSt){
            this.skuIdSt = skuIdSt;
            return this;
        }
        public QueryBuilder skuIdLessEqThan(Long skuIdEd){
            this.skuIdEd = skuIdEd;
            return this;
        }


        public QueryBuilder skuId(Long skuId){
            setSkuId(skuId);
            return this;
        }

        public QueryBuilder skuIdList(Long ... skuId){
            this.skuIdList = solveNullList(skuId);
            return this;
        }

        public QueryBuilder skuIdList(List<Long> skuId){
            this.skuIdList = skuId;
            return this;
        }

        public QueryBuilder fetchSkuId(){
            setFetchFields("fetchFields","skuId");
            return this;
        }

        public QueryBuilder excludeSkuId(){
            setFetchFields("excludeFields","skuId");
            return this;
        }

        public QueryBuilder fuzzyImgName (List<String> fuzzyImgName){
            this.fuzzyImgName = fuzzyImgName;
            return this;
        }

        public QueryBuilder fuzzyImgName (String ... fuzzyImgName){
            this.fuzzyImgName = solveNullList(fuzzyImgName);
            return this;
        }

        public QueryBuilder rightFuzzyImgName (List<String> rightFuzzyImgName){
            this.rightFuzzyImgName = rightFuzzyImgName;
            return this;
        }

        public QueryBuilder rightFuzzyImgName (String ... rightFuzzyImgName){
            this.rightFuzzyImgName = solveNullList(rightFuzzyImgName);
            return this;
        }

        public QueryBuilder imgName(String imgName){
            setImgName(imgName);
            return this;
        }

        public QueryBuilder imgNameList(String ... imgName){
            this.imgNameList = solveNullList(imgName);
            return this;
        }

        public QueryBuilder imgNameList(List<String> imgName){
            this.imgNameList = imgName;
            return this;
        }

        public QueryBuilder fetchImgName(){
            setFetchFields("fetchFields","imgName");
            return this;
        }

        public QueryBuilder excludeImgName(){
            setFetchFields("excludeFields","imgName");
            return this;
        }

        public QueryBuilder fuzzyImgUrl (List<String> fuzzyImgUrl){
            this.fuzzyImgUrl = fuzzyImgUrl;
            return this;
        }

        public QueryBuilder fuzzyImgUrl (String ... fuzzyImgUrl){
            this.fuzzyImgUrl = solveNullList(fuzzyImgUrl);
            return this;
        }

        public QueryBuilder rightFuzzyImgUrl (List<String> rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = rightFuzzyImgUrl;
            return this;
        }

        public QueryBuilder rightFuzzyImgUrl (String ... rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = solveNullList(rightFuzzyImgUrl);
            return this;
        }

        public QueryBuilder imgUrl(String imgUrl){
            setImgUrl(imgUrl);
            return this;
        }

        public QueryBuilder imgUrlList(String ... imgUrl){
            this.imgUrlList = solveNullList(imgUrl);
            return this;
        }

        public QueryBuilder imgUrlList(List<String> imgUrl){
            this.imgUrlList = imgUrl;
            return this;
        }

        public QueryBuilder fetchImgUrl(){
            setFetchFields("fetchFields","imgUrl");
            return this;
        }

        public QueryBuilder excludeImgUrl(){
            setFetchFields("excludeFields","imgUrl");
            return this;
        }

        public QueryBuilder productImgIdBetWeen(Long productImgIdSt,Long productImgIdEd){
            this.productImgIdSt = productImgIdSt;
            this.productImgIdEd = productImgIdEd;
            return this;
        }

        public QueryBuilder productImgIdGreaterEqThan(Long productImgIdSt){
            this.productImgIdSt = productImgIdSt;
            return this;
        }
        public QueryBuilder productImgIdLessEqThan(Long productImgIdEd){
            this.productImgIdEd = productImgIdEd;
            return this;
        }


        public QueryBuilder productImgId(Long productImgId){
            setProductImgId(productImgId);
            return this;
        }

        public QueryBuilder productImgIdList(Long ... productImgId){
            this.productImgIdList = solveNullList(productImgId);
            return this;
        }

        public QueryBuilder productImgIdList(List<Long> productImgId){
            this.productImgIdList = productImgId;
            return this;
        }

        public QueryBuilder fetchProductImgId(){
            setFetchFields("fetchFields","productImgId");
            return this;
        }

        public QueryBuilder excludeProductImgId(){
            setFetchFields("excludeFields","productImgId");
            return this;
        }

        public QueryBuilder fuzzyIsDefault (List<String> fuzzyIsDefault){
            this.fuzzyIsDefault = fuzzyIsDefault;
            return this;
        }

        public QueryBuilder fuzzyIsDefault (String ... fuzzyIsDefault){
            this.fuzzyIsDefault = solveNullList(fuzzyIsDefault);
            return this;
        }

        public QueryBuilder rightFuzzyIsDefault (List<String> rightFuzzyIsDefault){
            this.rightFuzzyIsDefault = rightFuzzyIsDefault;
            return this;
        }

        public QueryBuilder rightFuzzyIsDefault (String ... rightFuzzyIsDefault){
            this.rightFuzzyIsDefault = solveNullList(rightFuzzyIsDefault);
            return this;
        }

        public QueryBuilder isDefault(String isDefault){
            setIsDefault(isDefault);
            return this;
        }

        public QueryBuilder isDefaultList(String ... isDefault){
            this.isDefaultList = solveNullList(isDefault);
            return this;
        }

        public QueryBuilder isDefaultList(List<String> isDefault){
            this.isDefaultList = isDefault;
            return this;
        }

        public QueryBuilder fetchIsDefault(){
            setFetchFields("fetchFields","isDefault");
            return this;
        }

        public QueryBuilder excludeIsDefault(){
            setFetchFields("excludeFields","isDefault");
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

        public PmsSkuImage build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> skuIdList;

        public List<Long> getSkuIdList(){return this.skuIdList;}

        private Long skuIdSt;

        private Long skuIdEd;

        public Long getSkuIdSt(){return this.skuIdSt;}

        public Long getSkuIdEd(){return this.skuIdEd;}

        private List<String> imgNameList;

        public List<String> getImgNameList(){return this.imgNameList;}


        private List<String> fuzzyImgName;

        public List<String> getFuzzyImgName(){return this.fuzzyImgName;}

        private List<String> rightFuzzyImgName;

        public List<String> getRightFuzzyImgName(){return this.rightFuzzyImgName;}
        private List<String> imgUrlList;

        public List<String> getImgUrlList(){return this.imgUrlList;}


        private List<String> fuzzyImgUrl;

        public List<String> getFuzzyImgUrl(){return this.fuzzyImgUrl;}

        private List<String> rightFuzzyImgUrl;

        public List<String> getRightFuzzyImgUrl(){return this.rightFuzzyImgUrl;}
        private List<Long> productImgIdList;

        public List<Long> getProductImgIdList(){return this.productImgIdList;}

        private Long productImgIdSt;

        private Long productImgIdEd;

        public Long getProductImgIdSt(){return this.productImgIdSt;}

        public Long getProductImgIdEd(){return this.productImgIdEd;}

        private List<String> isDefaultList;

        public List<String> getIsDefaultList(){return this.isDefaultList;}


        private List<String> fuzzyIsDefault;

        public List<String> getFuzzyIsDefault(){return this.fuzzyIsDefault;}

        private List<String> rightFuzzyIsDefault;

        public List<String> getRightFuzzyIsDefault(){return this.rightFuzzyIsDefault;}

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

        public ConditionBuilder skuIdBetWeen(Long skuIdSt,Long skuIdEd){
            this.skuIdSt = skuIdSt;
            this.skuIdEd = skuIdEd;
            return this;
        }

        public ConditionBuilder skuIdGreaterEqThan(Long skuIdSt){
            this.skuIdSt = skuIdSt;
            return this;
        }
        public ConditionBuilder skuIdLessEqThan(Long skuIdEd){
            this.skuIdEd = skuIdEd;
            return this;
        }


        public ConditionBuilder skuIdList(Long ... skuId){
            this.skuIdList = solveNullList(skuId);
            return this;
        }

        public ConditionBuilder skuIdList(List<Long> skuId){
            this.skuIdList = skuId;
            return this;
        }

        public ConditionBuilder fuzzyImgName (List<String> fuzzyImgName){
            this.fuzzyImgName = fuzzyImgName;
            return this;
        }

        public ConditionBuilder fuzzyImgName (String ... fuzzyImgName){
            this.fuzzyImgName = solveNullList(fuzzyImgName);
            return this;
        }

        public ConditionBuilder rightFuzzyImgName (List<String> rightFuzzyImgName){
            this.rightFuzzyImgName = rightFuzzyImgName;
            return this;
        }

        public ConditionBuilder rightFuzzyImgName (String ... rightFuzzyImgName){
            this.rightFuzzyImgName = solveNullList(rightFuzzyImgName);
            return this;
        }

        public ConditionBuilder imgNameList(String ... imgName){
            this.imgNameList = solveNullList(imgName);
            return this;
        }

        public ConditionBuilder imgNameList(List<String> imgName){
            this.imgNameList = imgName;
            return this;
        }

        public ConditionBuilder fuzzyImgUrl (List<String> fuzzyImgUrl){
            this.fuzzyImgUrl = fuzzyImgUrl;
            return this;
        }

        public ConditionBuilder fuzzyImgUrl (String ... fuzzyImgUrl){
            this.fuzzyImgUrl = solveNullList(fuzzyImgUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyImgUrl (List<String> rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = rightFuzzyImgUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyImgUrl (String ... rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = solveNullList(rightFuzzyImgUrl);
            return this;
        }

        public ConditionBuilder imgUrlList(String ... imgUrl){
            this.imgUrlList = solveNullList(imgUrl);
            return this;
        }

        public ConditionBuilder imgUrlList(List<String> imgUrl){
            this.imgUrlList = imgUrl;
            return this;
        }

        public ConditionBuilder productImgIdBetWeen(Long productImgIdSt,Long productImgIdEd){
            this.productImgIdSt = productImgIdSt;
            this.productImgIdEd = productImgIdEd;
            return this;
        }

        public ConditionBuilder productImgIdGreaterEqThan(Long productImgIdSt){
            this.productImgIdSt = productImgIdSt;
            return this;
        }
        public ConditionBuilder productImgIdLessEqThan(Long productImgIdEd){
            this.productImgIdEd = productImgIdEd;
            return this;
        }


        public ConditionBuilder productImgIdList(Long ... productImgId){
            this.productImgIdList = solveNullList(productImgId);
            return this;
        }

        public ConditionBuilder productImgIdList(List<Long> productImgId){
            this.productImgIdList = productImgId;
            return this;
        }

        public ConditionBuilder fuzzyIsDefault (List<String> fuzzyIsDefault){
            this.fuzzyIsDefault = fuzzyIsDefault;
            return this;
        }

        public ConditionBuilder fuzzyIsDefault (String ... fuzzyIsDefault){
            this.fuzzyIsDefault = solveNullList(fuzzyIsDefault);
            return this;
        }

        public ConditionBuilder rightFuzzyIsDefault (List<String> rightFuzzyIsDefault){
            this.rightFuzzyIsDefault = rightFuzzyIsDefault;
            return this;
        }

        public ConditionBuilder rightFuzzyIsDefault (String ... rightFuzzyIsDefault){
            this.rightFuzzyIsDefault = solveNullList(rightFuzzyIsDefault);
            return this;
        }

        public ConditionBuilder isDefaultList(String ... isDefault){
            this.isDefaultList = solveNullList(isDefault);
            return this;
        }

        public ConditionBuilder isDefaultList(List<String> isDefault){
            this.isDefaultList = isDefault;
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

        private PmsSkuImage obj;

        public Builder(){
            this.obj = new PmsSkuImage();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder skuId(Long skuId){
            this.obj.setSkuId(skuId);
            return this;
        }
        public Builder imgName(String imgName){
            this.obj.setImgName(imgName);
            return this;
        }
        public Builder imgUrl(String imgUrl){
            this.obj.setImgUrl(imgUrl);
            return this;
        }
        public Builder productImgId(Long productImgId){
            this.obj.setProductImgId(productImgId);
            return this;
        }
        public Builder isDefault(String isDefault){
            this.obj.setIsDefault(isDefault);
            return this;
        }
        public PmsSkuImage build(){return obj;}
    }

}
