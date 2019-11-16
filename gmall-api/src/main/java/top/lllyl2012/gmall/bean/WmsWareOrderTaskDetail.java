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
public class WmsWareOrderTaskDetail implements Serializable {

    private static final long serialVersionUID = 1573824759902L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * sku_id
    * isNullAble:1
    */
    private Long skuId;

    /**
    * sku名称
    * isNullAble:1
    */
    private String skuName;

    /**
    * 购买个数
    * isNullAble:1
    */
    private Integer skuNums;

    /**
    * 工作单编号
    * isNullAble:1
    */
    private Long taskId;

    /**
    * 
    * isNullAble:1
    */
    private Integer skuNum;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setSkuId(Long skuId){this.skuId = skuId;}

    public Long getSkuId(){return this.skuId;}

    public void setSkuName(String skuName){this.skuName = skuName;}

    public String getSkuName(){return this.skuName;}

    public void setSkuNums(Integer skuNums){this.skuNums = skuNums;}

    public Integer getSkuNums(){return this.skuNums;}

    public void setTaskId(Long taskId){this.taskId = taskId;}

    public Long getTaskId(){return this.taskId;}

    public void setSkuNum(Integer skuNum){this.skuNum = skuNum;}

    public Integer getSkuNum(){return this.skuNum;}
    @Override
    public String toString() {
        return "WmsWareOrderTaskDetail{" +
                "id='" + id + '\'' +
                "skuId='" + skuId + '\'' +
                "skuName='" + skuName + '\'' +
                "skuNums='" + skuNums + '\'' +
                "taskId='" + taskId + '\'' +
                "skuNum='" + skuNum + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private WmsWareOrderTaskDetail set;

        private ConditionBuilder where;

        public UpdateBuilder set(WmsWareOrderTaskDetail set){
            this.set = set;
            return this;
        }

        public WmsWareOrderTaskDetail getSet(){
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

    public static class QueryBuilder extends WmsWareOrderTaskDetail{
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

        private List<String> skuNameList;

        public List<String> getSkuNameList(){return this.skuNameList;}


        private List<String> fuzzySkuName;

        public List<String> getFuzzySkuName(){return this.fuzzySkuName;}

        private List<String> rightFuzzySkuName;

        public List<String> getRightFuzzySkuName(){return this.rightFuzzySkuName;}
        private List<Integer> skuNumsList;

        public List<Integer> getSkuNumsList(){return this.skuNumsList;}

        private Integer skuNumsSt;

        private Integer skuNumsEd;

        public Integer getSkuNumsSt(){return this.skuNumsSt;}

        public Integer getSkuNumsEd(){return this.skuNumsEd;}

        private List<Long> taskIdList;

        public List<Long> getTaskIdList(){return this.taskIdList;}

        private Long taskIdSt;

        private Long taskIdEd;

        public Long getTaskIdSt(){return this.taskIdSt;}

        public Long getTaskIdEd(){return this.taskIdEd;}

        private List<Integer> skuNumList;

        public List<Integer> getSkuNumList(){return this.skuNumList;}

        private Integer skuNumSt;

        private Integer skuNumEd;

        public Integer getSkuNumSt(){return this.skuNumSt;}

        public Integer getSkuNumEd(){return this.skuNumEd;}

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

        public QueryBuilder skuNumsBetWeen(Integer skuNumsSt,Integer skuNumsEd){
            this.skuNumsSt = skuNumsSt;
            this.skuNumsEd = skuNumsEd;
            return this;
        }

        public QueryBuilder skuNumsGreaterEqThan(Integer skuNumsSt){
            this.skuNumsSt = skuNumsSt;
            return this;
        }
        public QueryBuilder skuNumsLessEqThan(Integer skuNumsEd){
            this.skuNumsEd = skuNumsEd;
            return this;
        }


        public QueryBuilder skuNums(Integer skuNums){
            setSkuNums(skuNums);
            return this;
        }

        public QueryBuilder skuNumsList(Integer ... skuNums){
            this.skuNumsList = solveNullList(skuNums);
            return this;
        }

        public QueryBuilder skuNumsList(List<Integer> skuNums){
            this.skuNumsList = skuNums;
            return this;
        }

        public QueryBuilder fetchSkuNums(){
            setFetchFields("fetchFields","skuNums");
            return this;
        }

        public QueryBuilder excludeSkuNums(){
            setFetchFields("excludeFields","skuNums");
            return this;
        }

        public QueryBuilder taskIdBetWeen(Long taskIdSt,Long taskIdEd){
            this.taskIdSt = taskIdSt;
            this.taskIdEd = taskIdEd;
            return this;
        }

        public QueryBuilder taskIdGreaterEqThan(Long taskIdSt){
            this.taskIdSt = taskIdSt;
            return this;
        }
        public QueryBuilder taskIdLessEqThan(Long taskIdEd){
            this.taskIdEd = taskIdEd;
            return this;
        }


        public QueryBuilder taskId(Long taskId){
            setTaskId(taskId);
            return this;
        }

        public QueryBuilder taskIdList(Long ... taskId){
            this.taskIdList = solveNullList(taskId);
            return this;
        }

        public QueryBuilder taskIdList(List<Long> taskId){
            this.taskIdList = taskId;
            return this;
        }

        public QueryBuilder fetchTaskId(){
            setFetchFields("fetchFields","taskId");
            return this;
        }

        public QueryBuilder excludeTaskId(){
            setFetchFields("excludeFields","taskId");
            return this;
        }

        public QueryBuilder skuNumBetWeen(Integer skuNumSt,Integer skuNumEd){
            this.skuNumSt = skuNumSt;
            this.skuNumEd = skuNumEd;
            return this;
        }

        public QueryBuilder skuNumGreaterEqThan(Integer skuNumSt){
            this.skuNumSt = skuNumSt;
            return this;
        }
        public QueryBuilder skuNumLessEqThan(Integer skuNumEd){
            this.skuNumEd = skuNumEd;
            return this;
        }


        public QueryBuilder skuNum(Integer skuNum){
            setSkuNum(skuNum);
            return this;
        }

        public QueryBuilder skuNumList(Integer ... skuNum){
            this.skuNumList = solveNullList(skuNum);
            return this;
        }

        public QueryBuilder skuNumList(List<Integer> skuNum){
            this.skuNumList = skuNum;
            return this;
        }

        public QueryBuilder fetchSkuNum(){
            setFetchFields("fetchFields","skuNum");
            return this;
        }

        public QueryBuilder excludeSkuNum(){
            setFetchFields("excludeFields","skuNum");
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

        public WmsWareOrderTaskDetail build(){return this;}
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

        private List<String> skuNameList;

        public List<String> getSkuNameList(){return this.skuNameList;}


        private List<String> fuzzySkuName;

        public List<String> getFuzzySkuName(){return this.fuzzySkuName;}

        private List<String> rightFuzzySkuName;

        public List<String> getRightFuzzySkuName(){return this.rightFuzzySkuName;}
        private List<Integer> skuNumsList;

        public List<Integer> getSkuNumsList(){return this.skuNumsList;}

        private Integer skuNumsSt;

        private Integer skuNumsEd;

        public Integer getSkuNumsSt(){return this.skuNumsSt;}

        public Integer getSkuNumsEd(){return this.skuNumsEd;}

        private List<Long> taskIdList;

        public List<Long> getTaskIdList(){return this.taskIdList;}

        private Long taskIdSt;

        private Long taskIdEd;

        public Long getTaskIdSt(){return this.taskIdSt;}

        public Long getTaskIdEd(){return this.taskIdEd;}

        private List<Integer> skuNumList;

        public List<Integer> getSkuNumList(){return this.skuNumList;}

        private Integer skuNumSt;

        private Integer skuNumEd;

        public Integer getSkuNumSt(){return this.skuNumSt;}

        public Integer getSkuNumEd(){return this.skuNumEd;}


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

        public ConditionBuilder skuNumsBetWeen(Integer skuNumsSt,Integer skuNumsEd){
            this.skuNumsSt = skuNumsSt;
            this.skuNumsEd = skuNumsEd;
            return this;
        }

        public ConditionBuilder skuNumsGreaterEqThan(Integer skuNumsSt){
            this.skuNumsSt = skuNumsSt;
            return this;
        }
        public ConditionBuilder skuNumsLessEqThan(Integer skuNumsEd){
            this.skuNumsEd = skuNumsEd;
            return this;
        }


        public ConditionBuilder skuNumsList(Integer ... skuNums){
            this.skuNumsList = solveNullList(skuNums);
            return this;
        }

        public ConditionBuilder skuNumsList(List<Integer> skuNums){
            this.skuNumsList = skuNums;
            return this;
        }

        public ConditionBuilder taskIdBetWeen(Long taskIdSt,Long taskIdEd){
            this.taskIdSt = taskIdSt;
            this.taskIdEd = taskIdEd;
            return this;
        }

        public ConditionBuilder taskIdGreaterEqThan(Long taskIdSt){
            this.taskIdSt = taskIdSt;
            return this;
        }
        public ConditionBuilder taskIdLessEqThan(Long taskIdEd){
            this.taskIdEd = taskIdEd;
            return this;
        }


        public ConditionBuilder taskIdList(Long ... taskId){
            this.taskIdList = solveNullList(taskId);
            return this;
        }

        public ConditionBuilder taskIdList(List<Long> taskId){
            this.taskIdList = taskId;
            return this;
        }

        public ConditionBuilder skuNumBetWeen(Integer skuNumSt,Integer skuNumEd){
            this.skuNumSt = skuNumSt;
            this.skuNumEd = skuNumEd;
            return this;
        }

        public ConditionBuilder skuNumGreaterEqThan(Integer skuNumSt){
            this.skuNumSt = skuNumSt;
            return this;
        }
        public ConditionBuilder skuNumLessEqThan(Integer skuNumEd){
            this.skuNumEd = skuNumEd;
            return this;
        }


        public ConditionBuilder skuNumList(Integer ... skuNum){
            this.skuNumList = solveNullList(skuNum);
            return this;
        }

        public ConditionBuilder skuNumList(List<Integer> skuNum){
            this.skuNumList = skuNum;
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

        private WmsWareOrderTaskDetail obj;

        public Builder(){
            this.obj = new WmsWareOrderTaskDetail();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder skuId(Long skuId){
            this.obj.setSkuId(skuId);
            return this;
        }
        public Builder skuName(String skuName){
            this.obj.setSkuName(skuName);
            return this;
        }
        public Builder skuNums(Integer skuNums){
            this.obj.setSkuNums(skuNums);
            return this;
        }
        public Builder taskId(Long taskId){
            this.obj.setTaskId(taskId);
            return this;
        }
        public Builder skuNum(Integer skuNum){
            this.obj.setSkuNum(skuNum);
            return this;
        }
        public WmsWareOrderTaskDetail build(){return obj;}
    }

}
