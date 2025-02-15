package tw.edu.ntub.imd.justforyou.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RecommendRecordBean {
    private String id;
    /**
     * @see tw.edu.ntub.imd.justforyou.databaseconfig.entity.SummaryRecord#sid
     */
    private Integer sid;
    private String userId;
    private LocalDateTime establishTime;
    /**
     * @see tw.edu.ntub.imd.justforyou.databaseconfig.entity.MusicRecommend#rid
     */
    private Integer rid;
    private String song;
    private String link;
    private String thumbnails;
    /**
     * @see tw.edu.ntub.imd.justforyou.databaseconfig.entity.Emotion#emotionTag
     */
    private Integer emotionTag;
    private String description;
    private Boolean collection;
}