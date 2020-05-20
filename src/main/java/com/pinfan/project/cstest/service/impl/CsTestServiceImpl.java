package com.pinfan.project.cstest.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinfan.project.cstest.mapper.CsTestMapper;
import com.pinfan.project.cstest.domain.CsTest;
import com.pinfan.project.cstest.service.ICsTestService;

/**
 * 测试Service业务层处理
 *
 * @author Lion Li
 * @date 2020-02-14
 */
@Service
public class CsTestServiceImpl extends ServiceImpl<CsTestMapper, CsTest> implements ICsTestService {

}
