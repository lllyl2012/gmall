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
public class PmsBaseCatalog2 implements Serializable {

    private static final long serialVersionUID = 1573824718000L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Integer id;

    /**
    * 二级分类名称
    * isNullAble:0
    */
    private String name;

    /**
    * 一级分类编号
    * isNullAble:1
    */
    private Integer catalog1Id;

    private List<PmsBaseCatalog3> catalog3List;

    public List<PmsBaseCatalog3> getCatalog3List() {
        return catalog3List;
    }

    public void setCatalog3List(List<PmsBaseCatalog3> catalog3List) {
        this.catalog3List = catalog3List;
    }

    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setCatalog1Id(Integer catalog1Id){this.catalog1Id = catalog1Id;}

    public Integer getCatalog1Id(){return this.catalog1Id;}
    @Override
    public String toString() {
        return "PmsBaseCatalog2{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "catalog1Id='" + catalog1Id + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsBaseCatalog2 set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsBaseCatalog2 set){
            this.set = set;
            return this;
        }

        public PmsBaseCatalog2 getSet(){
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

    public static class QueryBuilder extends PmsBaseCatalog2{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> catalog1IdList;

        public List<Integer> getCatalog1IdList(){return this.catalog1IdList;}

        private Integer catalog1IdSt;

        private Integer catalog1IdEd;

        public Integer getCatalog1IdSt(){return this.catalog1IdSt;}

        public Integer getCatalog1IdEd(){return this.catalog1IdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
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

        public QueryBuilder catalog1IdBetWeen(Integer catalog1IdSt,Integer catalog1IdEd){
            this.catalog1IdSt = catalog1IdSt;
            this.catalog1IdEd = catalog1IdEd;
            return this;
        }

        public QueryBuilder catalog1IdGreaterEqThan(Integer catalog1IdSt){
            this.catalog1IdSt = catalog1IdSt;
            return this;
        }
        public QueryBuilder catalog1IdLessEqThan(Integer catalog1IdEd){
            this.catalog1IdEd = catalog1IdEd;
            return this;
        }


        public QueryBuilder catalog1Id(Integer catalog1Id){
            setCatalog1Id(catalog1Id);
            return this;
        }

        public QueryBuilder catalog1IdList(Integer ... catalog1Id){
            this.catalog1IdList = solveNullList(catalog1Id);
            return this;
        }

        public QueryBuilder catalog1IdList(List<Integer> catalog1Id){
            this.catalog1IdList = catalog1Id;
            return this;
        }

        public QueryBuilder fetchCatalog1Id(){
            setFetchFields("fetchFields","catalog1Id");
            return this;
        }

        public QueryBuilder excludeCatalog1Id(){
            setFetchFields("excludeFields","catalog1Id");
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

        public PmsBaseCatalog2 build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> catalog1IdList;

        public List<Integer> getCatalog1IdList(){return this.catalog1IdList;}

        private Integer catalog1IdSt;

        private Integer catalog1IdEd;

        public Integer getCatalog1IdSt(){return this.catalog1IdSt;}

        public Integer getCatalog1IdEd(){return this.catalog1IdEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
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

        public ConditionBuilder catalog1IdBetWeen(Integer catalog1IdSt,Integer catalog1IdEd){
            this.catalog1IdSt = catalog1IdSt;
            this.catalog1IdEd = catalog1IdEd;
            return this;
        }

        public ConditionBuilder catalog1IdGreaterEqThan(Integer catalog1IdSt){
            this.catalog1IdSt = catalog1IdSt;
            return this;
        }
        public ConditionBuilder catalog1IdLessEqThan(Integer catalog1IdEd){
            this.catalog1IdEd = catalog1IdEd;
            return this;
        }


        public ConditionBuilder catalog1IdList(Integer ... catalog1Id){
            this.catalog1IdList = solveNullList(catalog1Id);
            return this;
        }

        public ConditionBuilder catalog1IdList(List<Integer> catalog1Id){
            this.catalog1IdList = catalog1Id;
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

        private PmsBaseCatalog2 obj;

        public Builder(){
            this.obj = new PmsBaseCatalog2();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder catalog1Id(Integer catalog1Id){
            this.obj.setCatalog1Id(catalog1Id);
            return this;
        }
        public PmsBaseCatalog2 build(){return obj;}
    }

}
