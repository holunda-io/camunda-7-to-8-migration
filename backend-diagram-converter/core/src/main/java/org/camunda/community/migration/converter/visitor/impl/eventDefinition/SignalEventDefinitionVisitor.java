package org.camunda.community.migration.converter.visitor.impl.eventDefinition;

import static org.camunda.community.migration.converter.NamespaceUri.*;

import org.camunda.community.migration.converter.DomElementVisitorContext;
import org.camunda.community.migration.converter.version.SemanticVersion;
import org.camunda.community.migration.converter.visitor.AbstractEventDefinitionVisitor;

public class SignalEventDefinitionVisitor extends AbstractEventDefinitionVisitor {
  @Override
  public String localName() {
    return "signalEventDefinition";
  }

  @Override
  protected SemanticVersion availableFrom(DomElementVisitorContext context) {
    if (isStartEvent(context) && isNotEventSubProcessStartEvent(context)) {
      return SemanticVersion._8_2_0;
    }
    return null;
  }

  private boolean isStartEvent(DomElementVisitorContext context) {
    return context.getElement().getParentElement().getLocalName().equals("startEvent");
  }
}
