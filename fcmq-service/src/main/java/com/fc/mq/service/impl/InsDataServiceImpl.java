package com.fc.mq.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.fc.mq.persist.base.CxInsCba;
import com.fc.mq.persist.base.CxInsCbb;
import com.fc.mq.persist.base.CxInsCbc;
import com.fc.mq.persist.base.CxInsU2a;
import com.fc.mq.persist.base.CxInsU2b;
import com.fc.mq.persist.base.CxInsU2c;
import com.fc.mq.persist.base.CxInsUcb;
import com.fc.mq.persist.base.CxInsUcc;
import com.fc.mq.persist.base.CxInsUser2;
import com.fc.mq.persist.mapper.CxInsCbaMapper;
import com.fc.mq.persist.mapper.CxInsCbbMapper;
import com.fc.mq.persist.mapper.CxInsCbcMapper;
import com.fc.mq.persist.mapper.CxInsU2aMapper;
import com.fc.mq.persist.mapper.CxInsU2bMapper;
import com.fc.mq.persist.mapper.CxInsU2cMapper;
import com.fc.mq.persist.mapper.CxInsUcbMapper;
import com.fc.mq.persist.mapper.CxInsUccMapper;
import com.fc.mq.persist.mapper.CxInsUser2Mapper;
import com.fc.mq.service.InsDataService;

public class InsDataServiceImpl implements InsDataService
{
    @Autowired
    CxInsCbaMapper cxInsCbaMapper;
    @Autowired
    CxInsCbbMapper cxInsCbbMapper;
    @Autowired
    CxInsCbcMapper cxInsCbcMapper;
    @Autowired
    CxInsU2aMapper cxInsU2aMapper;
    @Autowired
    CxInsU2bMapper cxInsU2bMapper;
    @Autowired
    CxInsU2cMapper cxInsU2cMapper;
    @Autowired
    CxInsUcbMapper cxInsUcbMapper;
    @Autowired
    CxInsUccMapper cxInsUccMapper;
    @Autowired
    CxInsUser2Mapper cxInsUser2Mapper;

    @Override
    public String makeInsParams(String loanId)
    {
        if (!StringUtils.isBlank(loanId))
        {
            List<CxInsCba> cbas = cxInsCbaMapper.selectByLoanId(loanId);
            List<CxInsCbb> cbbs = cxInsCbbMapper.selectByLoanId(loanId);
            List<CxInsCbc> cbcs = cxInsCbcMapper.selectByLoanId(loanId);
            List<CxInsU2a> u2as = cxInsU2aMapper.selectByLoanId(loanId);
            List<CxInsU2b> u2bs = cxInsU2bMapper.selectByLoanId(loanId);
            List<CxInsU2c> u2cs = cxInsU2cMapper.selectByLoanId(loanId);
            List<CxInsUcb> ucbs = cxInsUcbMapper.selectByLoanId(loanId);
            List<CxInsUcc> uccs = cxInsUccMapper.selectByLoanId(loanId);
            List<CxInsUser2> user2s = cxInsUser2Mapper.selectByLoanId(loanId);
        }
        return null;
    }

}
