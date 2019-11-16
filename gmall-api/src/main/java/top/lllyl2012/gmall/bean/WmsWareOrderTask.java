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
public class WmsWareOrderTask implements Serializable {

    private static final long serialVersionUID = 1573824757163L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * 订单编号
    * isNullAble:1
    */
    private Long orderId;

    /**
    * 收货人
    * isNullAble:1
    */
    private String consignee;

    /**
    * 收货人电话
    * isNullAble:1
    */
    private String consigneeTel;

    /**
    * 送货地址
    * isNullAble:1
    */
    private String deliveryAddress;

    /**
    * 订单备注
    * isNullAble:1
    */
    private String orderComment;

    /**
    * 付款方式 1:在线付款 2:货到付款
    * isNullAble:1
    */
    private String paymentWay;

    /**
    * 
    * isNullAble:1
    */
    private String taskStatus;

    /**
    * 订单描述
    * isNullAble:1
    */
    private String orderBody;

    /**
    * 物流单号
    * isNullAble:1
    */
    private String trackingNo;

    /**
    * 创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 仓库编号
    * isNullAble:1
    */
    private Long wareId;

    /**
    * 工作单备注
    * isNullAble:1
    */
    private String taskComment;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setOrderId(Long orderId){this.orderId = orderId;}

    public Long getOrderId(){return this.orderId;}

    public void setConsignee(String consignee){this.consignee = consignee;}

    public String getConsignee(){return this.consignee;}

    public void setConsigneeTel(String consigneeTel){this.consigneeTel = consigneeTel;}

    public String getConsigneeTel(){return this.consigneeTel;}

    public void setDeliveryAddress(String deliveryAddress){this.deliveryAddress = deliveryAddress;}

    public String getDeliveryAddress(){return this.deliveryAddress;}

    public void setOrderComment(String orderComment){this.orderComment = orderComment;}

    public String getOrderComment(){return this.orderComment;}

    public void setPaymentWay(String paymentWay){this.paymentWay = paymentWay;}

    public String getPaymentWay(){return this.paymentWay;}

    public void setTaskStatus(String taskStatus){this.taskStatus = taskStatus;}

    public String getTaskStatus(){return this.taskStatus;}

    public void setOrderBody(String orderBody){this.orderBody = orderBody;}

    public String getOrderBody(){return this.orderBody;}

    public void setTrackingNo(String trackingNo){this.trackingNo = trackingNo;}

