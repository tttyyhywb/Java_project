package kevin.test.cutomer;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class CustomerId {

    @JsonProperty
    private final String id;

    public CustomerId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
