package com.fc.mq.persist.base;

import java.util.Date;

public class CxInsCbb {
    private String rowId;

    private Date created;

    private String createdBy;

    private Date lastUpd;

    private String lastUpdBy;

    private Long modificationNum;

    private String conflictId;

    private Date dbLastUpd;

    private String dbLastUpdSrc;

    private String loanId;

    private String category;

    private String surname;

    private String homeAddress1;

    private String homeAddress2;

    private String homeAddress3;

    private String homePostcode;

    private String homePhoneNumber;

    private String mobilePhoneNumber;

    private Long userField1;

    private Date userField21;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    public String getHomeAddress1() {
        return homeAddress1;
    }

    public void setHomeAddress1(String homeAddress1) {
        this.homeAddress1 = homeAddress1 == null ? null : homeAddress1.trim();
    }

    public String getHomeAddress2() {
        return homeAddress2;
    }

    public void setHomeAddress2(String homeAddress2) {
        this.homeAddress2 = homeAddress2 == null ? null : homeAddress2.trim();
    }

    public String getHomeAddress3() {
        return homeAddress3;
    }

    public void setHomeAddress3(String homeAddress3) {
        this.homeAddress3 = homeAddress3 == null ? null : homeAddress3.trim();
    }

    public String getHomePostcode() {
        return homePostcode;
    }

    public void setHomePostcode(String homePostcode) {
        this.homePostcode = homePostcode == null ? null : homePostcode.trim();
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber == null ? null : homePhoneNumber.trim();
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber == null ? null : mobilePhoneNumber.trim();
    }

    public Long getUserField1() {
        return userField1;
    }

    public void setUserField1(Long userField1) {
        this.userField1 = userField1;
    }

    public Date getUserField21() {
        return userField21;
    }

    public void setUserField21(Date userField21) {
        this.userField21 = userField21;
    }
}