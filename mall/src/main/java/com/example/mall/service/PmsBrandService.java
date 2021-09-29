package com.example.mall.service;

import com.example.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @ClassName PmsService
 * @Description
 * @Author lao
 * @Date 2021/9/26 13:54
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
