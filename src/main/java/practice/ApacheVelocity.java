package practice;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class ApacheVelocity {

    public static void main(String... args) {
        VelocityEngine ve = new VelocityEngine();
        ve.init();
        /*  next, get the Template  */
//        Template t = ve.getTemplate("helloworld.vm");
        Template t = ve.getTemplate("src/main/resources/service.yml");
        /*  create a context and add data */
        VelocityContext context = new VelocityContext();
        context.put("drama", "curator");
        /* now render the template into a StringWriter */
        StringWriter writer = new StringWriter();
        t.merge(context, writer);
        /* show the World */
        System.out.println(writer.toString());
    }

    public void test() {
        System.out.println("ApacheVelocity");
    }
}
