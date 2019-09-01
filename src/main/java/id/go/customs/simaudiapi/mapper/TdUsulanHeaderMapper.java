package id.go.customs.simaudiapi.mapper;

import id.go.customs.simaudiapi.model.TdUsulanHeader;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TdUsulanHeaderMapper {
    int insert(TdUsulanHeader record);

    int insertSelective(TdUsulanHeader record);
    List<TdUsulanHeader> findAll();
}