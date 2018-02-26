package com.abin.lee.spring.boot.multids.api.service;


import com.abin.lee.spring.boot.multids.api.po.TChinaCity;

import java.util.List;

/**
 * This class is used for ...
 * @author leepon1990
 * @version
 *       1.0, 2016年4月18日 下午4:27:49
 */
public interface TChinaCityService {

	List<TChinaCity> findProvinceList(Integer id);

}
