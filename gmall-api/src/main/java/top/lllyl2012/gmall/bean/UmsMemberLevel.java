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
public class UmsMemberLevel implements Serializable {

    private static final long serialVersionUID = 1572702167845L;


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
    * 
    * isNullAble:1
    */
    private Integer growthPoint;

    /**
    * 是否为默认等级：0->不是；1->是
    * isNullAble:1
    */
    private Integer defaultStatus;

    /**
    * 免运费标准
    * isNullAble:1
    */
    private java.math.BigDecimal freeFreightPoint;

    /**
    * 每次评价获取的成长值
    * isNullAble:1
    */
    private Integer commentGrowthPoint;

    /**
    * 是否有免邮特权
    * isNullAble:1
    */
    private Integer priviledgeFreeFreight;

    /**
    * 是否有签到特权
    * isNullAble:1
    */
    private Integer priviledgeSignIn;

    /**
    * 是否有评论获奖励特权
    * isNullAble:1
    */
    private Integer priviledgeComment;

    /**
    * 是否有专享活动特权
    * isNullAble:1
    */
    private Integer priviledgePromotion;

    /**
    * 是否有会员价格特权
    * isNullAble:1
    */
    private Integer priviledgeMemberPrice;

    /**
    * 是否有生日特权
    * isNullAble:1
    */
    private Integer priviledgeBirthday;

    /**
    * 
    * isNullAble:1
    */
    private String note;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setGrowthPoint(Integer growthPoint){this.growthPoint = growthPoint;}

    public Integer getGrowthPoint(){return this.growthPoint;}

    public void setDefaultStatus(Integer defaultStatus){this.defaultStatus = defaultStatus;}

    public Integer getDefaultStatus(){return this.defaultStatus;}

    public void setFreeFreightPoint(java.math.BigDecimal freeFreightPoint){this.freeFreightPoint = freeFreightPoint;}

    public java.math.BigDecimal getFreeFreightPoint(){return this.freeFreightPoint;}

    public void setCommentGrowthPoint(Integer commentGrowthPoint){this.commentGrowthPoint = commentGrowthPoint;}

