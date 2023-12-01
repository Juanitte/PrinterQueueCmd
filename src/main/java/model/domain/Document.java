package model.domain;

public class Document {
    private String name;
    private String content;
    private int priority;

    public Document(String name, String content, int priority) {
        this.name = name;
        this.content = content;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String toString() {
        return "Document: " + name + "\nPriority: " + priority + "\n";
    }
}

