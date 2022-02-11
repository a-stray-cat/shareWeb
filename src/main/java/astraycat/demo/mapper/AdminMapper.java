package astraycat.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import astraycat.demo.model.Admin;

@Mapper
public interface AdminMapper {
  public Admin selectAdminByAdminnameAndPassword(String adminname, String adminpassword);

  public Admin selectAdminByAdminname(String adminname);
}
