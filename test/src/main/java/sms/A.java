package sms;

public class A {
//    public static String a(String url, String account, String pswd, String mobile, String msg,
//                                   boolean needstatus, String extno) throws Exception {
//        HttpClient client = new HttpClient(new HttpClientParams(), new SimpleHttpConnectionManager(true));
//        GetMethod method = new GetMethod();
//        try {
//            URI base = new URI(url, false);
//            method.setURI(new URI(base, "HttpBatchSendSM", false));
//            method.setQueryString(new NameValuePair[] {
//                    new NameValuePair("account", account),
//                    new NameValuePair("pswd", pswd),
//                    new NameValuePair("mobile", mobile),
//                    new NameValuePair("needstatus", String.valueOf(needstatus)),
//                    new NameValuePair("msg", msg),
//                    new NameValuePair("extno", extno),
//            });
//            int result = client.executeMethod(method);
//            if (result == HttpStatus.SC_OK) {
//                InputStream in = method.getResponseBodyAsStream();
//                ByteArrayOutputStream baos = new ByteArrayOutputStream();
//                byte[] buffer = new byte[1024];
//                int len = 0;
//                while ((len = in.read(buffer)) != -1) {
//                    baos.write(buffer, 0, len);
//                }
//                return URLDecoder.decode(baos.toString(), "UTF-8");
//            } else {
//                throw new Exception("HTTP ERROR Status: " + method.getStatusCode() + ":" + method.getStatusText());
//            }
//        } finally {
//            method.releaseConnection();
//        }
//    }

}