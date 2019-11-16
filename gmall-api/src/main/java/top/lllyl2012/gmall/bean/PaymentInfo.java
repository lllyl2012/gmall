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
public class PaymentInfo implements Serializable {

    private static final long serialVersionUID = 1573824709860L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * 对外业务编号
    * isNullAble:1
    */
    private String orderSn;

    /**
    * 订单编号
    * isNullAble:1
    */
    private String orderId;

    /**
    * 支付宝交易编号
    * isNullAble:1
    */
    private String alipayTradeNo;

    /**
    * 支付金额
    * isNullAble:1
    */
    private java.math.BigDecimal totalAmount;

    /**
    * 交易内容
    * isNullAble:1
    */
    private String subject;

    /**
    * 支付状态
    * isNullAble:1
    */
    private String paymentStatus;

    /**
    * 创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime confirmTime;

    /**
    * 回调信息
    * isNullAble:1
    */
    private String callbackContent;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime callbackTime;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setOrderSn(String orderSn){this.orderSn = orderSn;}

    public String getOrderSn(){return this.orderSn;}

    public void setOrderId(String orderId){this.orderId = orderId;}

    public String getOrderId(){return this.orderId;}

    public void setAlipayTradeNo(String alipayTradeNo){this.alipayTradeNo = alipayTradeNo;}

    public String getAlipayTradeNo(){return this.alipayTradeNo;}

    public void setTotalAmount(java.math.BigDecimal totalAmount){this.totalAmount = totalAmount;}

    public java.math.BigDecimal getTotalAmount(){return this.totalAmount;}

    public void setSubject(String subject){this.subject = subject;}

    public String getSubject(){return this.subject;}

    public void setPaymentStatus(String paymentStatus){this.paymentStatus = paymentStatus;}

