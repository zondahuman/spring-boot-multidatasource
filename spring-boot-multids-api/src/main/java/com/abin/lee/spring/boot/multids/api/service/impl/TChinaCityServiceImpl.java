package com.abin.lee.spring.boot.multids.api.service.impl;

import com.abin.lee.spring.boot.multids.api.mapper.TChinaCityMapper;
import com.abin.lee.spring.boot.multids.api.po.TChinaCity;
import com.abin.lee.spring.boot.multids.api.service.TChinaCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年4月18日 下午5:05:16   
 */
@Service
public class TChinaCityServiceImpl implements TChinaCityService {

	@Autowired
	TChinaCityMapper tChinaCityMapper;
	
	@Override
	public List<TChinaCity> findProvinceList(Integer id) {
		List<TChinaCity> list = tChinaCityMapper.findProvinceList(id);
		return list;
 	}

}
