package com.yannick.dao;

import com.yannick.pojo.SysSchedule;

import java.util.List;

public interface SysScheduleDao {
    int addSchedule(SysSchedule schedule);

    List<SysSchedule> selecAlltSchedule();
}
