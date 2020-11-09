package app.testing.com.practicalwork.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    public static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        @SerializedName("id")
        @Expose
        public final String  id;
        @SerializedName("title")
        @Expose
        public final String title;
        @SerializedName("time")
        @Expose
        public final Integer time;
        @SerializedName("type")
        @Expose
        public final String type;
        @SerializedName("by")
        @Expose
        public final String by;

        public DummyItem(String id, String title, Integer time, String type, String by) {
            this.id = id;
            this.title = title;
            this.time = time;
            this.type = type;
            this.by = by;
        }
        public DummyItem(DummyItem item) {
            this.id = item.id;
            this.title = item.title;
            this.time = item.time;
            this.type = item.type;
            this.by = item.by;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}

