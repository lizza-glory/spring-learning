package com.lizza.action;

import com.lizza.config.SpringConfig;
import com.lizza.service.ActionHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-02-25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class IActionHolderTest {

    @Autowired
    private ActionHolder actionHolder;

    @Test
    public void testGetActionMap() {
        Map<String, IAction> actionMap = actionHolder.getActionMap();
        System.out.println(actionMap);
    }
}
