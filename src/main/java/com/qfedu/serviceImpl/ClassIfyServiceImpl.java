package com.qfedu.serviceImpl;

import com.qfedu.mapper.ClassIfyDao;
import com.qfedu.domain.Classify;
import com.qfedu.service.ClassIfyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassIfyServiceImpl implements ClassIfyService {
    @Autowired
    private ClassIfyDao classIfyDao;



    @Override
    public List<Classify> getAllClassify() throws Exception{
        List<Classify> classifies = null;
        try {
            classifies = classIfyDao.selectAllClassify();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classifies;
    }
}
