package my.java.mail;

import java.time.LocalDate;
import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import my.java.mail.util.MailConstant;

public class MailQQClient {
	
    // 收件人邮箱 只写前缀即可
    public static String[] receiveMails = {"QQ号"};
    
    // 抄送人邮箱 只写前缀即可
//    public static String[] sendCopyMails = {"QQ号", "QQ号"};
    public static String[] sendCopyMails = {""};
    
    // 邮件内容
    public static String mailContent = "您好：" + 
    		// 换行
    		"<br>" +
    		"    wo 我申请今晚(" + LocalDate.now() + ")，因"
			+ "<br>"
    		+ "正文内容 "
    		+ "<br>"
    		+ "正文内容 "
    		+ "<br>"
    		+ "  上线加班，麻烦您给审批一下";
    
    // 底部个人信息
    public static String personal_Information = 
    		"<br><br><br><br><br><br>" +
			"<hr width=\"270px\" style=\"float: left;\"/>" +
			"<br>" +
			MailConstant.SENDMAIL_NAME + 
    		"<br>" +
    		"什么什么公司" + 
    		"<br>" +
    		"一级部门 二级部门" + 
    		"<br>" +
    		"地址：改" + 
    		"<br>" +
    		"邮箱：" + MailConstant.SENDEMAIL_ACCOUNT;
    
    // ----------------------------------------------------------------------------------------
 
    public static void main(String[] args) throws Exception {
    	// 参数配置
        // 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();
        // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.transport.protocol", "smtp"); 
        // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.host", MailConstant.EMAIL_SMTPHOST);
        // 需要请求认证
        props.setProperty("mail.smtp.auth", "true");
 
        // PS: 某些邮箱服务器要求 SMTP 连接需要使用 SSL 安全认证 (为了提高安全性, 邮箱支持SSL连接, 也可以自己开启),
        //     如果无法连接邮件服务器, 仔细查看控制台打印的 log, 如果有有类似 “连接失败, 要求 SSL 安全连接” 等错误,
        //     取消下面 /* ... */ 之间的注释代码, 开启 SSL 安全连接。
        /*
        // SMTP 服务器的端口 (非 SSL 连接的端口一般默认为 25, 可以不添加, 如果开启了 SSL 连接,
        //                  需要改为对应邮箱的 SMTP 服务器的端口, 具体可查看对应邮箱服务的帮助,
        //                  QQ邮箱的SMTP(SLL)端口为465或587, 其他邮箱自行去查看)
        final String smtpPort = "465";
        props.setProperty("mail.smtp.port", smtpPort);
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", smtpPort);
        */
 
        // 2. 根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getInstance(props);
        // 设置为debug模式, 可以查看详细的发送 log
        session.setDebug(true);
 
        // 3. 创建一封邮件
        MimeMessage message = createMimeMessage(session, MailConstant.SENDEMAIL_ACCOUNT, MailConstant.SENDMAIL_NAME, receiveMails, MailConstant.MAIL_TITLE);
        if(null == message) {
        	return;
        }
 
        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();
 
        // 5. 使用 邮箱账号 和 密码 连接邮件服务器, 这里认证的邮箱必须与 message 中的发件人邮箱一致, 否则报错
        //
        //    PS_01: 如果连接服务器失败, 都会在控制台输出相应失败原因的log。
        //    仔细查看失败原因, 有些邮箱服务器会返回错误码或查看错误类型的链接,
        //    根据给出的错误类型到对应邮件服务器的帮助网站上查看具体失败原因。
        //
        //    PS_02: 连接失败的原因通常为以下几点, 仔细检查代码:
        //           (1) 邮箱没有开启 SMTP 服务;
        //           (2) 邮箱密码错误, 例如某些邮箱开启了独立密码;
        //           (3) 邮箱服务器要求必须要使用 SSL 安全连接;
        //           (4) 请求过于频繁或其他原因, 被邮件服务器拒绝服务;
        //           (5) 如果以上几点都确定无误, 到邮件服务器网站查找帮助。
        //
        transport.connect(MailConstant.SENDEMAIL_ACCOUNT, MailConstant.SENDEMAIL_PASSWORD);
 
        // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());
 
        // 7. 关闭连接
        transport.close();
    }
 
    /**
         * 创建一封只包含文本的简单邮件
     *
     * @param session     和服务器交互的会话
     * @param sendMail    发件人邮箱
     * @param receiveMail 收件人邮箱
     * @return
     * @throws Exception
     */
    public static MimeMessage createMimeMessage(Session session, String sendMail, String sendMailName ,String receiveMail[], String title) throws Exception {
    	if(contentIsEmpty(receiveMails)) {
    		return null;
    	}
        // 1. 创建一封邮件
        MimeMessage message = new MimeMessage(session);
 
        // 2. From: 发件人
        message.setFrom(new InternetAddress(sendMail, sendMailName, "UTF-8"));
 
        // 3. To: 多收件人（可以增加多个收件人、抄送、密送）
        // message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "姓名", "UTF-8"));
        InternetAddress[] addressesTo = new InternetAddress[receiveMails.length];
        for (int i = 0; i < addressesTo.length; i++) {
        	if(!"".equals(receiveMails[i])) {
        		addressesTo[i] = new InternetAddress(receiveMails[i] + MailConstant.MAIL_SUFFIX, receiveMails[i], "UTF-8");
        	}
		}
        
        message.setRecipients(MimeMessage.RecipientType.TO, addressesTo);
        
        // 3.1 CC: 抄送多人
        if(!contentIsEmpty(sendCopyMails)) {
        	InternetAddress[] addressesCC = new InternetAddress[sendCopyMails.length];
        	for (int i = 0; i < addressesCC.length; i++) {
        		if(!"".equals(sendCopyMails[i])) {
        			addressesCC[i] = new InternetAddress(sendCopyMails[i] + MailConstant.MAIL_SUFFIX, sendCopyMails[i], "UTF-8");
        		}
        	}
        	
        	message.setRecipients(MimeMessage.RecipientType.CC, addressesCC);
        }
 
        // 4. Subject: 邮件主题
        message.setSubject(title, "UTF-8");
 
        // 5. Content: 邮件正文（可以使用html标签）
        message.setContent(mailContent + personal_Information, "text/html;charset=UTF-8");
        // 6. 设置发件时间
        message.setSentDate(new Date());
 
        // 7. 保存设置
        message.saveChanges();
 
        return message;
    }
    
    /**
         * 判断数组中元素内容是否为空 不为空返回false
     * <p>Title: contentIsEmpty</p>  
     * <p>Description: </p>  
     * @param arr
     * @return
     */
    private static boolean contentIsEmpty(String[] arr) {
    	for (int i = 0; i < arr.length; i++) {
			if(!"".equals(arr[i])){
				return false;
			}
		}
    	return true;
    }

}
