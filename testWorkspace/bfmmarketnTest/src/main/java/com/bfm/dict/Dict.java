package com.bfm.dict;

//ϵͳ�л����Ĳ���
public class Dict {
	
	//HTTP ���ر��� ����״̬
	public final static int HTTP_RE_OK = 200;
	
	//HTTP ���ر��� �ض�λ״̬
	public final static int HTTP_RE_REDIRECT = 302;
	
	public final static String host = "192.168.54.66:7001";
	public final static String url = "http://192.168.54.66:7001/bfmcpv20";
	
	//��½�ӿڵ�ַ
	public final static String loginService = "/bizframe.framework._signIn.service";
	//ע���ӿڵ�ַ
	public final static String logoutService = "/bizframe.framework._signOut.service";
	//ծȯָ���ӿڵ�ַ
	public final static String bondbsdInstrService = "/bfm.bondbiz.bondbsd.BondbsdInstr.service";
	
	//http bean ��Ӧ��·��
	public final static String httpVOPath = "com.bfm.http.bean.TestDatas";
	//��½�ӿ�������
	public final static String loginVOPath = "com.bfm.http.bean.LoginHttpVO";
	//ծȯָ���ӿ�������
	public final static String bondInstrVOPath = "com.bfm.http.bean.BondInstrHttpVO";
	
	
}
