package com.projcafe.cafe.board.repository;

import org.springframework.web.multipart.MultipartFile;

public class ProjCafeVO {

	private int CAFE_ID;
	private String CAFE_NAME;
	private String CAFE_LOCATION;
	private String CAFE_OPERATETIME;
	private String CAFE_PHONENUMBER;
	private String CAFE_SNS;
	private String CAFE_INTRODUCTION;
	private String CAFE_IMAGE;
	private String GIFTYCORN_CLN;
	private MultipartFile UPLOADIMAGE;
	private String CAFE_LAT;
	private String CAFE_LONG;
	private String SEARCHCONDITION; // 카페 리스트 검색 기능 추가
	private String SEARCHKEYWORD; // 카페 리스트 검색 기능 추가
	private int STARTPAGE; //페이징
	private int ENDPAGE; //페이징
	private int MAXPAGE; //페이징
	
	
	public String getGIFTYCORN_CLN() {
		return GIFTYCORN_CLN;
	}
	public void setGIFTYCORN_CLN(String gIFTYCORN_CLN) {
		GIFTYCORN_CLN = gIFTYCORN_CLN;
	}
	public int getSTARTPAGE() {
		return STARTPAGE;
	}
	public void setSTARTPAGE(int sTARTPAGE) {
		STARTPAGE = sTARTPAGE;
	}
	public int getENDPAGE() {
		return ENDPAGE;
	}
	public void setENDPAGE(int eNDPAGE) {
		ENDPAGE = eNDPAGE;
	}
	public int getCAFE_ID() {
		return CAFE_ID;
	}
	public String getCAFE_LAT() {
		return CAFE_LAT;
	}
	public void setCAFE_LAT(String cAFE_LAT) {
		CAFE_LAT = cAFE_LAT;
	}
	public String getCAFE_LONG() {
		return CAFE_LONG;
	}
	public void setCAFE_LONG(String cAFE_LONG) {
		CAFE_LONG = cAFE_LONG;
	}
	public void setCAFE_ID(int cAFE_ID) {
		CAFE_ID = cAFE_ID;
	}
	public String getCAFE_NAME() {
		return CAFE_NAME;
	}
	public void setCAFE_NAME(String cAFE_NAME) {
		CAFE_NAME = cAFE_NAME;
	}
	public String getCAFE_LOCATION() {
		return CAFE_LOCATION;
	}
	public void setCAFE_LOCATION(String cAFE_LOCATION) {
		CAFE_LOCATION = cAFE_LOCATION;
	}
	public String getCAFE_OPERATETIME() {
		return CAFE_OPERATETIME;
	}
	public void setCAFE_OPERATETIME(String cAFE_OPERATETIME) {
		CAFE_OPERATETIME = cAFE_OPERATETIME;
	}
	public String getCAFE_PHONENUMBER() {
		return CAFE_PHONENUMBER;
	}
	public void setCAFE_PHONENUMBER(String cAFE_PHONENUMBER) {
		CAFE_PHONENUMBER = cAFE_PHONENUMBER;
	}
	public String getCAFE_SNS() {
		return CAFE_SNS;
	}
	public void setCAFE_SNS(String cAFE_SNS) {
		CAFE_SNS = cAFE_SNS;
	}
	public String getCAFE_INTRODUCTION() {
		return CAFE_INTRODUCTION;
	}
	public void setCAFE_INTRODUCTION(String cAFE_INTRODUCTION) {
		CAFE_INTRODUCTION = cAFE_INTRODUCTION;
	}
	public String getSEARCHCONDITION() {
		return SEARCHCONDITION;
	}
	public void setSEARCHCONDITION(String sEARCHCONDITION) {
		SEARCHCONDITION = sEARCHCONDITION;
	}
	public String getSEARCHKEYWORD() {
		return SEARCHKEYWORD;
	}
	public void setSEARCHKEYWORD(String sEARCHKEYWORD) {
		SEARCHKEYWORD = sEARCHKEYWORD;
	}
	public String getCAFE_IMAGE() {
		return CAFE_IMAGE;
	}
	public void setCAFE_IMAGE(String cAFE_IMAGE) {
		CAFE_IMAGE = cAFE_IMAGE;
	}
	public MultipartFile getUPLOADIMAGE() {
		return UPLOADIMAGE;
	}
	public void setUPLOADIMAGE(MultipartFile uPLOADIMAGE) {
		UPLOADIMAGE = uPLOADIMAGE;
	}
	public int getMAXPAGE() {
		return MAXPAGE;
	}
	public void setMAXPAGE(int mAXPAGE) {
		MAXPAGE = mAXPAGE;
	}
	
	
	
	
	
}
