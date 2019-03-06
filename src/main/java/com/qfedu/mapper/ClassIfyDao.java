package com.qfedu.mapper;

import com.qfedu.domain.Classify;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassIfyDao {
    @Select({"select * from classify"})
    public List<Classify>  selectAllClassify() throws Exception;
}
