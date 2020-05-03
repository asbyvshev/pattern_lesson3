package interfaces;

import persistens.SubjectObservations;

public interface Observer {
    void update(SubjectObservations subject, Object arg);
}