    public String getTrackingNo(){return this.trackingNo;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setWareId(Long wareId){this.wareId = wareId;}

    public Long getWareId(){return this.wareId;}

    public void setTaskComment(String taskComment){this.taskComment = taskComment;}

    public String getTaskComment(){return this.taskComment;}
    @Override
    public String toString() {
        return "WmsWareOrderTask{" +
                "id='" + id + '\'' +
                "orderId='" + orderId + '\'' +
                "consignee='" + consignee + '\'' +
                "consigneeTel='" + consigneeTel + '\'' +
                "deliveryAddress='" + deliveryAddress + '\'' +
                "orderComment='" + orderComment + '\'' +
                "paymentWay='" + paymentWay + '\'' +
                "taskStatus='" + taskStatus + '\'' +
                "orderBody='" + orderBody + '\'' +
                "trackingNo='" + trackingNo + '\'' +
                "createTime='" + createTime + '\'' +
                "wareId='" + wareId + '\'' +
                "taskComment='" + taskComment + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private WmsWareOrderTask set;

        private ConditionBuilder where;

        public UpdateBuilder set(WmsWareOrderTask set){
            this.set = set;
            return this;
        }

        public WmsWareOrderTask getSet(){
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

    public static class QueryBuilder extends WmsWareOrderTask{
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

        private List<Long> orderIdList;

        public List<Long> getOrderIdList(){return this.orderIdList;}

        private Long orderIdSt;

        private Long orderIdEd;

        public Long getOrderIdSt(){return this.orderIdSt;}

        public Long getOrderIdEd(){return this.orderIdEd;}

        private List<String> consigneeList;

        public List<String> getConsigneeList(){return this.consigneeList;}


        private List<String> fuzzyConsignee;

        public List<String> getFuzzyConsignee(){return this.fuzzyConsignee;}

        private List<String> rightFuzzyConsignee;

        public List<String> getRightFuzzyConsignee(){return this.rightFuzzyConsignee;}
        private List<String> consigneeTelList;

        public List<String> getConsigneeTelList(){return this.consigneeTelList;}


        private List<String> fuzzyConsigneeTel;

        public List<String> getFuzzyConsigneeTel(){return this.fuzzyConsigneeTel;}

        private List<String> rightFuzzyConsigneeTel;

        public List<String> getRightFuzzyConsigneeTel(){return this.rightFuzzyConsigneeTel;}
        private List<String> deliveryAddressList;

        public List<String> getDeliveryAddressList(){return this.deliveryAddressList;}


        private List<String> fuzzyDeliveryAddress;

        public List<String> getFuzzyDeliveryAddress(){return this.fuzzyDeliveryAddress;}

        private List<String> rightFuzzyDeliveryAddress;

        public List<String> getRightFuzzyDeliveryAddress(){return this.rightFuzzyDeliveryAddress;}
        private List<String> orderCommentList;

        public List<String> getOrderCommentList(){return this.orderCommentList;}


        private List<String> fuzzyOrderComment;

        public List<String> getFuzzyOrderComment(){return this.fuzzyOrderComment;}

        private List<String> rightFuzzyOrderComment;

        public List<String> getRightFuzzyOrderComment(){return this.rightFuzzyOrderComment;}
        private List<String> paymentWayList;

        public List<String> getPaymentWayList(){return this.paymentWayList;}


        private List<String> fuzzyPaymentWay;

        public List<String> getFuzzyPaymentWay(){return this.fuzzyPaymentWay;}

        private List<String> rightFuzzyPaymentWay;

        public List<String> getRightFuzzyPaymentWay(){return this.rightFuzzyPaymentWay;}
        private List<String> taskStatusList;

        public List<String> getTaskStatusList(){return this.taskStatusList;}


        private List<String> fuzzyTaskStatus;

        public List<String> getFuzzyTaskStatus(){return this.fuzzyTaskStatus;}

        private List<String> rightFuzzyTaskStatus;

        public List<String> getRightFuzzyTaskStatus(){return this.rightFuzzyTaskStatus;}
        private List<String> orderBodyList;

        public List<String> getOrderBodyList(){return this.orderBodyList;}


        private List<String> fuzzyOrderBody;

        public List<String> getFuzzyOrderBody(){return this.fuzzyOrderBody;}

        private List<String> rightFuzzyOrderBody;

        public List<String> getRightFuzzyOrderBody(){return this.rightFuzzyOrderBody;}
        private List<String> trackingNoList;

        public List<String> getTrackingNoList(){return this.trackingNoList;}


        private List<String> fuzzyTrackingNo;

        public List<String> getFuzzyTrackingNo(){return this.fuzzyTrackingNo;}

        private List<String> rightFuzzyTrackingNo;

        public List<String> getRightFuzzyTrackingNo(){return this.rightFuzzyTrackingNo;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Long> wareIdList;

        public List<Long> getWareIdList(){return this.wareIdList;}

        private Long wareIdSt;

        private Long wareIdEd;

        public Long getWareIdSt(){return this.wareIdSt;}

        public Long getWareIdEd(){return this.wareIdEd;}

        private List<String> taskCommentList;

        public List<String> getTaskCommentList(){return this.taskCommentList;}


        private List<String> fuzzyTaskComment;

        public List<String> getFuzzyTaskComment(){return this.fuzzyTaskComment;}

        private List<String> rightFuzzyTaskComment;

        public List<String> getRightFuzzyTaskComment(){return this.rightFuzzyTaskComment;}
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

        public QueryBuilder orderIdBetWeen(Long orderIdSt,Long orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public QueryBuilder orderIdGreaterEqThan(Long orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public QueryBuilder orderIdLessEqThan(Long orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public QueryBuilder orderId(Long orderId){
            setOrderId(orderId);
            return this;
        }

        public QueryBuilder orderIdList(Long ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public QueryBuilder orderIdList(List<Long> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public QueryBuilder fetchOrderId(){
            setFetchFields("fetchFields","orderId");
            return this;
        }

        public QueryBuilder excludeOrderId(){
            setFetchFields("excludeFields","orderId");
            return this;
        }

        public QueryBuilder fuzzyConsignee (List<String> fuzzyConsignee){
            this.fuzzyConsignee = fuzzyConsignee;
            return this;
        }

        public QueryBuilder fuzzyConsignee (String ... fuzzyConsignee){
            this.fuzzyConsignee = solveNullList(fuzzyConsignee);
            return this;
        }

        public QueryBuilder rightFuzzyConsignee (List<String> rightFuzzyConsignee){
            this.rightFuzzyConsignee = rightFuzzyConsignee;
            return this;
        }

        public QueryBuilder rightFuzzyConsignee (String ... rightFuzzyConsignee){
            this.rightFuzzyConsignee = solveNullList(rightFuzzyConsignee);
            return this;
        }

        public QueryBuilder consignee(String consignee){
            setConsignee(consignee);
            return this;
        }

        public QueryBuilder consigneeList(String ... consignee){
            this.consigneeList = solveNullList(consignee);
            return this;
        }

        public QueryBuilder consigneeList(List<String> consignee){
            this.consigneeList = consignee;
            return this;
        }

        public QueryBuilder fetchConsignee(){
            setFetchFields("fetchFields","consignee");
            return this;
        }

        public QueryBuilder excludeConsignee(){
            setFetchFields("excludeFields","consignee");
            return this;
        }

        public QueryBuilder fuzzyConsigneeTel (List<String> fuzzyConsigneeTel){
            this.fuzzyConsigneeTel = fuzzyConsigneeTel;
            return this;
        }

        public QueryBuilder fuzzyConsigneeTel (String ... fuzzyConsigneeTel){
            this.fuzzyConsigneeTel = solveNullList(fuzzyConsigneeTel);
            return this;
        }

        public QueryBuilder rightFuzzyConsigneeTel (List<String> rightFuzzyConsigneeTel){
            this.rightFuzzyConsigneeTel = rightFuzzyConsigneeTel;
            return this;
        }

        public QueryBuilder rightFuzzyConsigneeTel (String ... rightFuzzyConsigneeTel){
            this.rightFuzzyConsigneeTel = solveNullList(rightFuzzyConsigneeTel);
            return this;
        }

        public QueryBuilder consigneeTel(String consigneeTel){
            setConsigneeTel(consigneeTel);
            return this;
        }

        public QueryBuilder consigneeTelList(String ... consigneeTel){
            this.consigneeTelList = solveNullList(consigneeTel);
            return this;
        }

        public QueryBuilder consigneeTelList(List<String> consigneeTel){
            this.consigneeTelList = consigneeTel;
            return this;
        }

        public QueryBuilder fetchConsigneeTel(){
            setFetchFields("fetchFields","consigneeTel");
            return this;
        }

        public QueryBuilder excludeConsigneeTel(){
            setFetchFields("excludeFields","consigneeTel");
            return this;
        }

        public QueryBuilder fuzzyDeliveryAddress (List<String> fuzzyDeliveryAddress){
            this.fuzzyDeliveryAddress = fuzzyDeliveryAddress;
            return this;
        }

        public QueryBuilder fuzzyDeliveryAddress (String ... fuzzyDeliveryAddress){
            this.fuzzyDeliveryAddress = solveNullList(fuzzyDeliveryAddress);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryAddress (List<String> rightFuzzyDeliveryAddress){
            this.rightFuzzyDeliveryAddress = rightFuzzyDeliveryAddress;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryAddress (String ... rightFuzzyDeliveryAddress){
            this.rightFuzzyDeliveryAddress = solveNullList(rightFuzzyDeliveryAddress);
            return this;
        }

        public QueryBuilder deliveryAddress(String deliveryAddress){
            setDeliveryAddress(deliveryAddress);
            return this;
        }

        public QueryBuilder deliveryAddressList(String ... deliveryAddress){
            this.deliveryAddressList = solveNullList(deliveryAddress);
            return this;
        }

        public QueryBuilder deliveryAddressList(List<String> deliveryAddress){
            this.deliveryAddressList = deliveryAddress;
            return this;
        }

        public QueryBuilder fetchDeliveryAddress(){
            setFetchFields("fetchFields","deliveryAddress");
            return this;
        }

        public QueryBuilder excludeDeliveryAddress(){
            setFetchFields("excludeFields","deliveryAddress");
            return this;
        }

        public QueryBuilder fuzzyOrderComment (List<String> fuzzyOrderComment){
            this.fuzzyOrderComment = fuzzyOrderComment;
            return this;
        }

        public QueryBuilder fuzzyOrderComment (String ... fuzzyOrderComment){
            this.fuzzyOrderComment = solveNullList(fuzzyOrderComment);
            return this;
        }

        public QueryBuilder rightFuzzyOrderComment (List<String> rightFuzzyOrderComment){
            this.rightFuzzyOrderComment = rightFuzzyOrderComment;
            return this;
        }

        public QueryBuilder rightFuzzyOrderComment (String ... rightFuzzyOrderComment){
            this.rightFuzzyOrderComment = solveNullList(rightFuzzyOrderComment);
            return this;
        }

        public QueryBuilder orderComment(String orderComment){
            setOrderComment(orderComment);
            return this;
        }

        public QueryBuilder orderCommentList(String ... orderComment){
            this.orderCommentList = solveNullList(orderComment);
            return this;
        }

        public QueryBuilder orderCommentList(List<String> orderComment){
            this.orderCommentList = orderComment;
            return this;
        }

        public QueryBuilder fetchOrderComment(){
            setFetchFields("fetchFields","orderComment");
            return this;
        }

        public QueryBuilder excludeOrderComment(){
            setFetchFields("excludeFields","orderComment");
            return this;
        }

        public QueryBuilder fuzzyPaymentWay (List<String> fuzzyPaymentWay){
            this.fuzzyPaymentWay = fuzzyPaymentWay;
            return this;
        }

        public QueryBuilder fuzzyPaymentWay (String ... fuzzyPaymentWay){
            this.fuzzyPaymentWay = solveNullList(fuzzyPaymentWay);
            return this;
        }

        public QueryBuilder rightFuzzyPaymentWay (List<String> rightFuzzyPaymentWay){
            this.rightFuzzyPaymentWay = rightFuzzyPaymentWay;
            return this;
        }

        public QueryBuilder rightFuzzyPaymentWay (String ... rightFuzzyPaymentWay){
            this.rightFuzzyPaymentWay = solveNullList(rightFuzzyPaymentWay);
            return this;
        }

        public QueryBuilder paymentWay(String paymentWay){
            setPaymentWay(paymentWay);
            return this;
        }

        public QueryBuilder paymentWayList(String ... paymentWay){
            this.paymentWayList = solveNullList(paymentWay);
            return this;
        }

        public QueryBuilder paymentWayList(List<String> paymentWay){
            this.paymentWayList = paymentWay;
            return this;
        }

        public QueryBuilder fetchPaymentWay(){
            setFetchFields("fetchFields","paymentWay");
            return this;
        }

        public QueryBuilder excludePaymentWay(){
            setFetchFields("excludeFields","paymentWay");
            return this;
        }

        public QueryBuilder fuzzyTaskStatus (List<String> fuzzyTaskStatus){
            this.fuzzyTaskStatus = fuzzyTaskStatus;
            return this;
        }

        public QueryBuilder fuzzyTaskStatus (String ... fuzzyTaskStatus){
            this.fuzzyTaskStatus = solveNullList(fuzzyTaskStatus);
            return this;
        }

        public QueryBuilder rightFuzzyTaskStatus (List<String> rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = rightFuzzyTaskStatus;
            return this;
        }

        public QueryBuilder rightFuzzyTaskStatus (String ... rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = solveNullList(rightFuzzyTaskStatus);
            return this;
        }

        public QueryBuilder taskStatus(String taskStatus){
            setTaskStatus(taskStatus);
            return this;
        }

        public QueryBuilder taskStatusList(String ... taskStatus){
            this.taskStatusList = solveNullList(taskStatus);
            return this;
        }

        public QueryBuilder taskStatusList(List<String> taskStatus){
            this.taskStatusList = taskStatus;
            return this;
        }

        public QueryBuilder fetchTaskStatus(){
            setFetchFields("fetchFields","taskStatus");
            return this;
        }

        public QueryBuilder excludeTaskStatus(){
            setFetchFields("excludeFields","taskStatus");
            return this;
        }

        public QueryBuilder fuzzyOrderBody (List<String> fuzzyOrderBody){
            this.fuzzyOrderBody = fuzzyOrderBody;
            return this;
        }

        public QueryBuilder fuzzyOrderBody (String ... fuzzyOrderBody){
            this.fuzzyOrderBody = solveNullList(fuzzyOrderBody);
            return this;
        }

        public QueryBuilder rightFuzzyOrderBody (List<String> rightFuzzyOrderBody){
            this.rightFuzzyOrderBody = rightFuzzyOrderBody;
            return this;
        }

        public QueryBuilder rightFuzzyOrderBody (String ... rightFuzzyOrderBody){
            this.rightFuzzyOrderBody = solveNullList(rightFuzzyOrderBody);
            return this;
        }

        public QueryBuilder orderBody(String orderBody){
            setOrderBody(orderBody);
            return this;
        }

        public QueryBuilder orderBodyList(String ... orderBody){
            this.orderBodyList = solveNullList(orderBody);
            return this;
        }

        public QueryBuilder orderBodyList(List<String> orderBody){
            this.orderBodyList = orderBody;
            return this;
        }

        public QueryBuilder fetchOrderBody(){
            setFetchFields("fetchFields","orderBody");
            return this;
        }

        public QueryBuilder excludeOrderBody(){
            setFetchFields("excludeFields","orderBody");
            return this;
        }

        public QueryBuilder fuzzyTrackingNo (List<String> fuzzyTrackingNo){
            this.fuzzyTrackingNo = fuzzyTrackingNo;
            return this;
        }

        public QueryBuilder fuzzyTrackingNo (String ... fuzzyTrackingNo){
            this.fuzzyTrackingNo = solveNullList(fuzzyTrackingNo);
            return this;
        }

        public QueryBuilder rightFuzzyTrackingNo (List<String> rightFuzzyTrackingNo){
            this.rightFuzzyTrackingNo = rightFuzzyTrackingNo;
            return this;
        }

        public QueryBuilder rightFuzzyTrackingNo (String ... rightFuzzyTrackingNo){
            this.rightFuzzyTrackingNo = solveNullList(rightFuzzyTrackingNo);
            return this;
        }

        public QueryBuilder trackingNo(String trackingNo){
            setTrackingNo(trackingNo);
            return this;
        }

        public QueryBuilder trackingNoList(String ... trackingNo){
            this.trackingNoList = solveNullList(trackingNo);
            return this;
        }

        public QueryBuilder trackingNoList(List<String> trackingNo){
            this.trackingNoList = trackingNo;
            return this;
        }

        public QueryBuilder fetchTrackingNo(){
            setFetchFields("fetchFields","trackingNo");
            return this;
        }

        public QueryBuilder excludeTrackingNo(){
            setFetchFields("excludeFields","trackingNo");
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

        public QueryBuilder wareIdBetWeen(Long wareIdSt,Long wareIdEd){
            this.wareIdSt = wareIdSt;
            this.wareIdEd = wareIdEd;
            return this;
        }

        public QueryBuilder wareIdGreaterEqThan(Long wareIdSt){
            this.wareIdSt = wareIdSt;
            return this;
        }
        public QueryBuilder wareIdLessEqThan(Long wareIdEd){
            this.wareIdEd = wareIdEd;
            return this;
        }


        public QueryBuilder wareId(Long wareId){
            setWareId(wareId);
            return this;
        }

        public QueryBuilder wareIdList(Long ... wareId){
            this.wareIdList = solveNullList(wareId);
            return this;
        }

        public QueryBuilder wareIdList(List<Long> wareId){
            this.wareIdList = wareId;
            return this;
        }

        public QueryBuilder fetchWareId(){
            setFetchFields("fetchFields","wareId");
            return this;
        }

        public QueryBuilder excludeWareId(){
            setFetchFields("excludeFields","wareId");
            return this;
        }

        public QueryBuilder fuzzyTaskComment (List<String> fuzzyTaskComment){
            this.fuzzyTaskComment = fuzzyTaskComment;
            return this;
        }

        public QueryBuilder fuzzyTaskComment (String ... fuzzyTaskComment){
            this.fuzzyTaskComment = solveNullList(fuzzyTaskComment);
            return this;
        }

        public QueryBuilder rightFuzzyTaskComment (List<String> rightFuzzyTaskComment){
            this.rightFuzzyTaskComment = rightFuzzyTaskComment;
            return this;
        }

        public QueryBuilder rightFuzzyTaskComment (String ... rightFuzzyTaskComment){
            this.rightFuzzyTaskComment = solveNullList(rightFuzzyTaskComment);
            return this;
        }

        public QueryBuilder taskComment(String taskComment){
            setTaskComment(taskComment);
            return this;
        }

        public QueryBuilder taskCommentList(String ... taskComment){
            this.taskCommentList = solveNullList(taskComment);
            return this;
        }

        public QueryBuilder taskCommentList(List<String> taskComment){
            this.taskCommentList = taskComment;
            return this;
        }

        public QueryBuilder fetchTaskComment(){
            setFetchFields("fetchFields","taskComment");
            return this;
        }

        public QueryBuilder excludeTaskComment(){
            setFetchFields("excludeFields","taskComment");
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

        public WmsWareOrderTask build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> orderIdList;

        public List<Long> getOrderIdList(){return this.orderIdList;}

        private Long orderIdSt;

        private Long orderIdEd;

        public Long getOrderIdSt(){return this.orderIdSt;}

        public Long getOrderIdEd(){return this.orderIdEd;}

        private List<String> consigneeList;

        public List<String> getConsigneeList(){return this.consigneeList;}


        private List<String> fuzzyConsignee;

        public List<String> getFuzzyConsignee(){return this.fuzzyConsignee;}

        private List<String> rightFuzzyConsignee;

        public List<String> getRightFuzzyConsignee(){return this.rightFuzzyConsignee;}
        private List<String> consigneeTelList;

        public List<String> getConsigneeTelList(){return this.consigneeTelList;}


        private List<String> fuzzyConsigneeTel;

        public List<String> getFuzzyConsigneeTel(){return this.fuzzyConsigneeTel;}

        private List<String> rightFuzzyConsigneeTel;

        public List<String> getRightFuzzyConsigneeTel(){return this.rightFuzzyConsigneeTel;}
        private List<String> deliveryAddressList;

        public List<String> getDeliveryAddressList(){return this.deliveryAddressList;}


        private List<String> fuzzyDeliveryAddress;

        public List<String> getFuzzyDeliveryAddress(){return this.fuzzyDeliveryAddress;}

        private List<String> rightFuzzyDeliveryAddress;

        public List<String> getRightFuzzyDeliveryAddress(){return this.rightFuzzyDeliveryAddress;}
        private List<String> orderCommentList;

        public List<String> getOrderCommentList(){return this.orderCommentList;}


        private List<String> fuzzyOrderComment;

        public List<String> getFuzzyOrderComment(){return this.fuzzyOrderComment;}

        private List<String> rightFuzzyOrderComment;

        public List<String> getRightFuzzyOrderComment(){return this.rightFuzzyOrderComment;}
        private List<String> paymentWayList;

        public List<String> getPaymentWayList(){return this.paymentWayList;}


        private List<String> fuzzyPaymentWay;

        public List<String> getFuzzyPaymentWay(){return this.fuzzyPaymentWay;}

        private List<String> rightFuzzyPaymentWay;

        public List<String> getRightFuzzyPaymentWay(){return this.rightFuzzyPaymentWay;}
        private List<String> taskStatusList;

        public List<String> getTaskStatusList(){return this.taskStatusList;}


        private List<String> fuzzyTaskStatus;

        public List<String> getFuzzyTaskStatus(){return this.fuzzyTaskStatus;}

        private List<String> rightFuzzyTaskStatus;

        public List<String> getRightFuzzyTaskStatus(){return this.rightFuzzyTaskStatus;}
        private List<String> orderBodyList;

        public List<String> getOrderBodyList(){return this.orderBodyList;}


        private List<String> fuzzyOrderBody;

        public List<String> getFuzzyOrderBody(){return this.fuzzyOrderBody;}

        private List<String> rightFuzzyOrderBody;

        public List<String> getRightFuzzyOrderBody(){return this.rightFuzzyOrderBody;}
        private List<String> trackingNoList;

        public List<String> getTrackingNoList(){return this.trackingNoList;}


        private List<String> fuzzyTrackingNo;

        public List<String> getFuzzyTrackingNo(){return this.fuzzyTrackingNo;}

        private List<String> rightFuzzyTrackingNo;

        public List<String> getRightFuzzyTrackingNo(){return this.rightFuzzyTrackingNo;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Long> wareIdList;

        public List<Long> getWareIdList(){return this.wareIdList;}

        private Long wareIdSt;

        private Long wareIdEd;

        public Long getWareIdSt(){return this.wareIdSt;}

        public Long getWareIdEd(){return this.wareIdEd;}

        private List<String> taskCommentList;

        public List<String> getTaskCommentList(){return this.taskCommentList;}


        private List<String> fuzzyTaskComment;

        public List<String> getFuzzyTaskComment(){return this.fuzzyTaskComment;}

        private List<String> rightFuzzyTaskComment;

        public List<String> getRightFuzzyTaskComment(){return this.rightFuzzyTaskComment;}

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

        public ConditionBuilder orderIdBetWeen(Long orderIdSt,Long orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public ConditionBuilder orderIdGreaterEqThan(Long orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public ConditionBuilder orderIdLessEqThan(Long orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public ConditionBuilder orderIdList(Long ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public ConditionBuilder orderIdList(List<Long> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public ConditionBuilder fuzzyConsignee (List<String> fuzzyConsignee){
            this.fuzzyConsignee = fuzzyConsignee;
            return this;
        }

        public ConditionBuilder fuzzyConsignee (String ... fuzzyConsignee){
            this.fuzzyConsignee = solveNullList(fuzzyConsignee);
            return this;
        }

        public ConditionBuilder rightFuzzyConsignee (List<String> rightFuzzyConsignee){
            this.rightFuzzyConsignee = rightFuzzyConsignee;
            return this;
        }

        public ConditionBuilder rightFuzzyConsignee (String ... rightFuzzyConsignee){
            this.rightFuzzyConsignee = solveNullList(rightFuzzyConsignee);
            return this;
        }

        public ConditionBuilder consigneeList(String ... consignee){
            this.consigneeList = solveNullList(consignee);
            return this;
        }

        public ConditionBuilder consigneeList(List<String> consignee){
            this.consigneeList = consignee;
            return this;
        }

        public ConditionBuilder fuzzyConsigneeTel (List<String> fuzzyConsigneeTel){
            this.fuzzyConsigneeTel = fuzzyConsigneeTel;
            return this;
        }

        public ConditionBuilder fuzzyConsigneeTel (String ... fuzzyConsigneeTel){
            this.fuzzyConsigneeTel = solveNullList(fuzzyConsigneeTel);
            return this;
        }

        public ConditionBuilder rightFuzzyConsigneeTel (List<String> rightFuzzyConsigneeTel){
            this.rightFuzzyConsigneeTel = rightFuzzyConsigneeTel;
            return this;
        }

        public ConditionBuilder rightFuzzyConsigneeTel (String ... rightFuzzyConsigneeTel){
            this.rightFuzzyConsigneeTel = solveNullList(rightFuzzyConsigneeTel);
            return this;
        }

        public ConditionBuilder consigneeTelList(String ... consigneeTel){
            this.consigneeTelList = solveNullList(consigneeTel);
            return this;
        }

        public ConditionBuilder consigneeTelList(List<String> consigneeTel){
            this.consigneeTelList = consigneeTel;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryAddress (List<String> fuzzyDeliveryAddress){
            this.fuzzyDeliveryAddress = fuzzyDeliveryAddress;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryAddress (String ... fuzzyDeliveryAddress){
            this.fuzzyDeliveryAddress = solveNullList(fuzzyDeliveryAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryAddress (List<String> rightFuzzyDeliveryAddress){
            this.rightFuzzyDeliveryAddress = rightFuzzyDeliveryAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryAddress (String ... rightFuzzyDeliveryAddress){
            this.rightFuzzyDeliveryAddress = solveNullList(rightFuzzyDeliveryAddress);
            return this;
        }

        public ConditionBuilder deliveryAddressList(String ... deliveryAddress){
            this.deliveryAddressList = solveNullList(deliveryAddress);
            return this;
        }

        public ConditionBuilder deliveryAddressList(List<String> deliveryAddress){
            this.deliveryAddressList = deliveryAddress;
            return this;
        }

        public ConditionBuilder fuzzyOrderComment (List<String> fuzzyOrderComment){
            this.fuzzyOrderComment = fuzzyOrderComment;
            return this;
        }

        public ConditionBuilder fuzzyOrderComment (String ... fuzzyOrderComment){
            this.fuzzyOrderComment = solveNullList(fuzzyOrderComment);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderComment (List<String> rightFuzzyOrderComment){
            this.rightFuzzyOrderComment = rightFuzzyOrderComment;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderComment (String ... rightFuzzyOrderComment){
            this.rightFuzzyOrderComment = solveNullList(rightFuzzyOrderComment);
            return this;
        }

        public ConditionBuilder orderCommentList(String ... orderComment){
            this.orderCommentList = solveNullList(orderComment);
            return this;
        }

        public ConditionBuilder orderCommentList(List<String> orderComment){
            this.orderCommentList = orderComment;
            return this;
        }

        public ConditionBuilder fuzzyPaymentWay (List<String> fuzzyPaymentWay){
            this.fuzzyPaymentWay = fuzzyPaymentWay;
            return this;
        }

        public ConditionBuilder fuzzyPaymentWay (String ... fuzzyPaymentWay){
            this.fuzzyPaymentWay = solveNullList(fuzzyPaymentWay);
            return this;
        }

        public ConditionBuilder rightFuzzyPaymentWay (List<String> rightFuzzyPaymentWay){
            this.rightFuzzyPaymentWay = rightFuzzyPaymentWay;
            return this;
        }

        public ConditionBuilder rightFuzzyPaymentWay (String ... rightFuzzyPaymentWay){
            this.rightFuzzyPaymentWay = solveNullList(rightFuzzyPaymentWay);
            return this;
        }

        public ConditionBuilder paymentWayList(String ... paymentWay){
            this.paymentWayList = solveNullList(paymentWay);
            return this;
        }

        public ConditionBuilder paymentWayList(List<String> paymentWay){
            this.paymentWayList = paymentWay;
            return this;
        }

        public ConditionBuilder fuzzyTaskStatus (List<String> fuzzyTaskStatus){
            this.fuzzyTaskStatus = fuzzyTaskStatus;
            return this;
        }

        public ConditionBuilder fuzzyTaskStatus (String ... fuzzyTaskStatus){
            this.fuzzyTaskStatus = solveNullList(fuzzyTaskStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskStatus (List<String> rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = rightFuzzyTaskStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskStatus (String ... rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = solveNullList(rightFuzzyTaskStatus);
            return this;
        }

        public ConditionBuilder taskStatusList(String ... taskStatus){
            this.taskStatusList = solveNullList(taskStatus);
            return this;
        }

        public ConditionBuilder taskStatusList(List<String> taskStatus){
            this.taskStatusList = taskStatus;
            return this;
        }

        public ConditionBuilder fuzzyOrderBody (List<String> fuzzyOrderBody){
            this.fuzzyOrderBody = fuzzyOrderBody;
            return this;
        }

        public ConditionBuilder fuzzyOrderBody (String ... fuzzyOrderBody){
            this.fuzzyOrderBody = solveNullList(fuzzyOrderBody);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderBody (List<String> rightFuzzyOrderBody){
            this.rightFuzzyOrderBody = rightFuzzyOrderBody;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderBody (String ... rightFuzzyOrderBody){
            this.rightFuzzyOrderBody = solveNullList(rightFuzzyOrderBody);
            return this;
        }

        public ConditionBuilder orderBodyList(String ... orderBody){
            this.orderBodyList = solveNullList(orderBody);
            return this;
        }

        public ConditionBuilder orderBodyList(List<String> orderBody){
            this.orderBodyList = orderBody;
            return this;
        }

        public ConditionBuilder fuzzyTrackingNo (List<String> fuzzyTrackingNo){
            this.fuzzyTrackingNo = fuzzyTrackingNo;
            return this;
        }

        public ConditionBuilder fuzzyTrackingNo (String ... fuzzyTrackingNo){
            this.fuzzyTrackingNo = solveNullList(fuzzyTrackingNo);
            return this;
        }

        public ConditionBuilder rightFuzzyTrackingNo (List<String> rightFuzzyTrackingNo){
            this.rightFuzzyTrackingNo = rightFuzzyTrackingNo;
            return this;
        }

        public ConditionBuilder rightFuzzyTrackingNo (String ... rightFuzzyTrackingNo){
            this.rightFuzzyTrackingNo = solveNullList(rightFuzzyTrackingNo);
            return this;
        }

        public ConditionBuilder trackingNoList(String ... trackingNo){
            this.trackingNoList = solveNullList(trackingNo);
            return this;
        }

        public ConditionBuilder trackingNoList(List<String> trackingNo){
            this.trackingNoList = trackingNo;
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

        public ConditionBuilder wareIdBetWeen(Long wareIdSt,Long wareIdEd){
            this.wareIdSt = wareIdSt;
            this.wareIdEd = wareIdEd;
            return this;
        }

        public ConditionBuilder wareIdGreaterEqThan(Long wareIdSt){
            this.wareIdSt = wareIdSt;
            return this;
        }
        public ConditionBuilder wareIdLessEqThan(Long wareIdEd){
            this.wareIdEd = wareIdEd;
            return this;
        }


        public ConditionBuilder wareIdList(Long ... wareId){
            this.wareIdList = solveNullList(wareId);
            return this;
        }

        public ConditionBuilder wareIdList(List<Long> wareId){
            this.wareIdList = wareId;
            return this;
        }

        public ConditionBuilder fuzzyTaskComment (List<String> fuzzyTaskComment){
            this.fuzzyTaskComment = fuzzyTaskComment;
            return this;
        }

        public ConditionBuilder fuzzyTaskComment (String ... fuzzyTaskComment){
            this.fuzzyTaskComment = solveNullList(fuzzyTaskComment);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskComment (List<String> rightFuzzyTaskComment){
            this.rightFuzzyTaskComment = rightFuzzyTaskComment;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskComment (String ... rightFuzzyTaskComment){
            this.rightFuzzyTaskComment = solveNullList(rightFuzzyTaskComment);
            return this;
        }

        public ConditionBuilder taskCommentList(String ... taskComment){
            this.taskCommentList = solveNullList(taskComment);
            return this;
        }

        public ConditionBuilder taskCommentList(List<String> taskComment){
            this.taskCommentList = taskComment;
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

        private WmsWareOrderTask obj;

        public Builder(){
            this.obj = new WmsWareOrderTask();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder orderId(Long orderId){
            this.obj.setOrderId(orderId);
            return this;
        }
        public Builder consignee(String consignee){
            this.obj.setConsignee(consignee);
            return this;
        }
        public Builder consigneeTel(String consigneeTel){
            this.obj.setConsigneeTel(consigneeTel);
            return this;
        }
        public Builder deliveryAddress(String deliveryAddress){
            this.obj.setDeliveryAddress(deliveryAddress);
            return this;
        }
        public Builder orderComment(String orderComment){
            this.obj.setOrderComment(orderComment);
            return this;
        }
        public Builder paymentWay(String paymentWay){
            this.obj.setPaymentWay(paymentWay);
            return this;
        }
        public Builder taskStatus(String taskStatus){
            this.obj.setTaskStatus(taskStatus);
            return this;
        }
        public Builder orderBody(String orderBody){
            this.obj.setOrderBody(orderBody);
            return this;
        }
        public Builder trackingNo(String trackingNo){
            this.obj.setTrackingNo(trackingNo);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder wareId(Long wareId){
            this.obj.setWareId(wareId);
            return this;
        }
        public Builder taskComment(String taskComment){
            this.obj.setTaskComment(taskComment);
            return this;
        }
        public WmsWareOrderTask build(){return obj;}
    }

}
