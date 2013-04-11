package de.gp.pms.common.auth;

import com.google.gwt.user.client.rpc.RemoteService;

public interface IAuthService extends RemoteService {
	
	boolean isAuthenticated();

}
