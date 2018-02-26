package com.abin.lee.spring.boot.multids.api.service.impl;

import com.abin.lee.spring.boot.multids.api.mapper.UserInfoMapper;
import com.abin.lee.spring.boot.multids.api.po.UserInfo;
import com.abin.lee.spring.boot.multids.api.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class is used for ...
 * @author leepon1990
 * @version
 *       1.0, 2016年3月31日 下午6:07:17
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserInfoById(Integer id) {
		UserInfo userInfo = userInfoMapper.getUserInfoById(id);
		return userInfo;
	}

}
