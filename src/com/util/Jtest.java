package com.util;

import org.junit.jupiter.api.Test;

/**
* @author 作者
* @version 创建时间：2019年1月9日 上午10:37:16
* 类说明
*/
class Jtest {

	@Test
	public void totleAgreeLimit() {
		 String longTermContType = "7737,7741";  //长期有效合同，需手动释放额度
		 String validContStatus = "7693,7695,8041,22879"; //正常合同的有效状态
		 String expireContStatus = "7693,8041,22879"; //过期合同的有效状态
		 String custid ="1006";
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("select (case when sum(cont_generalinfo.amount) is null then 0 else sum(cont_generalinfo.amount) end) ");
		strbuf.append("from cont_party,cont_generalinfo ");
		strbuf.append("where cont_party.contractid = cont_generalinfo.contractid ");
		//modified by wangnan 20180409 start 长期有效合同不自动是否额度
		strbuf.append("and ((cont_generalinfo.contracttype not in ("+longTermContType+") and enddate>=current date) or cont_generalinfo.contracttype in ("+longTermContType+")) ");
		strbuf.append("and cont_generalinfo.status in ("+validContStatus+") ");
		strbuf.append("and cont_generalinfo.limitcode <> '008' ");
		//modified by wangnan 20180409 end
		strbuf.append("and partyrole in (7716,7724,7753,7745,7739,8363,8394,8583)  ");
		strbuf.append("and (isextend<>7726 or isextend is null) and partyid = '" + custid + "'");
		System.out.println(strbuf.toString());
	}
	@Test
	public void extcontlimit() {
		StringBuffer strbuf = new StringBuffer();
		String custid = "1006";
		strbuf.append("select (case when sum(amount) is null then 0 else sum(amount) end) amount ");
		strbuf.append("from cont_generalinfo ");
		strbuf.append("where relgroupid in");
		strbuf.append("(");
		strbuf.append("	select relgroupid from cont_attachrelation where relcontractid in");
		strbuf.append("	(");
		strbuf.append("		select a.contractid from cont_generalinfo a,cont_party b ");
		strbuf.append("		where b.contractid=a.contractid and a.status in (7693,7695) and b.partyrole in (7716,7724,7753,7745,7739,8363,8394,8583) ");
		strbuf.append("		and begindate<=current date and enddate>=current date and a.isextend=7726 and b.partyid = '" + custid + "'");
		strbuf.append("	)");
		strbuf.append(") and (isextend<>7726 or isextend is null)");
		System.out.println(strbuf.toString());
	}
	@Test void totleAgreeLimit_ADD_extcontlimit() {
		
	}
	@Test void billLimit() {
		StringBuffer strbuf = new StringBuffer();
		String custid = "1006";
		strbuf.append("select (case when sum(ldb_loanduebill.amount) is null then 0 else sum(ldb_loanduebill.amount) end) ");
		strbuf.append("from cont_party,cont_generalinfo,ldb_loanduebill ");
		strbuf.append("where cont_party.contractid = cont_generalinfo.contractid and cont_generalinfo.contractid = ldb_loanduebill.contractid ");
		strbuf.append("and cont_generalinfo.status in (7693,7695) and partyrole in (7716,7724,7745,7739,8583) and cont_generalinfo.contractcode not like 'XH%'");
		strbuf.append("and (purposetype<>7913 or purposetype is null) ");
		strbuf.append("and cont_generalinfo.enddate>=current date and (isextend<>7726 or isextend is null) and partyid='" + custid + "'");
		strbuf.append(" and cont_generalinfo.contracttype <> 11614");
		System.out.println(strbuf.toString());
	}
	@Test void extbilllimit() {
		StringBuffer strbuf = new StringBuffer();
		String custid = "1006";
		strbuf.append("select (case when sum(c.amount) is null then 0 else sum(c.amount) end) amount ");
		strbuf.append("from cont_party b,cont_generalinfo a,ldb_loanduebill c ");
		strbuf.append("where b.contractid=a.contractid and a.contractid=c.contractid and a.status in (7693,7695) ");
		strbuf.append("and b.partyrole in (7716,7724,7745,7739,8583) and b.partyid='"
						+ custid + "' ");
		strbuf.append("and (purposetype<>7913 or purposetype is null) ");
		strbuf.append("and a.contractid in");
		strbuf.append("(");
		strbuf.append("	select contractid from cont_generalinfo where relgroupid in");
		strbuf.append("	(");
		strbuf.append("		select relgroupid from cont_attachrelation where relcontractid in");
		strbuf.append("		(");
		strbuf.append("			select a.contractid from cont_generalinfo a,cont_party b ");
		strbuf.append("			where b.contractid=a.contractid and a.status in (7693,7695) ");
		strbuf.append("			and b.partyrole in (7716,7724,7745,7739,8583) and a.isextend=7726 ");
		strbuf.append("			and begindate<=current date and enddate>=current date and b.partyid = '"
						+ custid + "'");
		strbuf.append("		)");
		strbuf.append("	) and (isextend<>7726 or isextend is null)");
		strbuf.append(")");
		System.out.println(strbuf.toString());
	}
	@Test void billLimit_ADD_extbilllimit() {
		
	}
	@Test void getBillReleaseLimit() {
		StringBuffer sql = new StringBuffer();
		String custid = "1006";
		sql.append("select nvl(sum(c.billamt),0) sum_billamt ");
		sql.append("from cont_party a,cont_generalinfo b,bill_release_limit c ");
		sql.append("where a.contractid = b.contractid and b.contractcode=c.contractcode ");
		sql.append("and a.partyrole in (7716,7724,7753,7745,7739,8363,8394,8583) ");
		sql.append("and b.contracttype = 11614 ");
		sql.append("and b.limitcode <> '008' ");
		sql.append("and b.enddate >= current date ");
		sql.append("and a.partyid = '").append(custid).append("' ");
		System.out.println(sql.toString());

	}

}
