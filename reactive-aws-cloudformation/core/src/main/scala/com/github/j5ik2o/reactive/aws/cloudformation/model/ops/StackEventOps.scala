// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackEventBuilderOps(val self: StackEvent.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackIdAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.stackId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def eventIdAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.eventId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackNameAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.stackName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def logicalResourceIdAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.logicalResourceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def physicalResourceIdAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.physicalResourceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceTypeAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.resourceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timestampAsScala(value: Option[java.time.Instant]): StackEvent.Builder = {
            value.fold(self){ v => self.timestamp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceStatusAsScala(value: Option[ResourceStatus]): StackEvent.Builder = {
            value.fold(self){ v => self.resourceStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceStatusReasonAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.resourceStatusReason(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourcePropertiesAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.resourceProperties(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientRequestTokenAsScala(value: Option[String]): StackEvent.Builder = {
            value.fold(self){ v => self.clientRequestToken(v) }
            } 


}

final class StackEventOps(val self: StackEvent) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackIdAsScala: Option[String] = Option(self.stackId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def eventIdAsScala: Option[String] = Option(self.eventId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackNameAsScala: Option[String] = Option(self.stackName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceTypeAsScala: Option[String] = Option(self.resourceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourcePropertiesAsScala: Option[String] = Option(self.resourceProperties) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackEventOps {

implicit def toStackEventBuilderOps(v: StackEvent.Builder): StackEventBuilderOps = new StackEventBuilderOps(v)

implicit def toStackEventOps(v: StackEvent): StackEventOps = new StackEventOps(v)

}

