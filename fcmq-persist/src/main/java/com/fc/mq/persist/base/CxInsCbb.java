package com.fc.mq.persist.base;

import java.util.Date;

public class CxInsCbb
{
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

    private String Surname;

    private String Home_Address1;

    private String Home_Address2;

    private String Home_Address3;

    private String Home_Postcode;

    private String Home_Phone_Number;

    private String Mobile_Phone_Number;

    private Long User_Field1;

    private Date User_Field21;

    public String getRowId()
    {
        return rowId;
    }

    public void setRowId(String rowId)
    {
        this.rowId = rowId == null ? null : rowId.trim();
    }

    public Date getCreated()
    {
        return created;
    }

    public void setCreated(Date created)
    {
        this.created = created;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getLastUpd()
    {
        return lastUpd;
    }

    public void setLastUpd(Date lastUpd)
    {
        this.lastUpd = lastUpd;
    }

    public String getLastUpdBy()
    {
        return lastUpdBy;
    }

    public void setLastUpdBy(String lastUpdBy)
    {
        this.lastUpdBy = lastUpdBy == null ? null : lastUpdBy.trim();
    }

    public Long getModificationNum()
    {
        return modificationNum;
    }

    public void setModificationNum(Long modificationNum)
    {
        this.modificationNum = modificationNum;
    }

    public String getConflictId()
    {
        return conflictId;
    }

    public void setConflictId(String conflictId)
    {
        this.conflictId = conflictId == null ? null : conflictId.trim();
    }

    public Date getDbLastUpd()
    {
        return dbLastUpd;
    }

    public void setDbLastUpd(Date dbLastUpd)
    {
        this.dbLastUpd = dbLastUpd;
    }

    public String getDbLastUpdSrc()
    {
        return dbLastUpdSrc;
    }

    public void setDbLastUpdSrc(String dbLastUpdSrc)
    {
        this.dbLastUpdSrc = dbLastUpdSrc == null ? null : dbLastUpdSrc.trim();
    }

    public String getLoanId()
    {
        return loanId;
    }

    public void setLoanId(String loanId)
    {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category == null ? null : category.trim();
    }

    public String getSurname()
    {
        return Surname;
    }

    public void setSurname(String surname)
    {
        this.Surname = Surname == null ? null : Surname.trim();
    }

    public String getHome_Address1()
    {
        return Home_Address1;
    }

    public void setHome_Address1(String Home_Address1)
    {
        this.Home_Address1 = Home_Address1 == null ? null : Home_Address1.trim();
    }

    public String getHome_Address2()
    {
        return Home_Address2;
    }

    public void setHome_Address2(String Home_Address2)
    {
        this.Home_Address2 = Home_Address2 == null ? null : Home_Address2.trim();
    }

    public String getHome_Address3()
    {
        return Home_Address3;
    }

    public void setHome_Address3(String Home_Address3)
    {
        this.Home_Address3 = Home_Address3 == null ? null : Home_Address3.trim();
    }

    public String getHome_Postcode()
    {
        return Home_Postcode;
    }

    public void setHome_Postcode(String Home_Postcode)
    {
        this.Home_Postcode = Home_Postcode == null ? null : Home_Postcode.trim();
    }

    public String getHome_PhoneNumber()
    {
        return Home_Phone_Number;
    }

    public void setHome_PhoneNumber(String Home_PhoneNumber)
    {
        this.Home_Phone_Number = Home_PhoneNumber == null ? null : Home_PhoneNumber.trim();
    }

    public String getMobilePhoneNumber()
    {
        return Mobile_Phone_Number;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber)
    {
        this.Mobile_Phone_Number = mobilePhoneNumber == null ? null : mobilePhoneNumber.trim();
    }

    public Long getUser_Field1()
    {
        return User_Field1;
    }

    public void setUser_Field1(Long User_Field1)
    {
        this.User_Field1 = User_Field1;
    }

    public Date getUser_Field21()
    {
        return User_Field21;
    }

    public void setUser_Field21(Date User_Field21)
    {
        this.User_Field21 = User_Field21;
    }
}