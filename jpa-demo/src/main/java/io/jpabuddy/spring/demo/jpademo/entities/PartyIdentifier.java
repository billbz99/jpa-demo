package io.jpabuddy.spring.demo.jpademo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PARTY_IDENTIFIER")
public class PartyIdentifier {
    @Id
    @Column(name = "PARTY_IDENTIFIER_ID", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARTY_IDENTIFIER_PARTY_ID", nullable = false)
    private Party partyIdentifierParty;

    @Column(name = "PARTY_IDENTIFIER_ISSUING_STATE_PROVINCE_ID")
    private Integer partyIdentifierIssuingStateProvinceId;

    @Column(name = "PARTY_IDENTIFIER_SOURCE_IDENTIFIER_ID")
    private Integer partyIdentifierSourceIdentifierId;

    @Column(name = "PARTY_IDENTIFIER_ISSUING_COUNTRY_ID")
    private Integer partyIdentifierIssuingCountryId;

    @NotNull
    @Column(name = "PARTY_IDENTIFIER_TYPE_ID", nullable = false)
    private Integer partyIdentifierTypeId;

    @Column(name = "PARTY_IDENTIFIER_ISSUE_DATE")
    private LocalDate partyIdentifierIssueDate;

    @Column(name = "PARTY_IDENTIFIER_EXPIRATION_DATE")
    private LocalDate partyIdentifierExpirationDate;

    @Size(max = 255)
    @Column(name = "PARTY_IDENTIFIER_ISSUING_AUTHORITY_TEXT")
    private String partyIdentifierIssuingAuthorityText;

    @Size(max = 255)
    @NotNull
    @Column(name = "PARTY_IDENTIFIER_IDENTIFICATION_VALUE", nullable = false)
    private String partyIdentifierIdentificationValue;

    @NotNull
    @Column(name = "BATCH_ID", nullable = false)
    private Integer batchId;

    @NotNull
    @Column(name = "CREATED_DATE_TIME", nullable = false)
    private Instant createdDateTime;

    @Column(name = "UPDATED_DATE_TIME")
    private Instant updatedDateTime;

    @Size(max = 255)
    @NotNull
    @Column(name = "CREATED_BY", nullable = false)
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

    public Party getPartyIdentifierParty() {
        return partyIdentifierParty;
    }

    public void setPartyIdentifierParty(Party partyIdentifierParty) {
        this.partyIdentifierParty = partyIdentifierParty;
    }

    public Integer getPartyIdentifierIssuingStateProvinceId() {
        return partyIdentifierIssuingStateProvinceId;
    }

    public void setPartyIdentifierIssuingStateProvinceId(Integer partyIdentifierIssuingStateProvinceId) {
        this.partyIdentifierIssuingStateProvinceId = partyIdentifierIssuingStateProvinceId;
    }

    public Integer getPartyIdentifierSourceIdentifierId() {
        return partyIdentifierSourceIdentifierId;
    }

    public void setPartyIdentifierSourceIdentifierId(Integer partyIdentifierSourceIdentifierId) {
        this.partyIdentifierSourceIdentifierId = partyIdentifierSourceIdentifierId;
    }

    public Integer getPartyIdentifierIssuingCountryId() {
        return partyIdentifierIssuingCountryId;
    }

    public void setPartyIdentifierIssuingCountryId(Integer partyIdentifierIssuingCountryId) {
        this.partyIdentifierIssuingCountryId = partyIdentifierIssuingCountryId;
    }

    public Integer getPartyIdentifierTypeId() {
        return partyIdentifierTypeId;
    }

    public void setPartyIdentifierTypeId(Integer partyIdentifierTypeId) {
        this.partyIdentifierTypeId = partyIdentifierTypeId;
    }

    public LocalDate getPartyIdentifierIssueDate() {
        return partyIdentifierIssueDate;
    }

    public void setPartyIdentifierIssueDate(LocalDate partyIdentifierIssueDate) {
        this.partyIdentifierIssueDate = partyIdentifierIssueDate;
    }

    public LocalDate getPartyIdentifierExpirationDate() {
        return partyIdentifierExpirationDate;
    }

    public void setPartyIdentifierExpirationDate(LocalDate partyIdentifierExpirationDate) {
        this.partyIdentifierExpirationDate = partyIdentifierExpirationDate;
    }

    public String getPartyIdentifierIssuingAuthorityText() {
        return partyIdentifierIssuingAuthorityText;
    }

    public void setPartyIdentifierIssuingAuthorityText(String partyIdentifierIssuingAuthorityText) {
        this.partyIdentifierIssuingAuthorityText = partyIdentifierIssuingAuthorityText;
    }

    public String getPartyIdentifierIdentificationValue() {
        return partyIdentifierIdentificationValue;
    }

    public void setPartyIdentifierIdentificationValue(String partyIdentifierIdentificationValue) {
        this.partyIdentifierIdentificationValue = partyIdentifierIdentificationValue;
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