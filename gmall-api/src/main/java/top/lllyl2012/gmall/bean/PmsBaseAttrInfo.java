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
public class PmsBaseAttrInfo implements Serializable {

    private static final long serialVersionUID = 1573910868348L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * 属性名称
    * isNullAble:0
    */
    private String attrName;

    /**
    * 
    * isNullAble:1
    */
    private Long catalog3Id;

    /**
    * 启用：1 停用：0
    * isNullAble:1
    */
    private String isEnabled;

    private List<PmsBaseAttrValue> attrValueList;

    public List<PmsBaseAttrValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<PmsBaseAttrValue> attrValueList) {
        this.attrValueList = attrValueList;
    }

    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setAttrName(String attrName){this.attrName = attrName;}

    public String getAttrName(){return this.attrName;}

    public void setCatalog3Id(Long catalog3Id){this.catalog3Id = catalog3Id;}

    public Long getCatalog3Id(){return this.catalog3Id;}

    public void setIsEnabled(String isEnabled){this.isEnabled = isEnabled;}

    public String getIsEnabled(){return this.isEnabled;}
    @Override
    public String toString() {
        return "PmsBaseAttrInfo{" +
                "id='" + id + '\'' +
                "attrName='" + attrName + '\'' +
                "catalog3Id='" + catalog3Id + '\'' +
                "isEnabled='" + isEnabled + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsBaseAttrInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsBaseAttrInfo set){
            this.set = set;
            return this;
        }

        public PmsBaseAttrInfo getSet(){
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

    public static class QueryBuilder extends PmsBaseAttrInfo{
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

        private List<String> attrNameList;

        public List<String> getAttrNameList(){return this.attrNameList;}


        private List<String> fuzzyAttrName;

        public List<String> getFuzzyAttrName(){return this.fuzzyAttrName;}

        private List<String> rightFuzzyAttrName;

        public List<String> getRightFuzzyAttrName(){return this.rightFuzzyAttrName;}
        private List<Long> catalog3IdList;

        public List<Long> getCatalog3IdList(){return this.catalog3IdList;}

        private Long catalog3IdSt;

        private Long catalog3IdEd;

        public Long getCatalog3IdSt(){return this.catalog3IdSt;}

        public Long getCatalog3IdEd(){return this.catalog3IdEd;}

        private List<String> isEnabledList;

        public List<String> getIsEnabledList(){return this.isEnabledList;}


        private List<String> fuzzyIsEnabled;

        public List<String> getFuzzyIsEnabled(){return this.fuzzyIsEnabled;}

        private List<String> rightFuzzyIsEnabled;

        public List<String> getRightFuzzyIsEnabled(){return this.rightFuzzyIsEnabled;}
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

        public QueryBuilder fuzzyAttrName (List<String> fuzzyAttrName){
            this.fuzzyAttrName = fuzzyAttrName;
            return this;
        }

        public QueryBuilder fuzzyAttrName (String ... fuzzyAttrName){
            this.fuzzyAttrName = solveNullList(fuzzyAttrName);
            return this;
        }

        public QueryBuilder rightFuzzyAttrName (List<String> rightFuzzyAttrName){
            this.rightFuzzyAttrName = rightFuzzyAttrName;
            return this;
        }

        public QueryBuilder rightFuzzyAttrName (String ... rightFuzzyAttrName){
            this.rightFuzzyAttrName = solveNullList(rightFuzzyAttrName);
            return this;
        }

        public QueryBuilder attrName(String attrName){
            setAttrName(attrName);
            return this;
        }

        public QueryBuilder attrNameList(String ... attrName){
            this.attrNameList = solveNullList(attrName);
            return this;
        }

        public QueryBuilder attrNameList(List<String> attrName){
            this.attrNameList = attrName;
            return this;
        }

        public QueryBuilder fetchAttrName(){
            setFetchFields("fetchFields","attrName");
            return this;
        }

        public QueryBuilder excludeAttrName(){
            setFetchFields("excludeFields","attrName");
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

        public QueryBuilder fuzzyIsEnabled (List<String> fuzzyIsEnabled){
            this.fuzzyIsEnabled = fuzzyIsEnabled;
            return this;
        }

        public QueryBuilder fuzzyIsEnabled (String ... fuzzyIsEnabled){
            this.fuzzyIsEnabled = solveNullList(fuzzyIsEnabled);
            return this;
        }

        public QueryBuilder rightFuzzyIsEnabled (List<String> rightFuzzyIsEnabled){
            this.rightFuzzyIsEnabled = rightFuzzyIsEnabled;
            return this;
        }

        public QueryBuilder rightFuzzyIsEnabled (String ... rightFuzzyIsEnabled){
            this.rightFuzzyIsEnabled = solveNullList(rightFuzzyIsEnabled);
            return this;
        }

        public QueryBuilder isEnabled(String isEnabled){
            setIsEnabled(isEnabled);
            return this;
        }

        public QueryBuilder isEnabledList(String ... isEnabled){
            this.isEnabledList = solveNullList(isEnabled);
            return this;
        }

        public QueryBuilder isEnabledList(List<String> isEnabled){
            this.isEnabledList = isEnabled;
            return this;
        }

        public QueryBuilder fetchIsEnabled(){
            setFetchFields("fetchFields","isEnabled");
            return this;
        }

        public QueryBuilder excludeIsEnabled(){
            setFetchFields("excludeFields","isEnabled");
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

        public PmsBaseAttrInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> attrNameList;

        public List<String> getAttrNameList(){return this.attrNameList;}


        private List<String> fuzzyAttrName;

        public List<String> getFuzzyAttrName(){return this.fuzzyAttrName;}

        private List<String> rightFuzzyAttrName;

        public List<String> getRightFuzzyAttrName(){return this.rightFuzzyAttrName;}
        private List<Long> catalog3IdList;

        public List<Long> getCatalog3IdList(){return this.catalog3IdList;}

        private Long catalog3IdSt;

        private Long catalog3IdEd;

        public Long getCatalog3IdSt(){return this.catalog3IdSt;}

        public Long getCatalog3IdEd(){return this.catalog3IdEd;}

        private List<String> isEnabledList;

        public List<String> getIsEnabledList(){return this.isEnabledList;}


        private List<String> fuzzyIsEnabled;

        public List<String> getFuzzyIsEnabled(){return this.fuzzyIsEnabled;}

        private List<String> rightFuzzyIsEnabled;

        public List<String> getRightFuzzyIsEnabled(){return this.rightFuzzyIsEnabled;}

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

        public ConditionBuilder fuzzyAttrName (List<String> fuzzyAttrName){
            this.fuzzyAttrName = fuzzyAttrName;
            return this;
        }

        public ConditionBuilder fuzzyAttrName (String ... fuzzyAttrName){
            this.fuzzyAttrName = solveNullList(fuzzyAttrName);
            return this;
        }

        public ConditionBuilder rightFuzzyAttrName (List<String> rightFuzzyAttrName){
            this.rightFuzzyAttrName = rightFuzzyAttrName;
            return this;
        }

        public ConditionBuilder rightFuzzyAttrName (String ... rightFuzzyAttrName){
            this.rightFuzzyAttrName = solveNullList(rightFuzzyAttrName);
            return this;
        }

        public ConditionBuilder attrNameList(String ... attrName){
            this.attrNameList = solveNullList(attrName);
            return this;
        }

        public ConditionBuilder attrNameList(List<String> attrName){
            this.attrNameList = attrName;
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

        public ConditionBuilder fuzzyIsEnabled (List<String> fuzzyIsEnabled){
            this.fuzzyIsEnabled = fuzzyIsEnabled;
            return this;
        }

        public ConditionBuilder fuzzyIsEnabled (String ... fuzzyIsEnabled){
            this.fuzzyIsEnabled = solveNullList(fuzzyIsEnabled);
            return this;
        }

        public ConditionBuilder rightFuzzyIsEnabled (List<String> rightFuzzyIsEnabled){
            this.rightFuzzyIsEnabled = rightFuzzyIsEnabled;
            return this;
        }

        public ConditionBuilder rightFuzzyIsEnabled (String ... rightFuzzyIsEnabled){
            this.rightFuzzyIsEnabled = solveNullList(rightFuzzyIsEnabled);
            return this;
        }

        public ConditionBuilder isEnabledList(String ... isEnabled){
            this.isEnabledList = solveNullList(isEnabled);
            return this;
        }

        public ConditionBuilder isEnabledList(List<String> isEnabled){
            this.isEnabledList = isEnabled;
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

        private PmsBaseAttrInfo obj;

        public Builder(){
            this.obj = new PmsBaseAttrInfo();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder attrName(String attrName){
            this.obj.setAttrName(attrName);
            return this;
        }
        public Builder catalog3Id(Long catalog3Id){
            this.obj.setCatalog3Id(catalog3Id);
            return this;
        }
        public Builder isEnabled(String isEnabled){
            this.obj.setIsEnabled(isEnabled);
            return this;
        }
        public PmsBaseAttrInfo build(){return obj;}
    }

}
