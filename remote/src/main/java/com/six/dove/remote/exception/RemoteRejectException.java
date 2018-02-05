package com.six.dove.remote.exception;

/**
 * @author 作者
 * @E-mail: 359852326@qq.com
 * @date 创建时间：2017年4月6日 下午9:21:55
 * @describe 远程调用 服务端拒绝执行方法异常
 */
public class RemoteRejectException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8557664964373398694L;

	public RemoteRejectException(String message) {
		super(message);
	}
	
	public RemoteRejectException(Throwable cause) {
		super(cause);
	}

	public RemoteRejectException(String message, Throwable cause) {
		super(message, cause);
	}

}
