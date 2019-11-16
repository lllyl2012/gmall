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
public class PmsBrand implements Serializable {

    private static final long serialVersionUID = 1573824723967L;


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
    private String name;

    /**
    * 首字母
    * isNullAble:1
    */
    private String firstLetter;

    /**
    * 
    * isNullAble:1
    */
    private Integer sort;

    /**
    * 是否为品牌制造商：0->不是；1->是
    * isNullAble:1
    */
    private Integer factoryStatus;

    /**
    * 
    * isNullAble:1
    */
    private Integer showStatus;

    /**
    * 产品数量
    * isNullAble:1
    */
    private Integer productCount;

    /**
    * 产品评论数量
    * isNullAble:1
    */
    private Integer productCommentCount;

    /**
    * 品牌logo
    * isNullAble:1
    */
    private String logo;

    /**
    * 专区大图
    * isNullAble:1
    */
    private String bigPic;

    /**
    * 品牌故事
    * isNullAble:1
    */
    private String brandStory;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setFirstLetter(String firstLetter){this.firstLetter = firstLetter;}

    public String getFirstLetter(){return this.firstLetter;}

    public void setSort(Integer sort){this.sort = sort;}

    public Integer getSort(){return this.sort;}

    public void setFactoryStatus(Integer factoryStatus){this.factoryStatus = factoryStatus;}

    public Integer getFactoryStatus(){return this.factoryStatus;}

    public void setShowStatus(Integer showStatus){this.showStatus = showStatus;}

    public Integer getShowStatus(){return this.showStatus;}

    public void setProductCount(Integer productCount){this.productCount = productCount;}

    public Integer getProductCount(){return this.productCount;}

    public void setProductCommentCount(Integer productCommentCount){this.productCommentCount = productCommentCount;}

    public Integer getProductCommentCount(){return this.productCommentCount;}

    public void setLogo(String logo){this.logo = logo;}

    public String getLogo(){return this.logo;}

    public void setBigPic(String bigPic){this.bigPic = bigPic;}

    public String getBigPic(){return this.bigPic;}

    public void setBrandStory(String brandStory){this.brandStory = brandStory;}

    public String getBrandStory(){return this.brandStory;}
    @Override
    public String toString() {
        return "PmsBrand{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "firstLetter='" + firstLetter + '\'' +
                "sort='" + sort + '\'' +
                "factoryStatus='" + factoryStatus + '\'' +
                "showStatus='" + showStatus + '\'' +
                "productCount='" + productCount + '\'' +
                "productCommentCount='" + productCommentCount + '\'' +
                "logo='" + logo + '\'' +
                "bigPic='" + bigPic + '\'' +
                "brandStory='" + brandStory + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsBrand set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsBrand set){
            this.set = set;
            return this;
        }

