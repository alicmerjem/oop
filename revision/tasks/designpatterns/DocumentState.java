package revision.tasks.designpatterns;

public interface DocumentState {
    void publish(Document doc);
}

class DraftState implements DocumentState {
    public void publish(Document doc) {
        System.out.println("moving document to moderation");
        doc.setState(new ModerationState());
    }
}

class ModerationState implements DocumentState {
    public void publish(Document doc) {
        if(doc.isAdmin()) {
            System.out.println("publishing document");
            doc.setState(new PublishedState());
        } else {
            System.out.println("only admin can publish the document");
        }
    }
}

class PublishedState implements DocumentState {
    public void publish(Document doc) {
        System.out.println("document is already published");
    }
}

class Document {
    private DocumentState state;
    private boolean admin;

    public Document(boolean isAdmin) {
        this.admin = isAdmin;
        this.state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void publish() {
        state.publish(this);
    }
}

class Main {
    public static void main(String[] args) {
        Document doc = new Document(true);
        doc.publish();
        doc.publish();

        Document doc2 = new Document(false);
        doc2.publish();
        doc2.publish();        
    }
}