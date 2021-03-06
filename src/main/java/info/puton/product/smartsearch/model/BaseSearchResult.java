package info.puton.product.smartsearch.model;

/**
 * Created by taoyang on 2016/9/29.
 */
public class BaseSearchResult {

    private String index;

    private String type;

    private String id;

    private Float score;

    private Long timestamp;

    private String owner;

    private String group;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public BaseSearchResult() {
    }

    @Override
    public String toString() {
        return "BaseSearchResult{" +
                "index='" + index + '\'' +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
                ", timestamp=" + timestamp +
                ", owner='" + owner + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
