package cn.cincout.distribute.spring.dubbo.service.provider.service;

import cn.cincout.distribute.spring.dubbo.service.api.DemoService;

/**
 * Created by zhaoyu on 18-9-17.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
