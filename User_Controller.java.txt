@Controller
public class UserController {
  // 로그인 페이지 이동
  @RequestMapping("user/login.do")
  public String login() {
    logger.info("경로 : login");

    return "user/login";
  }

}