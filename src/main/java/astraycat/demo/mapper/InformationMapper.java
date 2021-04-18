package astraycat.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import astraycat.demo.model.HomepageInformation;

@Mapper
public interface InformationMapper {
	public List<HomepageInformation> selectHomepageInformation();
}