        public PmsBrand getSet(){
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

    public static class QueryBuilder extends PmsBrand{
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
        private List<String> firstLetterList;

        public List<String> getFirstLetterList(){return this.firstLetterList;}


        private List<String> fuzzyFirstLetter;

        public List<String> getFuzzyFirstLetter(){return this.fuzzyFirstLetter;}

        private List<String> rightFuzzyFirstLetter;

        public List<String> getRightFuzzyFirstLetter(){return this.rightFuzzyFirstLetter;}
        private List<Integer> sortList;

        public List<Integer> getSortList(){return this.sortList;}

        private Integer sortSt;

        private Integer sortEd;

        public Integer getSortSt(){return this.sortSt;}

        public Integer getSortEd(){return this.sortEd;}

        private List<Integer> factoryStatusList;

        public List<Integer> getFactoryStatusList(){return this.factoryStatusList;}

        private Integer factoryStatusSt;

        private Integer factoryStatusEd;

        public Integer getFactoryStatusSt(){return this.factoryStatusSt;}

        public Integer getFactoryStatusEd(){return this.factoryStatusEd;}

        private List<Integer> showStatusList;

        public List<Integer> getShowStatusList(){return this.showStatusList;}

        private Integer showStatusSt;

        private Integer showStatusEd;

        public Integer getShowStatusSt(){return this.showStatusSt;}

        public Integer getShowStatusEd(){return this.showStatusEd;}

        private List<Integer> productCountList;

        public List<Integer> getProductCountList(){return this.productCountList;}

        private Integer productCountSt;

        private Integer productCountEd;

        public Integer getProductCountSt(){return this.productCountSt;}

        public Integer getProductCountEd(){return this.productCountEd;}

        private List<Integer> productCommentCountList;

        public List<Integer> getProductCommentCountList(){return this.productCommentCountList;}

        private Integer productCommentCountSt;

        private Integer productCommentCountEd;

        public Integer getProductCommentCountSt(){return this.productCommentCountSt;}

        public Integer getProductCommentCountEd(){return this.productCommentCountEd;}

        private List<String> logoList;

        public List<String> getLogoList(){return this.logoList;}


        private List<String> fuzzyLogo;

        public List<String> getFuzzyLogo(){return this.fuzzyLogo;}

        private List<String> rightFuzzyLogo;

        public List<String> getRightFuzzyLogo(){return this.rightFuzzyLogo;}
        private List<String> bigPicList;

        public List<String> getBigPicList(){return this.bigPicList;}


        private List<String> fuzzyBigPic;

        public List<String> getFuzzyBigPic(){return this.fuzzyBigPic;}

        private List<String> rightFuzzyBigPic;

        public List<String> getRightFuzzyBigPic(){return this.rightFuzzyBigPic;}
        private List<String> brandStoryList;

        public List<String> getBrandStoryList(){return this.brandStoryList;}


        private List<String> fuzzyBrandStory;

        public List<String> getFuzzyBrandStory(){return this.fuzzyBrandStory;}

        private List<String> rightFuzzyBrandStory;

        public List<String> getRightFuzzyBrandStory(){return this.rightFuzzyBrandStory;}
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

        public QueryBuilder fuzzyFirstLetter (List<String> fuzzyFirstLetter){
            this.fuzzyFirstLetter = fuzzyFirstLetter;
            return this;
        }

        public QueryBuilder fuzzyFirstLetter (String ... fuzzyFirstLetter){
            this.fuzzyFirstLetter = solveNullList(fuzzyFirstLetter);
            return this;
        }

        public QueryBuilder rightFuzzyFirstLetter (List<String> rightFuzzyFirstLetter){
            this.rightFuzzyFirstLetter = rightFuzzyFirstLetter;
            return this;
        }

        public QueryBuilder rightFuzzyFirstLetter (String ... rightFuzzyFirstLetter){
            this.rightFuzzyFirstLetter = solveNullList(rightFuzzyFirstLetter);
            return this;
        }

        public QueryBuilder firstLetter(String firstLetter){
            setFirstLetter(firstLetter);
            return this;
        }

        public QueryBuilder firstLetterList(String ... firstLetter){
            this.firstLetterList = solveNullList(firstLetter);
            return this;
        }

        public QueryBuilder firstLetterList(List<String> firstLetter){
            this.firstLetterList = firstLetter;
            return this;
        }

        public QueryBuilder fetchFirstLetter(){
            setFetchFields("fetchFields","firstLetter");
            return this;
        }

        public QueryBuilder excludeFirstLetter(){
            setFetchFields("excludeFields","firstLetter");
            return this;
        }

        public QueryBuilder sortBetWeen(Integer sortSt,Integer sortEd){
            this.sortSt = sortSt;
            this.sortEd = sortEd;
            return this;
        }

        public QueryBuilder sortGreaterEqThan(Integer sortSt){
            this.sortSt = sortSt;
            return this;
        }
        public QueryBuilder sortLessEqThan(Integer sortEd){
            this.sortEd = sortEd;
            return this;
        }


        public QueryBuilder sort(Integer sort){
            setSort(sort);
            return this;
        }

        public QueryBuilder sortList(Integer ... sort){
            this.sortList = solveNullList(sort);
            return this;
        }

        public QueryBuilder sortList(List<Integer> sort){
            this.sortList = sort;
            return this;
        }

        public QueryBuilder fetchSort(){
            setFetchFields("fetchFields","sort");
            return this;
        }

        public QueryBuilder excludeSort(){
            setFetchFields("excludeFields","sort");
            return this;
        }

        public QueryBuilder factoryStatusBetWeen(Integer factoryStatusSt,Integer factoryStatusEd){
            this.factoryStatusSt = factoryStatusSt;
            this.factoryStatusEd = factoryStatusEd;
            return this;
        }

        public QueryBuilder factoryStatusGreaterEqThan(Integer factoryStatusSt){
            this.factoryStatusSt = factoryStatusSt;
            return this;
        }
        public QueryBuilder factoryStatusLessEqThan(Integer factoryStatusEd){
            this.factoryStatusEd = factoryStatusEd;
            return this;
        }


        public QueryBuilder factoryStatus(Integer factoryStatus){
            setFactoryStatus(factoryStatus);
            return this;
        }

        public QueryBuilder factoryStatusList(Integer ... factoryStatus){
            this.factoryStatusList = solveNullList(factoryStatus);
            return this;
        }

        public QueryBuilder factoryStatusList(List<Integer> factoryStatus){
            this.factoryStatusList = factoryStatus;
            return this;
        }

        public QueryBuilder fetchFactoryStatus(){
            setFetchFields("fetchFields","factoryStatus");
            return this;
        }

        public QueryBuilder excludeFactoryStatus(){
            setFetchFields("excludeFields","factoryStatus");
            return this;
        }

        public QueryBuilder showStatusBetWeen(Integer showStatusSt,Integer showStatusEd){
            this.showStatusSt = showStatusSt;
            this.showStatusEd = showStatusEd;
            return this;
        }

        public QueryBuilder showStatusGreaterEqThan(Integer showStatusSt){
            this.showStatusSt = showStatusSt;
            return this;
        }
        public QueryBuilder showStatusLessEqThan(Integer showStatusEd){
            this.showStatusEd = showStatusEd;
            return this;
        }


        public QueryBuilder showStatus(Integer showStatus){
            setShowStatus(showStatus);
            return this;
        }

        public QueryBuilder showStatusList(Integer ... showStatus){
            this.showStatusList = solveNullList(showStatus);
            return this;
        }

        public QueryBuilder showStatusList(List<Integer> showStatus){
            this.showStatusList = showStatus;
            return this;
        }

        public QueryBuilder fetchShowStatus(){
            setFetchFields("fetchFields","showStatus");
            return this;
        }

        public QueryBuilder excludeShowStatus(){
            setFetchFields("excludeFields","showStatus");
            return this;
        }

        public QueryBuilder productCountBetWeen(Integer productCountSt,Integer productCountEd){
            this.productCountSt = productCountSt;
            this.productCountEd = productCountEd;
            return this;
        }

        public QueryBuilder productCountGreaterEqThan(Integer productCountSt){
            this.productCountSt = productCountSt;
            return this;
        }
        public QueryBuilder productCountLessEqThan(Integer productCountEd){
            this.productCountEd = productCountEd;
            return this;
        }


        public QueryBuilder productCount(Integer productCount){
            setProductCount(productCount);
            return this;
        }

        public QueryBuilder productCountList(Integer ... productCount){
            this.productCountList = solveNullList(productCount);
            return this;
        }

        public QueryBuilder productCountList(List<Integer> productCount){
            this.productCountList = productCount;
            return this;
        }

        public QueryBuilder fetchProductCount(){
            setFetchFields("fetchFields","productCount");
            return this;
        }

        public QueryBuilder excludeProductCount(){
            setFetchFields("excludeFields","productCount");
            return this;
        }

        public QueryBuilder productCommentCountBetWeen(Integer productCommentCountSt,Integer productCommentCountEd){
            this.productCommentCountSt = productCommentCountSt;
            this.productCommentCountEd = productCommentCountEd;
            return this;
        }

        public QueryBuilder productCommentCountGreaterEqThan(Integer productCommentCountSt){
            this.productCommentCountSt = productCommentCountSt;
            return this;
        }
        public QueryBuilder productCommentCountLessEqThan(Integer productCommentCountEd){
            this.productCommentCountEd = productCommentCountEd;
            return this;
        }


        public QueryBuilder productCommentCount(Integer productCommentCount){
            setProductCommentCount(productCommentCount);
            return this;
        }

        public QueryBuilder productCommentCountList(Integer ... productCommentCount){
            this.productCommentCountList = solveNullList(productCommentCount);
            return this;
        }

        public QueryBuilder productCommentCountList(List<Integer> productCommentCount){
            this.productCommentCountList = productCommentCount;
            return this;
        }

        public QueryBuilder fetchProductCommentCount(){
            setFetchFields("fetchFields","productCommentCount");
            return this;
        }

        public QueryBuilder excludeProductCommentCount(){
            setFetchFields("excludeFields","productCommentCount");
            return this;
        }

        public QueryBuilder fuzzyLogo (List<String> fuzzyLogo){
            this.fuzzyLogo = fuzzyLogo;
            return this;
        }

        public QueryBuilder fuzzyLogo (String ... fuzzyLogo){
            this.fuzzyLogo = solveNullList(fuzzyLogo);
            return this;
        }

        public QueryBuilder rightFuzzyLogo (List<String> rightFuzzyLogo){
            this.rightFuzzyLogo = rightFuzzyLogo;
            return this;
        }

        public QueryBuilder rightFuzzyLogo (String ... rightFuzzyLogo){
            this.rightFuzzyLogo = solveNullList(rightFuzzyLogo);
            return this;
        }

        public QueryBuilder logo(String logo){
            setLogo(logo);
            return this;
        }

        public QueryBuilder logoList(String ... logo){
            this.logoList = solveNullList(logo);
            return this;
        }

        public QueryBuilder logoList(List<String> logo){
            this.logoList = logo;
            return this;
        }

        public QueryBuilder fetchLogo(){
            setFetchFields("fetchFields","logo");
            return this;
        }

        public QueryBuilder excludeLogo(){
            setFetchFields("excludeFields","logo");
            return this;
        }

        public QueryBuilder fuzzyBigPic (List<String> fuzzyBigPic){
            this.fuzzyBigPic = fuzzyBigPic;
            return this;
        }

        public QueryBuilder fuzzyBigPic (String ... fuzzyBigPic){
            this.fuzzyBigPic = solveNullList(fuzzyBigPic);
            return this;
        }

        public QueryBuilder rightFuzzyBigPic (List<String> rightFuzzyBigPic){
            this.rightFuzzyBigPic = rightFuzzyBigPic;
            return this;
        }

        public QueryBuilder rightFuzzyBigPic (String ... rightFuzzyBigPic){
            this.rightFuzzyBigPic = solveNullList(rightFuzzyBigPic);
            return this;
        }

        public QueryBuilder bigPic(String bigPic){
            setBigPic(bigPic);
            return this;
        }

        public QueryBuilder bigPicList(String ... bigPic){
            this.bigPicList = solveNullList(bigPic);
            return this;
        }

        public QueryBuilder bigPicList(List<String> bigPic){
            this.bigPicList = bigPic;
            return this;
        }

        public QueryBuilder fetchBigPic(){
            setFetchFields("fetchFields","bigPic");
            return this;
        }

        public QueryBuilder excludeBigPic(){
            setFetchFields("excludeFields","bigPic");
            return this;
        }

        public QueryBuilder fuzzyBrandStory (List<String> fuzzyBrandStory){
            this.fuzzyBrandStory = fuzzyBrandStory;
            return this;
        }

        public QueryBuilder fuzzyBrandStory (String ... fuzzyBrandStory){
            this.fuzzyBrandStory = solveNullList(fuzzyBrandStory);
            return this;
        }

        public QueryBuilder rightFuzzyBrandStory (List<String> rightFuzzyBrandStory){
            this.rightFuzzyBrandStory = rightFuzzyBrandStory;
            return this;
        }

        public QueryBuilder rightFuzzyBrandStory (String ... rightFuzzyBrandStory){
            this.rightFuzzyBrandStory = solveNullList(rightFuzzyBrandStory);
            return this;
        }

        public QueryBuilder brandStory(String brandStory){
            setBrandStory(brandStory);
            return this;
        }

        public QueryBuilder brandStoryList(String ... brandStory){
            this.brandStoryList = solveNullList(brandStory);
            return this;
        }

        public QueryBuilder brandStoryList(List<String> brandStory){
            this.brandStoryList = brandStory;
            return this;
        }

        public QueryBuilder fetchBrandStory(){
            setFetchFields("fetchFields","brandStory");
            return this;
        }

        public QueryBuilder excludeBrandStory(){
            setFetchFields("excludeFields","brandStory");
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

        public PmsBrand build(){return this;}
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
        private List<String> firstLetterList;

        public List<String> getFirstLetterList(){return this.firstLetterList;}


        private List<String> fuzzyFirstLetter;

        public List<String> getFuzzyFirstLetter(){return this.fuzzyFirstLetter;}

        private List<String> rightFuzzyFirstLetter;

        public List<String> getRightFuzzyFirstLetter(){return this.rightFuzzyFirstLetter;}
        private List<Integer> sortList;

        public List<Integer> getSortList(){return this.sortList;}

        private Integer sortSt;

        private Integer sortEd;

        public Integer getSortSt(){return this.sortSt;}

        public Integer getSortEd(){return this.sortEd;}

        private List<Integer> factoryStatusList;

        public List<Integer> getFactoryStatusList(){return this.factoryStatusList;}

        private Integer factoryStatusSt;

        private Integer factoryStatusEd;

        public Integer getFactoryStatusSt(){return this.factoryStatusSt;}

        public Integer getFactoryStatusEd(){return this.factoryStatusEd;}

        private List<Integer> showStatusList;

        public List<Integer> getShowStatusList(){return this.showStatusList;}

        private Integer showStatusSt;

        private Integer showStatusEd;

        public Integer getShowStatusSt(){return this.showStatusSt;}

        public Integer getShowStatusEd(){return this.showStatusEd;}

        private List<Integer> productCountList;

        public List<Integer> getProductCountList(){return this.productCountList;}

        private Integer productCountSt;

        private Integer productCountEd;

        public Integer getProductCountSt(){return this.productCountSt;}

        public Integer getProductCountEd(){return this.productCountEd;}

        private List<Integer> productCommentCountList;

        public List<Integer> getProductCommentCountList(){return this.productCommentCountList;}

        private Integer productCommentCountSt;

        private Integer productCommentCountEd;

        public Integer getProductCommentCountSt(){return this.productCommentCountSt;}

        public Integer getProductCommentCountEd(){return this.productCommentCountEd;}

        private List<String> logoList;

        public List<String> getLogoList(){return this.logoList;}


        private List<String> fuzzyLogo;

        public List<String> getFuzzyLogo(){return this.fuzzyLogo;}

        private List<String> rightFuzzyLogo;

        public List<String> getRightFuzzyLogo(){return this.rightFuzzyLogo;}
        private List<String> bigPicList;

        public List<String> getBigPicList(){return this.bigPicList;}


        private List<String> fuzzyBigPic;

        public List<String> getFuzzyBigPic(){return this.fuzzyBigPic;}

        private List<String> rightFuzzyBigPic;

        public List<String> getRightFuzzyBigPic(){return this.rightFuzzyBigPic;}
        private List<String> brandStoryList;

        public List<String> getBrandStoryList(){return this.brandStoryList;}


        private List<String> fuzzyBrandStory;

        public List<String> getFuzzyBrandStory(){return this.fuzzyBrandStory;}

        private List<String> rightFuzzyBrandStory;

        public List<String> getRightFuzzyBrandStory(){return this.rightFuzzyBrandStory;}

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

        public ConditionBuilder fuzzyFirstLetter (List<String> fuzzyFirstLetter){
            this.fuzzyFirstLetter = fuzzyFirstLetter;
            return this;
        }

        public ConditionBuilder fuzzyFirstLetter (String ... fuzzyFirstLetter){
            this.fuzzyFirstLetter = solveNullList(fuzzyFirstLetter);
            return this;
        }

        public ConditionBuilder rightFuzzyFirstLetter (List<String> rightFuzzyFirstLetter){
            this.rightFuzzyFirstLetter = rightFuzzyFirstLetter;
            return this;
        }

        public ConditionBuilder rightFuzzyFirstLetter (String ... rightFuzzyFirstLetter){
            this.rightFuzzyFirstLetter = solveNullList(rightFuzzyFirstLetter);
            return this;
        }

        public ConditionBuilder firstLetterList(String ... firstLetter){
            this.firstLetterList = solveNullList(firstLetter);
            return this;
        }

        public ConditionBuilder firstLetterList(List<String> firstLetter){
            this.firstLetterList = firstLetter;
            return this;
        }

        public ConditionBuilder sortBetWeen(Integer sortSt,Integer sortEd){
            this.sortSt = sortSt;
            this.sortEd = sortEd;
            return this;
        }

        public ConditionBuilder sortGreaterEqThan(Integer sortSt){
            this.sortSt = sortSt;
            return this;
        }
        public ConditionBuilder sortLessEqThan(Integer sortEd){
            this.sortEd = sortEd;
            return this;
        }


        public ConditionBuilder sortList(Integer ... sort){
            this.sortList = solveNullList(sort);
            return this;
        }

        public ConditionBuilder sortList(List<Integer> sort){
            this.sortList = sort;
            return this;
        }

        public ConditionBuilder factoryStatusBetWeen(Integer factoryStatusSt,Integer factoryStatusEd){
            this.factoryStatusSt = factoryStatusSt;
            this.factoryStatusEd = factoryStatusEd;
            return this;
        }

        public ConditionBuilder factoryStatusGreaterEqThan(Integer factoryStatusSt){
            this.factoryStatusSt = factoryStatusSt;
            return this;
        }
        public ConditionBuilder factoryStatusLessEqThan(Integer factoryStatusEd){
            this.factoryStatusEd = factoryStatusEd;
            return this;
        }


        public ConditionBuilder factoryStatusList(Integer ... factoryStatus){
            this.factoryStatusList = solveNullList(factoryStatus);
            return this;
        }

        public ConditionBuilder factoryStatusList(List<Integer> factoryStatus){
            this.factoryStatusList = factoryStatus;
            return this;
        }

        public ConditionBuilder showStatusBetWeen(Integer showStatusSt,Integer showStatusEd){
            this.showStatusSt = showStatusSt;
            this.showStatusEd = showStatusEd;
            return this;
        }

        public ConditionBuilder showStatusGreaterEqThan(Integer showStatusSt){
            this.showStatusSt = showStatusSt;
            return this;
        }
        public ConditionBuilder showStatusLessEqThan(Integer showStatusEd){
            this.showStatusEd = showStatusEd;
            return this;
        }


        public ConditionBuilder showStatusList(Integer ... showStatus){
            this.showStatusList = solveNullList(showStatus);
            return this;
        }

        public ConditionBuilder showStatusList(List<Integer> showStatus){
            this.showStatusList = showStatus;
            return this;
        }

        public ConditionBuilder productCountBetWeen(Integer productCountSt,Integer productCountEd){
            this.productCountSt = productCountSt;
            this.productCountEd = productCountEd;
            return this;
        }

        public ConditionBuilder productCountGreaterEqThan(Integer productCountSt){
            this.productCountSt = productCountSt;
            return this;
        }
        public ConditionBuilder productCountLessEqThan(Integer productCountEd){
            this.productCountEd = productCountEd;
            return this;
        }


        public ConditionBuilder productCountList(Integer ... productCount){
            this.productCountList = solveNullList(productCount);
            return this;
        }

        public ConditionBuilder productCountList(List<Integer> productCount){
            this.productCountList = productCount;
            return this;
        }

        public ConditionBuilder productCommentCountBetWeen(Integer productCommentCountSt,Integer productCommentCountEd){
            this.productCommentCountSt = productCommentCountSt;
            this.productCommentCountEd = productCommentCountEd;
            return this;
        }

        public ConditionBuilder productCommentCountGreaterEqThan(Integer productCommentCountSt){
            this.productCommentCountSt = productCommentCountSt;
            return this;
        }
        public ConditionBuilder productCommentCountLessEqThan(Integer productCommentCountEd){
            this.productCommentCountEd = productCommentCountEd;
            return this;
        }


        public ConditionBuilder productCommentCountList(Integer ... productCommentCount){
            this.productCommentCountList = solveNullList(productCommentCount);
            return this;
        }

        public ConditionBuilder productCommentCountList(List<Integer> productCommentCount){
            this.productCommentCountList = productCommentCount;
            return this;
        }

        public ConditionBuilder fuzzyLogo (List<String> fuzzyLogo){
            this.fuzzyLogo = fuzzyLogo;
            return this;
        }

        public ConditionBuilder fuzzyLogo (String ... fuzzyLogo){
            this.fuzzyLogo = solveNullList(fuzzyLogo);
            return this;
        }

        public ConditionBuilder rightFuzzyLogo (List<String> rightFuzzyLogo){
            this.rightFuzzyLogo = rightFuzzyLogo;
            return this;
        }

        public ConditionBuilder rightFuzzyLogo (String ... rightFuzzyLogo){
            this.rightFuzzyLogo = solveNullList(rightFuzzyLogo);
            return this;
        }

        public ConditionBuilder logoList(String ... logo){
            this.logoList = solveNullList(logo);
            return this;
        }

        public ConditionBuilder logoList(List<String> logo){
            this.logoList = logo;
            return this;
        }

        public ConditionBuilder fuzzyBigPic (List<String> fuzzyBigPic){
            this.fuzzyBigPic = fuzzyBigPic;
            return this;
        }

        public ConditionBuilder fuzzyBigPic (String ... fuzzyBigPic){
            this.fuzzyBigPic = solveNullList(fuzzyBigPic);
            return this;
        }

        public ConditionBuilder rightFuzzyBigPic (List<String> rightFuzzyBigPic){
            this.rightFuzzyBigPic = rightFuzzyBigPic;
            return this;
        }

        public ConditionBuilder rightFuzzyBigPic (String ... rightFuzzyBigPic){
            this.rightFuzzyBigPic = solveNullList(rightFuzzyBigPic);
            return this;
        }

        public ConditionBuilder bigPicList(String ... bigPic){
            this.bigPicList = solveNullList(bigPic);
            return this;
        }

        public ConditionBuilder bigPicList(List<String> bigPic){
            this.bigPicList = bigPic;
            return this;
        }

        public ConditionBuilder fuzzyBrandStory (List<String> fuzzyBrandStory){
            this.fuzzyBrandStory = fuzzyBrandStory;
            return this;
        }

        public ConditionBuilder fuzzyBrandStory (String ... fuzzyBrandStory){
            this.fuzzyBrandStory = solveNullList(fuzzyBrandStory);
            return this;
        }

        public ConditionBuilder rightFuzzyBrandStory (List<String> rightFuzzyBrandStory){
            this.rightFuzzyBrandStory = rightFuzzyBrandStory;
            return this;
        }

        public ConditionBuilder rightFuzzyBrandStory (String ... rightFuzzyBrandStory){
            this.rightFuzzyBrandStory = solveNullList(rightFuzzyBrandStory);
            return this;
        }

        public ConditionBuilder brandStoryList(String ... brandStory){
            this.brandStoryList = solveNullList(brandStory);
            return this;
        }

        public ConditionBuilder brandStoryList(List<String> brandStory){
            this.brandStoryList = brandStory;
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

        private PmsBrand obj;

        public Builder(){
            this.obj = new PmsBrand();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder firstLetter(String firstLetter){
            this.obj.setFirstLetter(firstLetter);
            return this;
        }
        public Builder sort(Integer sort){
            this.obj.setSort(sort);
            return this;
        }
        public Builder factoryStatus(Integer factoryStatus){
            this.obj.setFactoryStatus(factoryStatus);
            return this;
        }
        public Builder showStatus(Integer showStatus){
            this.obj.setShowStatus(showStatus);
            return this;
        }
        public Builder productCount(Integer productCount){
            this.obj.setProductCount(productCount);
            return this;
        }
        public Builder productCommentCount(Integer productCommentCount){
            this.obj.setProductCommentCount(productCommentCount);
            return this;
        }
        public Builder logo(String logo){
            this.obj.setLogo(logo);
            return this;
        }
        public Builder bigPic(String bigPic){
            this.obj.setBigPic(bigPic);
            return this;
        }
        public Builder brandStory(String brandStory){
            this.obj.setBrandStory(brandStory);
            return this;
        }
        public PmsBrand build(){return obj;}
    }

}
