package asu.com.server.impl;

import asu.com.dao.BaseDao;
import asu.com.entity.MembersInfo;
import asu.com.server.MembersInfoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MembersDao extends BaseDao implements MembersInfoImpl {
    /**
     * 修改
     * @param membersInfo
     * @return
     */
    @Override
    public int MembersInfoUp(MembersInfo membersInfo) {
        String sql = "update MembersInfo set Mid=?,Mname=?,Mgender=?,Mage=?,Maddress=?,Memail=? where Mid=? where Mid=?";
        return executeUpdate(sql,new Object[]{membersInfo.getMid(),membersInfo.getMname(),membersInfo.getMgender(),membersInfo.getMage(),
        membersInfo.getMaddress(),membersInfo.getMemail()});
    }

    /**
     * 查看
     *
     * @return
     */
    @Override
    public List<MembersInfo> MembersInfo() {
        List<MembersInfo> list = new ArrayList<>();
        String sql = "select * from MembersInfo";
        ResultSet rs = executeQuery(sql,null);
        try{
            while (rs.next()){
                MembersInfo membersInfo = new MembersInfo();
                membersInfo.setMid(rs.getInt(1));
                membersInfo.setMname(rs.getString(2));
                membersInfo.setMgender(rs.getString(3));
                membersInfo.setMage(rs.getInt(4));
                membersInfo.setMaddress(rs.getString(5));
                membersInfo.setMemail(rs.getString(6));
                list.add(membersInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
