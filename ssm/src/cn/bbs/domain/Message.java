package cn.bbs.domain;

import java.sql.Timestamp;

 

public class Message {
	private int messageId;
	private String title;
	private String content;
	private int aid;//fk
	private Timestamp writerDate;
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
 
	public Timestamp getWriterDate() {
		return writerDate;
	}
	public void setWriterDate(Timestamp writerDate) {
		this.writerDate = writerDate;
	}
	 
	
}
