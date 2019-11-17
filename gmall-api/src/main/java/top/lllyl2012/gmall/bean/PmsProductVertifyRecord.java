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
public class PmsProductVertifyRecord implements Serializable {

    private static final long serialVersionUID = 1573991720080L;


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
    private java.time.LocalDateTime createTime;

    /**
    * 审核人
    * isNullAble:1
    */
    private String vertifyMan;

    /**
    * 
    * isNullAble:1
    */
    private Integer status;

    /**
    * 反馈详情
    * isNullAble:1
    */
    private String detail;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProductId(Long productId){this.productId = productId;}

    public Long getProductId(){return this.productId;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setVertifyMan(String vertifyMan){this.vertifyMan = vertifyMan;}

    public String getVertifyMan(){return this.vertifyMan;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setDetail(String detail){this.detail = detail;}

    public String getDetail(){return this.detail;}
    @Override
    public String toString() {
        return "PmsProductVertifyRecord{" +
                "id='" + id + '\'' +
                "productId='" + productId + '\'' +
                "createTime='" + createTime + '\'' +
                "vertifyMan='" + vertifyMan + '\'' +
                "status='" + status + '\'' +
                "detail='" + detail + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsProductVertifyRecord set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsProductVertifyRecord set){
            this.set = set;
            return this;
        }

        public PmsProductVertifyRecord getSet(){
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

    public static class QueryBuilder extends PmsProductVertifyRecord{
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

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> vertifyManList;

        public List<String> getVertifyManList(){return this.vertifyManList;}


        private List<String> fuzzyVertifyMan;

        public List<String> getFuzzyVertifyMan(){return this.fuzzyVertifyMan;}

        private List<String> rightFuzzyVertifyMan;

        public List<String> getRightFuzzyVertifyMan(){return this.rightFuzzyVertifyMan;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<String> detailList;

        public List<String> getDetailList(){return this.detailList;}


        private List<String> fuzzyDetail;

        public List<String> getFuzzyDetail(){return this.fuzzyDetail;}

        private List<String> rightFuzzyDetail;

        public List<String> getRightFuzzyDetail(){return this.rightFuzzyDetail;}
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

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder fuzzyVertifyMan (List<String> fuzzyVertifyMan){
            this.fuzzyVertifyMan = fuzzyVertifyMan;
            return this;
        }

        public QueryBuilder fuzzyVertifyMan (String ... fuzzyVertifyMan){
            this.fuzzyVertifyMan = solveNullList(fuzzyVertifyMan);
            return this;
        }

        public QueryBuilder rightFuzzyVertifyMan (List<String> rightFuzzyVertifyMan){
            this.rightFuzzyVertifyMan = rightFuzzyVertifyMan;
            return this;
        }

        public QueryBuilder rightFuzzyVertifyMan (String ... rightFuzzyVertifyMan){
            this.rightFuzzyVertifyMan = solveNullList(rightFuzzyVertifyMan);
            return this;
        }

        public QueryBuilder vertifyMan(String vertifyMan){
            setVertifyMan(vertifyMan);
            return this;
        }

        public QueryBuilder vertifyManList(String ... vertifyMan){
            this.vertifyManList = solveNullList(vertifyMan);
            return this;
        }

        public QueryBuilder vertifyManList(List<String> vertifyMan){
            this.vertifyManList = vertifyMan;
            return this;
        }

        public QueryBuilder fetchVertifyMan(){
            setFetchFields("fetchFields","vertifyMan");
            return this;
        }

        public QueryBuilder excludeVertifyMan(){
            setFetchFields("excludeFields","vertifyMan");
            return this;
        }

        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder fuzzyDetail (List<String> fuzzyDetail){
            this.fuzzyDetail = fuzzyDetail;
            return this;
        }

        public QueryBuilder fuzzyDetail (String ... fuzzyDetail){
            this.fuzzyDetail = solveNullList(fuzzyDetail);
            return this;
        }

        public QueryBuilder rightFuzzyDetail (List<String> rightFuzzyDetail){
            this.rightFuzzyDetail = rightFuzzyDetail;
            return this;
        }

        public QueryBuilder rightFuzzyDetail (String ... rightFuzzyDetail){
            this.rightFuzzyDetail = solveNullList(rightFuzzyDetail);
            return this;
        }

        public QueryBuilder detail(String detail){
            setDetail(detail);
            return this;
        }

        public QueryBuilder detailList(String ... detail){
            this.detailList = solveNullList(detail);
            return this;
        }

        public QueryBuilder detailList(List<String> detail){
            this.detailList = detail;
            return this;
        }

        public QueryBuilder fetchDetail(){
            setFetchFields("fetchFields","detail");
            return this;
        }

        public QueryBuilder excludeDetail(){
            setFetchFields("excludeFields","detail");
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

        public PmsProductVertifyRecord build(){return this;}
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

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> vertifyManList;

        public List<String> getVertifyManList(){return this.vertifyManList;}


        private List<String> fuzzyVertifyMan;

        public List<String> getFuzzyVertifyMan(){return this.fuzzyVertifyMan;}

        private List<String> rightFuzzyVertifyMan;

        public List<String> getRightFuzzyVertifyMan(){return this.rightFuzzyVertifyMan;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<String> detailList;

        public List<String> getDetailList(){return this.detailList;}


        private List<String> fuzzyDetail;

        public List<String> getFuzzyDetail(){return this.fuzzyDetail;}

        private List<String> rightFuzzyDetail;

        public List<String> getRightFuzzyDetail(){return this.rightFuzzyDetail;}

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

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder fuzzyVertifyMan (List<String> fuzzyVertifyMan){
            this.fuzzyVertifyMan = fuzzyVertifyMan;
            return this;
        }

        public ConditionBuilder fuzzyVertifyMan (String ... fuzzyVertifyMan){
            this.fuzzyVertifyMan = solveNullList(fuzzyVertifyMan);
            return this;
        }

        public ConditionBuilder rightFuzzyVertifyMan (List<String> rightFuzzyVertifyMan){
            this.rightFuzzyVertifyMan = rightFuzzyVertifyMan;
            return this;
        }

        public ConditionBuilder rightFuzzyVertifyMan (String ... rightFuzzyVertifyMan){
            this.rightFuzzyVertifyMan = solveNullList(rightFuzzyVertifyMan);
            return this;
        }

        public ConditionBuilder vertifyManList(String ... vertifyMan){
            this.vertifyManList = solveNullList(vertifyMan);
            return this;
        }

        public ConditionBuilder vertifyManList(List<String> vertifyMan){
            this.vertifyManList = vertifyMan;
            return this;
        }

        public ConditionBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public ConditionBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public ConditionBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public ConditionBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder fuzzyDetail (List<String> fuzzyDetail){
            this.fuzzyDetail = fuzzyDetail;
            return this;
        }

        public ConditionBuilder fuzzyDetail (String ... fuzzyDetail){
            this.fuzzyDetail = solveNullList(fuzzyDetail);
            return this;
        }

        public ConditionBuilder rightFuzzyDetail (List<String> rightFuzzyDetail){
            this.rightFuzzyDetail = rightFuzzyDetail;
            return this;
        }

        public ConditionBuilder rightFuzzyDetail (String ... rightFuzzyDetail){
            this.rightFuzzyDetail = solveNullList(rightFuzzyDetail);
            return this;
        }

        public ConditionBuilder detailList(String ... detail){
            this.detailList = solveNullList(detail);
            return this;
        }

        public ConditionBuilder detailList(List<String> detail){
            this.detailList = detail;
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

        private PmsProductVertifyRecord obj;

        public Builder(){
            this.obj = new PmsProductVertifyRecord();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder productId(Long productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder vertifyMan(String vertifyMan){
            this.obj.setVertifyMan(vertifyMan);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder detail(String detail){
            this.obj.setDetail(detail);
            return this;
        }
        public PmsProductVertifyRecord build(){return obj;}
    }

}
