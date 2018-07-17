package com.fc.mq.persist.base;

import java.util.Date;

public class CxInsU2b
{
    private String rowId;

    private Date created;

    private String createdBy;

    private Date lastUpd;

    private String lastUpdBy;

    private Long modificationNum;

    private String conflictId;

    private Date dbLastUpd;

    private Long User_Field36;

    private Long User_Field37;

    private Long User_Field38;

    private String completeFlg;

    private String dbLastUpdSrc;

    private String loanId;

    private String User_Field1;

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

    public Long getUser_Field36()
    {
        return User_Field36;
    }

    public void setUser_Field36(Long User_Field36)
    {
        this.User_Field36 = User_Field36;
    }

    public Long getUser_Field37()
    {
        return User_Field37;
    }

    public void setUser_Field37(Long User_Field37)
    {
        this.User_Field37 = User_Field37;
    }

    public Long getUser_Field38()
    {
        return User_Field38;
    }

    public void setUser_Field38(Long User_Field38)
    {
        this.User_Field38 = User_Field38;
    }

    public String getCompleteFlg()
    {
        return completeFlg;
    }

    public void setCompleteFlg(String completeFlg)
    {
        this.completeFlg = completeFlg == null ? null : completeFlg.trim();
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

    public String getUser_Field1()
    {
        return User_Field1;
    }

    public void setUser_Field1(String User_Field1)
    {
        this.User_Field1 = User_Field1 == null ? null : User_Field1.trim();
    }
}