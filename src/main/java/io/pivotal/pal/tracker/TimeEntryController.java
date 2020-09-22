package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

public class TimeEntryController {

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
    }

    public ResponseEntity create(TimeEntry timeEntryToCreate) {
        return null;
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        return null;
    }

    public ResponseEntity update(long timeEntryId, TimeEntry expected) {
        return null;
    }

    public ResponseEntity delete(long timeEntryId) {
        return null;
    }
}
