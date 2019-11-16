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
public class PmsComment implements Serializable {

    private static final long serialVersionUID = 1573824727504L;


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
    private String memberNickName;

    /**
    * 
    * isNullAble:1
    */
    private String productName;

    /**
    * 评价星数：0->5
    * isNullAble:1
    */
    private Integer star;

    /**
    * 评价的ip
    * isNullAble:1
    */
    private String memberIp;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 
    * isNullAble:1
    */
    private Integer showStatus;

    /**
    * 购买时的商品属性
    * isNullAble:1
    */
    private String productAttribute;

    /**
    * 
    * isNullAble:1
    */
    private Integer collectCouont;

    /**
    * 
    * isNullAble:1
    */
    private Integer readCount;

    /**
    * 
    * isNullAble:1
    */
    private String content;

    /**
    * 上传图片地址，以逗号隔开
    * isNullAble:1
    */
    private String pics;

    /**
    * 评论用户头像
    * isNullAble:1
    */
    private String memberIcon;

    /**
    * 
    * isNullAble:1
    */
    private Integer replayCount;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProductId(Long productId){this.productId = productId;}

    public Long getProductId(){return this.productId;}

    public void setMemberNickName(String memberNickName){this.memberNickName = memberNickName;}

    public String getMemberNickName(){return this.memberNickName;}

    public void setProductName(String productName){this.productName = productName;}

    public String getProductName(){return this.productName;}

    public void setStar(Integer star){this.star = star;}

    public Integer getStar(){return this.star;}

    public void setMemberIp(String memberIp){this.memberIp = memberIp;}

