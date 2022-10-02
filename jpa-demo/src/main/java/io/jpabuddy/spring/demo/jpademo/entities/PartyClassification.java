package io.jpabuddy.spring.demo.jpademo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "PARTY_CLASSIFICATION")
public class PartyClassification {
    @Id
    @Column(name = "PARTY_CLASSIFICATION_ID", nullable = false)
    private Integer id;

    @Size(max = 3)
    @NotNull
    @Column(name = "PARTY_CLASSIFICATION_CODE", nullable = false, length = 3)
    private String partyClassificationCode;

    @Size(max = 30)
    @NotNull
    @Column(name = "PARTY_CLASSIFICATION_NAME", nullable = false, length = 30)
    private String partyClassificationName;

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

    @OneToMany(mappedBy = "partyClassification")
    private Set<Party> parties = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartyClassificationCode() {
        return partyClassificationCode;
    }

    public void setPartyClassificationCode(String partyClassificationCode) {
        this.partyClassificationCode = partyClassificationCode;
    }

    public String getPartyClassificationName() {
        return partyClassificationName;
    }

    public void setPartyClassificationName(String partyClassificationName) {
        this.partyClassificationName = partyClassificationName;
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

    public Set<Party> getParties() {
        return parties;
    }

    public void setParties(Set<Party> parties) {
        this.parties = parties;
    }

}