package cn.bbs.action;

import java.util.List;

import cn.bbs.domain.Message;
import cn.bbs.service.MessageService;

import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Message> list;
	public MessageService  messageService;
	public List<Message> getList() {
		return list;
	}
	public void setList(List<Message> list) {
		this.list = list;
	}
	public MessageService getMessageService() {
		return messageService;
	}
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	public String searchMessageAll(){
		list=messageService.getMessage();
		return SUCCESS;
	}

}
