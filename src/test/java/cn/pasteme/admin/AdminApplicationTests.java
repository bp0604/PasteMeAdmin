package cn.pasteme.admin;

import cn.pasteme.admin.entity.PasteAdminDO;
import cn.pasteme.admin.mapper.PasteAdminMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminApplicationTests {

    @Autowired
    private PasteAdminMapper pasteAdminMapper;

    public void contextLoads() {
    }

    @Test
    public void mapperTest() {
        pasteAdminMapper.createTable();
        Assert.assertTrue(pasteAdminMapper.set(100L, 200L, 0, 0));
        PasteAdminDO pasteAdminDO = pasteAdminMapper.get(100L);
        Assert.assertNotNull(pasteAdminDO);
        Assert.assertEquals(Long.valueOf(200), pasteAdminDO.getCount());
    }
}
