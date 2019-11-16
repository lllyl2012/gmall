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
public class WmsWareSku implements Serializable {

    private static final long serialVersionUID = 1573824762375L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * skuid
    * isNullAble:1
    */
    private Long skuId;

    /**
    * 仓库id
    * isNullAble:1
    */
    private Long warehouseId;

    /**
    * 库存数
    * isNullAble:1,defaultVal:0
    */
    private Integer stock;

    /**
    * 存货名称
    * isNullAble:1
    */
    private String stockName;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer stockLocked;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setSkuId(Long skuId){this.skuId = skuId;}

    public Long getSkuId(){return this.skuId;}

    public void setWarehouseId(Long warehouseId){this.warehouseId = warehouseId;}

    public Long getWarehouseId(){return this.warehouseId;}

    public void setStock(Integer stock){this.stock = stock;}

    public Integer getStock(){return this.stock;}

    public void setStockName(String stockName){this.stockName = stockName;}

    public String getStockName(){return this.stockName;}

    public void setStockLocked(Integer stockLocked){this.stockLocked = stockLocked;}

    public Integer getStockLocked(){return this.stockLocked;}
    @Override
    public String toString() {
        return "WmsWareSku{" +
                "id='" + id + '\'' +
                "skuId='" + skuId + '\'' +
                "warehouseId='" + warehouseId + '\'' +
                "stock='" + stock + '\'' +
                "stockName='" + stockName + '\'' +
                "stockLocked='" + stockLocked + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private WmsWareSku set;

        private ConditionBuilder where;

        public UpdateBuilder set(WmsWareSku set){
            this.set = set;
            return this;
        }

        public WmsWareSku getSet(){
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

    public static class QueryBuilder extends WmsWareSku{
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

        private List<Long> warehouseIdList;

        public List<Long> getWarehouseIdList(){return this.warehouseIdList;}

        private Long warehouseIdSt;

        private Long warehouseIdEd;

        public Long getWarehouseIdSt(){return this.warehouseIdSt;}

        public Long getWarehouseIdEd(){return this.warehouseIdEd;}

        private List<Integer> stockList;

        public List<Integer> getStockList(){return this.stockList;}

        private Integer stockSt;

        private Integer stockEd;

        public Integer getStockSt(){return this.stockSt;}

        public Integer getStockEd(){return this.stockEd;}

        private List<String> stockNameList;

        public List<String> getStockNameList(){return this.stockNameList;}


        private List<String> fuzzyStockName;

        public List<String> getFuzzyStockName(){return this.fuzzyStockName;}

        private List<String> rightFuzzyStockName;

        public List<String> getRightFuzzyStockName(){return this.rightFuzzyStockName;}
        private List<Integer> stockLockedList;

        public List<Integer> getStockLockedList(){return this.stockLockedList;}

        private Integer stockLockedSt;

        private Integer stockLockedEd;

        public Integer getStockLockedSt(){return this.stockLockedSt;}

        public Integer getStockLockedEd(){return this.stockLockedEd;}

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

        public QueryBuilder warehouseIdBetWeen(Long warehouseIdSt,Long warehouseIdEd){
            this.warehouseIdSt = warehouseIdSt;
            this.warehouseIdEd = warehouseIdEd;
            return this;
        }

        public QueryBuilder warehouseIdGreaterEqThan(Long warehouseIdSt){
            this.warehouseIdSt = warehouseIdSt;
            return this;
        }
        public QueryBuilder warehouseIdLessEqThan(Long warehouseIdEd){
            this.warehouseIdEd = warehouseIdEd;
            return this;
        }


        public QueryBuilder warehouseId(Long warehouseId){
            setWarehouseId(warehouseId);
            return this;
        }

        public QueryBuilder warehouseIdList(Long ... warehouseId){
            this.warehouseIdList = solveNullList(warehouseId);
            return this;
        }

        public QueryBuilder warehouseIdList(List<Long> warehouseId){
            this.warehouseIdList = warehouseId;
            return this;
        }

        public QueryBuilder fetchWarehouseId(){
            setFetchFields("fetchFields","warehouseId");
            return this;
        }

        public QueryBuilder excludeWarehouseId(){
            setFetchFields("excludeFields","warehouseId");
            return this;
        }

        public QueryBuilder stockBetWeen(Integer stockSt,Integer stockEd){
            this.stockSt = stockSt;
            this.stockEd = stockEd;
            return this;
        }

        public QueryBuilder stockGreaterEqThan(Integer stockSt){
            this.stockSt = stockSt;
            return this;
        }
        public QueryBuilder stockLessEqThan(Integer stockEd){
            this.stockEd = stockEd;
            return this;
        }


        public QueryBuilder stock(Integer stock){
            setStock(stock);
            return this;
        }

        public QueryBuilder stockList(Integer ... stock){
            this.stockList = solveNullList(stock);
            return this;
        }

        public QueryBuilder stockList(List<Integer> stock){
            this.stockList = stock;
            return this;
        }

        public QueryBuilder fetchStock(){
            setFetchFields("fetchFields","stock");
            return this;
        }

        public QueryBuilder excludeStock(){
            setFetchFields("excludeFields","stock");
            return this;
        }

        public QueryBuilder fuzzyStockName (List<String> fuzzyStockName){
            this.fuzzyStockName = fuzzyStockName;
            return this;
        }

        public QueryBuilder fuzzyStockName (String ... fuzzyStockName){
            this.fuzzyStockName = solveNullList(fuzzyStockName);
            return this;
        }

        public QueryBuilder rightFuzzyStockName (List<String> rightFuzzyStockName){
            this.rightFuzzyStockName = rightFuzzyStockName;
            return this;
        }

        public QueryBuilder rightFuzzyStockName (String ... rightFuzzyStockName){
            this.rightFuzzyStockName = solveNullList(rightFuzzyStockName);
            return this;
        }

        public QueryBuilder stockName(String stockName){
            setStockName(stockName);
            return this;
        }

        public QueryBuilder stockNameList(String ... stockName){
            this.stockNameList = solveNullList(stockName);
            return this;
        }

        public QueryBuilder stockNameList(List<String> stockName){
            this.stockNameList = stockName;
            return this;
        }

        public QueryBuilder fetchStockName(){
            setFetchFields("fetchFields","stockName");
            return this;
        }

        public QueryBuilder excludeStockName(){
            setFetchFields("excludeFields","stockName");
            return this;
        }

        public QueryBuilder stockLockedBetWeen(Integer stockLockedSt,Integer stockLockedEd){
            this.stockLockedSt = stockLockedSt;
            this.stockLockedEd = stockLockedEd;
            return this;
        }

        public QueryBuilder stockLockedGreaterEqThan(Integer stockLockedSt){
            this.stockLockedSt = stockLockedSt;
            return this;
        }
        public QueryBuilder stockLockedLessEqThan(Integer stockLockedEd){
            this.stockLockedEd = stockLockedEd;
            return this;
        }


        public QueryBuilder stockLocked(Integer stockLocked){
            setStockLocked(stockLocked);
            return this;
        }

        public QueryBuilder stockLockedList(Integer ... stockLocked){
            this.stockLockedList = solveNullList(stockLocked);
            return this;
        }

        public QueryBuilder stockLockedList(List<Integer> stockLocked){
            this.stockLockedList = stockLocked;
            return this;
        }

        public QueryBuilder fetchStockLocked(){
            setFetchFields("fetchFields","stockLocked");
            return this;
        }

        public QueryBuilder excludeStockLocked(){
            setFetchFields("excludeFields","stockLocked");
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

        public WmsWareSku build(){return this;}
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

        private List<Long> warehouseIdList;

        public List<Long> getWarehouseIdList(){return this.warehouseIdList;}

        private Long warehouseIdSt;

        private Long warehouseIdEd;

        public Long getWarehouseIdSt(){return this.warehouseIdSt;}

        public Long getWarehouseIdEd(){return this.warehouseIdEd;}

        private List<Integer> stockList;

        public List<Integer> getStockList(){return this.stockList;}

        private Integer stockSt;

        private Integer stockEd;

        public Integer getStockSt(){return this.stockSt;}

        public Integer getStockEd(){return this.stockEd;}

        private List<String> stockNameList;

        public List<String> getStockNameList(){return this.stockNameList;}


        private List<String> fuzzyStockName;

        public List<String> getFuzzyStockName(){return this.fuzzyStockName;}

        private List<String> rightFuzzyStockName;

        public List<String> getRightFuzzyStockName(){return this.rightFuzzyStockName;}
        private List<Integer> stockLockedList;

        public List<Integer> getStockLockedList(){return this.stockLockedList;}

        private Integer stockLockedSt;

        private Integer stockLockedEd;

        public Integer getStockLockedSt(){return this.stockLockedSt;}

        public Integer getStockLockedEd(){return this.stockLockedEd;}


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

        public ConditionBuilder warehouseIdBetWeen(Long warehouseIdSt,Long warehouseIdEd){
            this.warehouseIdSt = warehouseIdSt;
            this.warehouseIdEd = warehouseIdEd;
            return this;
        }

        public ConditionBuilder warehouseIdGreaterEqThan(Long warehouseIdSt){
            this.warehouseIdSt = warehouseIdSt;
            return this;
        }
        public ConditionBuilder warehouseIdLessEqThan(Long warehouseIdEd){
            this.warehouseIdEd = warehouseIdEd;
            return this;
        }


        public ConditionBuilder warehouseIdList(Long ... warehouseId){
            this.warehouseIdList = solveNullList(warehouseId);
            return this;
        }

        public ConditionBuilder warehouseIdList(List<Long> warehouseId){
            this.warehouseIdList = warehouseId;
            return this;
        }

        public ConditionBuilder stockBetWeen(Integer stockSt,Integer stockEd){
            this.stockSt = stockSt;
            this.stockEd = stockEd;
            return this;
        }

        public ConditionBuilder stockGreaterEqThan(Integer stockSt){
            this.stockSt = stockSt;
            return this;
        }
        public ConditionBuilder stockLessEqThan(Integer stockEd){
            this.stockEd = stockEd;
            return this;
        }


        public ConditionBuilder stockList(Integer ... stock){
            this.stockList = solveNullList(stock);
            return this;
        }

        public ConditionBuilder stockList(List<Integer> stock){
            this.stockList = stock;
            return this;
        }

        public ConditionBuilder fuzzyStockName (List<String> fuzzyStockName){
            this.fuzzyStockName = fuzzyStockName;
            return this;
        }

        public ConditionBuilder fuzzyStockName (String ... fuzzyStockName){
            this.fuzzyStockName = solveNullList(fuzzyStockName);
            return this;
        }

        public ConditionBuilder rightFuzzyStockName (List<String> rightFuzzyStockName){
            this.rightFuzzyStockName = rightFuzzyStockName;
            return this;
        }

        public ConditionBuilder rightFuzzyStockName (String ... rightFuzzyStockName){
            this.rightFuzzyStockName = solveNullList(rightFuzzyStockName);
            return this;
        }

        public ConditionBuilder stockNameList(String ... stockName){
            this.stockNameList = solveNullList(stockName);
            return this;
        }

        public ConditionBuilder stockNameList(List<String> stockName){
            this.stockNameList = stockName;
            return this;
        }

        public ConditionBuilder stockLockedBetWeen(Integer stockLockedSt,Integer stockLockedEd){
            this.stockLockedSt = stockLockedSt;
            this.stockLockedEd = stockLockedEd;
            return this;
        }

        public ConditionBuilder stockLockedGreaterEqThan(Integer stockLockedSt){
            this.stockLockedSt = stockLockedSt;
            return this;
        }
        public ConditionBuilder stockLockedLessEqThan(Integer stockLockedEd){
            this.stockLockedEd = stockLockedEd;
            return this;
        }


        public ConditionBuilder stockLockedList(Integer ... stockLocked){
            this.stockLockedList = solveNullList(stockLocked);
            return this;
        }

        public ConditionBuilder stockLockedList(List<Integer> stockLocked){
            this.stockLockedList = stockLocked;
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

        private WmsWareSku obj;

        public Builder(){
            this.obj = new WmsWareSku();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder skuId(Long skuId){
            this.obj.setSkuId(skuId);
            return this;
        }
        public Builder warehouseId(Long warehouseId){
            this.obj.setWarehouseId(warehouseId);
            return this;
        }
        public Builder stock(Integer stock){
            this.obj.setStock(stock);
            return this;
        }
        public Builder stockName(String stockName){
            this.obj.setStockName(stockName);
            return this;
        }
        public Builder stockLocked(Integer stockLocked){
            this.obj.setStockLocked(stockLocked);
            return this;
        }
        public WmsWareSku build(){return obj;}
    }

}
