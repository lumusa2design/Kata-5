package is2.ulpgc.kata5;

import spark.Request;

public interface Service {
    String getPage();
    String calculateValues(Request request);
}
