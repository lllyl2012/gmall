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
public class PmsSkuSaleAttrValue implements Serializable {

    private static final long serialVersionUID = 1573824750630L;


    /**
    * 主键
    * id
    * isNullAble:0
    */
    private Long id;

    /**
    * 库存单元id
    * isNullAble:1
    */
    private Long skuId;

    /**
    * 销售属性id（冗余)
    * isNullAble:1
    */
    private Long saleAttrId;

    /**
    * 销售属性值id
    * isNullAble:1
    */
    private Long saleAttrValueId;

    /**
    * 销售属性名称(冗余)
    * isNullAble:1
    */
    private String saleAttrName;

    /**
    * 销售属性值名称(冗余)
    * isNullAble:1
    */
    private String saleAttrValueName;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setSkuId(Long skuId){this.skuId = skuId;}

    public Long getSkuId(){return this.skuId;}

    public void setSaleAttrId(Long saleAttrId){this.saleAttrId = saleAttrId;}

    public Long getSaleAttrId(){return this.saleAttrId;}

    public void setSaleAttrValueId(Long saleAttrValueId){this.saleAttrValueId = saleAttrValueId;}

    public Long getSaleAttrValueId(){return this.saleAttrValueId;}

    public void setSaleAttrName(String saleAttrName){this.saleAttrName = saleAttrName;}

    public String getSaleAttrName(){return this.saleAttrName;}

    public void setSaleAttrValueName(String saleAttrValueName){this.saleAttrValueName = saleAttrValueName;}

    public String getSaleAttrValueName(){return this.saleAttrValueName;}
    @Override
    public String toString() {
        return "PmsSkuSaleAttrValue{" +
                "id='" + id + '\'' +
                "skuId='" + skuId + '\'' +
                "saleAttrId='" + saleAttrId + '\'' +
                "saleAttrValueId='" + saleAttrValueId + '\'' +
                "saleAttrName='" + saleAttrName + '\'' +
                "saleAttrValueName='" + saleAttrValueName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsSkuSaleAttrValue set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsSkuSaleAttrValue set){
            this.set = set;
            return this;
        }

