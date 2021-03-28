package my.java.mail.util;

public class MailConstant {
	
	// @
	public static final String MAIL_SYMBOL = "@";
	
	// 后缀
	public static final String MAIL_SUFFIX_PART = "qq.com";
	
	// 发件人邮箱的 SMTP 服务器地址, 必须准确, 不同邮件服务器地址不同, 一般(只是一般, 绝非绝对)格式为: smtp.xxx.com
    // 网易126邮箱的 SMTP 服务器地址为: smtp.126.com
	public static final String EMAIL_SMTPHOST = "smtp." + MAIL_SUFFIX_PART;
	
	// 邮箱后缀 @travelsky.com.cn
	public static final String MAIL_SUFFIX = MAIL_SYMBOL + MAIL_SUFFIX_PART;
	
	// -------------------------------------- 需要修改的内容 --------------------------------------------------
	// 邮件主题
	public static final String MAIL_TITLE = "申请加班";
	
	// 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
    // PS: 某些邮箱服务器为了增加邮箱本身密码的安全性，给 SMTP 客户端设置了独立密码（有的邮箱称为“授权码”）,
    //     对于开启了独立密码的邮箱, 这里的邮箱密码必需使用这个独立密码（授权码）。
	// 发件人邮箱
	public static final String SENDEMAIL_ACCOUNT = "QQ号" + MAIL_SUFFIX;
	// 发件人邮箱密码
	// 如果用QQ，需要用到QQ授权码，到自己的QQ邮箱中获取
	public static final String SENDEMAIL_PASSWORD = "";
	// 发件人姓名
	public static final String SENDMAIL_NAME = "姓名";

}
