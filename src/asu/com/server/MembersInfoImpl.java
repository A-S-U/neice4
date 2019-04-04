package asu.com.server;

import asu.com.entity.MembersInfo;

import java.util.List;

public interface MembersInfoImpl {

    /**
     * 修改
     * @param membersInfo
     * @return
     */
    int MembersInfoUp(MembersInfo membersInfo);

    /**
     * 查看
     * @return
     */
    List<MembersInfo> MembersInfo();
}
