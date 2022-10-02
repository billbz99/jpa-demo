package io.jpabuddy.spring.demo.jpademo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

@Entity
@Table(name = "PARTY_ROLE", indexes = {
        @Index(name = "PARTY_ROLE_TYPE_TO_PARTY_ROLE_FK", columnList = "PARTY_ROLE_TYPE_ID"),
        @Index(name = "PARTY_TO_PARTY_ROLE_FK", columnList = "PARTY_ROLE_PARTY_ID"),
        @Index(name = "COUNTRY_TO_PARTY_ROLE_FK", columnList = "PARTY_ROLE_COUNTRY_ID")
})
public class PartyRole {
    @Id
    @Column(name = "PARTY_ROLE_ID", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARTY_ROLE_PARTY_ID", nullable = false)
    private Party partyRoleParty;

    @Column(name = "PARTY_ROLE_COUNTRY_ID")
    private Integer partyRoleCountryId;

    @Column(name = "PARTY_ROLE_TYPE_ID")
    private Integer partyRoleTypeId;

    @Column(name = "PARTY_ROLE_EFFECTIVE_START_DATE")
    private Instant partyRoleEffectiveStartDate;

    @NotNull
    @Column(name = "PARTY_ROLE_EFFECTIVE_END_DATE", nullable = false)
    private Instant partyRoleEffectiveEndDate;

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

    public Party getPartyRoleParty() {
        return partyRoleParty;
    }

    public void setPartyRoleParty(Party partyRoleParty) {
        this.partyRoleParty = partyRoleParty;
    }

    public Integer getPartyRoleCountryId() {
        return partyRoleCountryId;
    }

    public void setPartyRoleCountryId(Integer partyRoleCountryId) {
        this.partyRoleCountryId = partyRoleCountryId;
    }

    public Integer getPartyRoleTypeId() {
        return partyRoleTypeId;
    }

    public void setPartyRoleTypeId(Integer partyRoleTypeId) {
        this.partyRoleTypeId = partyRoleTypeId;
    }

    public Instant getPartyRoleEffectiveStartDate() {
        return partyRoleEffectiveStartDate;
    }

    public void setPartyRoleEffectiveStartDate(Instant partyRoleEffectiveStartDate) {
        this.partyRoleEffectiveStartDate = partyRoleEffectiveStartDate;
    }

    public Instant getPartyRoleEffectiveEndDate() {
        return partyRoleEffectiveEndDate;
    }

    public void setPartyRoleEffectiveEndDate(Instant partyRoleEffectiveEndDate) {
        this.partyRoleEffectiveEndDate = partyRoleEffectiveEndDate;
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