    public String getPaymentStatus(){return this.paymentStatus;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setConfirmTime(java.time.LocalDateTime confirmTime){this.confirmTime = confirmTime;}

    public java.time.LocalDateTime getConfirmTime(){return this.confirmTime;}

    public void setCallbackContent(String callbackContent){this.callbackContent = callbackContent;}

    public String getCallbackContent(){return this.callbackContent;}

    public void setCallbackTime(java.time.LocalDateTime callbackTime){this.callbackTime = callbackTime;}

    public java.time.LocalDateTime getCallbackTime(){return this.callbackTime;}
    @Override
    public String toString() {
        return "PaymentInfo{" +
                "id='" + id + '\'' +
                "orderSn='" + orderSn + '\'' +
                "orderId='" + orderId + '\'' +
                "alipayTradeNo='" + alipayTradeNo + '\'' +
                "totalAmount='" + totalAmount + '\'' +
                "subject='" + subject + '\'' +
                "paymentStatus='" + paymentStatus + '\'' +
                "createTime='" + createTime + '\'' +
                "confirmTime='" + confirmTime + '\'' +
                "callbackContent='" + callbackContent + '\'' +
                "callbackTime='" + callbackTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PaymentInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(PaymentInfo set){
            this.set = set;
            return this;
        }

        public PaymentInfo getSet(){
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

    public static class QueryBuilder extends PaymentInfo{
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

        private List<String> orderSnList;

        public List<String> getOrderSnList(){return this.orderSnList;}


        private List<String> fuzzyOrderSn;

        public List<String> getFuzzyOrderSn(){return this.fuzzyOrderSn;}

        private List<String> rightFuzzyOrderSn;

        public List<String> getRightFuzzyOrderSn(){return this.rightFuzzyOrderSn;}
        private List<String> orderIdList;

        public List<String> getOrderIdList(){return this.orderIdList;}


        private List<String> fuzzyOrderId;

        public List<String> getFuzzyOrderId(){return this.fuzzyOrderId;}

        private List<String> rightFuzzyOrderId;

        public List<String> getRightFuzzyOrderId(){return this.rightFuzzyOrderId;}
        private List<String> alipayTradeNoList;

        public List<String> getAlipayTradeNoList(){return this.alipayTradeNoList;}


        private List<String> fuzzyAlipayTradeNo;

        public List<String> getFuzzyAlipayTradeNo(){return this.fuzzyAlipayTradeNo;}

        private List<String> rightFuzzyAlipayTradeNo;

        public List<String> getRightFuzzyAlipayTradeNo(){return this.rightFuzzyAlipayTradeNo;}
        private List<java.math.BigDecimal> totalAmountList;

        public List<java.math.BigDecimal> getTotalAmountList(){return this.totalAmountList;}

        private java.math.BigDecimal totalAmountSt;

        private java.math.BigDecimal totalAmountEd;

        public java.math.BigDecimal getTotalAmountSt(){return this.totalAmountSt;}

        public java.math.BigDecimal getTotalAmountEd(){return this.totalAmountEd;}

        private List<String> subjectList;

        public List<String> getSubjectList(){return this.subjectList;}


        private List<String> fuzzySubject;

        public List<String> getFuzzySubject(){return this.fuzzySubject;}

        private List<String> rightFuzzySubject;

        public List<String> getRightFuzzySubject(){return this.rightFuzzySubject;}
        private List<String> paymentStatusList;

        public List<String> getPaymentStatusList(){return this.paymentStatusList;}


        private List<String> fuzzyPaymentStatus;

        public List<String> getFuzzyPaymentStatus(){return this.fuzzyPaymentStatus;}

        private List<String> rightFuzzyPaymentStatus;

        public List<String> getRightFuzzyPaymentStatus(){return this.rightFuzzyPaymentStatus;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> confirmTimeList;

        public List<java.time.LocalDateTime> getConfirmTimeList(){return this.confirmTimeList;}

        private java.time.LocalDateTime confirmTimeSt;

        private java.time.LocalDateTime confirmTimeEd;

        public java.time.LocalDateTime getConfirmTimeSt(){return this.confirmTimeSt;}

        public java.time.LocalDateTime getConfirmTimeEd(){return this.confirmTimeEd;}

        private List<String> callbackContentList;

        public List<String> getCallbackContentList(){return this.callbackContentList;}


        private List<String> fuzzyCallbackContent;

        public List<String> getFuzzyCallbackContent(){return this.fuzzyCallbackContent;}

        private List<String> rightFuzzyCallbackContent;

        public List<String> getRightFuzzyCallbackContent(){return this.rightFuzzyCallbackContent;}
        private List<java.time.LocalDateTime> callbackTimeList;

        public List<java.time.LocalDateTime> getCallbackTimeList(){return this.callbackTimeList;}

        private java.time.LocalDateTime callbackTimeSt;

        private java.time.LocalDateTime callbackTimeEd;

        public java.time.LocalDateTime getCallbackTimeSt(){return this.callbackTimeSt;}

        public java.time.LocalDateTime getCallbackTimeEd(){return this.callbackTimeEd;}

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

        public QueryBuilder fuzzyOrderSn (List<String> fuzzyOrderSn){
            this.fuzzyOrderSn = fuzzyOrderSn;
            return this;
        }

        public QueryBuilder fuzzyOrderSn (String ... fuzzyOrderSn){
            this.fuzzyOrderSn = solveNullList(fuzzyOrderSn);
            return this;
        }

        public QueryBuilder rightFuzzyOrderSn (List<String> rightFuzzyOrderSn){
            this.rightFuzzyOrderSn = rightFuzzyOrderSn;
            return this;
        }

        public QueryBuilder rightFuzzyOrderSn (String ... rightFuzzyOrderSn){
            this.rightFuzzyOrderSn = solveNullList(rightFuzzyOrderSn);
            return this;
        }

        public QueryBuilder orderSn(String orderSn){
            setOrderSn(orderSn);
            return this;
        }

        public QueryBuilder orderSnList(String ... orderSn){
            this.orderSnList = solveNullList(orderSn);
            return this;
        }

        public QueryBuilder orderSnList(List<String> orderSn){
            this.orderSnList = orderSn;
            return this;
        }

        public QueryBuilder fetchOrderSn(){
            setFetchFields("fetchFields","orderSn");
            return this;
        }

        public QueryBuilder excludeOrderSn(){
            setFetchFields("excludeFields","orderSn");
            return this;
        }

        public QueryBuilder fuzzyOrderId (List<String> fuzzyOrderId){
            this.fuzzyOrderId = fuzzyOrderId;
            return this;
        }

        public QueryBuilder fuzzyOrderId (String ... fuzzyOrderId){
            this.fuzzyOrderId = solveNullList(fuzzyOrderId);
            return this;
        }

        public QueryBuilder rightFuzzyOrderId (List<String> rightFuzzyOrderId){
            this.rightFuzzyOrderId = rightFuzzyOrderId;
            return this;
        }

        public QueryBuilder rightFuzzyOrderId (String ... rightFuzzyOrderId){
            this.rightFuzzyOrderId = solveNullList(rightFuzzyOrderId);
            return this;
        }

        public QueryBuilder orderId(String orderId){
            setOrderId(orderId);
            return this;
        }

        public QueryBuilder orderIdList(String ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public QueryBuilder orderIdList(List<String> orderId){
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

        public QueryBuilder fuzzyAlipayTradeNo (List<String> fuzzyAlipayTradeNo){
            this.fuzzyAlipayTradeNo = fuzzyAlipayTradeNo;
            return this;
        }

        public QueryBuilder fuzzyAlipayTradeNo (String ... fuzzyAlipayTradeNo){
            this.fuzzyAlipayTradeNo = solveNullList(fuzzyAlipayTradeNo);
            return this;
        }

        public QueryBuilder rightFuzzyAlipayTradeNo (List<String> rightFuzzyAlipayTradeNo){
            this.rightFuzzyAlipayTradeNo = rightFuzzyAlipayTradeNo;
            return this;
        }

        public QueryBuilder rightFuzzyAlipayTradeNo (String ... rightFuzzyAlipayTradeNo){
            this.rightFuzzyAlipayTradeNo = solveNullList(rightFuzzyAlipayTradeNo);
            return this;
        }

        public QueryBuilder alipayTradeNo(String alipayTradeNo){
            setAlipayTradeNo(alipayTradeNo);
            return this;
        }

        public QueryBuilder alipayTradeNoList(String ... alipayTradeNo){
            this.alipayTradeNoList = solveNullList(alipayTradeNo);
            return this;
        }

        public QueryBuilder alipayTradeNoList(List<String> alipayTradeNo){
            this.alipayTradeNoList = alipayTradeNo;
            return this;
        }

        public QueryBuilder fetchAlipayTradeNo(){
            setFetchFields("fetchFields","alipayTradeNo");
            return this;
        }

        public QueryBuilder excludeAlipayTradeNo(){
            setFetchFields("excludeFields","alipayTradeNo");
            return this;
        }

        public QueryBuilder totalAmountBetWeen(java.math.BigDecimal totalAmountSt,java.math.BigDecimal totalAmountEd){
            this.totalAmountSt = totalAmountSt;
            this.totalAmountEd = totalAmountEd;
            return this;
        }

        public QueryBuilder totalAmountGreaterEqThan(java.math.BigDecimal totalAmountSt){
            this.totalAmountSt = totalAmountSt;
            return this;
        }
        public QueryBuilder totalAmountLessEqThan(java.math.BigDecimal totalAmountEd){
            this.totalAmountEd = totalAmountEd;
            return this;
        }


        public QueryBuilder totalAmount(java.math.BigDecimal totalAmount){
            setTotalAmount(totalAmount);
            return this;
        }

        public QueryBuilder totalAmountList(java.math.BigDecimal ... totalAmount){
            this.totalAmountList = solveNullList(totalAmount);
            return this;
        }

        public QueryBuilder totalAmountList(List<java.math.BigDecimal> totalAmount){
            this.totalAmountList = totalAmount;
            return this;
        }

        public QueryBuilder fetchTotalAmount(){
            setFetchFields("fetchFields","totalAmount");
            return this;
        }

        public QueryBuilder excludeTotalAmount(){
            setFetchFields("excludeFields","totalAmount");
            return this;
        }

        public QueryBuilder fuzzySubject (List<String> fuzzySubject){
            this.fuzzySubject = fuzzySubject;
            return this;
        }

        public QueryBuilder fuzzySubject (String ... fuzzySubject){
            this.fuzzySubject = solveNullList(fuzzySubject);
            return this;
        }

        public QueryBuilder rightFuzzySubject (List<String> rightFuzzySubject){
            this.rightFuzzySubject = rightFuzzySubject;
            return this;
        }

        public QueryBuilder rightFuzzySubject (String ... rightFuzzySubject){
            this.rightFuzzySubject = solveNullList(rightFuzzySubject);
            return this;
        }

        public QueryBuilder subject(String subject){
            setSubject(subject);
            return this;
        }

        public QueryBuilder subjectList(String ... subject){
            this.subjectList = solveNullList(subject);
            return this;
        }

        public QueryBuilder subjectList(List<String> subject){
            this.subjectList = subject;
            return this;
        }

        public QueryBuilder fetchSubject(){
            setFetchFields("fetchFields","subject");
            return this;
        }

        public QueryBuilder excludeSubject(){
            setFetchFields("excludeFields","subject");
            return this;
        }

        public QueryBuilder fuzzyPaymentStatus (List<String> fuzzyPaymentStatus){
            this.fuzzyPaymentStatus = fuzzyPaymentStatus;
            return this;
        }

        public QueryBuilder fuzzyPaymentStatus (String ... fuzzyPaymentStatus){
            this.fuzzyPaymentStatus = solveNullList(fuzzyPaymentStatus);
            return this;
        }

        public QueryBuilder rightFuzzyPaymentStatus (List<String> rightFuzzyPaymentStatus){
            this.rightFuzzyPaymentStatus = rightFuzzyPaymentStatus;
            return this;
        }

        public QueryBuilder rightFuzzyPaymentStatus (String ... rightFuzzyPaymentStatus){
            this.rightFuzzyPaymentStatus = solveNullList(rightFuzzyPaymentStatus);
            return this;
        }

        public QueryBuilder paymentStatus(String paymentStatus){
            setPaymentStatus(paymentStatus);
            return this;
        }

        public QueryBuilder paymentStatusList(String ... paymentStatus){
            this.paymentStatusList = solveNullList(paymentStatus);
            return this;
        }

        public QueryBuilder paymentStatusList(List<String> paymentStatus){
            this.paymentStatusList = paymentStatus;
            return this;
        }

        public QueryBuilder fetchPaymentStatus(){
            setFetchFields("fetchFields","paymentStatus");
            return this;
        }

        public QueryBuilder excludePaymentStatus(){
            setFetchFields("excludeFields","paymentStatus");
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

        public QueryBuilder confirmTimeBetWeen(java.time.LocalDateTime confirmTimeSt,java.time.LocalDateTime confirmTimeEd){
            this.confirmTimeSt = confirmTimeSt;
            this.confirmTimeEd = confirmTimeEd;
            return this;
        }

        public QueryBuilder confirmTimeGreaterEqThan(java.time.LocalDateTime confirmTimeSt){
            this.confirmTimeSt = confirmTimeSt;
            return this;
        }
        public QueryBuilder confirmTimeLessEqThan(java.time.LocalDateTime confirmTimeEd){
            this.confirmTimeEd = confirmTimeEd;
            return this;
        }


        public QueryBuilder confirmTime(java.time.LocalDateTime confirmTime){
            setConfirmTime(confirmTime);
            return this;
        }

        public QueryBuilder confirmTimeList(java.time.LocalDateTime ... confirmTime){
            this.confirmTimeList = solveNullList(confirmTime);
            return this;
        }

        public QueryBuilder confirmTimeList(List<java.time.LocalDateTime> confirmTime){
            this.confirmTimeList = confirmTime;
            return this;
        }

        public QueryBuilder fetchConfirmTime(){
            setFetchFields("fetchFields","confirmTime");
            return this;
        }

        public QueryBuilder excludeConfirmTime(){
            setFetchFields("excludeFields","confirmTime");
            return this;
        }

        public QueryBuilder fuzzyCallbackContent (List<String> fuzzyCallbackContent){
            this.fuzzyCallbackContent = fuzzyCallbackContent;
            return this;
        }

        public QueryBuilder fuzzyCallbackContent (String ... fuzzyCallbackContent){
            this.fuzzyCallbackContent = solveNullList(fuzzyCallbackContent);
            return this;
        }

        public QueryBuilder rightFuzzyCallbackContent (List<String> rightFuzzyCallbackContent){
            this.rightFuzzyCallbackContent = rightFuzzyCallbackContent;
            return this;
        }

        public QueryBuilder rightFuzzyCallbackContent (String ... rightFuzzyCallbackContent){
            this.rightFuzzyCallbackContent = solveNullList(rightFuzzyCallbackContent);
            return this;
        }

        public QueryBuilder callbackContent(String callbackContent){
            setCallbackContent(callbackContent);
            return this;
        }

        public QueryBuilder callbackContentList(String ... callbackContent){
            this.callbackContentList = solveNullList(callbackContent);
            return this;
        }

        public QueryBuilder callbackContentList(List<String> callbackContent){
            this.callbackContentList = callbackContent;
            return this;
        }

        public QueryBuilder fetchCallbackContent(){
            setFetchFields("fetchFields","callbackContent");
            return this;
        }

        public QueryBuilder excludeCallbackContent(){
            setFetchFields("excludeFields","callbackContent");
            return this;
        }

        public QueryBuilder callbackTimeBetWeen(java.time.LocalDateTime callbackTimeSt,java.time.LocalDateTime callbackTimeEd){
            this.callbackTimeSt = callbackTimeSt;
            this.callbackTimeEd = callbackTimeEd;
            return this;
        }

        public QueryBuilder callbackTimeGreaterEqThan(java.time.LocalDateTime callbackTimeSt){
            this.callbackTimeSt = callbackTimeSt;
            return this;
        }
        public QueryBuilder callbackTimeLessEqThan(java.time.LocalDateTime callbackTimeEd){
            this.callbackTimeEd = callbackTimeEd;
            return this;
        }


        public QueryBuilder callbackTime(java.time.LocalDateTime callbackTime){
            setCallbackTime(callbackTime);
            return this;
        }

        public QueryBuilder callbackTimeList(java.time.LocalDateTime ... callbackTime){
            this.callbackTimeList = solveNullList(callbackTime);
            return this;
        }

        public QueryBuilder callbackTimeList(List<java.time.LocalDateTime> callbackTime){
            this.callbackTimeList = callbackTime;
            return this;
        }

        public QueryBuilder fetchCallbackTime(){
            setFetchFields("fetchFields","callbackTime");
            return this;
        }

        public QueryBuilder excludeCallbackTime(){
            setFetchFields("excludeFields","callbackTime");
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

        public PaymentInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> orderSnList;

        public List<String> getOrderSnList(){return this.orderSnList;}


        private List<String> fuzzyOrderSn;

        public List<String> getFuzzyOrderSn(){return this.fuzzyOrderSn;}

        private List<String> rightFuzzyOrderSn;

        public List<String> getRightFuzzyOrderSn(){return this.rightFuzzyOrderSn;}
        private List<String> orderIdList;

        public List<String> getOrderIdList(){return this.orderIdList;}


        private List<String> fuzzyOrderId;

        public List<String> getFuzzyOrderId(){return this.fuzzyOrderId;}

        private List<String> rightFuzzyOrderId;

        public List<String> getRightFuzzyOrderId(){return this.rightFuzzyOrderId;}
        private List<String> alipayTradeNoList;

        public List<String> getAlipayTradeNoList(){return this.alipayTradeNoList;}


        private List<String> fuzzyAlipayTradeNo;

        public List<String> getFuzzyAlipayTradeNo(){return this.fuzzyAlipayTradeNo;}

        private List<String> rightFuzzyAlipayTradeNo;

        public List<String> getRightFuzzyAlipayTradeNo(){return this.rightFuzzyAlipayTradeNo;}
        private List<java.math.BigDecimal> totalAmountList;

        public List<java.math.BigDecimal> getTotalAmountList(){return this.totalAmountList;}

        private java.math.BigDecimal totalAmountSt;

        private java.math.BigDecimal totalAmountEd;

        public java.math.BigDecimal getTotalAmountSt(){return this.totalAmountSt;}

        public java.math.BigDecimal getTotalAmountEd(){return this.totalAmountEd;}

        private List<String> subjectList;

        public List<String> getSubjectList(){return this.subjectList;}


        private List<String> fuzzySubject;

        public List<String> getFuzzySubject(){return this.fuzzySubject;}

        private List<String> rightFuzzySubject;

        public List<String> getRightFuzzySubject(){return this.rightFuzzySubject;}
        private List<String> paymentStatusList;

        public List<String> getPaymentStatusList(){return this.paymentStatusList;}


        private List<String> fuzzyPaymentStatus;

        public List<String> getFuzzyPaymentStatus(){return this.fuzzyPaymentStatus;}

        private List<String> rightFuzzyPaymentStatus;

        public List<String> getRightFuzzyPaymentStatus(){return this.rightFuzzyPaymentStatus;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> confirmTimeList;

        public List<java.time.LocalDateTime> getConfirmTimeList(){return this.confirmTimeList;}

        private java.time.LocalDateTime confirmTimeSt;

        private java.time.LocalDateTime confirmTimeEd;

        public java.time.LocalDateTime getConfirmTimeSt(){return this.confirmTimeSt;}

        public java.time.LocalDateTime getConfirmTimeEd(){return this.confirmTimeEd;}

        private List<String> callbackContentList;

        public List<String> getCallbackContentList(){return this.callbackContentList;}


        private List<String> fuzzyCallbackContent;

        public List<String> getFuzzyCallbackContent(){return this.fuzzyCallbackContent;}

        private List<String> rightFuzzyCallbackContent;

        public List<String> getRightFuzzyCallbackContent(){return this.rightFuzzyCallbackContent;}
        private List<java.time.LocalDateTime> callbackTimeList;

        public List<java.time.LocalDateTime> getCallbackTimeList(){return this.callbackTimeList;}

        private java.time.LocalDateTime callbackTimeSt;

        private java.time.LocalDateTime callbackTimeEd;

        public java.time.LocalDateTime getCallbackTimeSt(){return this.callbackTimeSt;}

        public java.time.LocalDateTime getCallbackTimeEd(){return this.callbackTimeEd;}


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

        public ConditionBuilder fuzzyOrderSn (List<String> fuzzyOrderSn){
            this.fuzzyOrderSn = fuzzyOrderSn;
            return this;
        }

        public ConditionBuilder fuzzyOrderSn (String ... fuzzyOrderSn){
            this.fuzzyOrderSn = solveNullList(fuzzyOrderSn);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderSn (List<String> rightFuzzyOrderSn){
            this.rightFuzzyOrderSn = rightFuzzyOrderSn;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderSn (String ... rightFuzzyOrderSn){
            this.rightFuzzyOrderSn = solveNullList(rightFuzzyOrderSn);
            return this;
        }

        public ConditionBuilder orderSnList(String ... orderSn){
            this.orderSnList = solveNullList(orderSn);
            return this;
        }

        public ConditionBuilder orderSnList(List<String> orderSn){
            this.orderSnList = orderSn;
            return this;
        }

        public ConditionBuilder fuzzyOrderId (List<String> fuzzyOrderId){
            this.fuzzyOrderId = fuzzyOrderId;
            return this;
        }

        public ConditionBuilder fuzzyOrderId (String ... fuzzyOrderId){
            this.fuzzyOrderId = solveNullList(fuzzyOrderId);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderId (List<String> rightFuzzyOrderId){
            this.rightFuzzyOrderId = rightFuzzyOrderId;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderId (String ... rightFuzzyOrderId){
            this.rightFuzzyOrderId = solveNullList(rightFuzzyOrderId);
            return this;
        }

        public ConditionBuilder orderIdList(String ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public ConditionBuilder orderIdList(List<String> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public ConditionBuilder fuzzyAlipayTradeNo (List<String> fuzzyAlipayTradeNo){
            this.fuzzyAlipayTradeNo = fuzzyAlipayTradeNo;
            return this;
        }

        public ConditionBuilder fuzzyAlipayTradeNo (String ... fuzzyAlipayTradeNo){
            this.fuzzyAlipayTradeNo = solveNullList(fuzzyAlipayTradeNo);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayTradeNo (List<String> rightFuzzyAlipayTradeNo){
            this.rightFuzzyAlipayTradeNo = rightFuzzyAlipayTradeNo;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayTradeNo (String ... rightFuzzyAlipayTradeNo){
            this.rightFuzzyAlipayTradeNo = solveNullList(rightFuzzyAlipayTradeNo);
            return this;
        }

        public ConditionBuilder alipayTradeNoList(String ... alipayTradeNo){
            this.alipayTradeNoList = solveNullList(alipayTradeNo);
            return this;
        }

        public ConditionBuilder alipayTradeNoList(List<String> alipayTradeNo){
            this.alipayTradeNoList = alipayTradeNo;
            return this;
        }

        public ConditionBuilder totalAmountBetWeen(java.math.BigDecimal totalAmountSt,java.math.BigDecimal totalAmountEd){
            this.totalAmountSt = totalAmountSt;
            this.totalAmountEd = totalAmountEd;
            return this;
        }

        public ConditionBuilder totalAmountGreaterEqThan(java.math.BigDecimal totalAmountSt){
            this.totalAmountSt = totalAmountSt;
            return this;
        }
        public ConditionBuilder totalAmountLessEqThan(java.math.BigDecimal totalAmountEd){
            this.totalAmountEd = totalAmountEd;
            return this;
        }


        public ConditionBuilder totalAmountList(java.math.BigDecimal ... totalAmount){
            this.totalAmountList = solveNullList(totalAmount);
            return this;
        }

        public ConditionBuilder totalAmountList(List<java.math.BigDecimal> totalAmount){
            this.totalAmountList = totalAmount;
            return this;
        }

        public ConditionBuilder fuzzySubject (List<String> fuzzySubject){
            this.fuzzySubject = fuzzySubject;
            return this;
        }

        public ConditionBuilder fuzzySubject (String ... fuzzySubject){
            this.fuzzySubject = solveNullList(fuzzySubject);
            return this;
        }

        public ConditionBuilder rightFuzzySubject (List<String> rightFuzzySubject){
            this.rightFuzzySubject = rightFuzzySubject;
            return this;
        }

        public ConditionBuilder rightFuzzySubject (String ... rightFuzzySubject){
            this.rightFuzzySubject = solveNullList(rightFuzzySubject);
            return this;
        }

        public ConditionBuilder subjectList(String ... subject){
            this.subjectList = solveNullList(subject);
            return this;
        }

        public ConditionBuilder subjectList(List<String> subject){
            this.subjectList = subject;
            return this;
        }

        public ConditionBuilder fuzzyPaymentStatus (List<String> fuzzyPaymentStatus){
            this.fuzzyPaymentStatus = fuzzyPaymentStatus;
            return this;
        }

        public ConditionBuilder fuzzyPaymentStatus (String ... fuzzyPaymentStatus){
            this.fuzzyPaymentStatus = solveNullList(fuzzyPaymentStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyPaymentStatus (List<String> rightFuzzyPaymentStatus){
            this.rightFuzzyPaymentStatus = rightFuzzyPaymentStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyPaymentStatus (String ... rightFuzzyPaymentStatus){
            this.rightFuzzyPaymentStatus = solveNullList(rightFuzzyPaymentStatus);
            return this;
        }

        public ConditionBuilder paymentStatusList(String ... paymentStatus){
            this.paymentStatusList = solveNullList(paymentStatus);
            return this;
        }

        public ConditionBuilder paymentStatusList(List<String> paymentStatus){
            this.paymentStatusList = paymentStatus;
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

        public ConditionBuilder confirmTimeBetWeen(java.time.LocalDateTime confirmTimeSt,java.time.LocalDateTime confirmTimeEd){
            this.confirmTimeSt = confirmTimeSt;
            this.confirmTimeEd = confirmTimeEd;
            return this;
        }

        public ConditionBuilder confirmTimeGreaterEqThan(java.time.LocalDateTime confirmTimeSt){
            this.confirmTimeSt = confirmTimeSt;
            return this;
        }
        public ConditionBuilder confirmTimeLessEqThan(java.time.LocalDateTime confirmTimeEd){
            this.confirmTimeEd = confirmTimeEd;
            return this;
        }


        public ConditionBuilder confirmTimeList(java.time.LocalDateTime ... confirmTime){
            this.confirmTimeList = solveNullList(confirmTime);
            return this;
        }

        public ConditionBuilder confirmTimeList(List<java.time.LocalDateTime> confirmTime){
            this.confirmTimeList = confirmTime;
            return this;
        }

        public ConditionBuilder fuzzyCallbackContent (List<String> fuzzyCallbackContent){
            this.fuzzyCallbackContent = fuzzyCallbackContent;
            return this;
        }

        public ConditionBuilder fuzzyCallbackContent (String ... fuzzyCallbackContent){
            this.fuzzyCallbackContent = solveNullList(fuzzyCallbackContent);
            return this;
        }

        public ConditionBuilder rightFuzzyCallbackContent (List<String> rightFuzzyCallbackContent){
            this.rightFuzzyCallbackContent = rightFuzzyCallbackContent;
            return this;
        }

        public ConditionBuilder rightFuzzyCallbackContent (String ... rightFuzzyCallbackContent){
            this.rightFuzzyCallbackContent = solveNullList(rightFuzzyCallbackContent);
            return this;
        }

        public ConditionBuilder callbackContentList(String ... callbackContent){
            this.callbackContentList = solveNullList(callbackContent);
            return this;
        }

        public ConditionBuilder callbackContentList(List<String> callbackContent){
            this.callbackContentList = callbackContent;
            return this;
        }

        public ConditionBuilder callbackTimeBetWeen(java.time.LocalDateTime callbackTimeSt,java.time.LocalDateTime callbackTimeEd){
            this.callbackTimeSt = callbackTimeSt;
            this.callbackTimeEd = callbackTimeEd;
            return this;
        }

        public ConditionBuilder callbackTimeGreaterEqThan(java.time.LocalDateTime callbackTimeSt){
            this.callbackTimeSt = callbackTimeSt;
            return this;
        }
        public ConditionBuilder callbackTimeLessEqThan(java.time.LocalDateTime callbackTimeEd){
            this.callbackTimeEd = callbackTimeEd;
            return this;
        }


        public ConditionBuilder callbackTimeList(java.time.LocalDateTime ... callbackTime){
            this.callbackTimeList = solveNullList(callbackTime);
            return this;
        }

        public ConditionBuilder callbackTimeList(List<java.time.LocalDateTime> callbackTime){
            this.callbackTimeList = callbackTime;
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

        private PaymentInfo obj;

        public Builder(){
            this.obj = new PaymentInfo();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder orderSn(String orderSn){
            this.obj.setOrderSn(orderSn);
            return this;
        }
        public Builder orderId(String orderId){
            this.obj.setOrderId(orderId);
            return this;
        }
        public Builder alipayTradeNo(String alipayTradeNo){
            this.obj.setAlipayTradeNo(alipayTradeNo);
            return this;
        }
        public Builder totalAmount(java.math.BigDecimal totalAmount){
            this.obj.setTotalAmount(totalAmount);
            return this;
        }
        public Builder subject(String subject){
            this.obj.setSubject(subject);
            return this;
        }
        public Builder paymentStatus(String paymentStatus){
            this.obj.setPaymentStatus(paymentStatus);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder confirmTime(java.time.LocalDateTime confirmTime){
            this.obj.setConfirmTime(confirmTime);
            return this;
        }
        public Builder callbackContent(String callbackContent){
            this.obj.setCallbackContent(callbackContent);
            return this;
        }
        public Builder callbackTime(java.time.LocalDateTime callbackTime){
            this.obj.setCallbackTime(callbackTime);
            return this;
        }
        public PaymentInfo build(){return obj;}
    }

}
