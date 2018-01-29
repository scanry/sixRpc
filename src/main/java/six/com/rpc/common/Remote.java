package six.com.rpc.common;

import six.com.rpc.Compiler;
import six.com.rpc.protocol.RpcSerialize;

/**
 * @author 作者
 * @E-mail: 359852326@qq.com
 * @date 创建时间：2017年4月10日 上午11:17:33 远程调用 接口
 */
public interface Remote {

	/**
	 * 启动
	 */
	void start();

	/**
	 * 关闭
	 */
	void shutdown();

	/**
	 * 获取一个编译器
	 * 
	 * @return
	 */
	Compiler getCompiler();

	/**
	 * 获取序列化器
	 * 
	 * @return
	 */
	RpcSerialize getRpcSerialize();

}
