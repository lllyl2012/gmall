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
public class OmsCompanyAddress implements Serializable {

    private static final long serialVersionUID = 1573824700887L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 地址名称
    * isNullAble:1
    */
    private String addressName;

    /**
    * 默认发货地址：0->否；1->是
    * isNullAble:1
    */
    private Integer sendStatus;

    /**
    * 是否默认收货地址：0->否；1->是
    * isNullAble:1
    */
    private Integer receiveStatus;

    /**
    * 收发货人姓名
    * isNullAble:1
    */
    private String name;

    /**
    * 收货人电话
    * isNullAble:1
    */
    private String phone;

    /**
    * 省/直辖市
    * isNullAble:1
    */
    private String province;

    /**
    * 市
    * isNullAble:1
    */
    private String city;

    /**
    * 区
    * isNullAble:1
    */
    private String region;

    /**
    * 详细地址
    * isNullAble:1
    */
    private String detailAddress;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setAddressName(String addressName){this.addressName = addressName;}

    public String getAddressName(){return this.addressName;}

    public void setSendStatus(Integer sendStatus){this.sendStatus = sendStatus;}

    public Integer getSendStatus(){return this.sendStatus;}

    public void setReceiveStatus(Integer receiveStatus){this.receiveStatus = receiveStatus;}

