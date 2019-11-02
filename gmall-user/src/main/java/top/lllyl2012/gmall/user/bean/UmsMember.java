package top.lllyl2012.gmall.user.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author volume
*/
public class UmsMember implements Serializable {

    private static final long serialVersionUID = 1572700872030L;


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
    private Long memberLevelId;

    /**
    * 用户名
    * isNullAble:1
    */
    private String username;

    /**
    * 密码
    * isNullAble:1
    */
    private String password;

    /**
    * 昵称
    * isNullAble:1
    */
    private String nickname;

    /**
    * 手机号码
    * isNullAble:1
    */
    private String phone;

    /**
    * 帐号启用状态:0->禁用；1->启用
    * isNullAble:1
    */
    private Integer status;

    /**
    * 注册时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 头像
    * isNullAble:1
    */
    private String icon;

    /**
    * 性别：0->未知；1->男；2->女
    * isNullAble:1
    */
    private Integer gender;

    /**
    * 生日
    * isNullAble:1
    */
    private java.time.LocalDate birthday;

    /**
    * 所做城市
    * isNullAble:1
    */
    private String city;

    /**
    * 职业
    * isNullAble:1
    */
    private String job;

    /**
    * 个性签名
    * isNullAble:1
    */
    private String personalizedSignature;

    /**
    * 用户来源
    * isNullAble:1
    */
    private Integer sourceType;

    /**
    * 积分
    * isNullAble:1
    */
    private Integer integration;

    /**
    * 成长值
    * isNullAble:1
    */
    private Integer growth;

    /**
    * 剩余抽奖次数
    * isNullAble:1
    */
    private Integer luckeyCount;

    /**
    * 历史积分数量
    * isNullAble:1
    */
    private Integer historyIntegration;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setMemberLevelId(Long memberLevelId){this.memberLevelId = memberLevelId;}

    public Long getMemberLevelId(){return this.memberLevelId;}

    public void setUsername(String username){this.username = username;}

