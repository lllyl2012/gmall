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
public class PmsProductInfo implements Serializable {

    private static final long serialVersionUID = 1573824733452L;


    /**
    * 主键
    * 商品id
    * isNullAble:0
    */
    private Long id;

    /**
    * 商品名称
    * isNullAble:1
    */
    private String productName;

    /**
    * 商品描述(后台简述）
    * isNullAble:1
    */
    private String description;

    /**
    * 三级分类id
    * isNullAble:1
    */
    private Long catalog3Id;

    /**
    * 品牌id
    * isNullAble:1
    */
    private Long tmId;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProductName(String productName){this.productName = productName;}

    public String getProductName(){return this.productName;}

    public void setDescription(String description){this.description = description;}

    public String getDescription(){return this.description;}

    public void setCatalog3Id(Long catalog3Id){this.catalog3Id = catalog3Id;}

    public Long getCatalog3Id(){return this.catalog3Id;}

    public void setTmId(Long tmId){this.tmId = tmId;}

    public Long getTmId(){return this.tmId;}
    @Override
    public String toString() {
        return "PmsProductInfo{" +
                "id='" + id + '\'' +
                "productName='" + productName + '\'' +
                "description='" + description + '\'' +
                "catalog3Id='" + catalog3Id + '\'' +
                "tmId='" + tmId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsProductInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsProductInfo set){
            this.set = set;
            return this;
        }

        public PmsProductInfo getSet(){
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

    public static class QueryBuilder extends PmsProductInfo{
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

        private List<String> productNameList;

        public List<String> getProductNameList(){return this.productNameList;}


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){return this.fuzzyProductName;}

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){return this.rightFuzzyProductName;}
        private List<String> descriptionList;

        public List<String> getDescriptionList(){return this.descriptionList;}


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription(){return this.fuzzyDescription;}

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription(){return this.rightFuzzyDescription;}
        private List<Long> catalog3IdList;

        public List<Long> getCatalog3IdList(){return this.catalog3IdList;}

        private Long catalog3IdSt;

        private Long catalog3IdEd;

        public Long getCatalog3IdSt(){return this.catalog3IdSt;}

        public Long getCatalog3IdEd(){return this.catalog3IdEd;}

        private List<Long> tmIdList;

        public List<Long> getTmIdList(){return this.tmIdList;}

        private Long tmIdSt;

        private Long tmIdEd;

        public Long getTmIdSt(){return this.tmIdSt;}

        public Long getTmIdEd(){return this.tmIdEd;}

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

        public QueryBuilder fuzzyDescription (List<String> fuzzyDescription){
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public QueryBuilder fuzzyDescription (String ... fuzzyDescription){
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public QueryBuilder rightFuzzyDescription (List<String> rightFuzzyDescription){
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public QueryBuilder rightFuzzyDescription (String ... rightFuzzyDescription){
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public QueryBuilder description(String description){
            setDescription(description);
            return this;
        }

        public QueryBuilder descriptionList(String ... description){
            this.descriptionList = solveNullList(description);
            return this;
        }

        public QueryBuilder descriptionList(List<String> description){
            this.descriptionList = description;
            return this;
        }

        public QueryBuilder fetchDescription(){
            setFetchFields("fetchFields","description");
            return this;
        }

        public QueryBuilder excludeDescription(){
            setFetchFields("excludeFields","description");
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

        public PmsProductInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> productNameList;

        public List<String> getProductNameList(){return this.productNameList;}


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){return this.fuzzyProductName;}

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){return this.rightFuzzyProductName;}
        private List<String> descriptionList;

        public List<String> getDescriptionList(){return this.descriptionList;}


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription(){return this.fuzzyDescription;}

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription(){return this.rightFuzzyDescription;}
        private List<Long> catalog3IdList;

        public List<Long> getCatalog3IdList(){return this.catalog3IdList;}

        private Long catalog3IdSt;

        private Long catalog3IdEd;

        public Long getCatalog3IdSt(){return this.catalog3IdSt;}

        public Long getCatalog3IdEd(){return this.catalog3IdEd;}

        private List<Long> tmIdList;

        public List<Long> getTmIdList(){return this.tmIdList;}

        private Long tmIdSt;

        private Long tmIdEd;

        public Long getTmIdSt(){return this.tmIdSt;}

        public Long getTmIdEd(){return this.tmIdEd;}


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

        public ConditionBuilder fuzzyDescription (List<String> fuzzyDescription){
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public ConditionBuilder fuzzyDescription (String ... fuzzyDescription){
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyDescription (List<String> rightFuzzyDescription){
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyDescription (String ... rightFuzzyDescription){
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public ConditionBuilder descriptionList(String ... description){
            this.descriptionList = solveNullList(description);
            return this;
        }

        public ConditionBuilder descriptionList(List<String> description){
            this.descriptionList = description;
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

        private PmsProductInfo obj;

        public Builder(){
            this.obj = new PmsProductInfo();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder productName(String productName){
            this.obj.setProductName(productName);
            return this;
        }
        public Builder description(String description){
            this.obj.setDescription(description);
            return this;
        }
        public Builder catalog3Id(Long catalog3Id){
            this.obj.setCatalog3Id(catalog3Id);
            return this;
        }
        public Builder tmId(Long tmId){
            this.obj.setTmId(tmId);
            return this;
        }
        public PmsProductInfo build(){return obj;}
    }

}
