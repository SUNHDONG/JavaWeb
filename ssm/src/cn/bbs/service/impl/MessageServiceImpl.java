package cn.bbs.service.impl;

import java.util.List;

import cn.bbs.dao.MessageDAO;
import cn.bbs.domain.Message;
import cn.bbs.service.MessageService;

public class MessageServiceImpl implements MessageService {
    MessageDAO messageDAO;
    
	public MessageDAO getMessageDAO() {
		return messageDAO;
	}

	public void setMessageDAO(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}

	@Override
	public List<Message> getMessage() {
		// TODO Auto-generated method stub
		return messageDAO.searchMessageAll();
	}

}
