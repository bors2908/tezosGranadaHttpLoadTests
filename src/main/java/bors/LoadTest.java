package bors;

import java.io.IOException;
import java.rmi.RemoteException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class LoadTest {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            String
                body
                = "{\"branch\":\"BLwpfQXCi9C4CkJPUTaixCw4DQPVkZ6m1vmb13PCTxRqxsBiDkR\",\"contents\":[{\"kind\":\"origination\",\"source\":\"tz1aSEPhU8TqhuZhLiSpQMfRozcQHVRD1rJ8\",\"fee\":\"2840\",\"counter\":\"146661\",\"gas_limit\":\"10600\",\"storage_limit\":\"60000\",\"balance\":\"0\",\"script\":{\"code\":[{\"prim\":\"parameter\",\"args\":[{\"prim\":\"or\",\"args\":[{\"prim\":\"unit\",\"annots\":[\"%default\"]},{\"prim\":\"pair\",\"args\":[{\"prim\":\"pair\",\"args\":[{\"prim\":\"nat\",\"annots\":[\"%counter\"]},{\"prim\":\"or\",\"args\":[{\"prim\":\"pair\",\"args\":[{\"prim\":\"mutez\",\"annots\":[\"%amount\"]},{\"prim\":\"contract\",\"args\":[{\"prim\":\"unit\"}],\"annots\":[\"%dest\"]}],\"annots\":[\":transfer\"]},{\"prim\":\"or\",\"args\":[{\"prim\":\"option\",\"args\":[{\"prim\":\"key_hash\"}],\"annots\":[\"%delegate\"]},{\"prim\":\"pair\",\"args\":[{\"prim\":\"nat\",\"annots\":[\"%threshold\"]},{\"prim\":\"list\",\"args\":[{\"prim\":\"key\"}],\"annots\":[\"%keys\"]}],\"annots\":[\"%change_keys\"]}]}],\"annots\":[\":action\"]}],\"annots\":[\":payload\"]},{\"prim\":\"list\",\"args\":[{\"prim\":\"option\",\"args\":[{\"prim\":\"signature\"}]}],\"annots\":[\"%sigs\"]}],\"annots\":[\"%main\"]}]}]},{\"prim\":\"storage\",\"args\":[{\"prim\":\"pair\",\"args\":[{\"prim\":\"nat\",\"annots\":[\"%stored_counter\"]},{\"prim\":\"pair\",\"args\":[{\"prim\":\"nat\",\"annots\":[\"%threshold\"]},{\"prim\":\"list\",\"args\":[{\"prim\":\"key\"}],\"annots\":[\"%keys\"]}]}]}]},{\"prim\":\"code\",\"args\":[[[[{\"prim\":\"DUP\"},{\"prim\":\"CAR\"},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"CDR\"}]]}]],{\"prim\":\"IF_LEFT\",\"args\":[[{\"prim\":\"DROP\"},{\"prim\":\"NIL\",\"args\":[{\"prim\":\"operation\"}]},{\"prim\":\"PAIR\"}],[{\"prim\":\"SWAP\"},{\"prim\":\"DUP\"},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"SWAP\"}]]},{\"prim\":\"DIP\",\"args\":[[[[{\"prim\":\"DUP\"},{\"prim\":\"CAR\"},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"CDR\"}]]}]],{\"prim\":\"DUP\"},{\"prim\":\"SELF\"},{\"prim\":\"ADDRESS\"},{\"prim\":\"CHAIN_ID\"},{\"prim\":\"PAIR\"},{\"prim\":\"PAIR\"},{\"prim\":\"PACK\"},{\"prim\":\"DIP\",\"args\":[[[[{\"prim\":\"DUP\"},{\"prim\":\"CAR\",\"annots\":[\"@counter\"]},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"CDR\"}]]}]],{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"SWAP\"}]]}]]},{\"prim\":\"SWAP\"}]]},[[{\"prim\":\"DUP\"},{\"prim\":\"CAR\",\"annots\":[\"@stored_counter\"]},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"CDR\"}]]}]],{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"SWAP\"}]]},[[{\"prim\":\"COMPARE\"},{\"prim\":\"EQ\"}],{\"prim\":\"IF\",\"args\":[[],[[{\"prim\":\"UNIT\"},{\"prim\":\"FAILWITH\"}]]]}],{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"SWAP\"}]]},[[{\"prim\":\"DUP\"},{\"prim\":\"CAR\",\"annots\":[\"@threshold\"]},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"CDR\",\"annots\":[\"@keys\"]}]]}]],{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"PUSH\",\"args\":[{\"prim\":\"nat\"},{\"int\":\"0\"}],\"annots\":[\"@valid\"]},{\"prim\":\"SWAP\"},{\"prim\":\"ITER\",\"args\":[[{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"SWAP\"}]]},{\"prim\":\"SWAP\"},{\"prim\":\"IF_CONS\",\"args\":[[[{\"prim\":\"IF_NONE\",\"args\":[[{\"prim\":\"SWAP\"},{\"prim\":\"DROP\"}],[{\"prim\":\"SWAP\"},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"SWAP\"},{\"prim\":\"DIP\",\"args\":[{\"int\":\"2\"},[[{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"DUP\"}]]},{\"prim\":\"SWAP\"}]]]},[[{\"prim\":\"DIP\",\"args\":[{\"int\":\"2\"},[{\"prim\":\"DUP\"}]]},{\"prim\":\"DIG\",\"args\":[{\"int\":\"3\"}]}],{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"CHECK_SIGNATURE\"}]]},{\"prim\":\"SWAP\"},{\"prim\":\"IF\",\"args\":[[{\"prim\":\"DROP\"}],[{\"prim\":\"FAILWITH\"}]]}],{\"prim\":\"PUSH\",\"args\":[{\"prim\":\"nat\"},{\"int\":\"1\"}]},{\"prim\":\"ADD\",\"annots\":[\"@valid\"]}]]}]]}]],[[{\"prim\":\"UNIT\"},{\"prim\":\"FAILWITH\"}]]]},{\"prim\":\"SWAP\"}]]}]]},[[{\"prim\":\"COMPARE\"},{\"prim\":\"LE\"}],{\"prim\":\"IF\",\"args\":[[],[[{\"prim\":\"UNIT\"},{\"prim\":\"FAILWITH\"}]]]}],{\"prim\":\"DROP\"},{\"prim\":\"DROP\"},{\"prim\":\"DIP\",\"args\":[[[[{\"prim\":\"DUP\"},{\"prim\":\"CAR\"},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"CDR\"}]]}]],{\"prim\":\"PUSH\",\"args\":[{\"prim\":\"nat\"},{\"int\":\"1\"}]},{\"prim\":\"ADD\",\"annots\":[\"@new_counter\"]},{\"prim\":\"PAIR\"}]]},{\"prim\":\"NIL\",\"args\":[{\"prim\":\"operation\"}]},{\"prim\":\"SWAP\"},{\"prim\":\"IF_LEFT\",\"args\":[[[[{\"prim\":\"DUP\"},{\"prim\":\"CAR\"},{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"CDR\"}]]}]],{\"prim\":\"UNIT\"},{\"prim\":\"TRANSFER_TOKENS\"},{\"prim\":\"CONS\"}],[{\"prim\":\"IF_LEFT\",\"args\":[[{\"prim\":\"SET_DELEGATE\"},{\"prim\":\"CONS\"}],[{\"prim\":\"DIP\",\"args\":[[{\"prim\":\"SWAP\"},{\"prim\":\"CAR\"}]]},{\"prim\":\"SWAP\"},{\"prim\":\"PAIR\"},{\"prim\":\"SWAP\"}]]}]]},{\"prim\":\"PAIR\"}]]}]]}],\"storage\":{\"prim\":\"Pair\",\"args\":[{\"int\":\"0\"},{\"prim\":\"Pair\",\"args\":[{\"int\":\"2\"},[{\"string\":\"edpku5Ax6DT1UgtU8CcYhoEsvFPjzYLRCXpVouJGWLLia6upeZBEYq\"},{\"string\":\"edpku4oPk1uDgRKJG6q94pWwRvymGSyTk1jqGUyAaeRPFfNEZgXGB7\"},{\"string\":\"edpkuXLqzhPyctR8pXt8PqQCN5XBa4VvuUVXvnGGGmR8cXLHuzoCyw\"}]]}]}}}]}";

            HttpPost request = new HttpPost("http://127.0.0.1:11018/chains/main/blocks/head/helpers/forge/operations");

            request.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");

            request.setEntity(new StringEntity(body));


            for (int i = 0; i < 1000; i++) {
                Thread.sleep(6000);

                try {
                    CloseableHttpResponse response = httpClient.execute(request);

                    try {
                        if (response.getStatusLine().getStatusCode() == 200) {
                            HttpEntity entity = response.getEntity();
                            if (entity != null) {
                                if (!EntityUtils.toString(entity).isEmpty()) {
                                    ;
                                }
                                System.out.println("OK");

                                continue;
                            }

                            System.out.println("EMPTY");

                            continue;
                        }
                        System.out.println("NON_OK");
                    }
                    catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    finally {
                        response.close();
                    }

                }
                catch (NoHttpResponseException e) {
                    System.out.println("EXCEPTION");
                }
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            httpClient.close();
        }

    }
}
