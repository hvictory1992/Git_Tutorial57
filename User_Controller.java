@Controller
public class UserController {
  // 로그인 페이지 이동
  @RequestMapping("user/login.do")
  public String login() {
    logger.info("경로 : login");

    return "user/login";
  }
  // 회원가입 페에지로 이동
  @RequestMapping("user/insert.do")
  public String insert() {
    logger.info("경로 : insert")

    return "user/insert";
  }

  // 회원 수정페이지로 이동
  @RequestMapping("user/update.do")
  public String update() {
    logger.info("경로 : update")

    return "user/update";
  }

  // 회원 탈퇴페이지로 이동 - master에서 작업
  @RequestMapping("user/delete.do")
  public String delete() {
    logger.info("경로 : delete")

    return "user/delete";
  }
}