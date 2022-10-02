package io.jpabuddy.spring.demo.jpademo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

//@Table(name = "PARTY", schema = "dbo")
@Entity
@Table(name = "PARTY")
public class Party {
    @Id
    @Column(name = "PARTY_ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTY_CLASSIFICATION_ID")
    private PartyClassification partyClassification;

    @NotNull
    @Column(name = "PARTY_SOURCE_IDENTIFIER_ID", nullable = false)
    private Integer partySourceIdentifierId;

    @NotNull
    @Column(name = "PARTY_TYPE_ID", nullable = false)
    private Integer partyTypeId;

    @Column(name = "PARTY_STATUS_ID")
    private Integer partyStatusId;

    @Size(max = 50)
    @Column(name = "PARTY_CLIENT_NUMBER", length = 50)
    private String partyClientNumber;

    @Size(max = 60)
    @Column(name = "PARTY_NAME", length = 60)
    private String partyName;

    @Column(name = "PARTY_JUNK_MAIL_FLAG")
    private Character partyJunkMailFlag;

    @Column(name = "PARTY_PRIVACY_POLICY_POSITION_1_INDICATOR")
    private Integer partyPrivacyPolicyPosition1Indicator;

    @Column(name = "PARTY_SOLICITATING_INDICATOR")
    private Character partySolicitatingIndicator;

    @Column(name = "PARTY_BANKRUPTCY_INDICATOR")
    private Integer partyBankruptcyIndicator;

    @Column(name = "PARTY_CUSTOMER_STATUS")
    private Integer partyCustomerStatus;

    @Column(name = "PARTY_CUSTOMER_OPENED_DATE")
    private Instant partyCustomerOpenedDate;

    @Column(name = "PARTY_PRIVACY_POLICY_1_INDICATOR")
    private Character partyPrivacyPolicy1Indicator;

    @Column(name = "PARTY_PRIVACY_POLICY_2_INDICATOR")
    private Character partyPrivacyPolicy2Indicator;

    @Column(name = "BATCH_ID")
    private Integer batchId;

    @Column(name = "CREATED_DATE_TIME")
    private Instant createdDateTime;

    @Column(name = "UPDATED_DATE_TIME")
    private Instant updatedDateTime;

    @Size(max = 255)
    @Column(name = "CREATED_BY")
    private String createdBy;

    @Size(max = 255)
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "SOURCE_LAST_UPDATED_DATE_TIME")
    private Instant sourceLastUpdatedDateTime;

    @Column(name = "SOURCE_SYSTEM_SURROGATE_KEY")
    private Integer sourceSystemSurrogateKey;

    @Size(max = 255)
    @Column(name = "SOURCE_SYSTEM_NATURAL_KEY")
    private String sourceSystemNaturalKey;

    @Size(max = 255)
    @Column(name = "MDM_GUID")
    private String mdmGuid;

    @Column(name = "DELETE_FLAG")
    private Character deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PartyClassification getPartyClassification() {
        return partyClassification;
    }

    public void setPartyClassification(PartyClassification partyClassification) {
        this.partyClassification = partyClassification;
    }

    public Integer getPartySourceIdentifierId() {
        return partySourceIdentifierId;
    }

    public void setPartySourceIdentifierId(Integer partySourceIdentifierId) {
        this.partySourceIdentifierId = partySourceIdentifierId;
    }

    public Integer getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(Integer partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public Integer getPartyStatusId() {
        return partyStatusId;
    }

    public void setPartyStatusId(Integer partyStatusId) {
        this.partyStatusId = partyStatusId;
    }

    public String getPartyClientNumber() {
        return partyClientNumber;
    }

    public void setPartyClientNumber(String partyClientNumber) {
        this.partyClientNumber = partyClientNumber;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public Character getPartyJunkMailFlag() {
        return partyJunkMailFlag;
    }

    public void setPartyJunkMailFlag(Character partyJunkMailFlag) {
        this.partyJunkMailFlag = partyJunkMailFlag;
    }

    public Integer getPartyPrivacyPolicyPosition1Indicator() {
        return partyPrivacyPolicyPosition1Indicator;
    }

    public void setPartyPrivacyPolicyPosition1Indicator(Integer partyPrivacyPolicyPosition1Indicator) {
        this.partyPrivacyPolicyPosition1Indicator = partyPrivacyPolicyPosition1Indicator;
    }

    public Character getPartySolicitatingIndicator() {
        return partySolicitatingIndicator;
    }

    public void setPartySolicitatingIndicator(Character partySolicitatingIndicator) {
        this.partySolicitatingIndicator = partySolicitatingIndicator;
    }

    public Integer getPartyBankruptcyIndicator() {
        return partyBankruptcyIndicator;
    }

    public void setPartyBankruptcyIndicator(Integer partyBankruptcyIndicator) {
        this.partyBankruptcyIndicator = partyBankruptcyIndicator;
    }

    public Integer getPartyCustomerStatus() {
        return partyCustomerStatus;
    }

    public void setPartyCustomerStatus(Integer partyCustomerStatus) {
        this.partyCustomerStatus = partyCustomerStatus;
    }

    public Instant getPartyCustomerOpenedDate() {
        return partyCustomerOpenedDate;
    }

    public void setPartyCustomerOpenedDate(Instant partyCustomerOpenedDate) {
        this.partyCustomerOpenedDate = partyCustomerOpenedDate;
    }

    public Character getPartyPrivacyPolicy1Indicator() {
        return partyPrivacyPolicy1Indicator;
    }

    public void setPartyPrivacyPolicy1Indicator(Character partyPrivacyPolicy1Indicator) {
        this.partyPrivacyPolicy1Indicator = partyPrivacyPolicy1Indicator;
    }

    public Character getPartyPrivacyPolicy2Indicator() {
        return partyPrivacyPolicy2Indicator;
    }

    public void setPartyPrivacyPolicy2Indicator(Character partyPrivacyPolicy2Indicator) {
        this.partyPrivacyPolicy2Indicator = partyPrivacyPolicy2Indicator;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Instant getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Instant createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Instant getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Instant updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Instant getSourceLastUpdatedDateTime() {
        return sourceLastUpdatedDateTime;
    }

    public void setSourceLastUpdatedDateTime(Instant sourceLastUpdatedDateTime) {
        this.sourceLastUpdatedDateTime = sourceLastUpdatedDateTime;
    }

    public Integer getSourceSystemSurrogateKey() {
        return sourceSystemSurrogateKey;
    }

    public void setSourceSystemSurrogateKey(Integer sourceSystemSurrogateKey) {
        this.sourceSystemSurrogateKey = sourceSystemSurrogateKey;
    }

    public String getSourceSystemNaturalKey() {
        return sourceSystemNaturalKey;
    }

    public void setSourceSystemNaturalKey(String sourceSystemNaturalKey) {
        this.sourceSystemNaturalKey = sourceSystemNaturalKey;
    }

    public String getMdmGuid() {
        return mdmGuid;
    }

    public void setMdmGuid(String mdmGuid) {
        this.mdmGuid = mdmGuid;
    }

    public Character getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Character deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}