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
public class UmsMemberReceiveAddress implements Serializable {

    private static final long serialVersionUID = 1572702178894L;


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
    private Long memberId;

    /**
    * 收货人名称
    * isNullAble:1
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private String phoneNumber;

    /**
    * 是否为默认
    * isNullAble:1
    */
    private Integer defaultStatus;

    /**
    * 邮政编码
    * isNullAble:1
    */
    private String postCode;

    /**
    * 省份/直辖市
    * isNullAble:1
    */
    private String province;

    /**
    * 城市
    * isNullAble:1
    */
    private String city;

    /**
    * 区
    * isNullAble:1
    */
    private String region;

    /**
    * 详细地址(街道)
    * isNullAble:1
    */
    private String detailAddress;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setMemberId(Long memberId){this.memberId = memberId;}

    public Long getMemberId(){return this.memberId;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

    public String getPhoneNumber(){return this.phoneNumber;}

    public void setDefaultStatus(Integer defaultStatus){this.defaultStatus = defaultStatus;}

    public Integer getDefaultStatus(){return this.defaultStatus;}

    public void setPostCode(String postCode){this.postCode = postCode;}

    public String getPostCode(){return this.postCode;}

    public void setProvince(String province){this.province = province;}

    public String getProvince(){return this.province;}

    public void setCity(String city){this.city = city;}

    public String getCity(){return this.city;}

    public void setRegion(String region){this.region = region;}

    public String getRegion(){return this.region;}

    public void setDetailAddress(String detailAddress){this.detailAddress = detailAddress;}

    public String getDetailAddress(){return this.detailAddress;}
    @Override
    public String toString() {
        return "UmsMemberReceiveAddress{" +
                "id='" + id + '\'' +
                "memberId='" + memberId + '\'' +
                "name='" + name + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                "defaultStatus='" + defaultStatus + '\'' +
                "postCode='" + postCode + '\'' +
                "province='" + province + '\'' +
                "city='" + city + '\'' +
                "region='" + region + '\'' +
                "detailAddress='" + detailAddress + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UmsMemberReceiveAddress set;

        private ConditionBuilder where;

        public UpdateBuilder set(UmsMemberReceiveAddress set){
            this.set = set;
            return this;
        }

        public UmsMemberReceiveAddress getSet(){
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

    public static class QueryBuilder extends UmsMemberReceiveAddress{
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

        private List<Long> memberIdList;

        public List<Long> getMemberIdList(){return this.memberIdList;}

        private Long memberIdSt;

        private Long memberIdEd;

        public Long getMemberIdSt(){return this.memberIdSt;}

        public Long getMemberIdEd(){return this.memberIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> phoneNumberList;

        public List<String> getPhoneNumberList(){return this.phoneNumberList;}


        private List<String> fuzzyPhoneNumber;

        public List<String> getFuzzyPhoneNumber(){return this.fuzzyPhoneNumber;}

        private List<String> rightFuzzyPhoneNumber;

        public List<String> getRightFuzzyPhoneNumber(){return this.rightFuzzyPhoneNumber;}
        private List<Integer> defaultStatusList;

        public List<Integer> getDefaultStatusList(){return this.defaultStatusList;}

        private Integer defaultStatusSt;

        private Integer defaultStatusEd;

        public Integer getDefaultStatusSt(){return this.defaultStatusSt;}

        public Integer getDefaultStatusEd(){return this.defaultStatusEd;}

        private List<String> postCodeList;

        public List<String> getPostCodeList(){return this.postCodeList;}


        private List<String> fuzzyPostCode;

        public List<String> getFuzzyPostCode(){return this.fuzzyPostCode;}

        private List<String> rightFuzzyPostCode;

        public List<String> getRightFuzzyPostCode(){return this.rightFuzzyPostCode;}
        private List<String> provinceList;

        public List<String> getProvinceList(){return this.provinceList;}


        private List<String> fuzzyProvince;

        public List<String> getFuzzyProvince(){return this.fuzzyProvince;}

        private List<String> rightFuzzyProvince;

        public List<String> getRightFuzzyProvince(){return this.rightFuzzyProvince;}
        private List<String> cityList;

        public List<String> getCityList(){return this.cityList;}


        private List<String> fuzzyCity;

        public List<String> getFuzzyCity(){return this.fuzzyCity;}

        private List<String> rightFuzzyCity;

        public List<String> getRightFuzzyCity(){return this.rightFuzzyCity;}
        private List<String> regionList;

        public List<String> getRegionList(){return this.regionList;}


        private List<String> fuzzyRegion;

        public List<String> getFuzzyRegion(){return this.fuzzyRegion;}

        private List<String> rightFuzzyRegion;

        public List<String> getRightFuzzyRegion(){return this.rightFuzzyRegion;}
        private List<String> detailAddressList;

        public List<String> getDetailAddressList(){return this.detailAddressList;}


        private List<String> fuzzyDetailAddress;

        public List<String> getFuzzyDetailAddress(){return this.fuzzyDetailAddress;}

        private List<String> rightFuzzyDetailAddress;

        public List<String> getRightFuzzyDetailAddress(){return this.rightFuzzyDetailAddress;}
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

        public QueryBuilder memberIdBetWeen(Long memberIdSt,Long memberIdEd){
            this.memberIdSt = memberIdSt;
            this.memberIdEd = memberIdEd;
            return this;
        }

        public QueryBuilder memberIdGreaterEqThan(Long memberIdSt){
            this.memberIdSt = memberIdSt;
            return this;
        }
        public QueryBuilder memberIdLessEqThan(Long memberIdEd){
            this.memberIdEd = memberIdEd;
            return this;
        }


        public QueryBuilder memberId(Long memberId){
            setMemberId(memberId);
            return this;
        }

        public QueryBuilder memberIdList(Long ... memberId){
            this.memberIdList = solveNullList(memberId);
            return this;
        }

        public QueryBuilder memberIdList(List<Long> memberId){
            this.memberIdList = memberId;
            return this;
        }

        public QueryBuilder fetchMemberId(){
            setFetchFields("fetchFields","memberId");
            return this;
        }

        public QueryBuilder excludeMemberId(){
            setFetchFields("excludeFields","memberId");
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

        public QueryBuilder fuzzyPhoneNumber (List<String> fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = fuzzyPhoneNumber;
            return this;
        }

        public QueryBuilder fuzzyPhoneNumber (String ... fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = solveNullList(fuzzyPhoneNumber);
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNumber (List<String> rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = rightFuzzyPhoneNumber;
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNumber (String ... rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = solveNullList(rightFuzzyPhoneNumber);
            return this;
        }

        public QueryBuilder phoneNumber(String phoneNumber){
            setPhoneNumber(phoneNumber);
            return this;
        }

        public QueryBuilder phoneNumberList(String ... phoneNumber){
            this.phoneNumberList = solveNullList(phoneNumber);
            return this;
        }

        public QueryBuilder phoneNumberList(List<String> phoneNumber){
            this.phoneNumberList = phoneNumber;
            return this;
        }

        public QueryBuilder fetchPhoneNumber(){
            setFetchFields("fetchFields","phoneNumber");
            return this;
        }

        public QueryBuilder excludePhoneNumber(){
            setFetchFields("excludeFields","phoneNumber");
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

        public QueryBuilder fuzzyPostCode (List<String> fuzzyPostCode){
            this.fuzzyPostCode = fuzzyPostCode;
            return this;
        }

        public QueryBuilder fuzzyPostCode (String ... fuzzyPostCode){
            this.fuzzyPostCode = solveNullList(fuzzyPostCode);
            return this;
        }

        public QueryBuilder rightFuzzyPostCode (List<String> rightFuzzyPostCode){
            this.rightFuzzyPostCode = rightFuzzyPostCode;
            return this;
        }

        public QueryBuilder rightFuzzyPostCode (String ... rightFuzzyPostCode){
            this.rightFuzzyPostCode = solveNullList(rightFuzzyPostCode);
            return this;
        }

        public QueryBuilder postCode(String postCode){
            setPostCode(postCode);
            return this;
        }

        public QueryBuilder postCodeList(String ... postCode){
            this.postCodeList = solveNullList(postCode);
            return this;
        }

        public QueryBuilder postCodeList(List<String> postCode){
            this.postCodeList = postCode;
            return this;
        }

        public QueryBuilder fetchPostCode(){
            setFetchFields("fetchFields","postCode");
            return this;
        }

        public QueryBuilder excludePostCode(){
            setFetchFields("excludeFields","postCode");
            return this;
        }

        public QueryBuilder fuzzyProvince (List<String> fuzzyProvince){
            this.fuzzyProvince = fuzzyProvince;
            return this;
        }

        public QueryBuilder fuzzyProvince (String ... fuzzyProvince){
            this.fuzzyProvince = solveNullList(fuzzyProvince);
            return this;
        }

        public QueryBuilder rightFuzzyProvince (List<String> rightFuzzyProvince){
            this.rightFuzzyProvince = rightFuzzyProvince;
            return this;
        }

        public QueryBuilder rightFuzzyProvince (String ... rightFuzzyProvince){
            this.rightFuzzyProvince = solveNullList(rightFuzzyProvince);
            return this;
        }

        public QueryBuilder province(String province){
            setProvince(province);
            return this;
        }

        public QueryBuilder provinceList(String ... province){
            this.provinceList = solveNullList(province);
            return this;
        }

        public QueryBuilder provinceList(List<String> province){
            this.provinceList = province;
            return this;
        }

        public QueryBuilder fetchProvince(){
            setFetchFields("fetchFields","province");
            return this;
        }

        public QueryBuilder excludeProvince(){
            setFetchFields("excludeFields","province");
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

        public QueryBuilder fuzzyRegion (List<String> fuzzyRegion){
            this.fuzzyRegion = fuzzyRegion;
            return this;
        }

        public QueryBuilder fuzzyRegion (String ... fuzzyRegion){
            this.fuzzyRegion = solveNullList(fuzzyRegion);
            return this;
        }

        public QueryBuilder rightFuzzyRegion (List<String> rightFuzzyRegion){
            this.rightFuzzyRegion = rightFuzzyRegion;
            return this;
        }

        public QueryBuilder rightFuzzyRegion (String ... rightFuzzyRegion){
            this.rightFuzzyRegion = solveNullList(rightFuzzyRegion);
            return this;
        }

        public QueryBuilder region(String region){
            setRegion(region);
            return this;
        }

        public QueryBuilder regionList(String ... region){
            this.regionList = solveNullList(region);
            return this;
        }

        public QueryBuilder regionList(List<String> region){
            this.regionList = region;
            return this;
        }

        public QueryBuilder fetchRegion(){
            setFetchFields("fetchFields","region");
            return this;
        }

        public QueryBuilder excludeRegion(){
            setFetchFields("excludeFields","region");
            return this;
        }

        public QueryBuilder fuzzyDetailAddress (List<String> fuzzyDetailAddress){
            this.fuzzyDetailAddress = fuzzyDetailAddress;
            return this;
        }

        public QueryBuilder fuzzyDetailAddress (String ... fuzzyDetailAddress){
            this.fuzzyDetailAddress = solveNullList(fuzzyDetailAddress);
            return this;
        }

        public QueryBuilder rightFuzzyDetailAddress (List<String> rightFuzzyDetailAddress){
            this.rightFuzzyDetailAddress = rightFuzzyDetailAddress;
            return this;
        }

        public QueryBuilder rightFuzzyDetailAddress (String ... rightFuzzyDetailAddress){
            this.rightFuzzyDetailAddress = solveNullList(rightFuzzyDetailAddress);
            return this;
        }

        public QueryBuilder detailAddress(String detailAddress){
            setDetailAddress(detailAddress);
            return this;
        }

        public QueryBuilder detailAddressList(String ... detailAddress){
            this.detailAddressList = solveNullList(detailAddress);
            return this;
        }

        public QueryBuilder detailAddressList(List<String> detailAddress){
            this.detailAddressList = detailAddress;
            return this;
        }

        public QueryBuilder fetchDetailAddress(){
            setFetchFields("fetchFields","detailAddress");
            return this;
        }

        public QueryBuilder excludeDetailAddress(){
            setFetchFields("excludeFields","detailAddress");
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

        public UmsMemberReceiveAddress build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> memberIdList;

        public List<Long> getMemberIdList(){return this.memberIdList;}

        private Long memberIdSt;

        private Long memberIdEd;

        public Long getMemberIdSt(){return this.memberIdSt;}

        public Long getMemberIdEd(){return this.memberIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> phoneNumberList;

        public List<String> getPhoneNumberList(){return this.phoneNumberList;}


        private List<String> fuzzyPhoneNumber;

        public List<String> getFuzzyPhoneNumber(){return this.fuzzyPhoneNumber;}

        private List<String> rightFuzzyPhoneNumber;

        public List<String> getRightFuzzyPhoneNumber(){return this.rightFuzzyPhoneNumber;}
        private List<Integer> defaultStatusList;

        public List<Integer> getDefaultStatusList(){return this.defaultStatusList;}

        private Integer defaultStatusSt;

        private Integer defaultStatusEd;

        public Integer getDefaultStatusSt(){return this.defaultStatusSt;}

        public Integer getDefaultStatusEd(){return this.defaultStatusEd;}

        private List<String> postCodeList;

        public List<String> getPostCodeList(){return this.postCodeList;}


        private List<String> fuzzyPostCode;

        public List<String> getFuzzyPostCode(){return this.fuzzyPostCode;}

        private List<String> rightFuzzyPostCode;

        public List<String> getRightFuzzyPostCode(){return this.rightFuzzyPostCode;}
        private List<String> provinceList;

        public List<String> getProvinceList(){return this.provinceList;}


        private List<String> fuzzyProvince;

        public List<String> getFuzzyProvince(){return this.fuzzyProvince;}

        private List<String> rightFuzzyProvince;

        public List<String> getRightFuzzyProvince(){return this.rightFuzzyProvince;}
        private List<String> cityList;

        public List<String> getCityList(){return this.cityList;}


        private List<String> fuzzyCity;

        public List<String> getFuzzyCity(){return this.fuzzyCity;}

        private List<String> rightFuzzyCity;

        public List<String> getRightFuzzyCity(){return this.rightFuzzyCity;}
        private List<String> regionList;

        public List<String> getRegionList(){return this.regionList;}


        private List<String> fuzzyRegion;

        public List<String> getFuzzyRegion(){return this.fuzzyRegion;}

        private List<String> rightFuzzyRegion;

        public List<String> getRightFuzzyRegion(){return this.rightFuzzyRegion;}
        private List<String> detailAddressList;

        public List<String> getDetailAddressList(){return this.detailAddressList;}


        private List<String> fuzzyDetailAddress;

        public List<String> getFuzzyDetailAddress(){return this.fuzzyDetailAddress;}

        private List<String> rightFuzzyDetailAddress;

        public List<String> getRightFuzzyDetailAddress(){return this.rightFuzzyDetailAddress;}

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

        public ConditionBuilder memberIdBetWeen(Long memberIdSt,Long memberIdEd){
            this.memberIdSt = memberIdSt;
            this.memberIdEd = memberIdEd;
            return this;
        }

        public ConditionBuilder memberIdGreaterEqThan(Long memberIdSt){
            this.memberIdSt = memberIdSt;
            return this;
        }
        public ConditionBuilder memberIdLessEqThan(Long memberIdEd){
            this.memberIdEd = memberIdEd;
            return this;
        }


        public ConditionBuilder memberIdList(Long ... memberId){
            this.memberIdList = solveNullList(memberId);
            return this;
        }

        public ConditionBuilder memberIdList(List<Long> memberId){
            this.memberIdList = memberId;
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

        public ConditionBuilder fuzzyPhoneNumber (List<String> fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = fuzzyPhoneNumber;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNumber (String ... fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = solveNullList(fuzzyPhoneNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNumber (List<String> rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = rightFuzzyPhoneNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNumber (String ... rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = solveNullList(rightFuzzyPhoneNumber);
            return this;
        }

        public ConditionBuilder phoneNumberList(String ... phoneNumber){
            this.phoneNumberList = solveNullList(phoneNumber);
            return this;
        }

        public ConditionBuilder phoneNumberList(List<String> phoneNumber){
            this.phoneNumberList = phoneNumber;
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

        public ConditionBuilder fuzzyPostCode (List<String> fuzzyPostCode){
            this.fuzzyPostCode = fuzzyPostCode;
            return this;
        }

        public ConditionBuilder fuzzyPostCode (String ... fuzzyPostCode){
            this.fuzzyPostCode = solveNullList(fuzzyPostCode);
            return this;
        }

        public ConditionBuilder rightFuzzyPostCode (List<String> rightFuzzyPostCode){
            this.rightFuzzyPostCode = rightFuzzyPostCode;
            return this;
        }

        public ConditionBuilder rightFuzzyPostCode (String ... rightFuzzyPostCode){
            this.rightFuzzyPostCode = solveNullList(rightFuzzyPostCode);
            return this;
        }

        public ConditionBuilder postCodeList(String ... postCode){
            this.postCodeList = solveNullList(postCode);
            return this;
        }

        public ConditionBuilder postCodeList(List<String> postCode){
            this.postCodeList = postCode;
            return this;
        }

        public ConditionBuilder fuzzyProvince (List<String> fuzzyProvince){
            this.fuzzyProvince = fuzzyProvince;
            return this;
        }

        public ConditionBuilder fuzzyProvince (String ... fuzzyProvince){
            this.fuzzyProvince = solveNullList(fuzzyProvince);
            return this;
        }

        public ConditionBuilder rightFuzzyProvince (List<String> rightFuzzyProvince){
            this.rightFuzzyProvince = rightFuzzyProvince;
            return this;
        }

        public ConditionBuilder rightFuzzyProvince (String ... rightFuzzyProvince){
            this.rightFuzzyProvince = solveNullList(rightFuzzyProvince);
            return this;
        }

        public ConditionBuilder provinceList(String ... province){
            this.provinceList = solveNullList(province);
            return this;
        }

        public ConditionBuilder provinceList(List<String> province){
            this.provinceList = province;
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

        public ConditionBuilder fuzzyRegion (List<String> fuzzyRegion){
            this.fuzzyRegion = fuzzyRegion;
            return this;
        }

        public ConditionBuilder fuzzyRegion (String ... fuzzyRegion){
            this.fuzzyRegion = solveNullList(fuzzyRegion);
            return this;
        }

        public ConditionBuilder rightFuzzyRegion (List<String> rightFuzzyRegion){
            this.rightFuzzyRegion = rightFuzzyRegion;
            return this;
        }

        public ConditionBuilder rightFuzzyRegion (String ... rightFuzzyRegion){
            this.rightFuzzyRegion = solveNullList(rightFuzzyRegion);
            return this;
        }

        public ConditionBuilder regionList(String ... region){
            this.regionList = solveNullList(region);
            return this;
        }

        public ConditionBuilder regionList(List<String> region){
            this.regionList = region;
            return this;
        }

        public ConditionBuilder fuzzyDetailAddress (List<String> fuzzyDetailAddress){
            this.fuzzyDetailAddress = fuzzyDetailAddress;
            return this;
        }

        public ConditionBuilder fuzzyDetailAddress (String ... fuzzyDetailAddress){
            this.fuzzyDetailAddress = solveNullList(fuzzyDetailAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyDetailAddress (List<String> rightFuzzyDetailAddress){
            this.rightFuzzyDetailAddress = rightFuzzyDetailAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyDetailAddress (String ... rightFuzzyDetailAddress){
            this.rightFuzzyDetailAddress = solveNullList(rightFuzzyDetailAddress);
            return this;
        }

        public ConditionBuilder detailAddressList(String ... detailAddress){
            this.detailAddressList = solveNullList(detailAddress);
            return this;
        }

        public ConditionBuilder detailAddressList(List<String> detailAddress){
            this.detailAddressList = detailAddress;
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

        private UmsMemberReceiveAddress obj;

        public Builder(){
            this.obj = new UmsMemberReceiveAddress();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder memberId(Long memberId){
            this.obj.setMemberId(memberId);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder phoneNumber(String phoneNumber){
            this.obj.setPhoneNumber(phoneNumber);
            return this;
        }
        public Builder defaultStatus(Integer defaultStatus){
            this.obj.setDefaultStatus(defaultStatus);
            return this;
        }
        public Builder postCode(String postCode){
            this.obj.setPostCode(postCode);
            return this;
        }
        public Builder province(String province){
            this.obj.setProvince(province);
            return this;
        }
        public Builder city(String city){
            this.obj.setCity(city);
            return this;
        }
        public Builder region(String region){
            this.obj.setRegion(region);
            return this;
        }
        public Builder detailAddress(String detailAddress){
            this.obj.setDetailAddress(detailAddress);
            return this;
        }
        public UmsMemberReceiveAddress build(){return obj;}
    }

}
