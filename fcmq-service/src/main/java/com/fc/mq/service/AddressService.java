package com.fc.mq.service;

import java.util.List;
import java.util.Map;

import com.fc.mq.persist.base.AddressInfo;

public interface AddressService
{
    List<AddressInfo> getAddressInfos(Map<String, Object> map);

    int addOrUpdateAddress(AddressInfo addressInfo);

    int deleteAddress(AddressInfo addressInfo);

}
