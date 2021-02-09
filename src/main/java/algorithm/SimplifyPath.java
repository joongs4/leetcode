package algorithm;

import java.util.Iterator;
import java.util.Stack;

public class SimplifyPath {

    public static void main(String... args) {
        //
//        String path = "/a/./b/../../c/";
        String path = "/../";
        simplifyPath(path);
    }

    public static String simplifyPath(String path) {
        //
        String[] parts = path.split("/");
        Stack<String> pathPartStack = new Stack<>();

        for (String part : parts) {
            if (part.length() < 1 || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!pathPartStack.isEmpty()) {
                    pathPartStack.pop();
                }
            } else {
                pathPartStack.push(part);
            }
        }

        StringBuilder sb = new StringBuilder("/");
        Iterator<String> pathIterator = pathPartStack.iterator();
        while (pathIterator.hasNext()) {
            sb.append(pathIterator.next());
            if (pathIterator.hasNext()) {
                sb.append("/");
            }
        }
        return sb.toString();
    }
}
