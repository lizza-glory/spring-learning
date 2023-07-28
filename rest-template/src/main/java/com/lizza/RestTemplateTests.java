package com.lizza;

import com.alibaba.fastjson.JSONObject;
import com.lizza.util.Logger;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import sun.security.krb5.internal.PAData;

import java.util.Arrays;

/**
 *
 */
public class RestTemplateTests {

    @Test
    public void test1() throws Exception {
        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("X-Auth-Token", "f8aaff4ceb7b4c4faba2db0d25819094");
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        String url = "http://localhost:9004/netCollectController/getNextIdByRecordIdAndType?record_id=123&type=1";

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    ResponseEntity<String> result = template.exchange(url, HttpMethod.GET, entity, String.class);
                    System.out.println(result.getBody());
                }
            }, "T-" + i).start();
        }
    }

    @Test
    public void test2() throws Exception {
        RestTemplate template = new RestTemplate();
        String url = "https://pre-ms3.poizonapp.com/api/v1/open/getOssSignCdnUrl";
        String param = "{\"appId\":\"vV02B4nz02107W7MD6z1PN0j661yF1tO\",\"ossUrls\":[\"https://h5cdn-sig-sign.poizonapp.com/global/poizon-deal-h5/2000010179/218c1f416b6c67c27048ed07e6c9b071.jpg\",\"https://h5cdn-sig-sign.poizonapp.com/global/poizon-deal-h5/2000010179/3174fa03c38d7514857cf1732630920d.jpg\",\"https://h5cdn-sig-sign.poizonapp.com/global/poizon-deal-h5/2000010179/fff10684c6d6223ebda10eed34520cd3.jpg\",\"https://h5cdn-sig-sign.poizonapp.com/global/poizon-deal-h5/2000010179/23f08b2c470362611b8fff550d566886.jpg\",\"https://h5cdn-sig-sign.poizonapp.com/global/poizon-deal-h5/2000010179/166dbc62c86b9b831a21d672d4a1910a.jpg\",\"https://h5cdn-sig-sign.poizonapp.com/global/poizon-deal-h5/2000010179/a281dce137aa5088f04a319c71371063.jpg\"],\"period\":4837571042,\"sourceService\":\"overseas-identify\"}";
        Logger.info("url: {}", url);
        Logger.info("req: {}", param);
        ResponseEntity<String> response = template.postForEntity(url, param, String.class);
        Logger.info("res: {}", response);
    }
}
