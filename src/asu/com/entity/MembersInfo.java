package asu.com.entity;

/**
 * 会员信息实体类
 */

public class MembersInfo {

    private int Mid;//会员编号

    private String Mname;//会员姓名

    private String Mgender;//会员性别

    private int Mage;//会员年龄

    private String Maddress;//会员地址

    private String Memail;//电子邮件

    public int getMid() { return Mid; }

    public void setMid(int mid) { Mid = mid; }

    public String getMname() { return Mname; }

    public void setMname(String mname) { Mname = mname; }

    public String getMgender() { return Mgender; }

    public void setMgender(String mgender) { Mgender = mgender; }

    public int getMage() { return Mage; }

    public void setMage(int mage) { Mage = mage; }

    public String getMaddress() { return Maddress; }

    public void setMaddress(String maddress) { Maddress = maddress; }

    public String getMemail() { return Memail; }

    public void setMemail(String memail) { Memail = memail; }
}
