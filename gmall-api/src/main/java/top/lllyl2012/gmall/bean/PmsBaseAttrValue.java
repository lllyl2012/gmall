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
public class PmsBaseAttrValue implements Serializable {

    private static final long serialVersionUID = 1573910873474L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * 属性值名称
    * isNullAble:0
    */
    private String valueName;

    /**
    * 属性id
    * isNullAble:1
    */
    private Long attrId;

    /**
    * 启用：1 停用：0 1
    * isNullAble:1
    */
    private String isEnabled;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setValueName(String valueName){this.valueName = valueName;}

    public String getValueName(){return this.valueName;}

    public void setAttrId(Long attrId){this.attrId = attrId;}

    public Long getAttrId(){return this.attrId;}

    public void setIsEnabled(String isEnabled){this.isEnabled = isEnabled;}

    public String getIsEnabled(){return this.isEnabled;}
    @Override
    public String toString() {
        return "PmsBaseAttrValue{" +
                "id='" + id + '\'' +
                "valueName='" + valueName + '\'' +
                "attrId='" + attrId + '\'' +
                "isEnabled='" + isEnabled + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsBaseAttrValue set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsBaseAttrValue set){
            this.set = set;
            return this;
        }

        public PmsBaseAttrValue getSet(){
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

    public static class QueryBuilder extends PmsBaseAttrValue{
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

        private List<String> valueNameList;

        public List<String> getValueNameList(){return this.valueNameList;}


        private List<String> fuzzyValueName;

        public List<String> getFuzzyValueName(){return this.fuzzyValueName;}

        private List<String> rightFuzzyValueName;

        public List<String> getRightFuzzyValueName(){return this.rightFuzzyValueName;}
        private List<Long> attrIdList;

        public List<Long> getAttrIdList(){return this.attrIdList;}

        private Long attrIdSt;

        private Long attrIdEd;

        public Long getAttrIdSt(){return this.attrIdSt;}

        public Long getAttrIdEd(){return this.attrIdEd;}

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

        public QueryBuilder fuzzyValueName (List<String> fuzzyValueName){
            this.fuzzyValueName = fuzzyValueName;
            return this;
        }

        public QueryBuilder fuzzyValueName (String ... fuzzyValueName){
            this.fuzzyValueName = solveNullList(fuzzyValueName);
            return this;
        }

        public QueryBuilder rightFuzzyValueName (List<String> rightFuzzyValueName){
            this.rightFuzzyValueName = rightFuzzyValueName;
            return this;
        }

        public QueryBuilder rightFuzzyValueName (String ... rightFuzzyValueName){
            this.rightFuzzyValueName = solveNullList(rightFuzzyValueName);
            return this;
        }

        public QueryBuilder valueName(String valueName){
            setValueName(valueName);
            return this;
        }

        public QueryBuilder valueNameList(String ... valueName){
            this.valueNameList = solveNullList(valueName);
            return this;
        }

        public QueryBuilder valueNameList(List<String> valueName){
            this.valueNameList = valueName;
            return this;
        }

        public QueryBuilder fetchValueName(){
            setFetchFields("fetchFields","valueName");
            return this;
        }

        public QueryBuilder excludeValueName(){
            setFetchFields("excludeFields","valueName");
            return this;
        }

        public QueryBuilder attrIdBetWeen(Long attrIdSt,Long attrIdEd){
            this.attrIdSt = attrIdSt;
            this.attrIdEd = attrIdEd;
            return this;
        }

        public QueryBuilder attrIdGreaterEqThan(Long attrIdSt){
            this.attrIdSt = attrIdSt;
            return this;
        }
        public QueryBuilder attrIdLessEqThan(Long attrIdEd){
            this.attrIdEd = attrIdEd;
            return this;
        }


        public QueryBuilder attrId(Long attrId){
            setAttrId(attrId);
            return this;
        }

        public QueryBuilder attrIdList(Long ... attrId){
            this.attrIdList = solveNullList(attrId);
            return this;
        }

        public QueryBuilder attrIdList(List<Long> attrId){
            this.attrIdList = attrId;
            return this;
        }

        public QueryBuilder fetchAttrId(){
            setFetchFields("fetchFields","attrId");
            return this;
        }

        public QueryBuilder excludeAttrId(){
            setFetchFields("excludeFields","attrId");
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

        public PmsBaseAttrValue build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> valueNameList;

        public List<String> getValueNameList(){return this.valueNameList;}


        private List<String> fuzzyValueName;

        public List<String> getFuzzyValueName(){return this.fuzzyValueName;}

        private List<String> rightFuzzyValueName;

        public List<String> getRightFuzzyValueName(){return this.rightFuzzyValueName;}
        private List<Long> attrIdList;

        public List<Long> getAttrIdList(){return this.attrIdList;}

        private Long attrIdSt;

        private Long attrIdEd;

        public Long getAttrIdSt(){return this.attrIdSt;}

        public Long getAttrIdEd(){return this.attrIdEd;}

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

        public ConditionBuilder fuzzyValueName (List<String> fuzzyValueName){
            this.fuzzyValueName = fuzzyValueName;
            return this;
        }

        public ConditionBuilder fuzzyValueName (String ... fuzzyValueName){
            this.fuzzyValueName = solveNullList(fuzzyValueName);
            return this;
        }

        public ConditionBuilder rightFuzzyValueName (List<String> rightFuzzyValueName){
            this.rightFuzzyValueName = rightFuzzyValueName;
            return this;
        }

        public ConditionBuilder rightFuzzyValueName (String ... rightFuzzyValueName){
            this.rightFuzzyValueName = solveNullList(rightFuzzyValueName);
            return this;
        }

        public ConditionBuilder valueNameList(String ... valueName){
            this.valueNameList = solveNullList(valueName);
            return this;
        }

        public ConditionBuilder valueNameList(List<String> valueName){
            this.valueNameList = valueName;
            return this;
        }

        public ConditionBuilder attrIdBetWeen(Long attrIdSt,Long attrIdEd){
            this.attrIdSt = attrIdSt;
            this.attrIdEd = attrIdEd;
            return this;
        }

        public ConditionBuilder attrIdGreaterEqThan(Long attrIdSt){
            this.attrIdSt = attrIdSt;
            return this;
        }
        public ConditionBuilder attrIdLessEqThan(Long attrIdEd){
            this.attrIdEd = attrIdEd;
            return this;
        }


        public ConditionBuilder attrIdList(Long ... attrId){
            this.attrIdList = solveNullList(attrId);
            return this;
        }

        public ConditionBuilder attrIdList(List<Long> attrId){
            this.attrIdList = attrId;
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

        private PmsBaseAttrValue obj;

        public Builder(){
            this.obj = new PmsBaseAttrValue();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder valueName(String valueName){
            this.obj.setValueName(valueName);
            return this;
        }
        public Builder attrId(Long attrId){
            this.obj.setAttrId(attrId);
            return this;
        }
        public Builder isEnabled(String isEnabled){
            this.obj.setIsEnabled(isEnabled);
            return this;
        }
        public PmsBaseAttrValue build(){return obj;}
    }

}
