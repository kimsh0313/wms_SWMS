package com.offline.dao;

import com.offline.dto.OfflineStackDto;

import java.util.List;

public interface ShoeMapper {

    List<OfflineStackDto> shoesSearch(String code);
}
