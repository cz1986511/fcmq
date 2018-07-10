package com.fc.mq.persist.base;

import java.util.Date;

public class CxInsUcc {
    private Integer rowId;

    private Date created;

    private String createdBy;

    private Date lastUpd;

    private String lastUpdBy;

    private Long modificationNum;

    private String conflictId;

    private Date dbLastUpd;

    private Long userField3;

    private Long userField4;

    private String completeFlg;

    private String dbLastUpdSrc;

    private String homePhoneNumber;

    private String loanId;

    private String surname;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getLastUpd() {
        return lastUpd;
    }

    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }

    public String getLastUpdBy() {
        return lastUpdBy;
    }

    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy == null ? null : lastUpdBy.trim();
    }

    public Long getModificationNum() {
        return modificationNum;
    }

    public void setModificationNum(Long modificationNum) {
        this.modificationNum = modificationNum;
    }

    public String getConflictId() {
        return conflictId;
    }

    public void setConflictId(String conflictId) {
        this.conflictId = conflictId == null ? null : conflictId.trim();
    }

    public Date getDbLastUpd() {
        return dbLastUpd;
    }

    public void setDbLastUpd(Date dbLastUpd) {
        this.dbLastUpd = dbLastUpd;
    }

    public Long getUserField3() {
        return userField3;
    }

    public void setUserField3(Long userField3) {
        this.userField3 = userField3;
    }

    public Long getUserField4() {
        return userField4;
    }

    public void setUserField4(Long userField4) {
        this.userField4 = userField4;
    }

    public String getCompleteFlg() {
        return completeFlg;
    }

    public void setCompleteFlg(String completeFlg) {
        this.completeFlg = completeFlg == null ? null : completeFlg.trim();
    }

    public String getDbLastUpdSrc() {
        return dbLastUpdSrc;
    }

    public void setDbLastUpdSrc(String dbLastUpdSrc) {
        this.dbLastUpdSrc = dbLastUpdSrc == null ? null : dbLastUpdSrc.trim();
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber == null ? null : homePhoneNumber.trim();
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }
}