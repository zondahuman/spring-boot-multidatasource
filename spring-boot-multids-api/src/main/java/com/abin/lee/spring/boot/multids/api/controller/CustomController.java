package com.abin.lee.spring.boot.multids.api.controller;

import com.abin.lee.spring.boot.multids.api.po.TChinaCity;
import com.abin.lee.spring.boot.multids.api.service.TChinaCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class is used for ...
 * @author leepon1990
 * @version
 *       1.0, 2016年4月18日 下午4:23:55
 */

@RestController
@RequestMapping("/custom")
public class CustomController {

	@Autowired
	TChinaCityService chinaCityService;

	@RequestMapping("/view/{id}")
	public List<TChinaCity> view(@PathVariable Integer id){

		List<TChinaCity> list = chinaCityService.findProvinceList(id);

		return list;

	}

}
