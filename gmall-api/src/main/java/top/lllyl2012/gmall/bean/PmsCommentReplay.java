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
public class PmsCommentReplay implements Serializable {

    private static final long serialVersionUID = 1573824729691L;


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
    private Long commentId;

    /**
    * 
    * isNullAble:1
    */
    private String memberNickName;

    /**
    * 
    * isNullAble:1
    */
    private String memberIcon;

    /**
    * 
    * isNullAble:1
    */
    private String content;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 评论人员类型；0->会员；1->管理员
    * isNullAble:1
    */
    private Integer type;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setCommentId(Long commentId){this.commentId = commentId;}

    public Long getCommentId(){return this.commentId;}

    public void setMemberNickName(String memberNickName){this.memberNickName = memberNickName;}

    public String getMemberNickName(){return this.memberNickName;}

    public void setMemberIcon(String memberIcon){this.memberIcon = memberIcon;}

    public String getMemberIcon(){return this.memberIcon;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}
    @Override
    public String toString() {
        return "PmsCommentReplay{" +
                "id='" + id + '\'' +
                "commentId='" + commentId + '\'' +
                "memberNickName='" + memberNickName + '\'' +
                "memberIcon='" + memberIcon + '\'' +
                "content='" + content + '\'' +
                "createTime='" + createTime + '\'' +
                "type='" + type + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PmsCommentReplay set;

        private ConditionBuilder where;

        public UpdateBuilder set(PmsCommentReplay set){
            this.set = set;
            return this;
        }

        public PmsCommentReplay getSet(){
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

    public static class QueryBuilder extends PmsCommentReplay{
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

        private List<Long> commentIdList;

        public List<Long> getCommentIdList(){return this.commentIdList;}

        private Long commentIdSt;

        private Long commentIdEd;

        public Long getCommentIdSt(){return this.commentIdSt;}

        public Long getCommentIdEd(){return this.commentIdEd;}

        private List<String> memberNickNameList;

        public List<String> getMemberNickNameList(){return this.memberNickNameList;}


        private List<String> fuzzyMemberNickName;

        public List<String> getFuzzyMemberNickName(){return this.fuzzyMemberNickName;}

        private List<String> rightFuzzyMemberNickName;

        public List<String> getRightFuzzyMemberNickName(){return this.rightFuzzyMemberNickName;}
        private List<String> memberIconList;

        public List<String> getMemberIconList(){return this.memberIconList;}


        private List<String> fuzzyMemberIcon;

        public List<String> getFuzzyMemberIcon(){return this.fuzzyMemberIcon;}

        private List<String> rightFuzzyMemberIcon;

        public List<String> getRightFuzzyMemberIcon(){return this.rightFuzzyMemberIcon;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

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

        public QueryBuilder commentIdBetWeen(Long commentIdSt,Long commentIdEd){
            this.commentIdSt = commentIdSt;
            this.commentIdEd = commentIdEd;
            return this;
        }

        public QueryBuilder commentIdGreaterEqThan(Long commentIdSt){
            this.commentIdSt = commentIdSt;
            return this;
        }
        public QueryBuilder commentIdLessEqThan(Long commentIdEd){
            this.commentIdEd = commentIdEd;
            return this;
        }


        public QueryBuilder commentId(Long commentId){
            setCommentId(commentId);
            return this;
        }

        public QueryBuilder commentIdList(Long ... commentId){
            this.commentIdList = solveNullList(commentId);
            return this;
        }

        public QueryBuilder commentIdList(List<Long> commentId){
            this.commentIdList = commentId;
            return this;
        }

        public QueryBuilder fetchCommentId(){
            setFetchFields("fetchFields","commentId");
            return this;
        }

        public QueryBuilder excludeCommentId(){
            setFetchFields("excludeFields","commentId");
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

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
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

        public PmsCommentReplay build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> commentIdList;

        public List<Long> getCommentIdList(){return this.commentIdList;}

        private Long commentIdSt;

        private Long commentIdEd;

        public Long getCommentIdSt(){return this.commentIdSt;}

        public Long getCommentIdEd(){return this.commentIdEd;}

        private List<String> memberNickNameList;

        public List<String> getMemberNickNameList(){return this.memberNickNameList;}


        private List<String> fuzzyMemberNickName;

        public List<String> getFuzzyMemberNickName(){return this.fuzzyMemberNickName;}

        private List<String> rightFuzzyMemberNickName;

        public List<String> getRightFuzzyMemberNickName(){return this.rightFuzzyMemberNickName;}
        private List<String> memberIconList;

        public List<String> getMemberIconList(){return this.memberIconList;}


        private List<String> fuzzyMemberIcon;

        public List<String> getFuzzyMemberIcon(){return this.fuzzyMemberIcon;}

        private List<String> rightFuzzyMemberIcon;

        public List<String> getRightFuzzyMemberIcon(){return this.rightFuzzyMemberIcon;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}


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

        public ConditionBuilder commentIdBetWeen(Long commentIdSt,Long commentIdEd){
            this.commentIdSt = commentIdSt;
            this.commentIdEd = commentIdEd;
            return this;
        }

        public ConditionBuilder commentIdGreaterEqThan(Long commentIdSt){
            this.commentIdSt = commentIdSt;
            return this;
        }
        public ConditionBuilder commentIdLessEqThan(Long commentIdEd){
            this.commentIdEd = commentIdEd;
            return this;
        }


        public ConditionBuilder commentIdList(Long ... commentId){
            this.commentIdList = solveNullList(commentId);
            return this;
        }

        public ConditionBuilder commentIdList(List<Long> commentId){
            this.commentIdList = commentId;
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

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
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

        private PmsCommentReplay obj;

        public Builder(){
            this.obj = new PmsCommentReplay();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder commentId(Long commentId){
            this.obj.setCommentId(commentId);
            return this;
        }
        public Builder memberNickName(String memberNickName){
            this.obj.setMemberNickName(memberNickName);
            return this;
        }
        public Builder memberIcon(String memberIcon){
            this.obj.setMemberIcon(memberIcon);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public PmsCommentReplay build(){return obj;}
    }

}
