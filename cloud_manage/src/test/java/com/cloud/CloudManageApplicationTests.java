package com.cloud;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudManageApplicationTests {
    //根据上面配的盐值自动注入
    @Autowired
    StringEncryptor stringEncryptor;

    @Test
    public void encryptPwd() {
        String password="password";//要加密的密码
        String result = stringEncryptor.encrypt(password);
        //打印结果
        System.out.println(result);
    }

	@Test
	public void contextLoads() {
		System.out.println("-----------");
	}

}
