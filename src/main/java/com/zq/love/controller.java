package com.zq.love;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class controller {
    @GetMapping ("/login")
    public Object myLoveAsk(){
        String myAsk;
        Map<Object, Object> map=new HashMap<>();
        map.put("周全:","爱张亚男");
        myAsk= "周全:"+map.get("周全:");
        return myAsk;
    }
}
