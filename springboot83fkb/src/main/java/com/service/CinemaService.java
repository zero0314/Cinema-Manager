package com.service;

import com.entity.Cinema;

import java.util.List;

/**
 * (Cinema)表服务接口
 *
 * @author makejava
 * @since 2023-04-27 20:20:34
 */
public interface CinemaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Cinema queryById(Long id);

    /**
     * 查询全部
     *
     * @param cinema 筛选条件
     * @return 查询结果
     */
    List<Cinema> queryAll(Cinema cinema);

    /**
     * 新增数据
     *
     * @param cinema 实例对象
     * @return 实例对象
     */
    Cinema insert(Cinema cinema);

    /**
     * 修改数据
     *
     * @param cinema 实例对象
     * @return 实例对象
     */
    Cinema update(Cinema cinema);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
