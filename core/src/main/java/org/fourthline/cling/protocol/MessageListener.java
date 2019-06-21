package org.fourthline.cling.protocol;

import org.fourthline.cling.model.action.RemoteActionInvocation;
import org.fourthline.cling.model.message.control.IncomingActionRequestMessage;

public interface MessageListener {
    void receiveLocalMessage(IncomingActionRequestMessage message, RemoteActionInvocation invocation);
}
