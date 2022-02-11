package astraycat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import astraycat.demo.model.HomepageInformation;
import astraycat.demo.service.InformationService;
import net.sf.json.JSONObject;

/** @author 资源信息管理Controller */
@RestController
@RequestMapping("/homepage")
public class InformationController {

  @Autowired InformationService informationService;

  @RequestMapping("/information")
  public List<HomepageInformation> getInformation(HomepageInformation information) {

    // 调用Service层
    informationService.getInformation(information);

    return informationService.getInformation(information);
  }
}
