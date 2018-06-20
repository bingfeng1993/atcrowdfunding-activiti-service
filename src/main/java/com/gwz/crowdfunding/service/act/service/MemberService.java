package com.gwz.crowdfunding.service.act.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gwz.crowdfunding.bean.Member;

/**
 * 服务访问类
 * @author DELL
 *
 */
@FeignClient("eureka-member-service")
public interface MemberService {

	@RequestMapping("/queryMemberByPiId/{piid}")
	Member queryMemberByPiId(@PathVariable("piid")String piid);

}
