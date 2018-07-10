package com.fc.mq.persist.base;

import java.util.Date;

public class CxInsU2b {
    private String rowId;

    private Date created;

    private String createdBy;

    private Date lastUpd;

    private String lastUpdBy;

    private Long modificationNum;

    private String conflictId;

    private Date dbLastUpd;

    private Long userField36;

    private Long userField37;

    private Long userField38;

    private String completeFlg;

    private String dbLastUpdSrc;

    private String loanId;

    private String userField1;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId == null ? null : rowId.trim();
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

    public Long getUserField36() {
        return userField36;
    }

    public void setUserField36(Long userField36) {
        this.userField36 = userField36;
    }

    public Long getUserField37() {
        return userField37;
    }

    public void setUserField37(Long userField37) {
        this.userField37 = userField37;
    }

    public Long getUserField38() {
        return userField38;
    }

    public void setUserField38(Long userField38) {
        this.userField38 = userField38;
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

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public String getUserField1() {
        return userField1;
    }

    public void setUserField1(String userField1) {
        this.userField1 = userField1 == null ? null : userField1.trim();
    }
}