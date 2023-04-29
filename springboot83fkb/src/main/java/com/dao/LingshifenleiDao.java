package com.dao;

import com.entity.LingshifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingshifenleiVO;
import com.entity.view.LingshifenleiView;


/**
 * 零食分类
 * 
 * @author 
 * @email 
 * @date 2023-03-10 18:07:15
 */
public interface LingshifenleiDao extends BaseMapper<LingshifenleiEntity> {
	
	List<LingshifenleiVO> selectListVO(@Param("ew") Wrapper<LingshifenleiEntity> wrapper);
	
	LingshifenleiVO selectVO(@Param("ew") Wrapper<LingshifenleiEntity> wrapper);
	
	List<LingshifenleiView> selectListView(@Param("ew") Wrapper<LingshifenleiEntity> wrapper);

	List<LingshifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<LingshifenleiEntity> wrapper);
	
	LingshifenleiView selectView(@Param("ew") Wrapper<LingshifenleiEntity> wrapper);
	

}