        public PmsSkuSaleAttrValue getSet(){
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

    public static class QueryBuilder extends PmsSkuSaleAttrValue{
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

        private List<Long> saleAttrIdList;

        public List<Long> getSaleAttrIdList(){return this.saleAttrIdList;}

        private Long saleAttrIdSt;

        private Long saleAttrIdEd;

        public Long getSaleAttrIdSt(){return this.saleAttrIdSt;}

        public Long getSaleAttrIdEd(){return this.saleAttrIdEd;}

        private List<Long> saleAttrValueIdList;

        public List<Long> getSaleAttrValueIdList(){return this.saleAttrValueIdList;}

        private Long saleAttrValueIdSt;

        private Long saleAttrValueIdEd;

        public Long getSaleAttrValueIdSt(){return this.saleAttrValueIdSt;}

        public Long getSaleAttrValueIdEd(){return this.saleAttrValueIdEd;}

        private List<String> saleAttrNameList;

        public List<String> getSaleAttrNameList(){return this.saleAttrNameList;}


        private List<String> fuzzySaleAttrName;

        public List<String> getFuzzySaleAttrName(){return this.fuzzySaleAttrName;}

        private List<String> rightFuzzySaleAttrName;

        public List<String> getRightFuzzySaleAttrName(){return this.rightFuzzySaleAttrName;}
        private List<String> saleAttrValueNameList;

        public List<String> getSaleAttrValueNameList(){return this.saleAttrValueNameList;}


        private List<String> fuzzySaleAttrValueName;

        public List<String> getFuzzySaleAttrValueName(){return this.fuzzySaleAttrValueName;}

        private List<String> rightFuzzySaleAttrValueName;

        public List<String> getRightFuzzySaleAttrValueName(){return this.rightFuzzySaleAttrValueName;}
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

        public QueryBuilder saleAttrIdBetWeen(Long saleAttrIdSt,Long saleAttrIdEd){
            this.saleAttrIdSt = saleAttrIdSt;
            this.saleAttrIdEd = saleAttrIdEd;
            return this;
        }

        public QueryBuilder saleAttrIdGreaterEqThan(Long saleAttrIdSt){
            this.saleAttrIdSt = saleAttrIdSt;
            return this;
        }
        public QueryBuilder saleAttrIdLessEqThan(Long saleAttrIdEd){
            this.saleAttrIdEd = saleAttrIdEd;
            return this;
        }


        public QueryBuilder saleAttrId(Long saleAttrId){
            setSaleAttrId(saleAttrId);
            return this;
        }

        public QueryBuilder saleAttrIdList(Long ... saleAttrId){
            this.saleAttrIdList = solveNullList(saleAttrId);
            return this;
        }

        public QueryBuilder saleAttrIdList(List<Long> saleAttrId){
            this.saleAttrIdList = saleAttrId;
            return this;
        }

        public QueryBuilder fetchSaleAttrId(){
            setFetchFields("fetchFields","saleAttrId");
            return this;
        }

        public QueryBuilder excludeSaleAttrId(){
            setFetchFields("excludeFields","saleAttrId");
            return this;
        }

        public QueryBuilder saleAttrValueIdBetWeen(Long saleAttrValueIdSt,Long saleAttrValueIdEd){
            this.saleAttrValueIdSt = saleAttrValueIdSt;
            this.saleAttrValueIdEd = saleAttrValueIdEd;
            return this;
        }

        public QueryBuilder saleAttrValueIdGreaterEqThan(Long saleAttrValueIdSt){
            this.saleAttrValueIdSt = saleAttrValueIdSt;
            return this;
        }
        public QueryBuilder saleAttrValueIdLessEqThan(Long saleAttrValueIdEd){
            this.saleAttrValueIdEd = saleAttrValueIdEd;
            return this;
        }


        public QueryBuilder saleAttrValueId(Long saleAttrValueId){
            setSaleAttrValueId(saleAttrValueId);
            return this;
        }

        public QueryBuilder saleAttrValueIdList(Long ... saleAttrValueId){
            this.saleAttrValueIdList = solveNullList(saleAttrValueId);
            return this;
        }

        public QueryBuilder saleAttrValueIdList(List<Long> saleAttrValueId){
            this.saleAttrValueIdList = saleAttrValueId;
            return this;
        }

        public QueryBuilder fetchSaleAttrValueId(){
            setFetchFields("fetchFields","saleAttrValueId");
            return this;
        }

        public QueryBuilder excludeSaleAttrValueId(){
            setFetchFields("excludeFields","saleAttrValueId");
            return this;
        }

        public QueryBuilder fuzzySaleAttrName (List<String> fuzzySaleAttrName){
            this.fuzzySaleAttrName = fuzzySaleAttrName;
            return this;
        }

        public QueryBuilder fuzzySaleAttrName (String ... fuzzySaleAttrName){
            this.fuzzySaleAttrName = solveNullList(fuzzySaleAttrName);
            return this;
        }

        public QueryBuilder rightFuzzySaleAttrName (List<String> rightFuzzySaleAttrName){
            this.rightFuzzySaleAttrName = rightFuzzySaleAttrName;
            return this;
        }

        public QueryBuilder rightFuzzySaleAttrName (String ... rightFuzzySaleAttrName){
            this.rightFuzzySaleAttrName = solveNullList(rightFuzzySaleAttrName);
            return this;
        }

        public QueryBuilder saleAttrName(String saleAttrName){
            setSaleAttrName(saleAttrName);
            return this;
        }

        public QueryBuilder saleAttrNameList(String ... saleAttrName){
            this.saleAttrNameList = solveNullList(saleAttrName);
            return this;
        }

        public QueryBuilder saleAttrNameList(List<String> saleAttrName){
            this.saleAttrNameList = saleAttrName;
            return this;
        }

        public QueryBuilder fetchSaleAttrName(){
            setFetchFields("fetchFields","saleAttrName");
            return this;
        }

        public QueryBuilder excludeSaleAttrName(){
            setFetchFields("excludeFields","saleAttrName");
            return this;
        }

        public QueryBuilder fuzzySaleAttrValueName (List<String> fuzzySaleAttrValueName){
            this.fuzzySaleAttrValueName = fuzzySaleAttrValueName;
            return this;
        }

        public QueryBuilder fuzzySaleAttrValueName (String ... fuzzySaleAttrValueName){
            this.fuzzySaleAttrValueName = solveNullList(fuzzySaleAttrValueName);
            return this;
        }

        public QueryBuilder rightFuzzySaleAttrValueName (List<String> rightFuzzySaleAttrValueName){
            this.rightFuzzySaleAttrValueName = rightFuzzySaleAttrValueName;
            return this;
        }

        public QueryBuilder rightFuzzySaleAttrValueName (String ... rightFuzzySaleAttrValueName){
            this.rightFuzzySaleAttrValueName = solveNullList(rightFuzzySaleAttrValueName);
            return this;
        }

        public QueryBuilder saleAttrValueName(String saleAttrValueName){
            setSaleAttrValueName(saleAttrValueName);
            return this;
        }

        public QueryBuilder saleAttrValueNameList(String ... saleAttrValueName){
            this.saleAttrValueNameList = solveNullList(saleAttrValueName);
            return this;
        }

        public QueryBuilder saleAttrValueNameList(List<String> saleAttrValueName){
            this.saleAttrValueNameList = saleAttrValueName;
            return this;
        }

        public QueryBuilder fetchSaleAttrValueName(){
            setFetchFields("fetchFields","saleAttrValueName");
            return this;
        }

        public QueryBuilder excludeSaleAttrValueName(){
            setFetchFields("excludeFields","saleAttrValueName");
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

        public PmsSkuSaleAttrValue build(){return this;}
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

        private List<Long> saleAttrIdList;

        public List<Long> getSaleAttrIdList(){return this.saleAttrIdList;}

        private Long saleAttrIdSt;

        private Long saleAttrIdEd;

        public Long getSaleAttrIdSt(){return this.saleAttrIdSt;}

        public Long getSaleAttrIdEd(){return this.saleAttrIdEd;}

        private List<Long> saleAttrValueIdList;

        public List<Long> getSaleAttrValueIdList(){return this.saleAttrValueIdList;}

        private Long saleAttrValueIdSt;

        private Long saleAttrValueIdEd;

        public Long getSaleAttrValueIdSt(){return this.saleAttrValueIdSt;}

        public Long getSaleAttrValueIdEd(){return this.saleAttrValueIdEd;}

        private List<String> saleAttrNameList;

        public List<String> getSaleAttrNameList(){return this.saleAttrNameList;}


        private List<String> fuzzySaleAttrName;

        public List<String> getFuzzySaleAttrName(){return this.fuzzySaleAttrName;}

        private List<String> rightFuzzySaleAttrName;

        public List<String> getRightFuzzySaleAttrName(){return this.rightFuzzySaleAttrName;}
        private List<String> saleAttrValueNameList;

        public List<String> getSaleAttrValueNameList(){return this.saleAttrValueNameList;}


        private List<String> fuzzySaleAttrValueName;

        public List<String> getFuzzySaleAttrValueName(){return this.fuzzySaleAttrValueName;}

        private List<String> rightFuzzySaleAttrValueName;

        public List<String> getRightFuzzySaleAttrValueName(){return this.rightFuzzySaleAttrValueName;}

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

        public ConditionBuilder saleAttrIdBetWeen(Long saleAttrIdSt,Long saleAttrIdEd){
            this.saleAttrIdSt = saleAttrIdSt;
            this.saleAttrIdEd = saleAttrIdEd;
            return this;
        }

        public ConditionBuilder saleAttrIdGreaterEqThan(Long saleAttrIdSt){
            this.saleAttrIdSt = saleAttrIdSt;
            return this;
        }
        public ConditionBuilder saleAttrIdLessEqThan(Long saleAttrIdEd){
            this.saleAttrIdEd = saleAttrIdEd;
            return this;
        }


        public ConditionBuilder saleAttrIdList(Long ... saleAttrId){
            this.saleAttrIdList = solveNullList(saleAttrId);
            return this;
        }

        public ConditionBuilder saleAttrIdList(List<Long> saleAttrId){
            this.saleAttrIdList = saleAttrId;
            return this;
        }

        public ConditionBuilder saleAttrValueIdBetWeen(Long saleAttrValueIdSt,Long saleAttrValueIdEd){
            this.saleAttrValueIdSt = saleAttrValueIdSt;
            this.saleAttrValueIdEd = saleAttrValueIdEd;
            return this;
        }

        public ConditionBuilder saleAttrValueIdGreaterEqThan(Long saleAttrValueIdSt){
            this.saleAttrValueIdSt = saleAttrValueIdSt;
            return this;
        }
        public ConditionBuilder saleAttrValueIdLessEqThan(Long saleAttrValueIdEd){
            this.saleAttrValueIdEd = saleAttrValueIdEd;
            return this;
        }


        public ConditionBuilder saleAttrValueIdList(Long ... saleAttrValueId){
            this.saleAttrValueIdList = solveNullList(saleAttrValueId);
            return this;
        }

        public ConditionBuilder saleAttrValueIdList(List<Long> saleAttrValueId){
            this.saleAttrValueIdList = saleAttrValueId;
            return this;
        }

        public ConditionBuilder fuzzySaleAttrName (List<String> fuzzySaleAttrName){
            this.fuzzySaleAttrName = fuzzySaleAttrName;
            return this;
        }

        public ConditionBuilder fuzzySaleAttrName (String ... fuzzySaleAttrName){
            this.fuzzySaleAttrName = solveNullList(fuzzySaleAttrName);
            return this;
        }

        public ConditionBuilder rightFuzzySaleAttrName (List<String> rightFuzzySaleAttrName){
            this.rightFuzzySaleAttrName = rightFuzzySaleAttrName;
            return this;
        }

        public ConditionBuilder rightFuzzySaleAttrName (String ... rightFuzzySaleAttrName){
            this.rightFuzzySaleAttrName = solveNullList(rightFuzzySaleAttrName);
            return this;
        }

        public ConditionBuilder saleAttrNameList(String ... saleAttrName){
            this.saleAttrNameList = solveNullList(saleAttrName);
            return this;
        }

        public ConditionBuilder saleAttrNameList(List<String> saleAttrName){
            this.saleAttrNameList = saleAttrName;
            return this;
        }

        public ConditionBuilder fuzzySaleAttrValueName (List<String> fuzzySaleAttrValueName){
            this.fuzzySaleAttrValueName = fuzzySaleAttrValueName;
            return this;
        }

        public ConditionBuilder fuzzySaleAttrValueName (String ... fuzzySaleAttrValueName){
            this.fuzzySaleAttrValueName = solveNullList(fuzzySaleAttrValueName);
            return this;
        }

        public ConditionBuilder rightFuzzySaleAttrValueName (List<String> rightFuzzySaleAttrValueName){
            this.rightFuzzySaleAttrValueName = rightFuzzySaleAttrValueName;
            return this;
        }

        public ConditionBuilder rightFuzzySaleAttrValueName (String ... rightFuzzySaleAttrValueName){
            this.rightFuzzySaleAttrValueName = solveNullList(rightFuzzySaleAttrValueName);
            return this;
        }

        public ConditionBuilder saleAttrValueNameList(String ... saleAttrValueName){
            this.saleAttrValueNameList = solveNullList(saleAttrValueName);
            return this;
        }

        public ConditionBuilder saleAttrValueNameList(List<String> saleAttrValueName){
            this.saleAttrValueNameList = saleAttrValueName;
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

        private PmsSkuSaleAttrValue obj;

        public Builder(){
            this.obj = new PmsSkuSaleAttrValue();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder skuId(Long skuId){
            this.obj.setSkuId(skuId);
            return this;
        }
        public Builder saleAttrId(Long saleAttrId){
            this.obj.setSaleAttrId(saleAttrId);
            return this;
        }
        public Builder saleAttrValueId(Long saleAttrValueId){
            this.obj.setSaleAttrValueId(saleAttrValueId);
            return this;
        }
        public Builder saleAttrName(String saleAttrName){
            this.obj.setSaleAttrName(saleAttrName);
            return this;
        }
        public Builder saleAttrValueName(String saleAttrValueName){
            this.obj.setSaleAttrValueName(saleAttrValueName);
            return this;
        }
        public PmsSkuSaleAttrValue build(){return obj;}
    }

}
