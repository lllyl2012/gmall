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
public class PmsSkuAttrValue implements Serializable {

    private static final long serialVersionUID = 1574497741775L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * 属性id（冗余)
    * isNullAble:1
    */
    private Long attrId;

    /**
    * 属性值id
    * isNullAble:1
    */
    private Long valueId;

    /**
    * skuid
    * isNullAble:1
    */
    private Long skuId;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setAttrId(Long attrId){this.attrId = attrId;}

    public Long getAttrId(){return this.attrId;}

    public void setValueId(Long valueId){this.valueId = valueId;}

    public Long getValueId(){return this.valueId;}

    public void setSkuId(Long skuId){this.skuId = skuId;}

    public Long getSkuId(){return this.skuId;}
    @Override
    public String toString() {
        return "PmsSkuAttrValue{" +
                "id='" + id + '\'' +
                "attrId='" + attrId + '\'' +
                "valueId='" + valueId + '\'' +
                "skuId='" + skuId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsSkuAttrValue set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsSkuAttrValue set){
            this.set = set;
            return this;
        }

        public PmsSkuAttrValue getSet(){
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

    public static class QueryBuilder extends PmsSkuAttrValue{
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

        private List<Long> attrIdList;

        public List<Long> getAttrIdList(){return this.attrIdList;}

        private Long attrIdSt;

        private Long attrIdEd;

        public Long getAttrIdSt(){return this.attrIdSt;}

        public Long getAttrIdEd(){return this.attrIdEd;}

        private List<Long> valueIdList;

        public List<Long> getValueIdList(){return this.valueIdList;}

        private Long valueIdSt;

        private Long valueIdEd;

        public Long getValueIdSt(){return this.valueIdSt;}

        public Long getValueIdEd(){return this.valueIdEd;}

        private List<Long> skuIdList;

        public List<Long> getSkuIdList(){return this.skuIdList;}

        private Long skuIdSt;

        private Long skuIdEd;

        public Long getSkuIdSt(){return this.skuIdSt;}

        public Long getSkuIdEd(){return this.skuIdEd;}

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

        public QueryBuilder valueIdBetWeen(Long valueIdSt,Long valueIdEd){
            this.valueIdSt = valueIdSt;
            this.valueIdEd = valueIdEd;
            return this;
        }

        public QueryBuilder valueIdGreaterEqThan(Long valueIdSt){
            this.valueIdSt = valueIdSt;
            return this;
        }
        public QueryBuilder valueIdLessEqThan(Long valueIdEd){
            this.valueIdEd = valueIdEd;
            return this;
        }


        public QueryBuilder valueId(Long valueId){
            setValueId(valueId);
            return this;
        }

        public QueryBuilder valueIdList(Long ... valueId){
            this.valueIdList = solveNullList(valueId);
            return this;
        }

        public QueryBuilder valueIdList(List<Long> valueId){
            this.valueIdList = valueId;
            return this;
        }

        public QueryBuilder fetchValueId(){
            setFetchFields("fetchFields","valueId");
            return this;
        }

        public QueryBuilder excludeValueId(){
            setFetchFields("excludeFields","valueId");
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

        public PmsSkuAttrValue build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> attrIdList;

        public List<Long> getAttrIdList(){return this.attrIdList;}

        private Long attrIdSt;

        private Long attrIdEd;

        public Long getAttrIdSt(){return this.attrIdSt;}

        public Long getAttrIdEd(){return this.attrIdEd;}

        private List<Long> valueIdList;

        public List<Long> getValueIdList(){return this.valueIdList;}

        private Long valueIdSt;

        private Long valueIdEd;

        public Long getValueIdSt(){return this.valueIdSt;}

        public Long getValueIdEd(){return this.valueIdEd;}

        private List<Long> skuIdList;

        public List<Long> getSkuIdList(){return this.skuIdList;}

        private Long skuIdSt;

        private Long skuIdEd;

        public Long getSkuIdSt(){return this.skuIdSt;}

        public Long getSkuIdEd(){return this.skuIdEd;}


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

        public ConditionBuilder valueIdBetWeen(Long valueIdSt,Long valueIdEd){
            this.valueIdSt = valueIdSt;
            this.valueIdEd = valueIdEd;
            return this;
        }

        public ConditionBuilder valueIdGreaterEqThan(Long valueIdSt){
            this.valueIdSt = valueIdSt;
            return this;
        }
        public ConditionBuilder valueIdLessEqThan(Long valueIdEd){
            this.valueIdEd = valueIdEd;
            return this;
        }


        public ConditionBuilder valueIdList(Long ... valueId){
            this.valueIdList = solveNullList(valueId);
            return this;
        }

        public ConditionBuilder valueIdList(List<Long> valueId){
            this.valueIdList = valueId;
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

        private PmsSkuAttrValue obj;

        public Builder(){
            this.obj = new PmsSkuAttrValue();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder attrId(Long attrId){
            this.obj.setAttrId(attrId);
            return this;
        }
        public Builder valueId(Long valueId){
            this.obj.setValueId(valueId);
            return this;
        }
        public Builder skuId(Long skuId){
            this.obj.setSkuId(skuId);
            return this;
        }
        public PmsSkuAttrValue build(){return obj;}
    }

}