    public Integer getCommentGrowthPoint(){return this.commentGrowthPoint;}

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight){this.priviledgeFreeFreight = priviledgeFreeFreight;}

    public Integer getPriviledgeFreeFreight(){return this.priviledgeFreeFreight;}

    public void setPriviledgeSignIn(Integer priviledgeSignIn){this.priviledgeSignIn = priviledgeSignIn;}

    public Integer getPriviledgeSignIn(){return this.priviledgeSignIn;}

    public void setPriviledgeComment(Integer priviledgeComment){this.priviledgeComment = priviledgeComment;}

    public Integer getPriviledgeComment(){return this.priviledgeComment;}

    public void setPriviledgePromotion(Integer priviledgePromotion){this.priviledgePromotion = priviledgePromotion;}

    public Integer getPriviledgePromotion(){return this.priviledgePromotion;}

    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice){this.priviledgeMemberPrice = priviledgeMemberPrice;}

    public Integer getPriviledgeMemberPrice(){return this.priviledgeMemberPrice;}

    public void setPriviledgeBirthday(Integer priviledgeBirthday){this.priviledgeBirthday = priviledgeBirthday;}

    public Integer getPriviledgeBirthday(){return this.priviledgeBirthday;}

    public void setNote(String note){this.note = note;}

    public String getNote(){return this.note;}
    @Override
    public String toString() {
        return "UmsMemberLevel{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "growthPoint='" + growthPoint + '\'' +
                "defaultStatus='" + defaultStatus + '\'' +
                "freeFreightPoint='" + freeFreightPoint + '\'' +
                "commentGrowthPoint='" + commentGrowthPoint + '\'' +
                "priviledgeFreeFreight='" + priviledgeFreeFreight + '\'' +
                "priviledgeSignIn='" + priviledgeSignIn + '\'' +
                "priviledgeComment='" + priviledgeComment + '\'' +
                "priviledgePromotion='" + priviledgePromotion + '\'' +
                "priviledgeMemberPrice='" + priviledgeMemberPrice + '\'' +
                "priviledgeBirthday='" + priviledgeBirthday + '\'' +
                "note='" + note + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UmsMemberLevel set;

        private ConditionBuilder where;

        public UpdateBuilder set(UmsMemberLevel set){
            this.set = set;
            return this;
        }

        public UmsMemberLevel getSet(){
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

    public static class QueryBuilder extends UmsMemberLevel{
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
        private List<Integer> growthPointList;

        public List<Integer> getGrowthPointList(){return this.growthPointList;}

        private Integer growthPointSt;

        private Integer growthPointEd;

        public Integer getGrowthPointSt(){return this.growthPointSt;}

        public Integer getGrowthPointEd(){return this.growthPointEd;}

        private List<Integer> defaultStatusList;

        public List<Integer> getDefaultStatusList(){return this.defaultStatusList;}

        private Integer defaultStatusSt;

        private Integer defaultStatusEd;

        public Integer getDefaultStatusSt(){return this.defaultStatusSt;}

        public Integer getDefaultStatusEd(){return this.defaultStatusEd;}

        private List<java.math.BigDecimal> freeFreightPointList;

        public List<java.math.BigDecimal> getFreeFreightPointList(){return this.freeFreightPointList;}

        private java.math.BigDecimal freeFreightPointSt;

        private java.math.BigDecimal freeFreightPointEd;

        public java.math.BigDecimal getFreeFreightPointSt(){return this.freeFreightPointSt;}

        public java.math.BigDecimal getFreeFreightPointEd(){return this.freeFreightPointEd;}

        private List<Integer> commentGrowthPointList;

        public List<Integer> getCommentGrowthPointList(){return this.commentGrowthPointList;}

        private Integer commentGrowthPointSt;

        private Integer commentGrowthPointEd;

        public Integer getCommentGrowthPointSt(){return this.commentGrowthPointSt;}

        public Integer getCommentGrowthPointEd(){return this.commentGrowthPointEd;}

        private List<Integer> priviledgeFreeFreightList;

        public List<Integer> getPriviledgeFreeFreightList(){return this.priviledgeFreeFreightList;}

        private Integer priviledgeFreeFreightSt;

        private Integer priviledgeFreeFreightEd;

        public Integer getPriviledgeFreeFreightSt(){return this.priviledgeFreeFreightSt;}

        public Integer getPriviledgeFreeFreightEd(){return this.priviledgeFreeFreightEd;}

        private List<Integer> priviledgeSignInList;

        public List<Integer> getPriviledgeSignInList(){return this.priviledgeSignInList;}

        private Integer priviledgeSignInSt;

        private Integer priviledgeSignInEd;

        public Integer getPriviledgeSignInSt(){return this.priviledgeSignInSt;}

        public Integer getPriviledgeSignInEd(){return this.priviledgeSignInEd;}

        private List<Integer> priviledgeCommentList;

        public List<Integer> getPriviledgeCommentList(){return this.priviledgeCommentList;}

        private Integer priviledgeCommentSt;

        private Integer priviledgeCommentEd;

        public Integer getPriviledgeCommentSt(){return this.priviledgeCommentSt;}

        public Integer getPriviledgeCommentEd(){return this.priviledgeCommentEd;}

        private List<Integer> priviledgePromotionList;

        public List<Integer> getPriviledgePromotionList(){return this.priviledgePromotionList;}

        private Integer priviledgePromotionSt;

        private Integer priviledgePromotionEd;

        public Integer getPriviledgePromotionSt(){return this.priviledgePromotionSt;}

        public Integer getPriviledgePromotionEd(){return this.priviledgePromotionEd;}

        private List<Integer> priviledgeMemberPriceList;

        public List<Integer> getPriviledgeMemberPriceList(){return this.priviledgeMemberPriceList;}

        private Integer priviledgeMemberPriceSt;

        private Integer priviledgeMemberPriceEd;

        public Integer getPriviledgeMemberPriceSt(){return this.priviledgeMemberPriceSt;}

        public Integer getPriviledgeMemberPriceEd(){return this.priviledgeMemberPriceEd;}

        private List<Integer> priviledgeBirthdayList;

        public List<Integer> getPriviledgeBirthdayList(){return this.priviledgeBirthdayList;}

        private Integer priviledgeBirthdaySt;

        private Integer priviledgeBirthdayEd;

        public Integer getPriviledgeBirthdaySt(){return this.priviledgeBirthdaySt;}

        public Integer getPriviledgeBirthdayEd(){return this.priviledgeBirthdayEd;}

        private List<String> noteList;

        public List<String> getNoteList(){return this.noteList;}


        private List<String> fuzzyNote;

        public List<String> getFuzzyNote(){return this.fuzzyNote;}

        private List<String> rightFuzzyNote;

        public List<String> getRightFuzzyNote(){return this.rightFuzzyNote;}
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

        public QueryBuilder growthPointBetWeen(Integer growthPointSt,Integer growthPointEd){
            this.growthPointSt = growthPointSt;
            this.growthPointEd = growthPointEd;
            return this;
        }

        public QueryBuilder growthPointGreaterEqThan(Integer growthPointSt){
            this.growthPointSt = growthPointSt;
            return this;
        }
        public QueryBuilder growthPointLessEqThan(Integer growthPointEd){
            this.growthPointEd = growthPointEd;
            return this;
        }


        public QueryBuilder growthPoint(Integer growthPoint){
            setGrowthPoint(growthPoint);
            return this;
        }

        public QueryBuilder growthPointList(Integer ... growthPoint){
            this.growthPointList = solveNullList(growthPoint);
            return this;
        }

        public QueryBuilder growthPointList(List<Integer> growthPoint){
            this.growthPointList = growthPoint;
            return this;
        }

        public QueryBuilder fetchGrowthPoint(){
            setFetchFields("fetchFields","growthPoint");
            return this;
        }

        public QueryBuilder excludeGrowthPoint(){
            setFetchFields("excludeFields","growthPoint");
            return this;
        }

        public QueryBuilder defaultStatusBetWeen(Integer defaultStatusSt,Integer defaultStatusEd){
            this.defaultStatusSt = defaultStatusSt;
            this.defaultStatusEd = defaultStatusEd;
            return this;
        }

        public QueryBuilder defaultStatusGreaterEqThan(Integer defaultStatusSt){
            this.defaultStatusSt = defaultStatusSt;
            return this;
        }
        public QueryBuilder defaultStatusLessEqThan(Integer defaultStatusEd){
            this.defaultStatusEd = defaultStatusEd;
            return this;
        }


        public QueryBuilder defaultStatus(Integer defaultStatus){
            setDefaultStatus(defaultStatus);
            return this;
        }

        public QueryBuilder defaultStatusList(Integer ... defaultStatus){
            this.defaultStatusList = solveNullList(defaultStatus);
            return this;
        }

        public QueryBuilder defaultStatusList(List<Integer> defaultStatus){
            this.defaultStatusList = defaultStatus;
            return this;
        }

        public QueryBuilder fetchDefaultStatus(){
            setFetchFields("fetchFields","defaultStatus");
            return this;
        }

        public QueryBuilder excludeDefaultStatus(){
            setFetchFields("excludeFields","defaultStatus");
            return this;
        }

        public QueryBuilder freeFreightPointBetWeen(java.math.BigDecimal freeFreightPointSt,java.math.BigDecimal freeFreightPointEd){
            this.freeFreightPointSt = freeFreightPointSt;
            this.freeFreightPointEd = freeFreightPointEd;
            return this;
        }

        public QueryBuilder freeFreightPointGreaterEqThan(java.math.BigDecimal freeFreightPointSt){
            this.freeFreightPointSt = freeFreightPointSt;
            return this;
        }
        public QueryBuilder freeFreightPointLessEqThan(java.math.BigDecimal freeFreightPointEd){
            this.freeFreightPointEd = freeFreightPointEd;
            return this;
        }


        public QueryBuilder freeFreightPoint(java.math.BigDecimal freeFreightPoint){
            setFreeFreightPoint(freeFreightPoint);
            return this;
        }

        public QueryBuilder freeFreightPointList(java.math.BigDecimal ... freeFreightPoint){
            this.freeFreightPointList = solveNullList(freeFreightPoint);
            return this;
        }

        public QueryBuilder freeFreightPointList(List<java.math.BigDecimal> freeFreightPoint){
            this.freeFreightPointList = freeFreightPoint;
            return this;
        }

        public QueryBuilder fetchFreeFreightPoint(){
            setFetchFields("fetchFields","freeFreightPoint");
            return this;
        }

        public QueryBuilder excludeFreeFreightPoint(){
            setFetchFields("excludeFields","freeFreightPoint");
            return this;
        }

        public QueryBuilder commentGrowthPointBetWeen(Integer commentGrowthPointSt,Integer commentGrowthPointEd){
            this.commentGrowthPointSt = commentGrowthPointSt;
            this.commentGrowthPointEd = commentGrowthPointEd;
            return this;
        }

        public QueryBuilder commentGrowthPointGreaterEqThan(Integer commentGrowthPointSt){
            this.commentGrowthPointSt = commentGrowthPointSt;
            return this;
        }
        public QueryBuilder commentGrowthPointLessEqThan(Integer commentGrowthPointEd){
            this.commentGrowthPointEd = commentGrowthPointEd;
            return this;
        }


        public QueryBuilder commentGrowthPoint(Integer commentGrowthPoint){
            setCommentGrowthPoint(commentGrowthPoint);
            return this;
        }

        public QueryBuilder commentGrowthPointList(Integer ... commentGrowthPoint){
            this.commentGrowthPointList = solveNullList(commentGrowthPoint);
            return this;
        }

        public QueryBuilder commentGrowthPointList(List<Integer> commentGrowthPoint){
            this.commentGrowthPointList = commentGrowthPoint;
            return this;
        }

        public QueryBuilder fetchCommentGrowthPoint(){
            setFetchFields("fetchFields","commentGrowthPoint");
            return this;
        }

        public QueryBuilder excludeCommentGrowthPoint(){
            setFetchFields("excludeFields","commentGrowthPoint");
            return this;
        }

        public QueryBuilder priviledgeFreeFreightBetWeen(Integer priviledgeFreeFreightSt,Integer priviledgeFreeFreightEd){
            this.priviledgeFreeFreightSt = priviledgeFreeFreightSt;
            this.priviledgeFreeFreightEd = priviledgeFreeFreightEd;
            return this;
        }

        public QueryBuilder priviledgeFreeFreightGreaterEqThan(Integer priviledgeFreeFreightSt){
            this.priviledgeFreeFreightSt = priviledgeFreeFreightSt;
            return this;
        }
        public QueryBuilder priviledgeFreeFreightLessEqThan(Integer priviledgeFreeFreightEd){
            this.priviledgeFreeFreightEd = priviledgeFreeFreightEd;
            return this;
        }


        public QueryBuilder priviledgeFreeFreight(Integer priviledgeFreeFreight){
            setPriviledgeFreeFreight(priviledgeFreeFreight);
            return this;
        }

        public QueryBuilder priviledgeFreeFreightList(Integer ... priviledgeFreeFreight){
            this.priviledgeFreeFreightList = solveNullList(priviledgeFreeFreight);
            return this;
        }

        public QueryBuilder priviledgeFreeFreightList(List<Integer> priviledgeFreeFreight){
            this.priviledgeFreeFreightList = priviledgeFreeFreight;
            return this;
        }

        public QueryBuilder fetchPriviledgeFreeFreight(){
            setFetchFields("fetchFields","priviledgeFreeFreight");
            return this;
        }

        public QueryBuilder excludePriviledgeFreeFreight(){
            setFetchFields("excludeFields","priviledgeFreeFreight");
            return this;
        }

        public QueryBuilder priviledgeSignInBetWeen(Integer priviledgeSignInSt,Integer priviledgeSignInEd){
            this.priviledgeSignInSt = priviledgeSignInSt;
            this.priviledgeSignInEd = priviledgeSignInEd;
            return this;
        }

        public QueryBuilder priviledgeSignInGreaterEqThan(Integer priviledgeSignInSt){
            this.priviledgeSignInSt = priviledgeSignInSt;
            return this;
        }
        public QueryBuilder priviledgeSignInLessEqThan(Integer priviledgeSignInEd){
            this.priviledgeSignInEd = priviledgeSignInEd;
            return this;
        }


        public QueryBuilder priviledgeSignIn(Integer priviledgeSignIn){
            setPriviledgeSignIn(priviledgeSignIn);
            return this;
        }

        public QueryBuilder priviledgeSignInList(Integer ... priviledgeSignIn){
            this.priviledgeSignInList = solveNullList(priviledgeSignIn);
            return this;
        }

        public QueryBuilder priviledgeSignInList(List<Integer> priviledgeSignIn){
            this.priviledgeSignInList = priviledgeSignIn;
            return this;
        }

        public QueryBuilder fetchPriviledgeSignIn(){
            setFetchFields("fetchFields","priviledgeSignIn");
            return this;
        }

        public QueryBuilder excludePriviledgeSignIn(){
            setFetchFields("excludeFields","priviledgeSignIn");
            return this;
        }

        public QueryBuilder priviledgeCommentBetWeen(Integer priviledgeCommentSt,Integer priviledgeCommentEd){
            this.priviledgeCommentSt = priviledgeCommentSt;
            this.priviledgeCommentEd = priviledgeCommentEd;
            return this;
        }

        public QueryBuilder priviledgeCommentGreaterEqThan(Integer priviledgeCommentSt){
            this.priviledgeCommentSt = priviledgeCommentSt;
            return this;
        }
        public QueryBuilder priviledgeCommentLessEqThan(Integer priviledgeCommentEd){
            this.priviledgeCommentEd = priviledgeCommentEd;
            return this;
        }


        public QueryBuilder priviledgeComment(Integer priviledgeComment){
            setPriviledgeComment(priviledgeComment);
            return this;
        }

        public QueryBuilder priviledgeCommentList(Integer ... priviledgeComment){
            this.priviledgeCommentList = solveNullList(priviledgeComment);
            return this;
        }

        public QueryBuilder priviledgeCommentList(List<Integer> priviledgeComment){
            this.priviledgeCommentList = priviledgeComment;
            return this;
        }

        public QueryBuilder fetchPriviledgeComment(){
            setFetchFields("fetchFields","priviledgeComment");
            return this;
        }

        public QueryBuilder excludePriviledgeComment(){
            setFetchFields("excludeFields","priviledgeComment");
            return this;
        }

        public QueryBuilder priviledgePromotionBetWeen(Integer priviledgePromotionSt,Integer priviledgePromotionEd){
            this.priviledgePromotionSt = priviledgePromotionSt;
            this.priviledgePromotionEd = priviledgePromotionEd;
            return this;
        }

        public QueryBuilder priviledgePromotionGreaterEqThan(Integer priviledgePromotionSt){
            this.priviledgePromotionSt = priviledgePromotionSt;
            return this;
        }
        public QueryBuilder priviledgePromotionLessEqThan(Integer priviledgePromotionEd){
            this.priviledgePromotionEd = priviledgePromotionEd;
            return this;
        }


        public QueryBuilder priviledgePromotion(Integer priviledgePromotion){
            setPriviledgePromotion(priviledgePromotion);
            return this;
        }

        public QueryBuilder priviledgePromotionList(Integer ... priviledgePromotion){
            this.priviledgePromotionList = solveNullList(priviledgePromotion);
            return this;
        }

        public QueryBuilder priviledgePromotionList(List<Integer> priviledgePromotion){
            this.priviledgePromotionList = priviledgePromotion;
            return this;
        }

        public QueryBuilder fetchPriviledgePromotion(){
            setFetchFields("fetchFields","priviledgePromotion");
            return this;
        }

        public QueryBuilder excludePriviledgePromotion(){
            setFetchFields("excludeFields","priviledgePromotion");
            return this;
        }

        public QueryBuilder priviledgeMemberPriceBetWeen(Integer priviledgeMemberPriceSt,Integer priviledgeMemberPriceEd){
            this.priviledgeMemberPriceSt = priviledgeMemberPriceSt;
            this.priviledgeMemberPriceEd = priviledgeMemberPriceEd;
            return this;
        }

        public QueryBuilder priviledgeMemberPriceGreaterEqThan(Integer priviledgeMemberPriceSt){
            this.priviledgeMemberPriceSt = priviledgeMemberPriceSt;
            return this;
        }
        public QueryBuilder priviledgeMemberPriceLessEqThan(Integer priviledgeMemberPriceEd){
            this.priviledgeMemberPriceEd = priviledgeMemberPriceEd;
            return this;
        }


        public QueryBuilder priviledgeMemberPrice(Integer priviledgeMemberPrice){
            setPriviledgeMemberPrice(priviledgeMemberPrice);
            return this;
        }

        public QueryBuilder priviledgeMemberPriceList(Integer ... priviledgeMemberPrice){
            this.priviledgeMemberPriceList = solveNullList(priviledgeMemberPrice);
            return this;
        }

        public QueryBuilder priviledgeMemberPriceList(List<Integer> priviledgeMemberPrice){
            this.priviledgeMemberPriceList = priviledgeMemberPrice;
            return this;
        }

        public QueryBuilder fetchPriviledgeMemberPrice(){
            setFetchFields("fetchFields","priviledgeMemberPrice");
            return this;
        }

        public QueryBuilder excludePriviledgeMemberPrice(){
            setFetchFields("excludeFields","priviledgeMemberPrice");
            return this;
        }

        public QueryBuilder priviledgeBirthdayBetWeen(Integer priviledgeBirthdaySt,Integer priviledgeBirthdayEd){
            this.priviledgeBirthdaySt = priviledgeBirthdaySt;
            this.priviledgeBirthdayEd = priviledgeBirthdayEd;
            return this;
        }

        public QueryBuilder priviledgeBirthdayGreaterEqThan(Integer priviledgeBirthdaySt){
            this.priviledgeBirthdaySt = priviledgeBirthdaySt;
            return this;
        }
        public QueryBuilder priviledgeBirthdayLessEqThan(Integer priviledgeBirthdayEd){
            this.priviledgeBirthdayEd = priviledgeBirthdayEd;
            return this;
        }


        public QueryBuilder priviledgeBirthday(Integer priviledgeBirthday){
            setPriviledgeBirthday(priviledgeBirthday);
            return this;
        }

        public QueryBuilder priviledgeBirthdayList(Integer ... priviledgeBirthday){
            this.priviledgeBirthdayList = solveNullList(priviledgeBirthday);
            return this;
        }

        public QueryBuilder priviledgeBirthdayList(List<Integer> priviledgeBirthday){
            this.priviledgeBirthdayList = priviledgeBirthday;
            return this;
        }

        public QueryBuilder fetchPriviledgeBirthday(){
            setFetchFields("fetchFields","priviledgeBirthday");
            return this;
        }

        public QueryBuilder excludePriviledgeBirthday(){
            setFetchFields("excludeFields","priviledgeBirthday");
            return this;
        }

        public QueryBuilder fuzzyNote (List<String> fuzzyNote){
            this.fuzzyNote = fuzzyNote;
            return this;
        }

        public QueryBuilder fuzzyNote (String ... fuzzyNote){
            this.fuzzyNote = solveNullList(fuzzyNote);
            return this;
        }

        public QueryBuilder rightFuzzyNote (List<String> rightFuzzyNote){
            this.rightFuzzyNote = rightFuzzyNote;
            return this;
        }

        public QueryBuilder rightFuzzyNote (String ... rightFuzzyNote){
            this.rightFuzzyNote = solveNullList(rightFuzzyNote);
            return this;
        }

        public QueryBuilder note(String note){
            setNote(note);
            return this;
        }

        public QueryBuilder noteList(String ... note){
            this.noteList = solveNullList(note);
            return this;
        }

        public QueryBuilder noteList(List<String> note){
            this.noteList = note;
            return this;
        }

        public QueryBuilder fetchNote(){
            setFetchFields("fetchFields","note");
            return this;
        }

        public QueryBuilder excludeNote(){
            setFetchFields("excludeFields","note");
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

        public UmsMemberLevel build(){return this;}
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
        private List<Integer> growthPointList;

        public List<Integer> getGrowthPointList(){return this.growthPointList;}

        private Integer growthPointSt;

        private Integer growthPointEd;

        public Integer getGrowthPointSt(){return this.growthPointSt;}

        public Integer getGrowthPointEd(){return this.growthPointEd;}

        private List<Integer> defaultStatusList;

        public List<Integer> getDefaultStatusList(){return this.defaultStatusList;}

        private Integer defaultStatusSt;

        private Integer defaultStatusEd;

        public Integer getDefaultStatusSt(){return this.defaultStatusSt;}

        public Integer getDefaultStatusEd(){return this.defaultStatusEd;}

        private List<java.math.BigDecimal> freeFreightPointList;

        public List<java.math.BigDecimal> getFreeFreightPointList(){return this.freeFreightPointList;}

        private java.math.BigDecimal freeFreightPointSt;

        private java.math.BigDecimal freeFreightPointEd;

        public java.math.BigDecimal getFreeFreightPointSt(){return this.freeFreightPointSt;}

        public java.math.BigDecimal getFreeFreightPointEd(){return this.freeFreightPointEd;}

        private List<Integer> commentGrowthPointList;

        public List<Integer> getCommentGrowthPointList(){return this.commentGrowthPointList;}

        private Integer commentGrowthPointSt;

        private Integer commentGrowthPointEd;

        public Integer getCommentGrowthPointSt(){return this.commentGrowthPointSt;}

        public Integer getCommentGrowthPointEd(){return this.commentGrowthPointEd;}

        private List<Integer> priviledgeFreeFreightList;

        public List<Integer> getPriviledgeFreeFreightList(){return this.priviledgeFreeFreightList;}

        private Integer priviledgeFreeFreightSt;

        private Integer priviledgeFreeFreightEd;

        public Integer getPriviledgeFreeFreightSt(){return this.priviledgeFreeFreightSt;}

        public Integer getPriviledgeFreeFreightEd(){return this.priviledgeFreeFreightEd;}

        private List<Integer> priviledgeSignInList;

        public List<Integer> getPriviledgeSignInList(){return this.priviledgeSignInList;}

        private Integer priviledgeSignInSt;

        private Integer priviledgeSignInEd;

        public Integer getPriviledgeSignInSt(){return this.priviledgeSignInSt;}

        public Integer getPriviledgeSignInEd(){return this.priviledgeSignInEd;}

        private List<Integer> priviledgeCommentList;

        public List<Integer> getPriviledgeCommentList(){return this.priviledgeCommentList;}

        private Integer priviledgeCommentSt;

        private Integer priviledgeCommentEd;

        public Integer getPriviledgeCommentSt(){return this.priviledgeCommentSt;}

        public Integer getPriviledgeCommentEd(){return this.priviledgeCommentEd;}

        private List<Integer> priviledgePromotionList;

        public List<Integer> getPriviledgePromotionList(){return this.priviledgePromotionList;}

        private Integer priviledgePromotionSt;

        private Integer priviledgePromotionEd;

        public Integer getPriviledgePromotionSt(){return this.priviledgePromotionSt;}

        public Integer getPriviledgePromotionEd(){return this.priviledgePromotionEd;}

        private List<Integer> priviledgeMemberPriceList;

        public List<Integer> getPriviledgeMemberPriceList(){return this.priviledgeMemberPriceList;}

        private Integer priviledgeMemberPriceSt;

        private Integer priviledgeMemberPriceEd;

        public Integer getPriviledgeMemberPriceSt(){return this.priviledgeMemberPriceSt;}

        public Integer getPriviledgeMemberPriceEd(){return this.priviledgeMemberPriceEd;}

        private List<Integer> priviledgeBirthdayList;

        public List<Integer> getPriviledgeBirthdayList(){return this.priviledgeBirthdayList;}

        private Integer priviledgeBirthdaySt;

        private Integer priviledgeBirthdayEd;

        public Integer getPriviledgeBirthdaySt(){return this.priviledgeBirthdaySt;}

        public Integer getPriviledgeBirthdayEd(){return this.priviledgeBirthdayEd;}

        private List<String> noteList;

        public List<String> getNoteList(){return this.noteList;}


        private List<String> fuzzyNote;

        public List<String> getFuzzyNote(){return this.fuzzyNote;}

        private List<String> rightFuzzyNote;

        public List<String> getRightFuzzyNote(){return this.rightFuzzyNote;}

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

        public ConditionBuilder growthPointBetWeen(Integer growthPointSt,Integer growthPointEd){
            this.growthPointSt = growthPointSt;
            this.growthPointEd = growthPointEd;
            return this;
        }

        public ConditionBuilder growthPointGreaterEqThan(Integer growthPointSt){
            this.growthPointSt = growthPointSt;
            return this;
        }
        public ConditionBuilder growthPointLessEqThan(Integer growthPointEd){
            this.growthPointEd = growthPointEd;
            return this;
        }


        public ConditionBuilder growthPointList(Integer ... growthPoint){
            this.growthPointList = solveNullList(growthPoint);
            return this;
        }

        public ConditionBuilder growthPointList(List<Integer> growthPoint){
            this.growthPointList = growthPoint;
            return this;
        }

        public ConditionBuilder defaultStatusBetWeen(Integer defaultStatusSt,Integer defaultStatusEd){
            this.defaultStatusSt = defaultStatusSt;
            this.defaultStatusEd = defaultStatusEd;
            return this;
        }

        public ConditionBuilder defaultStatusGreaterEqThan(Integer defaultStatusSt){
            this.defaultStatusSt = defaultStatusSt;
            return this;
        }
        public ConditionBuilder defaultStatusLessEqThan(Integer defaultStatusEd){
            this.defaultStatusEd = defaultStatusEd;
            return this;
        }


        public ConditionBuilder defaultStatusList(Integer ... defaultStatus){
            this.defaultStatusList = solveNullList(defaultStatus);
            return this;
        }

        public ConditionBuilder defaultStatusList(List<Integer> defaultStatus){
            this.defaultStatusList = defaultStatus;
            return this;
        }

        public ConditionBuilder freeFreightPointBetWeen(java.math.BigDecimal freeFreightPointSt,java.math.BigDecimal freeFreightPointEd){
            this.freeFreightPointSt = freeFreightPointSt;
            this.freeFreightPointEd = freeFreightPointEd;
            return this;
        }

        public ConditionBuilder freeFreightPointGreaterEqThan(java.math.BigDecimal freeFreightPointSt){
            this.freeFreightPointSt = freeFreightPointSt;
            return this;
        }
        public ConditionBuilder freeFreightPointLessEqThan(java.math.BigDecimal freeFreightPointEd){
            this.freeFreightPointEd = freeFreightPointEd;
            return this;
        }


        public ConditionBuilder freeFreightPointList(java.math.BigDecimal ... freeFreightPoint){
            this.freeFreightPointList = solveNullList(freeFreightPoint);
            return this;
        }

        public ConditionBuilder freeFreightPointList(List<java.math.BigDecimal> freeFreightPoint){
            this.freeFreightPointList = freeFreightPoint;
            return this;
        }

        public ConditionBuilder commentGrowthPointBetWeen(Integer commentGrowthPointSt,Integer commentGrowthPointEd){
            this.commentGrowthPointSt = commentGrowthPointSt;
            this.commentGrowthPointEd = commentGrowthPointEd;
            return this;
        }

        public ConditionBuilder commentGrowthPointGreaterEqThan(Integer commentGrowthPointSt){
            this.commentGrowthPointSt = commentGrowthPointSt;
            return this;
        }
        public ConditionBuilder commentGrowthPointLessEqThan(Integer commentGrowthPointEd){
            this.commentGrowthPointEd = commentGrowthPointEd;
            return this;
        }


        public ConditionBuilder commentGrowthPointList(Integer ... commentGrowthPoint){
            this.commentGrowthPointList = solveNullList(commentGrowthPoint);
            return this;
        }

        public ConditionBuilder commentGrowthPointList(List<Integer> commentGrowthPoint){
            this.commentGrowthPointList = commentGrowthPoint;
            return this;
        }

        public ConditionBuilder priviledgeFreeFreightBetWeen(Integer priviledgeFreeFreightSt,Integer priviledgeFreeFreightEd){
            this.priviledgeFreeFreightSt = priviledgeFreeFreightSt;
            this.priviledgeFreeFreightEd = priviledgeFreeFreightEd;
            return this;
        }

        public ConditionBuilder priviledgeFreeFreightGreaterEqThan(Integer priviledgeFreeFreightSt){
            this.priviledgeFreeFreightSt = priviledgeFreeFreightSt;
            return this;
        }
        public ConditionBuilder priviledgeFreeFreightLessEqThan(Integer priviledgeFreeFreightEd){
            this.priviledgeFreeFreightEd = priviledgeFreeFreightEd;
            return this;
        }


        public ConditionBuilder priviledgeFreeFreightList(Integer ... priviledgeFreeFreight){
            this.priviledgeFreeFreightList = solveNullList(priviledgeFreeFreight);
            return this;
        }

        public ConditionBuilder priviledgeFreeFreightList(List<Integer> priviledgeFreeFreight){
            this.priviledgeFreeFreightList = priviledgeFreeFreight;
            return this;
        }

        public ConditionBuilder priviledgeSignInBetWeen(Integer priviledgeSignInSt,Integer priviledgeSignInEd){
            this.priviledgeSignInSt = priviledgeSignInSt;
            this.priviledgeSignInEd = priviledgeSignInEd;
            return this;
        }

        public ConditionBuilder priviledgeSignInGreaterEqThan(Integer priviledgeSignInSt){
            this.priviledgeSignInSt = priviledgeSignInSt;
            return this;
        }
        public ConditionBuilder priviledgeSignInLessEqThan(Integer priviledgeSignInEd){
            this.priviledgeSignInEd = priviledgeSignInEd;
            return this;
        }


        public ConditionBuilder priviledgeSignInList(Integer ... priviledgeSignIn){
            this.priviledgeSignInList = solveNullList(priviledgeSignIn);
            return this;
        }

        public ConditionBuilder priviledgeSignInList(List<Integer> priviledgeSignIn){
            this.priviledgeSignInList = priviledgeSignIn;
            return this;
        }

        public ConditionBuilder priviledgeCommentBetWeen(Integer priviledgeCommentSt,Integer priviledgeCommentEd){
            this.priviledgeCommentSt = priviledgeCommentSt;
            this.priviledgeCommentEd = priviledgeCommentEd;
            return this;
        }

        public ConditionBuilder priviledgeCommentGreaterEqThan(Integer priviledgeCommentSt){
            this.priviledgeCommentSt = priviledgeCommentSt;
            return this;
        }
        public ConditionBuilder priviledgeCommentLessEqThan(Integer priviledgeCommentEd){
            this.priviledgeCommentEd = priviledgeCommentEd;
            return this;
        }


        public ConditionBuilder priviledgeCommentList(Integer ... priviledgeComment){
            this.priviledgeCommentList = solveNullList(priviledgeComment);
            return this;
        }

        public ConditionBuilder priviledgeCommentList(List<Integer> priviledgeComment){
            this.priviledgeCommentList = priviledgeComment;
            return this;
        }

        public ConditionBuilder priviledgePromotionBetWeen(Integer priviledgePromotionSt,Integer priviledgePromotionEd){
            this.priviledgePromotionSt = priviledgePromotionSt;
            this.priviledgePromotionEd = priviledgePromotionEd;
            return this;
        }

        public ConditionBuilder priviledgePromotionGreaterEqThan(Integer priviledgePromotionSt){
            this.priviledgePromotionSt = priviledgePromotionSt;
            return this;
        }
        public ConditionBuilder priviledgePromotionLessEqThan(Integer priviledgePromotionEd){
            this.priviledgePromotionEd = priviledgePromotionEd;
            return this;
        }


        public ConditionBuilder priviledgePromotionList(Integer ... priviledgePromotion){
            this.priviledgePromotionList = solveNullList(priviledgePromotion);
            return this;
        }

        public ConditionBuilder priviledgePromotionList(List<Integer> priviledgePromotion){
            this.priviledgePromotionList = priviledgePromotion;
            return this;
        }

        public ConditionBuilder priviledgeMemberPriceBetWeen(Integer priviledgeMemberPriceSt,Integer priviledgeMemberPriceEd){
            this.priviledgeMemberPriceSt = priviledgeMemberPriceSt;
            this.priviledgeMemberPriceEd = priviledgeMemberPriceEd;
            return this;
        }

        public ConditionBuilder priviledgeMemberPriceGreaterEqThan(Integer priviledgeMemberPriceSt){
            this.priviledgeMemberPriceSt = priviledgeMemberPriceSt;
            return this;
        }
        public ConditionBuilder priviledgeMemberPriceLessEqThan(Integer priviledgeMemberPriceEd){
            this.priviledgeMemberPriceEd = priviledgeMemberPriceEd;
            return this;
        }


        public ConditionBuilder priviledgeMemberPriceList(Integer ... priviledgeMemberPrice){
            this.priviledgeMemberPriceList = solveNullList(priviledgeMemberPrice);
            return this;
        }

        public ConditionBuilder priviledgeMemberPriceList(List<Integer> priviledgeMemberPrice){
            this.priviledgeMemberPriceList = priviledgeMemberPrice;
            return this;
        }

        public ConditionBuilder priviledgeBirthdayBetWeen(Integer priviledgeBirthdaySt,Integer priviledgeBirthdayEd){
            this.priviledgeBirthdaySt = priviledgeBirthdaySt;
            this.priviledgeBirthdayEd = priviledgeBirthdayEd;
            return this;
        }

        public ConditionBuilder priviledgeBirthdayGreaterEqThan(Integer priviledgeBirthdaySt){
            this.priviledgeBirthdaySt = priviledgeBirthdaySt;
            return this;
        }
        public ConditionBuilder priviledgeBirthdayLessEqThan(Integer priviledgeBirthdayEd){
            this.priviledgeBirthdayEd = priviledgeBirthdayEd;
            return this;
        }


        public ConditionBuilder priviledgeBirthdayList(Integer ... priviledgeBirthday){
            this.priviledgeBirthdayList = solveNullList(priviledgeBirthday);
            return this;
        }

        public ConditionBuilder priviledgeBirthdayList(List<Integer> priviledgeBirthday){
            this.priviledgeBirthdayList = priviledgeBirthday;
            return this;
        }

        public ConditionBuilder fuzzyNote (List<String> fuzzyNote){
            this.fuzzyNote = fuzzyNote;
            return this;
        }

        public ConditionBuilder fuzzyNote (String ... fuzzyNote){
            this.fuzzyNote = solveNullList(fuzzyNote);
            return this;
        }

        public ConditionBuilder rightFuzzyNote (List<String> rightFuzzyNote){
            this.rightFuzzyNote = rightFuzzyNote;
            return this;
        }

        public ConditionBuilder rightFuzzyNote (String ... rightFuzzyNote){
            this.rightFuzzyNote = solveNullList(rightFuzzyNote);
            return this;
        }

        public ConditionBuilder noteList(String ... note){
            this.noteList = solveNullList(note);
            return this;
        }

        public ConditionBuilder noteList(List<String> note){
            this.noteList = note;
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

        private UmsMemberLevel obj;

        public Builder(){
            this.obj = new UmsMemberLevel();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder growthPoint(Integer growthPoint){
            this.obj.setGrowthPoint(growthPoint);
            return this;
        }
        public Builder defaultStatus(Integer defaultStatus){
            this.obj.setDefaultStatus(defaultStatus);
            return this;
        }
        public Builder freeFreightPoint(java.math.BigDecimal freeFreightPoint){
            this.obj.setFreeFreightPoint(freeFreightPoint);
            return this;
        }
        public Builder commentGrowthPoint(Integer commentGrowthPoint){
            this.obj.setCommentGrowthPoint(commentGrowthPoint);
            return this;
        }
        public Builder priviledgeFreeFreight(Integer priviledgeFreeFreight){
            this.obj.setPriviledgeFreeFreight(priviledgeFreeFreight);
            return this;
        }
        public Builder priviledgeSignIn(Integer priviledgeSignIn){
            this.obj.setPriviledgeSignIn(priviledgeSignIn);
            return this;
        }
        public Builder priviledgeComment(Integer priviledgeComment){
            this.obj.setPriviledgeComment(priviledgeComment);
            return this;
        }
        public Builder priviledgePromotion(Integer priviledgePromotion){
            this.obj.setPriviledgePromotion(priviledgePromotion);
            return this;
        }
        public Builder priviledgeMemberPrice(Integer priviledgeMemberPrice){
            this.obj.setPriviledgeMemberPrice(priviledgeMemberPrice);
            return this;
        }
        public Builder priviledgeBirthday(Integer priviledgeBirthday){
            this.obj.setPriviledgeBirthday(priviledgeBirthday);
            return this;
        }
        public Builder note(String note){
            this.obj.setNote(note);
            return this;
        }
        public UmsMemberLevel build(){return obj;}
    }

}
