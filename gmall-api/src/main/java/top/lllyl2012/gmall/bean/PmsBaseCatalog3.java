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
public class PmsBaseCatalog3 implements Serializable {

    private static final long serialVersionUID = 1573824719983L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * 三级分类名称
    * isNullAble:0
    */
    private String name;

    /**
    * 二级分类编号
    * isNullAble:1
    */
    private Long catalog2Id;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setCatalog2Id(Long catalog2Id){this.catalog2Id = catalog2Id;}

    public Long getCatalog2Id(){return this.catalog2Id;}
    @Override
    public String toString() {
        return "PmsBaseCatalog3{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "catalog2Id='" + catalog2Id + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsBaseCatalog3 set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsBaseCatalog3 set){
            this.set = set;
            return this;
        }

        public PmsBaseCatalog3 getSet(){
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

    public static class QueryBuilder extends PmsBaseCatalog3{
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

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Long> catalog2IdList;

        public List<Long> getCatalog2IdList(){return this.catalog2IdList;}

        private Long catalog2IdSt;

        private Long catalog2IdEd;

        public Long getCatalog2IdSt(){return this.catalog2IdSt;}

        public Long getCatalog2IdEd(){return this.catalog2IdEd;}

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

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder catalog2IdBetWeen(Long catalog2IdSt,Long catalog2IdEd){
            this.catalog2IdSt = catalog2IdSt;
            this.catalog2IdEd = catalog2IdEd;
            return this;
        }

        public QueryBuilder catalog2IdGreaterEqThan(Long catalog2IdSt){
            this.catalog2IdSt = catalog2IdSt;
            return this;
        }
        public QueryBuilder catalog2IdLessEqThan(Long catalog2IdEd){
            this.catalog2IdEd = catalog2IdEd;
            return this;
        }


        public QueryBuilder catalog2Id(Long catalog2Id){
            setCatalog2Id(catalog2Id);
            return this;
        }

        public QueryBuilder catalog2IdList(Long ... catalog2Id){
            this.catalog2IdList = solveNullList(catalog2Id);
            return this;
        }

        public QueryBuilder catalog2IdList(List<Long> catalog2Id){
            this.catalog2IdList = catalog2Id;
            return this;
        }

        public QueryBuilder fetchCatalog2Id(){
            setFetchFields("fetchFields","catalog2Id");
            return this;
        }

        public QueryBuilder excludeCatalog2Id(){
            setFetchFields("excludeFields","catalog2Id");
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

        public PmsBaseCatalog3 build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Long> catalog2IdList;

        public List<Long> getCatalog2IdList(){return this.catalog2IdList;}

        private Long catalog2IdSt;

        private Long catalog2IdEd;

        public Long getCatalog2IdSt(){return this.catalog2IdSt;}

        public Long getCatalog2IdEd(){return this.catalog2IdEd;}


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

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder catalog2IdBetWeen(Long catalog2IdSt,Long catalog2IdEd){
            this.catalog2IdSt = catalog2IdSt;
            this.catalog2IdEd = catalog2IdEd;
            return this;
        }

        public ConditionBuilder catalog2IdGreaterEqThan(Long catalog2IdSt){
            this.catalog2IdSt = catalog2IdSt;
            return this;
        }
        public ConditionBuilder catalog2IdLessEqThan(Long catalog2IdEd){
            this.catalog2IdEd = catalog2IdEd;
            return this;
        }


        public ConditionBuilder catalog2IdList(Long ... catalog2Id){
            this.catalog2IdList = solveNullList(catalog2Id);
            return this;
        }

        public ConditionBuilder catalog2IdList(List<Long> catalog2Id){
            this.catalog2IdList = catalog2Id;
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

        private PmsBaseCatalog3 obj;

        public Builder(){
            this.obj = new PmsBaseCatalog3();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder catalog2Id(Long catalog2Id){
            this.obj.setCatalog2Id(catalog2Id);
            return this;
        }
        public PmsBaseCatalog3 build(){return obj;}
    }

}
