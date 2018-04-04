package uk.gov.justice.services.adapter.messaging;

import uk.gov.justice.services.messaging.JsonEnvelope;

public interface ISubscriptionManager {
    void process(JsonEnvelope jsonEnvelope);
}
