package com.controller;

import com.annotation.IgnoreAuth;
import com.entity.Cinema;
import com.service.CinemaService;
import com.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Cinema)表控制层
 *
 * @author makejava
 * @since 2023-04-27 20:20:14
 */
@RestController
@RequestMapping("cinema")
public class CinemaController {
    /**
     * 服务对象
     */
    @Resource
    private CinemaService cinemaService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("query")
    @IgnoreAuth
    public R queryById(@RequestParam("id") Long id) {
        return R.ok().put("data",this.cinemaService.queryById(id));
    }

    /**
     * 查询全部
     * @param cinema 实体
     * @return R
     */
    @PostMapping("/queryAll")
    @IgnoreAuth
    public R queryAll(@RequestBody Cinema cinema){
        return R.ok().put("data",this.cinemaService.queryAll(cinema));
    }

    /**
     * 新增数据
     *
     * @param cinema 实体
     * @return 新增结果
     */
    @PostMapping("add")
    @IgnoreAuth
    public R add(@RequestBody Cinema cinema) {
        return R.ok().put("data",(this.cinemaService.insert(cinema)));
    }

    /**
     * 编辑数据
     *
     * @param cinema 实体
     * @return 编辑结果
     */
    @PostMapping("update")
    @IgnoreAuth
    public R edit(@RequestBody Cinema cinema) {
        return R.ok().put("data",(this.cinemaService.update(cinema)));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @PostMapping("delete")
    @IgnoreAuth
    public R deleteById(@RequestParam("id")Long id) {
        return R.ok().put("data",(this.cinemaService.deleteById(id)));
    }

}

