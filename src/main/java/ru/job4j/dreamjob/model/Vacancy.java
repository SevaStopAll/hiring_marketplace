package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class Vacancy {

    public static final Map<String, String> COLUMN_MAPPING = Map.of(
            "id", "id",
            "title", "title",
            "description", "description",
            "creation_date", "creationDate",
            "visible", "visible",
            "city_id", "cityId",
            "file_id", "fileId"
    );

    private int id;
    private String title;
    private String description;
    private LocalDateTime creationDate;

    private boolean visible;

    private int cityId;

    private int fileId;

    public Vacancy() {
        creationDate = LocalDateTime.now();
    }

    public Vacancy(int id, String title, String description, boolean visible, int cityId, int fileID) {
        this.id = id;
        this.title = title;
        this.description = description;
        creationDate = LocalDateTime.now();
        this.visible = visible;
        this.cityId = cityId;
        this.fileId = fileID;
    }

    public Vacancy(int id, String title, String description, LocalDateTime now, boolean visible, int cityId, int fileID) {
        this.id = id;
        this.title = title;
        this.description = description;
        creationDate = now;
        this.visible = visible;
        this.cityId = cityId;
        this.fileId = fileID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vacancy vacancy = (Vacancy) o;
        return id == vacancy.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
