package com.abin.lee.spring.boot.multids.api.mapper;


import com.abin.lee.spring.boot.multids.api.datasource.TargetDataSource;
import com.abin.lee.spring.boot.multids.api.po.UserInfo;

/**
 * 
 * @ClassName: UserInfoMapper 
 * @Description: TODO
 * @author leepon1990
 * @date 2016年4月5日 下午4:02:45 
 *
 */
public interface UserInfoMapper {

	@TargetDataSource("ds1")
	UserInfo getUserInfoById(Integer id);
}
