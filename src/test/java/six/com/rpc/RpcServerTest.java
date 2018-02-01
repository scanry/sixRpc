package six.com.rpc;

import com.six.dove.rpc.RpcServer;
import com.six.dove.rpc.server.netty.NettyRpcServer;

/**   
* @author liusong  
* @date   2017年8月10日 
* @email  359852326@qq.com 
*/
public class RpcServerTest {

	public static void main(String[] args) throws InterruptedException {
		RpcServer server=new NettyRpcServer("127.0.0.1", 80);
		server.start();
		server.register(TestService.class, new TestServiceImpl());
		RpcServerTest wait=new RpcServerTest();
		synchronized (wait) {
			wait.wait();
		}
	}

}
