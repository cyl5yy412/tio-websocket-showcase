package org.tio.showcase.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.showcase.http.init.HttpServerInit;
import org.tio.utils.jfinal.P;

import java.io.IOException;

/**
 * ab -c 10 -n 200000 -k http://127.0.0.1:9527/test/abtest
 * ab -c 20 -n 200000 -k http://127.0.0.1:9527/test/abtest
 * ab -c 40 -n 200000 -k http://127.0.0.1:9527/test/abtest
 * ab -c 60 -n 200000 -k http://127.0.0.1:9527/test/abtest
 * ab -c 80 -n 200000 -k http://127.0.0.1:9527/test/abtest
 * ab -c 100 -n 200000 -k http://127.0.0.1:9527/test/abtest
 * ab -c 200 -n 200000 -k http://127.0.0.1:9527/test/abtest
 * ab -c 300 -n 200000 -k http://127.0.0.1:9527/test/abtest
 * ab -c 400 -n 200000 -k http://127.0.0.1:9527/test/abtest
 *
 * @author Chr
 *         2017年6月28日 下午5:34:04
 */
public class HttpServerShowcaseStarter {
    @SuppressWarnings("unused")
    private static Logger log = LoggerFactory.getLogger(HttpServerShowcaseStarter.class);

    /**
     * @param args
     * @throws IOException
     * @author Chr
     */
    public static void main(String[] args) throws Exception {
        P.use("app.properties");

        HttpServerInit.init();
    }

    /**
     * @author Chr
     */
    public HttpServerShowcaseStarter() {
    }
}