package astraycat.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import astraycat.demo.mapper.InformationMapper;
import astraycat.demo.model.HomepageInformation;
import astraycat.demo.service.InformationService;

@Service
public class InformationServiceImpl implements InformationService {

  @Autowired InformationMapper informationmapper;

  @Override
  public List<HomepageInformation> getInformation(HomepageInformation information) {
    // 调用mapper实现查询
    return informationmapper.selectHomepageInformation();
  }
}
