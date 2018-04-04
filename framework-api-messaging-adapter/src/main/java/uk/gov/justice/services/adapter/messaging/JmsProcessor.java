package uk.gov.justice.services.adapter.messaging;

import uk.gov.justice.services.core.interceptor.InterceptorContext;

import java.util.function.Consumer;

import javax.jms.Message;

public interface JmsProcessor {

    /**
     * Process an incoming JMS message by validating the message and then passing the envelope
     * converted from the message to the given consumer.
     *
     * @param subscriptionManager a subscription manager
     * @param message  a message to be processed
     */
    void process(final ISubscriptionManager subscriptionManager, final Message message);
}