package com.service.impl;

import com.dao.CinemaDao;
import com.entity.Cinema;
import com.service.CinemaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cinema)表服务实现类
 *
 * @author makejava
 * @since 2023-04-27 20:20:34
 */
@Service("cinemaService")
public class CinemaServiceImpl implements CinemaService {
    @Resource
    private CinemaDao cinemaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Cinema queryById(Long id) {
        return this.cinemaDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param cinema 筛选条件
     * @return 查询结果
     */
    @Override
    public List<Cinema> queryAll(Cinema cinema) {
        return this.cinemaDao.queryAll(cinema);
    }

    /**
     * 新增数据
     *
     * @param cinema 实例对象
     * @return 实例对象
     */
    @Override
    public Cinema insert(Cinema cinema) {
        this.cinemaDao.insert(cinema);
        return cinema;
    }

    /**
     * 修改数据
     *
     * @param cinema 实例对象
     * @return 实例对象
     */
    @Override
    public Cinema update(Cinema cinema) {
        this.cinemaDao.update(cinema);
        return this.queryById(cinema.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.cinemaDao.deleteById(id) > 0;
    }
}
