package server;

import init.IExpand;
import init.Init;
import service.RPCClientTestService;
import tcp.TOpCodeRPCServer;
import tcp.TOpCodeRPCServer1;

public class Expand implements IExpand {

	@Override
	public void init() throws Exception {
		TOpCodeRPCServer.init();
		TOpCodeRPCServer1.init();
		Init.registerService(RPCClientTestService.class);
	}

	@Override
	public void threadInit() throws Exception {

	}
}
