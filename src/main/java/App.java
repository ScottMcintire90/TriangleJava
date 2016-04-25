import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
//
public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/triangle", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      int side1 = Integer.parseInt(request.queryParams("side1"));
      int side2 = Integer.parseInt(request.queryParams("side2"));
      int side3 = Integer.parseInt(request.queryParams("side3"));

      Triangle myTriangle = new Triangle(side1, side2, side3);
      model.put("myTriangle", myTriangle);

      model.put("template", "templates/triangle.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }
}
