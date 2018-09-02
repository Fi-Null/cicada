package top.crossoverjie.cicada.server.util;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;

import java.util.Map;
import java.util.Set;

public class ScannerTest {


    private static final Logger LOGGER = LoggerBuilder.getLogger(ScannerTest.class) ;

    @Test
    public void getClasses() throws Exception {
        Set<Class<?>> classes = Scanner.getClasses("top.crossoverjie.cicada.server");

        LOGGER.info("classes=[{}]", JSON.toJSONString(classes));
    }


    @Test
    public void getActionAction() throws Exception{
        Map<String, Class<?>> cicadaAction = Scanner.getCicadaAction("top.crossoverjie.cicada.server");
        LOGGER.info("classes=[{}]", JSON.toJSONString(cicadaAction));
    }

}