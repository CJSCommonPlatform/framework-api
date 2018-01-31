package uk.gov.justice.services.messaging;


public interface EnvelopeBuilder<T> {

    EnvelopeBuilder withMetadata(final Metadata metadata);

    EnvelopeBuilder withPayload(final T payload);

    Envelope<T> build();
}
