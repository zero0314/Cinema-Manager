package com.dao;

import com.entity.YingyuanchangciEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyuanchangciVO;
import com.entity.view.YingyuanchangciView;


/**
 * 影院场次
 * 
 * @author 
 * @email 
 * @date 2023-03-10 18:07:15
 */
public interface YingyuanchangciDao extends BaseMapper<YingyuanchangciEntity> {
	
	List<YingyuanchangciVO> selectListVO(@Param("ew") Wrapper<YingyuanchangciEntity> wrapper);
	
	YingyuanchangciVO selectVO(@Param("ew") Wrapper<YingyuanchangciEntity> wrapper);
	
	List<YingyuanchangciView> selectListView(@Param("ew") Wrapper<YingyuanchangciEntity> wrapper);

	List<YingyuanchangciView> selectListView(Pagination page,@Param("ew") Wrapper<YingyuanchangciEntity> wrapper);
	
	YingyuanchangciView selectView(@Param("ew") Wrapper<YingyuanchangciEntity> wrapper);
	

}
