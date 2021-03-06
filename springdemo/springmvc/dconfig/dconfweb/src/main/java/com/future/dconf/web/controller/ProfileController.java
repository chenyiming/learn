/**        
 * Copyright (c) 2013 by chenyiming.    
 */    
package com.future.dconf.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.future.dconf.utils.PageUtil;
import com.future.dconf.web.service.ConfigService;
import com.future.dconf.web.service.ModuleService;
import com.future.dconf.web.service.ProjectService;

/**
 * Create on @2013-8-21 @下午6:55:09 
 * @author 
 */
@Controller
public class ProfileController extends BaseController {
	@Autowired
	private ModuleService moduleService;
	@Autowired
	private ConfigService configService;
	@Autowired
	private ProjectService projectService;
	
	private static final int LIMIT = 15;
	
	@RequestMapping("/profile/{type}/{projectId}")
	public String profile(@PathVariable("type") String type, @PathVariable("projectId") Long projectId, 
			Long moduleId, ModelMap modelMap, @RequestParam(defaultValue="1")int page) {
		modelMap.addAttribute("modules", moduleService.queryModules(projectId));
		modelMap.addAttribute("configs", configService.queryConfigs(projectId, moduleId, PageUtil.getOffset(page, LIMIT), LIMIT));
		modelMap.addAttribute("moduleId", moduleId);
		modelMap.addAttribute("project", projectService.queryProject(projectId));
		
		long recordCount = configService.queryConfigCount(projectId, moduleId);
		modelMap.addAttribute("totalPages", PageUtil.pageCount(recordCount, LIMIT));
		modelMap.addAttribute("currentPage", page);
		
		return "profile/" + type;
	}
	
	@RequestMapping("/profile/preview/{projectCode}/{type}")
	public String preview(@PathVariable("type") String type, @PathVariable("projectCode") String projectCode, 
			Long projectId, ModelMap modelMap) {
		String config = configService.queryConfigs(projectCode, type, "");
		
		modelMap.addAttribute("project", projectService.queryProject(projectId));
		modelMap.addAttribute("message", config);
		return "profile/preview";
	}
}