    public String getMemberIp(){return this.memberIp;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setShowStatus(Integer showStatus){this.showStatus = showStatus;}

    public Integer getShowStatus(){return this.showStatus;}

    public void setProductAttribute(String productAttribute){this.productAttribute = productAttribute;}

    public String getProductAttribute(){return this.productAttribute;}

    public void setCollectCouont(Integer collectCouont){this.collectCouont = collectCouont;}

    public Integer getCollectCouont(){return this.collectCouont;}

    public void setReadCount(Integer readCount){this.readCount = readCount;}

    public Integer getReadCount(){return this.readCount;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}

    public void setPics(String pics){this.pics = pics;}

    public String getPics(){return this.pics;}

    public void setMemberIcon(String memberIcon){this.memberIcon = memberIcon;}

    public String getMemberIcon(){return this.memberIcon;}

    public void setReplayCount(Integer replayCount){this.replayCount = replayCount;}

    public Integer getReplayCount(){return this.replayCount;}
    @Override
    public String toString() {
        return "PmsComment{" +
                "id='" + id + '\'' +
                "productId='" + productId + '\'' +
                "memberNickName='" + memberNickName + '\'' +
                "productName='" + productName + '\'' +
                "star='" + star + '\'' +
                "memberIp='" + memberIp + '\'' +
                "createTime='" + createTime + '\'' +
                "showStatus='" + showStatus + '\'' +
                "productAttribute='" + productAttribute + '\'' +
                "collectCouont='" + collectCouont + '\'' +
                "readCount='" + readCount + '\'' +
                "content='" + content + '\'' +
                "pics='" + pics + '\'' +
                "memberIcon='" + memberIcon + '\'' +
                "replayCount='" + replayCount + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsComment set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsComment set){
            this.set = set;
            return this;
        }

        public PmsComment getSet(){
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

    public static class QueryBuilder extends PmsComment{
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

        private List<String> memberNickNameList;

        public List<String> getMemberNickNameList(){return this.memberNickNameList;}


        private List<String> fuzzyMemberNickName;

        public List<String> getFuzzyMemberNickName(){return this.fuzzyMemberNickName;}

        private List<String> rightFuzzyMemberNickName;

        public List<String> getRightFuzzyMemberNickName(){return this.rightFuzzyMemberNickName;}
        private List<String> productNameList;

        public List<String> getProductNameList(){return this.productNameList;}


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){return this.fuzzyProductName;}

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){return this.rightFuzzyProductName;}
        private List<Integer> starList;

        public List<Integer> getStarList(){return this.starList;}

        private Integer starSt;

        private Integer starEd;

        public Integer getStarSt(){return this.starSt;}

        public Integer getStarEd(){return this.starEd;}

        private List<String> memberIpList;

        public List<String> getMemberIpList(){return this.memberIpList;}


        private List<String> fuzzyMemberIp;

        public List<String> getFuzzyMemberIp(){return this.fuzzyMemberIp;}

        private List<String> rightFuzzyMemberIp;

        public List<String> getRightFuzzyMemberIp(){return this.rightFuzzyMemberIp;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Integer> showStatusList;

        public List<Integer> getShowStatusList(){return this.showStatusList;}

        private Integer showStatusSt;

        private Integer showStatusEd;

        public Integer getShowStatusSt(){return this.showStatusSt;}

        public Integer getShowStatusEd(){return this.showStatusEd;}

        private List<String> productAttributeList;

        public List<String> getProductAttributeList(){return this.productAttributeList;}


        private List<String> fuzzyProductAttribute;

        public List<String> getFuzzyProductAttribute(){return this.fuzzyProductAttribute;}

        private List<String> rightFuzzyProductAttribute;

        public List<String> getRightFuzzyProductAttribute(){return this.rightFuzzyProductAttribute;}
        private List<Integer> collectCouontList;

        public List<Integer> getCollectCouontList(){return this.collectCouontList;}

        private Integer collectCouontSt;

        private Integer collectCouontEd;

        public Integer getCollectCouontSt(){return this.collectCouontSt;}

        public Integer getCollectCouontEd(){return this.collectCouontEd;}

        private List<Integer> readCountList;

        public List<Integer> getReadCountList(){return this.readCountList;}

        private Integer readCountSt;

        private Integer readCountEd;

        public Integer getReadCountSt(){return this.readCountSt;}

        public Integer getReadCountEd(){return this.readCountEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<String> picsList;

        public List<String> getPicsList(){return this.picsList;}


        private List<String> fuzzyPics;

        public List<String> getFuzzyPics(){return this.fuzzyPics;}

        private List<String> rightFuzzyPics;

        public List<String> getRightFuzzyPics(){return this.rightFuzzyPics;}
        private List<String> memberIconList;

        public List<String> getMemberIconList(){return this.memberIconList;}


        private List<String> fuzzyMemberIcon;

        public List<String> getFuzzyMemberIcon(){return this.fuzzyMemberIcon;}

        private List<String> rightFuzzyMemberIcon;

        public List<String> getRightFuzzyMemberIcon(){return this.rightFuzzyMemberIcon;}
        private List<Integer> replayCountList;

        public List<Integer> getReplayCountList(){return this.replayCountList;}

        private Integer replayCountSt;

        private Integer replayCountEd;

        public Integer getReplayCountSt(){return this.replayCountSt;}

        public Integer getReplayCountEd(){return this.replayCountEd;}

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

        public QueryBuilder fuzzyMemberNickName (List<String> fuzzyMemberNickName){
            this.fuzzyMemberNickName = fuzzyMemberNickName;
            return this;
        }

        public QueryBuilder fuzzyMemberNickName (String ... fuzzyMemberNickName){
            this.fuzzyMemberNickName = solveNullList(fuzzyMemberNickName);
            return this;
        }

        public QueryBuilder rightFuzzyMemberNickName (List<String> rightFuzzyMemberNickName){
            this.rightFuzzyMemberNickName = rightFuzzyMemberNickName;
            return this;
        }

        public QueryBuilder rightFuzzyMemberNickName (String ... rightFuzzyMemberNickName){
            this.rightFuzzyMemberNickName = solveNullList(rightFuzzyMemberNickName);
            return this;
        }

        public QueryBuilder memberNickName(String memberNickName){
            setMemberNickName(memberNickName);
            return this;
        }

        public QueryBuilder memberNickNameList(String ... memberNickName){
            this.memberNickNameList = solveNullList(memberNickName);
            return this;
        }

        public QueryBuilder memberNickNameList(List<String> memberNickName){
            this.memberNickNameList = memberNickName;
            return this;
        }

        public QueryBuilder fetchMemberNickName(){
            setFetchFields("fetchFields","memberNickName");
            return this;
        }

        public QueryBuilder excludeMemberNickName(){
            setFetchFields("excludeFields","memberNickName");
            return this;
        }

        public QueryBuilder fuzzyProductName (List<String> fuzzyProductName){
            this.fuzzyProductName = fuzzyProductName;
            return this;
        }

        public QueryBuilder fuzzyProductName (String ... fuzzyProductName){
            this.fuzzyProductName = solveNullList(fuzzyProductName);
            return this;
        }

        public QueryBuilder rightFuzzyProductName (List<String> rightFuzzyProductName){
            this.rightFuzzyProductName = rightFuzzyProductName;
            return this;
        }

        public QueryBuilder rightFuzzyProductName (String ... rightFuzzyProductName){
            this.rightFuzzyProductName = solveNullList(rightFuzzyProductName);
            return this;
        }

        public QueryBuilder productName(String productName){
            setProductName(productName);
            return this;
        }

        public QueryBuilder productNameList(String ... productName){
            this.productNameList = solveNullList(productName);
            return this;
        }

        public QueryBuilder productNameList(List<String> productName){
            this.productNameList = productName;
            return this;
        }

        public QueryBuilder fetchProductName(){
            setFetchFields("fetchFields","productName");
            return this;
        }

        public QueryBuilder excludeProductName(){
            setFetchFields("excludeFields","productName");
            return this;
        }

        public QueryBuilder starBetWeen(Integer starSt,Integer starEd){
            this.starSt = starSt;
            this.starEd = starEd;
            return this;
        }

        public QueryBuilder starGreaterEqThan(Integer starSt){
            this.starSt = starSt;
            return this;
        }
        public QueryBuilder starLessEqThan(Integer starEd){
            this.starEd = starEd;
            return this;
        }


        public QueryBuilder star(Integer star){
            setStar(star);
            return this;
        }

        public QueryBuilder starList(Integer ... star){
            this.starList = solveNullList(star);
            return this;
        }

        public QueryBuilder starList(List<Integer> star){
            this.starList = star;
            return this;
        }

        public QueryBuilder fetchStar(){
            setFetchFields("fetchFields","star");
            return this;
        }

        public QueryBuilder excludeStar(){
            setFetchFields("excludeFields","star");
            return this;
        }

        public QueryBuilder fuzzyMemberIp (List<String> fuzzyMemberIp){
            this.fuzzyMemberIp = fuzzyMemberIp;
            return this;
        }

        public QueryBuilder fuzzyMemberIp (String ... fuzzyMemberIp){
            this.fuzzyMemberIp = solveNullList(fuzzyMemberIp);
            return this;
        }

        public QueryBuilder rightFuzzyMemberIp (List<String> rightFuzzyMemberIp){
            this.rightFuzzyMemberIp = rightFuzzyMemberIp;
            return this;
        }

        public QueryBuilder rightFuzzyMemberIp (String ... rightFuzzyMemberIp){
            this.rightFuzzyMemberIp = solveNullList(rightFuzzyMemberIp);
            return this;
        }

        public QueryBuilder memberIp(String memberIp){
            setMemberIp(memberIp);
            return this;
        }

        public QueryBuilder memberIpList(String ... memberIp){
            this.memberIpList = solveNullList(memberIp);
            return this;
        }

        public QueryBuilder memberIpList(List<String> memberIp){
            this.memberIpList = memberIp;
            return this;
        }

        public QueryBuilder fetchMemberIp(){
            setFetchFields("fetchFields","memberIp");
            return this;
        }

        public QueryBuilder excludeMemberIp(){
            setFetchFields("excludeFields","memberIp");
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

        public QueryBuilder fuzzyProductAttribute (List<String> fuzzyProductAttribute){
            this.fuzzyProductAttribute = fuzzyProductAttribute;
            return this;
        }

        public QueryBuilder fuzzyProductAttribute (String ... fuzzyProductAttribute){
            this.fuzzyProductAttribute = solveNullList(fuzzyProductAttribute);
            return this;
        }

        public QueryBuilder rightFuzzyProductAttribute (List<String> rightFuzzyProductAttribute){
            this.rightFuzzyProductAttribute = rightFuzzyProductAttribute;
            return this;
        }

        public QueryBuilder rightFuzzyProductAttribute (String ... rightFuzzyProductAttribute){
            this.rightFuzzyProductAttribute = solveNullList(rightFuzzyProductAttribute);
            return this;
        }

        public QueryBuilder productAttribute(String productAttribute){
            setProductAttribute(productAttribute);
            return this;
        }

        public QueryBuilder productAttributeList(String ... productAttribute){
            this.productAttributeList = solveNullList(productAttribute);
            return this;
        }

        public QueryBuilder productAttributeList(List<String> productAttribute){
            this.productAttributeList = productAttribute;
            return this;
        }

        public QueryBuilder fetchProductAttribute(){
            setFetchFields("fetchFields","productAttribute");
            return this;
        }

        public QueryBuilder excludeProductAttribute(){
            setFetchFields("excludeFields","productAttribute");
            return this;
        }

        public QueryBuilder collectCouontBetWeen(Integer collectCouontSt,Integer collectCouontEd){
            this.collectCouontSt = collectCouontSt;
            this.collectCouontEd = collectCouontEd;
            return this;
        }

        public QueryBuilder collectCouontGreaterEqThan(Integer collectCouontSt){
            this.collectCouontSt = collectCouontSt;
            return this;
        }
        public QueryBuilder collectCouontLessEqThan(Integer collectCouontEd){
            this.collectCouontEd = collectCouontEd;
            return this;
        }


        public QueryBuilder collectCouont(Integer collectCouont){
            setCollectCouont(collectCouont);
            return this;
        }

        public QueryBuilder collectCouontList(Integer ... collectCouont){
            this.collectCouontList = solveNullList(collectCouont);
            return this;
        }

        public QueryBuilder collectCouontList(List<Integer> collectCouont){
            this.collectCouontList = collectCouont;
            return this;
        }

        public QueryBuilder fetchCollectCouont(){
            setFetchFields("fetchFields","collectCouont");
            return this;
        }

        public QueryBuilder excludeCollectCouont(){
            setFetchFields("excludeFields","collectCouont");
            return this;
        }

        public QueryBuilder readCountBetWeen(Integer readCountSt,Integer readCountEd){
            this.readCountSt = readCountSt;
            this.readCountEd = readCountEd;
            return this;
        }

        public QueryBuilder readCountGreaterEqThan(Integer readCountSt){
            this.readCountSt = readCountSt;
            return this;
        }
        public QueryBuilder readCountLessEqThan(Integer readCountEd){
            this.readCountEd = readCountEd;
            return this;
        }


        public QueryBuilder readCount(Integer readCount){
            setReadCount(readCount);
            return this;
        }

        public QueryBuilder readCountList(Integer ... readCount){
            this.readCountList = solveNullList(readCount);
            return this;
        }

        public QueryBuilder readCountList(List<Integer> readCount){
            this.readCountList = readCount;
            return this;
        }

        public QueryBuilder fetchReadCount(){
            setFetchFields("fetchFields","readCount");
            return this;
        }

        public QueryBuilder excludeReadCount(){
            setFetchFields("excludeFields","readCount");
            return this;
        }

        public QueryBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public QueryBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public QueryBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public QueryBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public QueryBuilder content(String content){
            setContent(content);
            return this;
        }

        public QueryBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public QueryBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public QueryBuilder fetchContent(){
            setFetchFields("fetchFields","content");
            return this;
        }

        public QueryBuilder excludeContent(){
            setFetchFields("excludeFields","content");
            return this;
        }

        public QueryBuilder fuzzyPics (List<String> fuzzyPics){
            this.fuzzyPics = fuzzyPics;
            return this;
        }

        public QueryBuilder fuzzyPics (String ... fuzzyPics){
            this.fuzzyPics = solveNullList(fuzzyPics);
            return this;
        }

        public QueryBuilder rightFuzzyPics (List<String> rightFuzzyPics){
            this.rightFuzzyPics = rightFuzzyPics;
            return this;
        }

        public QueryBuilder rightFuzzyPics (String ... rightFuzzyPics){
            this.rightFuzzyPics = solveNullList(rightFuzzyPics);
            return this;
        }

        public QueryBuilder pics(String pics){
            setPics(pics);
            return this;
        }

        public QueryBuilder picsList(String ... pics){
            this.picsList = solveNullList(pics);
            return this;
        }

        public QueryBuilder picsList(List<String> pics){
            this.picsList = pics;
            return this;
        }

        public QueryBuilder fetchPics(){
            setFetchFields("fetchFields","pics");
            return this;
        }

        public QueryBuilder excludePics(){
            setFetchFields("excludeFields","pics");
            return this;
        }

        public QueryBuilder fuzzyMemberIcon (List<String> fuzzyMemberIcon){
            this.fuzzyMemberIcon = fuzzyMemberIcon;
            return this;
        }

        public QueryBuilder fuzzyMemberIcon (String ... fuzzyMemberIcon){
            this.fuzzyMemberIcon = solveNullList(fuzzyMemberIcon);
            return this;
        }

        public QueryBuilder rightFuzzyMemberIcon (List<String> rightFuzzyMemberIcon){
            this.rightFuzzyMemberIcon = rightFuzzyMemberIcon;
            return this;
        }

        public QueryBuilder rightFuzzyMemberIcon (String ... rightFuzzyMemberIcon){
            this.rightFuzzyMemberIcon = solveNullList(rightFuzzyMemberIcon);
            return this;
        }

        public QueryBuilder memberIcon(String memberIcon){
            setMemberIcon(memberIcon);
            return this;
        }

        public QueryBuilder memberIconList(String ... memberIcon){
            this.memberIconList = solveNullList(memberIcon);
            return this;
        }

        public QueryBuilder memberIconList(List<String> memberIcon){
            this.memberIconList = memberIcon;
            return this;
        }

        public QueryBuilder fetchMemberIcon(){
            setFetchFields("fetchFields","memberIcon");
            return this;
        }

        public QueryBuilder excludeMemberIcon(){
            setFetchFields("excludeFields","memberIcon");
            return this;
        }

        public QueryBuilder replayCountBetWeen(Integer replayCountSt,Integer replayCountEd){
            this.replayCountSt = replayCountSt;
            this.replayCountEd = replayCountEd;
            return this;
        }

        public QueryBuilder replayCountGreaterEqThan(Integer replayCountSt){
            this.replayCountSt = replayCountSt;
            return this;
        }
        public QueryBuilder replayCountLessEqThan(Integer replayCountEd){
            this.replayCountEd = replayCountEd;
            return this;
        }


        public QueryBuilder replayCount(Integer replayCount){
            setReplayCount(replayCount);
            return this;
        }

        public QueryBuilder replayCountList(Integer ... replayCount){
            this.replayCountList = solveNullList(replayCount);
            return this;
        }

        public QueryBuilder replayCountList(List<Integer> replayCount){
            this.replayCountList = replayCount;
            return this;
        }

        public QueryBuilder fetchReplayCount(){
            setFetchFields("fetchFields","replayCount");
            return this;
        }

        public QueryBuilder excludeReplayCount(){
            setFetchFields("excludeFields","replayCount");
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

        public PmsComment build(){return this;}
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

        private List<String> memberNickNameList;

        public List<String> getMemberNickNameList(){return this.memberNickNameList;}


        private List<String> fuzzyMemberNickName;

        public List<String> getFuzzyMemberNickName(){return this.fuzzyMemberNickName;}

        private List<String> rightFuzzyMemberNickName;

        public List<String> getRightFuzzyMemberNickName(){return this.rightFuzzyMemberNickName;}
        private List<String> productNameList;

        public List<String> getProductNameList(){return this.productNameList;}


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){return this.fuzzyProductName;}

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){return this.rightFuzzyProductName;}
        private List<Integer> starList;

        public List<Integer> getStarList(){return this.starList;}

        private Integer starSt;

        private Integer starEd;

        public Integer getStarSt(){return this.starSt;}

        public Integer getStarEd(){return this.starEd;}

        private List<String> memberIpList;

        public List<String> getMemberIpList(){return this.memberIpList;}


        private List<String> fuzzyMemberIp;

        public List<String> getFuzzyMemberIp(){return this.fuzzyMemberIp;}

        private List<String> rightFuzzyMemberIp;

        public List<String> getRightFuzzyMemberIp(){return this.rightFuzzyMemberIp;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Integer> showStatusList;

        public List<Integer> getShowStatusList(){return this.showStatusList;}

        private Integer showStatusSt;

        private Integer showStatusEd;

        public Integer getShowStatusSt(){return this.showStatusSt;}

        public Integer getShowStatusEd(){return this.showStatusEd;}

        private List<String> productAttributeList;

        public List<String> getProductAttributeList(){return this.productAttributeList;}


        private List<String> fuzzyProductAttribute;

        public List<String> getFuzzyProductAttribute(){return this.fuzzyProductAttribute;}

        private List<String> rightFuzzyProductAttribute;

        public List<String> getRightFuzzyProductAttribute(){return this.rightFuzzyProductAttribute;}
        private List<Integer> collectCouontList;

        public List<Integer> getCollectCouontList(){return this.collectCouontList;}

        private Integer collectCouontSt;

        private Integer collectCouontEd;

        public Integer getCollectCouontSt(){return this.collectCouontSt;}

        public Integer getCollectCouontEd(){return this.collectCouontEd;}

        private List<Integer> readCountList;

        public List<Integer> getReadCountList(){return this.readCountList;}

        private Integer readCountSt;

        private Integer readCountEd;

        public Integer getReadCountSt(){return this.readCountSt;}

        public Integer getReadCountEd(){return this.readCountEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<String> picsList;

        public List<String> getPicsList(){return this.picsList;}


        private List<String> fuzzyPics;

        public List<String> getFuzzyPics(){return this.fuzzyPics;}

        private List<String> rightFuzzyPics;

        public List<String> getRightFuzzyPics(){return this.rightFuzzyPics;}
        private List<String> memberIconList;

        public List<String> getMemberIconList(){return this.memberIconList;}


        private List<String> fuzzyMemberIcon;

        public List<String> getFuzzyMemberIcon(){return this.fuzzyMemberIcon;}

        private List<String> rightFuzzyMemberIcon;

        public List<String> getRightFuzzyMemberIcon(){return this.rightFuzzyMemberIcon;}
        private List<Integer> replayCountList;

        public List<Integer> getReplayCountList(){return this.replayCountList;}

        private Integer replayCountSt;

        private Integer replayCountEd;

        public Integer getReplayCountSt(){return this.replayCountSt;}

        public Integer getReplayCountEd(){return this.replayCountEd;}


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

        public ConditionBuilder fuzzyMemberNickName (List<String> fuzzyMemberNickName){
            this.fuzzyMemberNickName = fuzzyMemberNickName;
            return this;
        }

        public ConditionBuilder fuzzyMemberNickName (String ... fuzzyMemberNickName){
            this.fuzzyMemberNickName = solveNullList(fuzzyMemberNickName);
            return this;
        }

        public ConditionBuilder rightFuzzyMemberNickName (List<String> rightFuzzyMemberNickName){
            this.rightFuzzyMemberNickName = rightFuzzyMemberNickName;
            return this;
        }

        public ConditionBuilder rightFuzzyMemberNickName (String ... rightFuzzyMemberNickName){
            this.rightFuzzyMemberNickName = solveNullList(rightFuzzyMemberNickName);
            return this;
        }

        public ConditionBuilder memberNickNameList(String ... memberNickName){
            this.memberNickNameList = solveNullList(memberNickName);
            return this;
        }

        public ConditionBuilder memberNickNameList(List<String> memberNickName){
            this.memberNickNameList = memberNickName;
            return this;
        }

        public ConditionBuilder fuzzyProductName (List<String> fuzzyProductName){
            this.fuzzyProductName = fuzzyProductName;
            return this;
        }

        public ConditionBuilder fuzzyProductName (String ... fuzzyProductName){
            this.fuzzyProductName = solveNullList(fuzzyProductName);
            return this;
        }

        public ConditionBuilder rightFuzzyProductName (List<String> rightFuzzyProductName){
            this.rightFuzzyProductName = rightFuzzyProductName;
            return this;
        }

        public ConditionBuilder rightFuzzyProductName (String ... rightFuzzyProductName){
            this.rightFuzzyProductName = solveNullList(rightFuzzyProductName);
            return this;
        }

        public ConditionBuilder productNameList(String ... productName){
            this.productNameList = solveNullList(productName);
            return this;
        }

        public ConditionBuilder productNameList(List<String> productName){
            this.productNameList = productName;
            return this;
        }

        public ConditionBuilder starBetWeen(Integer starSt,Integer starEd){
            this.starSt = starSt;
            this.starEd = starEd;
            return this;
        }

        public ConditionBuilder starGreaterEqThan(Integer starSt){
            this.starSt = starSt;
            return this;
        }
        public ConditionBuilder starLessEqThan(Integer starEd){
            this.starEd = starEd;
            return this;
        }


        public ConditionBuilder starList(Integer ... star){
            this.starList = solveNullList(star);
            return this;
        }

        public ConditionBuilder starList(List<Integer> star){
            this.starList = star;
            return this;
        }

        public ConditionBuilder fuzzyMemberIp (List<String> fuzzyMemberIp){
            this.fuzzyMemberIp = fuzzyMemberIp;
            return this;
        }

        public ConditionBuilder fuzzyMemberIp (String ... fuzzyMemberIp){
            this.fuzzyMemberIp = solveNullList(fuzzyMemberIp);
            return this;
        }

        public ConditionBuilder rightFuzzyMemberIp (List<String> rightFuzzyMemberIp){
            this.rightFuzzyMemberIp = rightFuzzyMemberIp;
            return this;
        }

        public ConditionBuilder rightFuzzyMemberIp (String ... rightFuzzyMemberIp){
            this.rightFuzzyMemberIp = solveNullList(rightFuzzyMemberIp);
            return this;
        }

        public ConditionBuilder memberIpList(String ... memberIp){
            this.memberIpList = solveNullList(memberIp);
            return this;
        }

        public ConditionBuilder memberIpList(List<String> memberIp){
            this.memberIpList = memberIp;
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

        public ConditionBuilder fuzzyProductAttribute (List<String> fuzzyProductAttribute){
            this.fuzzyProductAttribute = fuzzyProductAttribute;
            return this;
        }

        public ConditionBuilder fuzzyProductAttribute (String ... fuzzyProductAttribute){
            this.fuzzyProductAttribute = solveNullList(fuzzyProductAttribute);
            return this;
        }

        public ConditionBuilder rightFuzzyProductAttribute (List<String> rightFuzzyProductAttribute){
            this.rightFuzzyProductAttribute = rightFuzzyProductAttribute;
            return this;
        }

        public ConditionBuilder rightFuzzyProductAttribute (String ... rightFuzzyProductAttribute){
            this.rightFuzzyProductAttribute = solveNullList(rightFuzzyProductAttribute);
            return this;
        }

        public ConditionBuilder productAttributeList(String ... productAttribute){
            this.productAttributeList = solveNullList(productAttribute);
            return this;
        }

        public ConditionBuilder productAttributeList(List<String> productAttribute){
            this.productAttributeList = productAttribute;
            return this;
        }

        public ConditionBuilder collectCouontBetWeen(Integer collectCouontSt,Integer collectCouontEd){
            this.collectCouontSt = collectCouontSt;
            this.collectCouontEd = collectCouontEd;
            return this;
        }

        public ConditionBuilder collectCouontGreaterEqThan(Integer collectCouontSt){
            this.collectCouontSt = collectCouontSt;
            return this;
        }
        public ConditionBuilder collectCouontLessEqThan(Integer collectCouontEd){
            this.collectCouontEd = collectCouontEd;
            return this;
        }


        public ConditionBuilder collectCouontList(Integer ... collectCouont){
            this.collectCouontList = solveNullList(collectCouont);
            return this;
        }

        public ConditionBuilder collectCouontList(List<Integer> collectCouont){
            this.collectCouontList = collectCouont;
            return this;
        }

        public ConditionBuilder readCountBetWeen(Integer readCountSt,Integer readCountEd){
            this.readCountSt = readCountSt;
            this.readCountEd = readCountEd;
            return this;
        }

        public ConditionBuilder readCountGreaterEqThan(Integer readCountSt){
            this.readCountSt = readCountSt;
            return this;
        }
        public ConditionBuilder readCountLessEqThan(Integer readCountEd){
            this.readCountEd = readCountEd;
            return this;
        }


        public ConditionBuilder readCountList(Integer ... readCount){
            this.readCountList = solveNullList(readCount);
            return this;
        }

        public ConditionBuilder readCountList(List<Integer> readCount){
            this.readCountList = readCount;
            return this;
        }

        public ConditionBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public ConditionBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public ConditionBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public ConditionBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public ConditionBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public ConditionBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public ConditionBuilder fuzzyPics (List<String> fuzzyPics){
            this.fuzzyPics = fuzzyPics;
            return this;
        }

        public ConditionBuilder fuzzyPics (String ... fuzzyPics){
            this.fuzzyPics = solveNullList(fuzzyPics);
            return this;
        }

        public ConditionBuilder rightFuzzyPics (List<String> rightFuzzyPics){
            this.rightFuzzyPics = rightFuzzyPics;
            return this;
        }

        public ConditionBuilder rightFuzzyPics (String ... rightFuzzyPics){
            this.rightFuzzyPics = solveNullList(rightFuzzyPics);
            return this;
        }

        public ConditionBuilder picsList(String ... pics){
            this.picsList = solveNullList(pics);
            return this;
        }

        public ConditionBuilder picsList(List<String> pics){
            this.picsList = pics;
            return this;
        }

        public ConditionBuilder fuzzyMemberIcon (List<String> fuzzyMemberIcon){
            this.fuzzyMemberIcon = fuzzyMemberIcon;
            return this;
        }

        public ConditionBuilder fuzzyMemberIcon (String ... fuzzyMemberIcon){
            this.fuzzyMemberIcon = solveNullList(fuzzyMemberIcon);
            return this;
        }

        public ConditionBuilder rightFuzzyMemberIcon (List<String> rightFuzzyMemberIcon){
            this.rightFuzzyMemberIcon = rightFuzzyMemberIcon;
            return this;
        }

        public ConditionBuilder rightFuzzyMemberIcon (String ... rightFuzzyMemberIcon){
            this.rightFuzzyMemberIcon = solveNullList(rightFuzzyMemberIcon);
            return this;
        }

        public ConditionBuilder memberIconList(String ... memberIcon){
            this.memberIconList = solveNullList(memberIcon);
            return this;
        }

        public ConditionBuilder memberIconList(List<String> memberIcon){
            this.memberIconList = memberIcon;
            return this;
        }

        public ConditionBuilder replayCountBetWeen(Integer replayCountSt,Integer replayCountEd){
            this.replayCountSt = replayCountSt;
            this.replayCountEd = replayCountEd;
            return this;
        }

        public ConditionBuilder replayCountGreaterEqThan(Integer replayCountSt){
            this.replayCountSt = replayCountSt;
            return this;
        }
        public ConditionBuilder replayCountLessEqThan(Integer replayCountEd){
            this.replayCountEd = replayCountEd;
            return this;
        }


        public ConditionBuilder replayCountList(Integer ... replayCount){
            this.replayCountList = solveNullList(replayCount);
            return this;
        }

        public ConditionBuilder replayCountList(List<Integer> replayCount){
            this.replayCountList = replayCount;
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

        private PmsComment obj;

        public Builder(){
            this.obj = new PmsComment();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder productId(Long productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder memberNickName(String memberNickName){
            this.obj.setMemberNickName(memberNickName);
            return this;
        }
        public Builder productName(String productName){
            this.obj.setProductName(productName);
            return this;
        }
        public Builder star(Integer star){
            this.obj.setStar(star);
            return this;
        }
        public Builder memberIp(String memberIp){
            this.obj.setMemberIp(memberIp);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder showStatus(Integer showStatus){
            this.obj.setShowStatus(showStatus);
            return this;
        }
        public Builder productAttribute(String productAttribute){
            this.obj.setProductAttribute(productAttribute);
            return this;
        }
        public Builder collectCouont(Integer collectCouont){
            this.obj.setCollectCouont(collectCouont);
            return this;
        }
        public Builder readCount(Integer readCount){
            this.obj.setReadCount(readCount);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public Builder pics(String pics){
            this.obj.setPics(pics);
            return this;
        }
        public Builder memberIcon(String memberIcon){
            this.obj.setMemberIcon(memberIcon);
            return this;
        }
        public Builder replayCount(Integer replayCount){
            this.obj.setReplayCount(replayCount);
            return this;
        }
        public PmsComment build(){return obj;}
    }

}