    public Integer getReceiveStatus(){return this.receiveStatus;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setPhone(String phone){this.phone = phone;}

    public String getPhone(){return this.phone;}

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
        return "OmsCompanyAddress{" +
                "id='" + id + '\'' +
                "addressName='" + addressName + '\'' +
                "sendStatus='" + sendStatus + '\'' +
                "receiveStatus='" + receiveStatus + '\'' +
                "name='" + name + '\'' +
                "phone='" + phone + '\'' +
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

        private OmsCompanyAddress set;

        private ConditionBuilder where;

        public UpdateBuilder set(OmsCompanyAddress set){
            this.set = set;
            return this;
        }

        public OmsCompanyAddress getSet(){
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

    public static class QueryBuilder extends OmsCompanyAddress{
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

        private List<String> addressNameList;

        public List<String> getAddressNameList(){return this.addressNameList;}


        private List<String> fuzzyAddressName;

        public List<String> getFuzzyAddressName(){return this.fuzzyAddressName;}

        private List<String> rightFuzzyAddressName;

        public List<String> getRightFuzzyAddressName(){return this.rightFuzzyAddressName;}
        private List<Integer> sendStatusList;

        public List<Integer> getSendStatusList(){return this.sendStatusList;}

        private Integer sendStatusSt;

        private Integer sendStatusEd;

        public Integer getSendStatusSt(){return this.sendStatusSt;}

        public Integer getSendStatusEd(){return this.sendStatusEd;}

        private List<Integer> receiveStatusList;

        public List<Integer> getReceiveStatusList(){return this.receiveStatusList;}

        private Integer receiveStatusSt;

        private Integer receiveStatusEd;

        public Integer getReceiveStatusSt(){return this.receiveStatusSt;}

        public Integer getReceiveStatusEd(){return this.receiveStatusEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> phoneList;

        public List<String> getPhoneList(){return this.phoneList;}


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone(){return this.fuzzyPhone;}

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone(){return this.rightFuzzyPhone;}
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

        public QueryBuilder fuzzyAddressName (List<String> fuzzyAddressName){
            this.fuzzyAddressName = fuzzyAddressName;
            return this;
        }

        public QueryBuilder fuzzyAddressName (String ... fuzzyAddressName){
            this.fuzzyAddressName = solveNullList(fuzzyAddressName);
            return this;
        }

        public QueryBuilder rightFuzzyAddressName (List<String> rightFuzzyAddressName){
            this.rightFuzzyAddressName = rightFuzzyAddressName;
            return this;
        }

        public QueryBuilder rightFuzzyAddressName (String ... rightFuzzyAddressName){
            this.rightFuzzyAddressName = solveNullList(rightFuzzyAddressName);
            return this;
        }

        public QueryBuilder addressName(String addressName){
            setAddressName(addressName);
            return this;
        }

        public QueryBuilder addressNameList(String ... addressName){
            this.addressNameList = solveNullList(addressName);
            return this;
        }

        public QueryBuilder addressNameList(List<String> addressName){
            this.addressNameList = addressName;
            return this;
        }

        public QueryBuilder fetchAddressName(){
            setFetchFields("fetchFields","addressName");
            return this;
        }

        public QueryBuilder excludeAddressName(){
            setFetchFields("excludeFields","addressName");
            return this;
        }

        public QueryBuilder sendStatusBetWeen(Integer sendStatusSt,Integer sendStatusEd){
            this.sendStatusSt = sendStatusSt;
            this.sendStatusEd = sendStatusEd;
            return this;
        }

        public QueryBuilder sendStatusGreaterEqThan(Integer sendStatusSt){
            this.sendStatusSt = sendStatusSt;
            return this;
        }
        public QueryBuilder sendStatusLessEqThan(Integer sendStatusEd){
            this.sendStatusEd = sendStatusEd;
            return this;
        }


        public QueryBuilder sendStatus(Integer sendStatus){
            setSendStatus(sendStatus);
            return this;
        }

        public QueryBuilder sendStatusList(Integer ... sendStatus){
            this.sendStatusList = solveNullList(sendStatus);
            return this;
        }

        public QueryBuilder sendStatusList(List<Integer> sendStatus){
            this.sendStatusList = sendStatus;
            return this;
        }

        public QueryBuilder fetchSendStatus(){
            setFetchFields("fetchFields","sendStatus");
            return this;
        }

        public QueryBuilder excludeSendStatus(){
            setFetchFields("excludeFields","sendStatus");
            return this;
        }

        public QueryBuilder receiveStatusBetWeen(Integer receiveStatusSt,Integer receiveStatusEd){
            this.receiveStatusSt = receiveStatusSt;
            this.receiveStatusEd = receiveStatusEd;
            return this;
        }

        public QueryBuilder receiveStatusGreaterEqThan(Integer receiveStatusSt){
            this.receiveStatusSt = receiveStatusSt;
            return this;
        }
        public QueryBuilder receiveStatusLessEqThan(Integer receiveStatusEd){
            this.receiveStatusEd = receiveStatusEd;
            return this;
        }


        public QueryBuilder receiveStatus(Integer receiveStatus){
            setReceiveStatus(receiveStatus);
            return this;
        }

        public QueryBuilder receiveStatusList(Integer ... receiveStatus){
            this.receiveStatusList = solveNullList(receiveStatus);
            return this;
        }

        public QueryBuilder receiveStatusList(List<Integer> receiveStatus){
            this.receiveStatusList = receiveStatus;
            return this;
        }

        public QueryBuilder fetchReceiveStatus(){
            setFetchFields("fetchFields","receiveStatus");
            return this;
        }

        public QueryBuilder excludeReceiveStatus(){
            setFetchFields("excludeFields","receiveStatus");
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

        public OmsCompanyAddress build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> addressNameList;

        public List<String> getAddressNameList(){return this.addressNameList;}


        private List<String> fuzzyAddressName;

        public List<String> getFuzzyAddressName(){return this.fuzzyAddressName;}

        private List<String> rightFuzzyAddressName;

        public List<String> getRightFuzzyAddressName(){return this.rightFuzzyAddressName;}
        private List<Integer> sendStatusList;

        public List<Integer> getSendStatusList(){return this.sendStatusList;}

        private Integer sendStatusSt;

        private Integer sendStatusEd;

        public Integer getSendStatusSt(){return this.sendStatusSt;}

        public Integer getSendStatusEd(){return this.sendStatusEd;}

        private List<Integer> receiveStatusList;

        public List<Integer> getReceiveStatusList(){return this.receiveStatusList;}

        private Integer receiveStatusSt;

        private Integer receiveStatusEd;

        public Integer getReceiveStatusSt(){return this.receiveStatusSt;}

        public Integer getReceiveStatusEd(){return this.receiveStatusEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> phoneList;

        public List<String> getPhoneList(){return this.phoneList;}


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone(){return this.fuzzyPhone;}

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone(){return this.rightFuzzyPhone;}
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

        public ConditionBuilder fuzzyAddressName (List<String> fuzzyAddressName){
            this.fuzzyAddressName = fuzzyAddressName;
            return this;
        }

        public ConditionBuilder fuzzyAddressName (String ... fuzzyAddressName){
            this.fuzzyAddressName = solveNullList(fuzzyAddressName);
            return this;
        }

        public ConditionBuilder rightFuzzyAddressName (List<String> rightFuzzyAddressName){
            this.rightFuzzyAddressName = rightFuzzyAddressName;
            return this;
        }

        public ConditionBuilder rightFuzzyAddressName (String ... rightFuzzyAddressName){
            this.rightFuzzyAddressName = solveNullList(rightFuzzyAddressName);
            return this;
        }

        public ConditionBuilder addressNameList(String ... addressName){
            this.addressNameList = solveNullList(addressName);
            return this;
        }

        public ConditionBuilder addressNameList(List<String> addressName){
            this.addressNameList = addressName;
            return this;
        }

        public ConditionBuilder sendStatusBetWeen(Integer sendStatusSt,Integer sendStatusEd){
            this.sendStatusSt = sendStatusSt;
            this.sendStatusEd = sendStatusEd;
            return this;
        }

        public ConditionBuilder sendStatusGreaterEqThan(Integer sendStatusSt){
            this.sendStatusSt = sendStatusSt;
            return this;
        }
        public ConditionBuilder sendStatusLessEqThan(Integer sendStatusEd){
            this.sendStatusEd = sendStatusEd;
            return this;
        }


        public ConditionBuilder sendStatusList(Integer ... sendStatus){
            this.sendStatusList = solveNullList(sendStatus);
            return this;
        }

        public ConditionBuilder sendStatusList(List<Integer> sendStatus){
            this.sendStatusList = sendStatus;
            return this;
        }

        public ConditionBuilder receiveStatusBetWeen(Integer receiveStatusSt,Integer receiveStatusEd){
            this.receiveStatusSt = receiveStatusSt;
            this.receiveStatusEd = receiveStatusEd;
            return this;
        }

        public ConditionBuilder receiveStatusGreaterEqThan(Integer receiveStatusSt){
            this.receiveStatusSt = receiveStatusSt;
            return this;
        }
        public ConditionBuilder receiveStatusLessEqThan(Integer receiveStatusEd){
            this.receiveStatusEd = receiveStatusEd;
            return this;
        }


        public ConditionBuilder receiveStatusList(Integer ... receiveStatus){
            this.receiveStatusList = solveNullList(receiveStatus);
            return this;
        }

        public ConditionBuilder receiveStatusList(List<Integer> receiveStatus){
            this.receiveStatusList = receiveStatus;
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

        private OmsCompanyAddress obj;

        public Builder(){
            this.obj = new OmsCompanyAddress();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder addressName(String addressName){
            this.obj.setAddressName(addressName);
            return this;
        }
        public Builder sendStatus(Integer sendStatus){
            this.obj.setSendStatus(sendStatus);
            return this;
        }
        public Builder receiveStatus(Integer receiveStatus){
            this.obj.setReceiveStatus(receiveStatus);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder phone(String phone){
            this.obj.setPhone(phone);
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
        public OmsCompanyAddress build(){return obj;}
    }

}