    public String getUsername(){return this.username;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setNickname(String nickname){this.nickname = nickname;}

    public String getNickname(){return this.nickname;}

    public void setPhone(String phone){this.phone = phone;}

    public String getPhone(){return this.phone;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setIcon(String icon){this.icon = icon;}

    public String getIcon(){return this.icon;}

    public void setGender(Integer gender){this.gender = gender;}

    public Integer getGender(){return this.gender;}

    public void setBirthday(java.time.LocalDate birthday){this.birthday = birthday;}

    public java.time.LocalDate getBirthday(){return this.birthday;}

    public void setCity(String city){this.city = city;}

    public String getCity(){return this.city;}

    public void setJob(String job){this.job = job;}

    public String getJob(){return this.job;}

    public void setPersonalizedSignature(String personalizedSignature){this.personalizedSignature = personalizedSignature;}

    public String getPersonalizedSignature(){return this.personalizedSignature;}

    public void setSourceType(Integer sourceType){this.sourceType = sourceType;}

    public Integer getSourceType(){return this.sourceType;}

    public void setIntegration(Integer integration){this.integration = integration;}

    public Integer getIntegration(){return this.integration;}

    public void setGrowth(Integer growth){this.growth = growth;}

    public Integer getGrowth(){return this.growth;}

    public void setLuckeyCount(Integer luckeyCount){this.luckeyCount = luckeyCount;}

    public Integer getLuckeyCount(){return this.luckeyCount;}

    public void setHistoryIntegration(Integer historyIntegration){this.historyIntegration = historyIntegration;}

    public Integer getHistoryIntegration(){return this.historyIntegration;}
    @Override
    public String toString() {
        return "UmsMember{" +
                "id='" + id + '\'' +
                "memberLevelId='" + memberLevelId + '\'' +
                "username='" + username + '\'' +
                "password='" + password + '\'' +
                "nickname='" + nickname + '\'' +
                "phone='" + phone + '\'' +
                "status='" + status + '\'' +
                "createTime='" + createTime + '\'' +
                "icon='" + icon + '\'' +
                "gender='" + gender + '\'' +
                "birthday='" + birthday + '\'' +
                "city='" + city + '\'' +
                "job='" + job + '\'' +
                "personalizedSignature='" + personalizedSignature + '\'' +
                "sourceType='" + sourceType + '\'' +
                "integration='" + integration + '\'' +
                "growth='" + growth + '\'' +
                "luckeyCount='" + luckeyCount + '\'' +
                "historyIntegration='" + historyIntegration + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UmsMember set;

        private ConditionBuilder where;

        public UpdateBuilder set(UmsMember set){
            this.set = set;
            return this;
        }

        public UmsMember getSet(){
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

    public static class QueryBuilder extends UmsMember{
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

        private List<Long> memberLevelIdList;

        public List<Long> getMemberLevelIdList(){return this.memberLevelIdList;}

        private Long memberLevelIdSt;

        private Long memberLevelIdEd;

        public Long getMemberLevelIdSt(){return this.memberLevelIdSt;}

        public Long getMemberLevelIdEd(){return this.memberLevelIdEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> nicknameList;

        public List<String> getNicknameList(){return this.nicknameList;}


        private List<String> fuzzyNickname;

        public List<String> getFuzzyNickname(){return this.fuzzyNickname;}

        private List<String> rightFuzzyNickname;

        public List<String> getRightFuzzyNickname(){return this.rightFuzzyNickname;}
        private List<String> phoneList;

        public List<String> getPhoneList(){return this.phoneList;}


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone(){return this.fuzzyPhone;}

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone(){return this.rightFuzzyPhone;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> iconList;

        public List<String> getIconList(){return this.iconList;}


        private List<String> fuzzyIcon;

        public List<String> getFuzzyIcon(){return this.fuzzyIcon;}

        private List<String> rightFuzzyIcon;

        public List<String> getRightFuzzyIcon(){return this.rightFuzzyIcon;}
        private List<Integer> genderList;

        public List<Integer> getGenderList(){return this.genderList;}

        private Integer genderSt;

        private Integer genderEd;

        public Integer getGenderSt(){return this.genderSt;}

        public Integer getGenderEd(){return this.genderEd;}

        private List<java.time.LocalDate> birthdayList;

        public List<java.time.LocalDate> getBirthdayList(){return this.birthdayList;}

        private java.time.LocalDate birthdaySt;

        private java.time.LocalDate birthdayEd;

        public java.time.LocalDate getBirthdaySt(){return this.birthdaySt;}

        public java.time.LocalDate getBirthdayEd(){return this.birthdayEd;}

        private List<String> cityList;

        public List<String> getCityList(){return this.cityList;}


        private List<String> fuzzyCity;

        public List<String> getFuzzyCity(){return this.fuzzyCity;}

        private List<String> rightFuzzyCity;

        public List<String> getRightFuzzyCity(){return this.rightFuzzyCity;}
        private List<String> jobList;

        public List<String> getJobList(){return this.jobList;}


        private List<String> fuzzyJob;

        public List<String> getFuzzyJob(){return this.fuzzyJob;}

        private List<String> rightFuzzyJob;

        public List<String> getRightFuzzyJob(){return this.rightFuzzyJob;}
        private List<String> personalizedSignatureList;

        public List<String> getPersonalizedSignatureList(){return this.personalizedSignatureList;}


        private List<String> fuzzyPersonalizedSignature;

        public List<String> getFuzzyPersonalizedSignature(){return this.fuzzyPersonalizedSignature;}

        private List<String> rightFuzzyPersonalizedSignature;

        public List<String> getRightFuzzyPersonalizedSignature(){return this.rightFuzzyPersonalizedSignature;}
        private List<Integer> sourceTypeList;

        public List<Integer> getSourceTypeList(){return this.sourceTypeList;}

        private Integer sourceTypeSt;

        private Integer sourceTypeEd;

        public Integer getSourceTypeSt(){return this.sourceTypeSt;}

        public Integer getSourceTypeEd(){return this.sourceTypeEd;}

        private List<Integer> integrationList;

        public List<Integer> getIntegrationList(){return this.integrationList;}

        private Integer integrationSt;

        private Integer integrationEd;

        public Integer getIntegrationSt(){return this.integrationSt;}

        public Integer getIntegrationEd(){return this.integrationEd;}

        private List<Integer> growthList;

        public List<Integer> getGrowthList(){return this.growthList;}

        private Integer growthSt;

        private Integer growthEd;

        public Integer getGrowthSt(){return this.growthSt;}

        public Integer getGrowthEd(){return this.growthEd;}

        private List<Integer> luckeyCountList;

        public List<Integer> getLuckeyCountList(){return this.luckeyCountList;}

        private Integer luckeyCountSt;

        private Integer luckeyCountEd;

        public Integer getLuckeyCountSt(){return this.luckeyCountSt;}

        public Integer getLuckeyCountEd(){return this.luckeyCountEd;}

        private List<Integer> historyIntegrationList;

        public List<Integer> getHistoryIntegrationList(){return this.historyIntegrationList;}

        private Integer historyIntegrationSt;

        private Integer historyIntegrationEd;

        public Integer getHistoryIntegrationSt(){return this.historyIntegrationSt;}

        public Integer getHistoryIntegrationEd(){return this.historyIntegrationEd;}

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

        public QueryBuilder memberLevelIdBetWeen(Long memberLevelIdSt,Long memberLevelIdEd){
            this.memberLevelIdSt = memberLevelIdSt;
            this.memberLevelIdEd = memberLevelIdEd;
            return this;
        }

        public QueryBuilder memberLevelIdGreaterEqThan(Long memberLevelIdSt){
            this.memberLevelIdSt = memberLevelIdSt;
            return this;
        }
        public QueryBuilder memberLevelIdLessEqThan(Long memberLevelIdEd){
            this.memberLevelIdEd = memberLevelIdEd;
            return this;
        }


        public QueryBuilder memberLevelId(Long memberLevelId){
            setMemberLevelId(memberLevelId);
            return this;
        }

        public QueryBuilder memberLevelIdList(Long ... memberLevelId){
            this.memberLevelIdList = solveNullList(memberLevelId);
            return this;
        }

        public QueryBuilder memberLevelIdList(List<Long> memberLevelId){
            this.memberLevelIdList = memberLevelId;
            return this;
        }

        public QueryBuilder fetchMemberLevelId(){
            setFetchFields("fetchFields","memberLevelId");
            return this;
        }

        public QueryBuilder excludeMemberLevelId(){
            setFetchFields("excludeFields","memberLevelId");
            return this;
        }

        public QueryBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public QueryBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public QueryBuilder username(String username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public QueryBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }

        public QueryBuilder fuzzyNickname (List<String> fuzzyNickname){
            this.fuzzyNickname = fuzzyNickname;
            return this;
        }

        public QueryBuilder fuzzyNickname (String ... fuzzyNickname){
            this.fuzzyNickname = solveNullList(fuzzyNickname);
            return this;
        }

        public QueryBuilder rightFuzzyNickname (List<String> rightFuzzyNickname){
            this.rightFuzzyNickname = rightFuzzyNickname;
            return this;
        }

        public QueryBuilder rightFuzzyNickname (String ... rightFuzzyNickname){
            this.rightFuzzyNickname = solveNullList(rightFuzzyNickname);
            return this;
        }

        public QueryBuilder nickname(String nickname){
            setNickname(nickname);
            return this;
        }

        public QueryBuilder nicknameList(String ... nickname){
            this.nicknameList = solveNullList(nickname);
            return this;
        }

        public QueryBuilder nicknameList(List<String> nickname){
            this.nicknameList = nickname;
            return this;
        }

        public QueryBuilder fetchNickname(){
            setFetchFields("fetchFields","nickname");
            return this;
        }

        public QueryBuilder excludeNickname(){
            setFetchFields("excludeFields","nickname");
            return this;
        }

        public QueryBuilder fuzzyPhone (List<String> fuzzyPhone){
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public QueryBuilder fuzzyPhone (String ... fuzzyPhone){
            this.fuzzyPhone = solveNullList(fuzzyPhone);
            return this;
        }

        public QueryBuilder rightFuzzyPhone (List<String> rightFuzzyPhone){
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public QueryBuilder rightFuzzyPhone (String ... rightFuzzyPhone){
            this.rightFuzzyPhone = solveNullList(rightFuzzyPhone);
            return this;
        }

        public QueryBuilder phone(String phone){
            setPhone(phone);
            return this;
        }

        public QueryBuilder phoneList(String ... phone){
            this.phoneList = solveNullList(phone);
            return this;
        }

        public QueryBuilder phoneList(List<String> phone){
            this.phoneList = phone;
            return this;
        }

        public QueryBuilder fetchPhone(){
            setFetchFields("fetchFields","phone");
            return this;
        }

        public QueryBuilder excludePhone(){
            setFetchFields("excludeFields","phone");
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

        public QueryBuilder fuzzyIcon (List<String> fuzzyIcon){
            this.fuzzyIcon = fuzzyIcon;
            return this;
        }

        public QueryBuilder fuzzyIcon (String ... fuzzyIcon){
            this.fuzzyIcon = solveNullList(fuzzyIcon);
            return this;
        }

        public QueryBuilder rightFuzzyIcon (List<String> rightFuzzyIcon){
            this.rightFuzzyIcon = rightFuzzyIcon;
            return this;
        }

        public QueryBuilder rightFuzzyIcon (String ... rightFuzzyIcon){
            this.rightFuzzyIcon = solveNullList(rightFuzzyIcon);
            return this;
        }

        public QueryBuilder icon(String icon){
            setIcon(icon);
            return this;
        }

        public QueryBuilder iconList(String ... icon){
            this.iconList = solveNullList(icon);
            return this;
        }

        public QueryBuilder iconList(List<String> icon){
            this.iconList = icon;
            return this;
        }

        public QueryBuilder fetchIcon(){
            setFetchFields("fetchFields","icon");
            return this;
        }

        public QueryBuilder excludeIcon(){
            setFetchFields("excludeFields","icon");
            return this;
        }

        public QueryBuilder genderBetWeen(Integer genderSt,Integer genderEd){
            this.genderSt = genderSt;
            this.genderEd = genderEd;
            return this;
        }

        public QueryBuilder genderGreaterEqThan(Integer genderSt){
            this.genderSt = genderSt;
            return this;
        }
        public QueryBuilder genderLessEqThan(Integer genderEd){
            this.genderEd = genderEd;
            return this;
        }


        public QueryBuilder gender(Integer gender){
            setGender(gender);
            return this;
        }

        public QueryBuilder genderList(Integer ... gender){
            this.genderList = solveNullList(gender);
            return this;
        }

        public QueryBuilder genderList(List<Integer> gender){
            this.genderList = gender;
            return this;
        }

        public QueryBuilder fetchGender(){
            setFetchFields("fetchFields","gender");
            return this;
        }

        public QueryBuilder excludeGender(){
            setFetchFields("excludeFields","gender");
            return this;
        }

        public QueryBuilder birthdayBetWeen(java.time.LocalDate birthdaySt,java.time.LocalDate birthdayEd){
            this.birthdaySt = birthdaySt;
            this.birthdayEd = birthdayEd;
            return this;
        }

        public QueryBuilder birthdayGreaterEqThan(java.time.LocalDate birthdaySt){
            this.birthdaySt = birthdaySt;
            return this;
        }
        public QueryBuilder birthdayLessEqThan(java.time.LocalDate birthdayEd){
            this.birthdayEd = birthdayEd;
            return this;
        }


        public QueryBuilder birthday(java.time.LocalDate birthday){
            setBirthday(birthday);
            return this;
        }

        public QueryBuilder birthdayList(java.time.LocalDate ... birthday){
            this.birthdayList = solveNullList(birthday);
            return this;
        }

        public QueryBuilder birthdayList(List<java.time.LocalDate> birthday){
            this.birthdayList = birthday;
            return this;
        }

        public QueryBuilder fetchBirthday(){
            setFetchFields("fetchFields","birthday");
            return this;
        }

        public QueryBuilder excludeBirthday(){
            setFetchFields("excludeFields","birthday");
            return this;
        }

        public QueryBuilder fuzzyCity (List<String> fuzzyCity){
            this.fuzzyCity = fuzzyCity;
            return this;
        }

        public QueryBuilder fuzzyCity (String ... fuzzyCity){
            this.fuzzyCity = solveNullList(fuzzyCity);
            return this;
        }

        public QueryBuilder rightFuzzyCity (List<String> rightFuzzyCity){
            this.rightFuzzyCity = rightFuzzyCity;
            return this;
        }

        public QueryBuilder rightFuzzyCity (String ... rightFuzzyCity){
            this.rightFuzzyCity = solveNullList(rightFuzzyCity);
            return this;
        }

        public QueryBuilder city(String city){
            setCity(city);
            return this;
        }

        public QueryBuilder cityList(String ... city){
            this.cityList = solveNullList(city);
            return this;
        }

        public QueryBuilder cityList(List<String> city){
            this.cityList = city;
            return this;
        }

        public QueryBuilder fetchCity(){
            setFetchFields("fetchFields","city");
            return this;
        }

        public QueryBuilder excludeCity(){
            setFetchFields("excludeFields","city");
            return this;
        }

        public QueryBuilder fuzzyJob (List<String> fuzzyJob){
            this.fuzzyJob = fuzzyJob;
            return this;
        }

        public QueryBuilder fuzzyJob (String ... fuzzyJob){
            this.fuzzyJob = solveNullList(fuzzyJob);
            return this;
        }

        public QueryBuilder rightFuzzyJob (List<String> rightFuzzyJob){
            this.rightFuzzyJob = rightFuzzyJob;
            return this;
        }

        public QueryBuilder rightFuzzyJob (String ... rightFuzzyJob){
            this.rightFuzzyJob = solveNullList(rightFuzzyJob);
            return this;
        }

        public QueryBuilder job(String job){
            setJob(job);
            return this;
        }

        public QueryBuilder jobList(String ... job){
            this.jobList = solveNullList(job);
            return this;
        }

        public QueryBuilder jobList(List<String> job){
            this.jobList = job;
            return this;
        }

        public QueryBuilder fetchJob(){
            setFetchFields("fetchFields","job");
            return this;
        }

        public QueryBuilder excludeJob(){
            setFetchFields("excludeFields","job");
            return this;
        }

        public QueryBuilder fuzzyPersonalizedSignature (List<String> fuzzyPersonalizedSignature){
            this.fuzzyPersonalizedSignature = fuzzyPersonalizedSignature;
            return this;
        }

        public QueryBuilder fuzzyPersonalizedSignature (String ... fuzzyPersonalizedSignature){
            this.fuzzyPersonalizedSignature = solveNullList(fuzzyPersonalizedSignature);
            return this;
        }

        public QueryBuilder rightFuzzyPersonalizedSignature (List<String> rightFuzzyPersonalizedSignature){
            this.rightFuzzyPersonalizedSignature = rightFuzzyPersonalizedSignature;
            return this;
        }

        public QueryBuilder rightFuzzyPersonalizedSignature (String ... rightFuzzyPersonalizedSignature){
            this.rightFuzzyPersonalizedSignature = solveNullList(rightFuzzyPersonalizedSignature);
            return this;
        }

        public QueryBuilder personalizedSignature(String personalizedSignature){
            setPersonalizedSignature(personalizedSignature);
            return this;
        }

        public QueryBuilder personalizedSignatureList(String ... personalizedSignature){
            this.personalizedSignatureList = solveNullList(personalizedSignature);
            return this;
        }

        public QueryBuilder personalizedSignatureList(List<String> personalizedSignature){
            this.personalizedSignatureList = personalizedSignature;
            return this;
        }

        public QueryBuilder fetchPersonalizedSignature(){
            setFetchFields("fetchFields","personalizedSignature");
            return this;
        }

        public QueryBuilder excludePersonalizedSignature(){
            setFetchFields("excludeFields","personalizedSignature");
            return this;
        }

        public QueryBuilder sourceTypeBetWeen(Integer sourceTypeSt,Integer sourceTypeEd){
            this.sourceTypeSt = sourceTypeSt;
            this.sourceTypeEd = sourceTypeEd;
            return this;
        }

        public QueryBuilder sourceTypeGreaterEqThan(Integer sourceTypeSt){
            this.sourceTypeSt = sourceTypeSt;
            return this;
        }
        public QueryBuilder sourceTypeLessEqThan(Integer sourceTypeEd){
            this.sourceTypeEd = sourceTypeEd;
            return this;
        }


        public QueryBuilder sourceType(Integer sourceType){
            setSourceType(sourceType);
            return this;
        }

        public QueryBuilder sourceTypeList(Integer ... sourceType){
            this.sourceTypeList = solveNullList(sourceType);
            return this;
        }

        public QueryBuilder sourceTypeList(List<Integer> sourceType){
            this.sourceTypeList = sourceType;
            return this;
        }

        public QueryBuilder fetchSourceType(){
            setFetchFields("fetchFields","sourceType");
            return this;
        }

        public QueryBuilder excludeSourceType(){
            setFetchFields("excludeFields","sourceType");
            return this;
        }

        public QueryBuilder integrationBetWeen(Integer integrationSt,Integer integrationEd){
            this.integrationSt = integrationSt;
            this.integrationEd = integrationEd;
            return this;
        }

        public QueryBuilder integrationGreaterEqThan(Integer integrationSt){
            this.integrationSt = integrationSt;
            return this;
        }
        public QueryBuilder integrationLessEqThan(Integer integrationEd){
            this.integrationEd = integrationEd;
            return this;
        }


        public QueryBuilder integration(Integer integration){
            setIntegration(integration);
            return this;
        }

        public QueryBuilder integrationList(Integer ... integration){
            this.integrationList = solveNullList(integration);
            return this;
        }

        public QueryBuilder integrationList(List<Integer> integration){
            this.integrationList = integration;
            return this;
        }

        public QueryBuilder fetchIntegration(){
            setFetchFields("fetchFields","integration");
            return this;
        }

        public QueryBuilder excludeIntegration(){
            setFetchFields("excludeFields","integration");
            return this;
        }

        public QueryBuilder growthBetWeen(Integer growthSt,Integer growthEd){
            this.growthSt = growthSt;
            this.growthEd = growthEd;
            return this;
        }

        public QueryBuilder growthGreaterEqThan(Integer growthSt){
            this.growthSt = growthSt;
            return this;
        }
        public QueryBuilder growthLessEqThan(Integer growthEd){
            this.growthEd = growthEd;
            return this;
        }


        public QueryBuilder growth(Integer growth){
            setGrowth(growth);
            return this;
        }

        public QueryBuilder growthList(Integer ... growth){
            this.growthList = solveNullList(growth);
            return this;
        }

        public QueryBuilder growthList(List<Integer> growth){
            this.growthList = growth;
            return this;
        }

        public QueryBuilder fetchGrowth(){
            setFetchFields("fetchFields","growth");
            return this;
        }

        public QueryBuilder excludeGrowth(){
            setFetchFields("excludeFields","growth");
            return this;
        }

        public QueryBuilder luckeyCountBetWeen(Integer luckeyCountSt,Integer luckeyCountEd){
            this.luckeyCountSt = luckeyCountSt;
            this.luckeyCountEd = luckeyCountEd;
            return this;
        }

        public QueryBuilder luckeyCountGreaterEqThan(Integer luckeyCountSt){
            this.luckeyCountSt = luckeyCountSt;
            return this;
        }
        public QueryBuilder luckeyCountLessEqThan(Integer luckeyCountEd){
            this.luckeyCountEd = luckeyCountEd;
            return this;
        }


        public QueryBuilder luckeyCount(Integer luckeyCount){
            setLuckeyCount(luckeyCount);
            return this;
        }

        public QueryBuilder luckeyCountList(Integer ... luckeyCount){
            this.luckeyCountList = solveNullList(luckeyCount);
            return this;
        }

        public QueryBuilder luckeyCountList(List<Integer> luckeyCount){
            this.luckeyCountList = luckeyCount;
            return this;
        }

        public QueryBuilder fetchLuckeyCount(){
            setFetchFields("fetchFields","luckeyCount");
            return this;
        }

        public QueryBuilder excludeLuckeyCount(){
            setFetchFields("excludeFields","luckeyCount");
            return this;
        }

        public QueryBuilder historyIntegrationBetWeen(Integer historyIntegrationSt,Integer historyIntegrationEd){
            this.historyIntegrationSt = historyIntegrationSt;
            this.historyIntegrationEd = historyIntegrationEd;
            return this;
        }

        public QueryBuilder historyIntegrationGreaterEqThan(Integer historyIntegrationSt){
            this.historyIntegrationSt = historyIntegrationSt;
            return this;
        }
        public QueryBuilder historyIntegrationLessEqThan(Integer historyIntegrationEd){
            this.historyIntegrationEd = historyIntegrationEd;
            return this;
        }


        public QueryBuilder historyIntegration(Integer historyIntegration){
            setHistoryIntegration(historyIntegration);
            return this;
        }

        public QueryBuilder historyIntegrationList(Integer ... historyIntegration){
            this.historyIntegrationList = solveNullList(historyIntegration);
            return this;
        }

        public QueryBuilder historyIntegrationList(List<Integer> historyIntegration){
            this.historyIntegrationList = historyIntegration;
            return this;
        }

        public QueryBuilder fetchHistoryIntegration(){
            setFetchFields("fetchFields","historyIntegration");
            return this;
        }

        public QueryBuilder excludeHistoryIntegration(){
            setFetchFields("excludeFields","historyIntegration");
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

        public UmsMember build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> memberLevelIdList;

        public List<Long> getMemberLevelIdList(){return this.memberLevelIdList;}

        private Long memberLevelIdSt;

        private Long memberLevelIdEd;

        public Long getMemberLevelIdSt(){return this.memberLevelIdSt;}

        public Long getMemberLevelIdEd(){return this.memberLevelIdEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> nicknameList;

        public List<String> getNicknameList(){return this.nicknameList;}


        private List<String> fuzzyNickname;

        public List<String> getFuzzyNickname(){return this.fuzzyNickname;}

        private List<String> rightFuzzyNickname;

        public List<String> getRightFuzzyNickname(){return this.rightFuzzyNickname;}
        private List<String> phoneList;

        public List<String> getPhoneList(){return this.phoneList;}


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone(){return this.fuzzyPhone;}

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone(){return this.rightFuzzyPhone;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> iconList;

        public List<String> getIconList(){return this.iconList;}


        private List<String> fuzzyIcon;

        public List<String> getFuzzyIcon(){return this.fuzzyIcon;}

        private List<String> rightFuzzyIcon;

        public List<String> getRightFuzzyIcon(){return this.rightFuzzyIcon;}
        private List<Integer> genderList;

        public List<Integer> getGenderList(){return this.genderList;}

        private Integer genderSt;

        private Integer genderEd;

        public Integer getGenderSt(){return this.genderSt;}

        public Integer getGenderEd(){return this.genderEd;}

        private List<java.time.LocalDate> birthdayList;

        public List<java.time.LocalDate> getBirthdayList(){return this.birthdayList;}

        private java.time.LocalDate birthdaySt;

        private java.time.LocalDate birthdayEd;

        public java.time.LocalDate getBirthdaySt(){return this.birthdaySt;}

        public java.time.LocalDate getBirthdayEd(){return this.birthdayEd;}

        private List<String> cityList;

        public List<String> getCityList(){return this.cityList;}


        private List<String> fuzzyCity;

        public List<String> getFuzzyCity(){return this.fuzzyCity;}

        private List<String> rightFuzzyCity;

        public List<String> getRightFuzzyCity(){return this.rightFuzzyCity;}
        private List<String> jobList;

        public List<String> getJobList(){return this.jobList;}


        private List<String> fuzzyJob;

        public List<String> getFuzzyJob(){return this.fuzzyJob;}

        private List<String> rightFuzzyJob;

        public List<String> getRightFuzzyJob(){return this.rightFuzzyJob;}
        private List<String> personalizedSignatureList;

        public List<String> getPersonalizedSignatureList(){return this.personalizedSignatureList;}


        private List<String> fuzzyPersonalizedSignature;

        public List<String> getFuzzyPersonalizedSignature(){return this.fuzzyPersonalizedSignature;}

        private List<String> rightFuzzyPersonalizedSignature;

        public List<String> getRightFuzzyPersonalizedSignature(){return this.rightFuzzyPersonalizedSignature;}
        private List<Integer> sourceTypeList;

        public List<Integer> getSourceTypeList(){return this.sourceTypeList;}

        private Integer sourceTypeSt;

        private Integer sourceTypeEd;

        public Integer getSourceTypeSt(){return this.sourceTypeSt;}

        public Integer getSourceTypeEd(){return this.sourceTypeEd;}

        private List<Integer> integrationList;

        public List<Integer> getIntegrationList(){return this.integrationList;}

        private Integer integrationSt;

        private Integer integrationEd;

        public Integer getIntegrationSt(){return this.integrationSt;}

        public Integer getIntegrationEd(){return this.integrationEd;}

        private List<Integer> growthList;

        public List<Integer> getGrowthList(){return this.growthList;}

        private Integer growthSt;

        private Integer growthEd;

        public Integer getGrowthSt(){return this.growthSt;}

        public Integer getGrowthEd(){return this.growthEd;}

        private List<Integer> luckeyCountList;

        public List<Integer> getLuckeyCountList(){return this.luckeyCountList;}

        private Integer luckeyCountSt;

        private Integer luckeyCountEd;

        public Integer getLuckeyCountSt(){return this.luckeyCountSt;}

        public Integer getLuckeyCountEd(){return this.luckeyCountEd;}

        private List<Integer> historyIntegrationList;

        public List<Integer> getHistoryIntegrationList(){return this.historyIntegrationList;}

        private Integer historyIntegrationSt;

        private Integer historyIntegrationEd;

        public Integer getHistoryIntegrationSt(){return this.historyIntegrationSt;}

        public Integer getHistoryIntegrationEd(){return this.historyIntegrationEd;}


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

        public ConditionBuilder memberLevelIdBetWeen(Long memberLevelIdSt,Long memberLevelIdEd){
            this.memberLevelIdSt = memberLevelIdSt;
            this.memberLevelIdEd = memberLevelIdEd;
            return this;
        }

        public ConditionBuilder memberLevelIdGreaterEqThan(Long memberLevelIdSt){
            this.memberLevelIdSt = memberLevelIdSt;
            return this;
        }
        public ConditionBuilder memberLevelIdLessEqThan(Long memberLevelIdEd){
            this.memberLevelIdEd = memberLevelIdEd;
            return this;
        }


        public ConditionBuilder memberLevelIdList(Long ... memberLevelId){
            this.memberLevelIdList = solveNullList(memberLevelId);
            return this;
        }

        public ConditionBuilder memberLevelIdList(List<Long> memberLevelId){
            this.memberLevelIdList = memberLevelId;
            return this;
        }

        public ConditionBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public ConditionBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public ConditionBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public ConditionBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzyNickname (List<String> fuzzyNickname){
            this.fuzzyNickname = fuzzyNickname;
            return this;
        }

        public ConditionBuilder fuzzyNickname (String ... fuzzyNickname){
            this.fuzzyNickname = solveNullList(fuzzyNickname);
            return this;
        }

        public ConditionBuilder rightFuzzyNickname (List<String> rightFuzzyNickname){
            this.rightFuzzyNickname = rightFuzzyNickname;
            return this;
        }

        public ConditionBuilder rightFuzzyNickname (String ... rightFuzzyNickname){
            this.rightFuzzyNickname = solveNullList(rightFuzzyNickname);
            return this;
        }

        public ConditionBuilder nicknameList(String ... nickname){
            this.nicknameList = solveNullList(nickname);
            return this;
        }

        public ConditionBuilder nicknameList(List<String> nickname){
            this.nicknameList = nickname;
            return this;
        }

        public ConditionBuilder fuzzyPhone (List<String> fuzzyPhone){
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public ConditionBuilder fuzzyPhone (String ... fuzzyPhone){
            this.fuzzyPhone = solveNullList(fuzzyPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyPhone (List<String> rightFuzzyPhone){
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyPhone (String ... rightFuzzyPhone){
            this.rightFuzzyPhone = solveNullList(rightFuzzyPhone);
            return this;
        }

        public ConditionBuilder phoneList(String ... phone){
            this.phoneList = solveNullList(phone);
            return this;
        }

        public ConditionBuilder phoneList(List<String> phone){
            this.phoneList = phone;
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

        public ConditionBuilder fuzzyIcon (List<String> fuzzyIcon){
            this.fuzzyIcon = fuzzyIcon;
            return this;
        }

        public ConditionBuilder fuzzyIcon (String ... fuzzyIcon){
            this.fuzzyIcon = solveNullList(fuzzyIcon);
            return this;
        }

        public ConditionBuilder rightFuzzyIcon (List<String> rightFuzzyIcon){
            this.rightFuzzyIcon = rightFuzzyIcon;
            return this;
        }

        public ConditionBuilder rightFuzzyIcon (String ... rightFuzzyIcon){
            this.rightFuzzyIcon = solveNullList(rightFuzzyIcon);
            return this;
        }

        public ConditionBuilder iconList(String ... icon){
            this.iconList = solveNullList(icon);
            return this;
        }

        public ConditionBuilder iconList(List<String> icon){
            this.iconList = icon;
            return this;
        }

        public ConditionBuilder genderBetWeen(Integer genderSt,Integer genderEd){
            this.genderSt = genderSt;
            this.genderEd = genderEd;
            return this;
        }

        public ConditionBuilder genderGreaterEqThan(Integer genderSt){
            this.genderSt = genderSt;
            return this;
        }
        public ConditionBuilder genderLessEqThan(Integer genderEd){
            this.genderEd = genderEd;
            return this;
        }


        public ConditionBuilder genderList(Integer ... gender){
            this.genderList = solveNullList(gender);
            return this;
        }

        public ConditionBuilder genderList(List<Integer> gender){
            this.genderList = gender;
            return this;
        }

        public ConditionBuilder birthdayBetWeen(java.time.LocalDate birthdaySt,java.time.LocalDate birthdayEd){
            this.birthdaySt = birthdaySt;
            this.birthdayEd = birthdayEd;
            return this;
        }

        public ConditionBuilder birthdayGreaterEqThan(java.time.LocalDate birthdaySt){
            this.birthdaySt = birthdaySt;
            return this;
        }
        public ConditionBuilder birthdayLessEqThan(java.time.LocalDate birthdayEd){
            this.birthdayEd = birthdayEd;
            return this;
        }


        public ConditionBuilder birthdayList(java.time.LocalDate ... birthday){
            this.birthdayList = solveNullList(birthday);
            return this;
        }

        public ConditionBuilder birthdayList(List<java.time.LocalDate> birthday){
            this.birthdayList = birthday;
            return this;
        }

        public ConditionBuilder fuzzyCity (List<String> fuzzyCity){
            this.fuzzyCity = fuzzyCity;
            return this;
        }

        public ConditionBuilder fuzzyCity (String ... fuzzyCity){
            this.fuzzyCity = solveNullList(fuzzyCity);
            return this;
        }

        public ConditionBuilder rightFuzzyCity (List<String> rightFuzzyCity){
            this.rightFuzzyCity = rightFuzzyCity;
            return this;
        }

        public ConditionBuilder rightFuzzyCity (String ... rightFuzzyCity){
            this.rightFuzzyCity = solveNullList(rightFuzzyCity);
            return this;
        }

        public ConditionBuilder cityList(String ... city){
            this.cityList = solveNullList(city);
            return this;
        }

        public ConditionBuilder cityList(List<String> city){
            this.cityList = city;
            return this;
        }

        public ConditionBuilder fuzzyJob (List<String> fuzzyJob){
            this.fuzzyJob = fuzzyJob;
            return this;
        }

        public ConditionBuilder fuzzyJob (String ... fuzzyJob){
            this.fuzzyJob = solveNullList(fuzzyJob);
            return this;
        }

        public ConditionBuilder rightFuzzyJob (List<String> rightFuzzyJob){
            this.rightFuzzyJob = rightFuzzyJob;
            return this;
        }

        public ConditionBuilder rightFuzzyJob (String ... rightFuzzyJob){
            this.rightFuzzyJob = solveNullList(rightFuzzyJob);
            return this;
        }

        public ConditionBuilder jobList(String ... job){
            this.jobList = solveNullList(job);
            return this;
        }

        public ConditionBuilder jobList(List<String> job){
            this.jobList = job;
            return this;
        }

        public ConditionBuilder fuzzyPersonalizedSignature (List<String> fuzzyPersonalizedSignature){
            this.fuzzyPersonalizedSignature = fuzzyPersonalizedSignature;
            return this;
        }

        public ConditionBuilder fuzzyPersonalizedSignature (String ... fuzzyPersonalizedSignature){
            this.fuzzyPersonalizedSignature = solveNullList(fuzzyPersonalizedSignature);
            return this;
        }

        public ConditionBuilder rightFuzzyPersonalizedSignature (List<String> rightFuzzyPersonalizedSignature){
            this.rightFuzzyPersonalizedSignature = rightFuzzyPersonalizedSignature;
            return this;
        }

        public ConditionBuilder rightFuzzyPersonalizedSignature (String ... rightFuzzyPersonalizedSignature){
            this.rightFuzzyPersonalizedSignature = solveNullList(rightFuzzyPersonalizedSignature);
            return this;
        }

        public ConditionBuilder personalizedSignatureList(String ... personalizedSignature){
            this.personalizedSignatureList = solveNullList(personalizedSignature);
            return this;
        }

        public ConditionBuilder personalizedSignatureList(List<String> personalizedSignature){
            this.personalizedSignatureList = personalizedSignature;
            return this;
        }

        public ConditionBuilder sourceTypeBetWeen(Integer sourceTypeSt,Integer sourceTypeEd){
            this.sourceTypeSt = sourceTypeSt;
            this.sourceTypeEd = sourceTypeEd;
            return this;
        }

        public ConditionBuilder sourceTypeGreaterEqThan(Integer sourceTypeSt){
            this.sourceTypeSt = sourceTypeSt;
            return this;
        }
        public ConditionBuilder sourceTypeLessEqThan(Integer sourceTypeEd){
            this.sourceTypeEd = sourceTypeEd;
            return this;
        }


        public ConditionBuilder sourceTypeList(Integer ... sourceType){
            this.sourceTypeList = solveNullList(sourceType);
            return this;
        }

        public ConditionBuilder sourceTypeList(List<Integer> sourceType){
            this.sourceTypeList = sourceType;
            return this;
        }

        public ConditionBuilder integrationBetWeen(Integer integrationSt,Integer integrationEd){
            this.integrationSt = integrationSt;
            this.integrationEd = integrationEd;
            return this;
        }

        public ConditionBuilder integrationGreaterEqThan(Integer integrationSt){
            this.integrationSt = integrationSt;
            return this;
        }
        public ConditionBuilder integrationLessEqThan(Integer integrationEd){
            this.integrationEd = integrationEd;
            return this;
        }


        public ConditionBuilder integrationList(Integer ... integration){
            this.integrationList = solveNullList(integration);
            return this;
        }

        public ConditionBuilder integrationList(List<Integer> integration){
            this.integrationList = integration;
            return this;
        }

        public ConditionBuilder growthBetWeen(Integer growthSt,Integer growthEd){
            this.growthSt = growthSt;
            this.growthEd = growthEd;
            return this;
        }

        public ConditionBuilder growthGreaterEqThan(Integer growthSt){
            this.growthSt = growthSt;
            return this;
        }
        public ConditionBuilder growthLessEqThan(Integer growthEd){
            this.growthEd = growthEd;
            return this;
        }


        public ConditionBuilder growthList(Integer ... growth){
            this.growthList = solveNullList(growth);
            return this;
        }

        public ConditionBuilder growthList(List<Integer> growth){
            this.growthList = growth;
            return this;
        }

        public ConditionBuilder luckeyCountBetWeen(Integer luckeyCountSt,Integer luckeyCountEd){
            this.luckeyCountSt = luckeyCountSt;
            this.luckeyCountEd = luckeyCountEd;
            return this;
        }

        public ConditionBuilder luckeyCountGreaterEqThan(Integer luckeyCountSt){
            this.luckeyCountSt = luckeyCountSt;
            return this;
        }
        public ConditionBuilder luckeyCountLessEqThan(Integer luckeyCountEd){
            this.luckeyCountEd = luckeyCountEd;
            return this;
        }


        public ConditionBuilder luckeyCountList(Integer ... luckeyCount){
            this.luckeyCountList = solveNullList(luckeyCount);
            return this;
        }

        public ConditionBuilder luckeyCountList(List<Integer> luckeyCount){
            this.luckeyCountList = luckeyCount;
            return this;
        }

        public ConditionBuilder historyIntegrationBetWeen(Integer historyIntegrationSt,Integer historyIntegrationEd){
            this.historyIntegrationSt = historyIntegrationSt;
            this.historyIntegrationEd = historyIntegrationEd;
            return this;
        }

        public ConditionBuilder historyIntegrationGreaterEqThan(Integer historyIntegrationSt){
            this.historyIntegrationSt = historyIntegrationSt;
            return this;
        }
        public ConditionBuilder historyIntegrationLessEqThan(Integer historyIntegrationEd){
            this.historyIntegrationEd = historyIntegrationEd;
            return this;
        }


        public ConditionBuilder historyIntegrationList(Integer ... historyIntegration){
            this.historyIntegrationList = solveNullList(historyIntegration);
            return this;
        }

        public ConditionBuilder historyIntegrationList(List<Integer> historyIntegration){
            this.historyIntegrationList = historyIntegration;
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

        private UmsMember obj;

        public Builder(){
            this.obj = new UmsMember();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder memberLevelId(Long memberLevelId){
            this.obj.setMemberLevelId(memberLevelId);
            return this;
        }
        public Builder username(String username){
            this.obj.setUsername(username);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder nickname(String nickname){
            this.obj.setNickname(nickname);
            return this;
        }
        public Builder phone(String phone){
            this.obj.setPhone(phone);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder icon(String icon){
            this.obj.setIcon(icon);
            return this;
        }
        public Builder gender(Integer gender){
            this.obj.setGender(gender);
            return this;
        }
        public Builder birthday(java.time.LocalDate birthday){
            this.obj.setBirthday(birthday);
            return this;
        }
        public Builder city(String city){
            this.obj.setCity(city);
            return this;
        }
        public Builder job(String job){
            this.obj.setJob(job);
            return this;
        }
        public Builder personalizedSignature(String personalizedSignature){
            this.obj.setPersonalizedSignature(personalizedSignature);
            return this;
        }
        public Builder sourceType(Integer sourceType){
            this.obj.setSourceType(sourceType);
            return this;
        }
        public Builder integration(Integer integration){
            this.obj.setIntegration(integration);
            return this;
        }
        public Builder growth(Integer growth){
            this.obj.setGrowth(growth);
            return this;
        }
        public Builder luckeyCount(Integer luckeyCount){
            this.obj.setLuckeyCount(luckeyCount);
            return this;
        }
        public Builder historyIntegration(Integer historyIntegration){
            this.obj.setHistoryIntegration(historyIntegration);
            return this;
        }
        public UmsMember build(){return obj;}
    }

}
