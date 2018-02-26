package com.abin.lee.spring.boot.multids.api.mapper;


import com.abin.lee.spring.boot.multids.api.datasource.TargetDataSource;
import com.abin.lee.spring.boot.multids.api.po.TChinaCity;

import java.util.List;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年4月18日 下午5:05:57   
 */
public interface TChinaCityMapper {

	@TargetDataSource("ds2")
	List<TChinaCity> findProvinceList(Integer id);
	
}
