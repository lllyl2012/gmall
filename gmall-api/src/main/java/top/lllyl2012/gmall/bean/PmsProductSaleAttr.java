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
public class PmsProductSaleAttr implements Serializable {

    private static final long serialVersionUID = 1574078570041L;


    /**
    * 主键
    * id
    * isNullAble:0
    */
    private Long id;

    /**
    * 商品id
    * isNullAble:1
    */
    private Long productId;

    /**
    * 销售属性id
    * isNullAble:1
    */
    private Long saleAttrId;

    /**
    * 销售属性名称(冗余)
    * isNullAble:1
    */
    private String saleAttrName;

    private List<PmsProductSaleAttrValue> spuSaleAttrValueList;

    public List<PmsProductSaleAttrValue> getSpuSaleAttrValueList() {
        return spuSaleAttrValueList;
    }

    public void setSpuSaleAttrValueList(List<PmsProductSaleAttrValue> spuSaleAttrValueList) {
        this.spuSaleAttrValueList = spuSaleAttrValueList;
    }

    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProductId(Long productId){this.productId = productId;}

    public Long getProductId(){return this.productId;}

    public void setSaleAttrId(Long saleAttrId){this.saleAttrId = saleAttrId;}

    public Long getSaleAttrId(){return this.saleAttrId;}

    public void setSaleAttrName(String saleAttrName){this.saleAttrName = saleAttrName;}

    public String getSaleAttrName(){return this.saleAttrName;}
    @Override
    public String toString() {
        return "PmsProductSaleAttr{" +
                "id='" + id + '\'' +
                "productId='" + productId + '\'' +
                "saleAttrId='" + saleAttrId + '\'' +
                "saleAttrName='" + saleAttrName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsProductSaleAttr set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsProductSaleAttr set){
            this.set = set;
            return this;
        }

        public PmsProductSaleAttr getSet(){
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

    public static class QueryBuilder extends PmsProductSaleAttr{
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

        private List<Long> saleAttrIdList;

        public List<Long> getSaleAttrIdList(){return this.saleAttrIdList;}

        private Long saleAttrIdSt;

        private Long saleAttrIdEd;

        public Long getSaleAttrIdSt(){return this.saleAttrIdSt;}

        public Long getSaleAttrIdEd(){return this.saleAttrIdEd;}

        private List<String> saleAttrNameList;

        public List<String> getSaleAttrNameList(){return this.saleAttrNameList;}


        private List<String> fuzzySaleAttrName;

        public List<String> getFuzzySaleAttrName(){return this.fuzzySaleAttrName;}

        private List<String> rightFuzzySaleAttrName;

        public List<String> getRightFuzzySaleAttrName(){return this.rightFuzzySaleAttrName;}
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

        public PmsProductSaleAttr build(){return this;}
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

        private List<Long> saleAttrIdList;

        public List<Long> getSaleAttrIdList(){return this.saleAttrIdList;}

        private Long saleAttrIdSt;

        private Long saleAttrIdEd;

        public Long getSaleAttrIdSt(){return this.saleAttrIdSt;}

        public Long getSaleAttrIdEd(){return this.saleAttrIdEd;}

        private List<String> saleAttrNameList;

        public List<String> getSaleAttrNameList(){return this.saleAttrNameList;}


        private List<String> fuzzySaleAttrName;

        public List<String> getFuzzySaleAttrName(){return this.fuzzySaleAttrName;}

        private List<String> rightFuzzySaleAttrName;

        public List<String> getRightFuzzySaleAttrName(){return this.rightFuzzySaleAttrName;}

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

        private PmsProductSaleAttr obj;

        public Builder(){
            this.obj = new PmsProductSaleAttr();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder productId(Long productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder saleAttrId(Long saleAttrId){
            this.obj.setSaleAttrId(saleAttrId);
            return this;
        }
        public Builder saleAttrName(String saleAttrName){
            this.obj.setSaleAttrName(saleAttrName);
            return this;
        }
        public PmsProductSaleAttr build(){return obj;}
    }

}
