package com.yannick.dao.impl;

import com.yannick.dao.BaseDao;
import com.yannick.dao.SysScheduleDao;
import com.yannick.pojo.SysSchedule;

import java.util.List;

public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "insert into sys_schedule values (DEFAULT,?,?,?)";
        int rows = baseUpdate(sql, schedule.getUid(), schedule.getTitle(), schedule.getCompleted());
        return 0;
    }

    @Override
    public List<SysSchedule> selecAlltSchedule() {
        String sql = "select sid, uid, title, completed from sys_schedule";
        List<SysSchedule> sysSchedules = baseQuery(SysSchedule.class, sql);
        return sysSchedules;
    }
}
