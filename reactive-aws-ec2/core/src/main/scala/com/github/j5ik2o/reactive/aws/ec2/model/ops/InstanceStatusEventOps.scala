// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceStatusEventBuilderOps(val self: InstanceStatusEvent.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceEventIdAsScala(value: Option[String]): InstanceStatusEvent.Builder = {
            value.fold(self){ v => self.instanceEventId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[EventCode]): InstanceStatusEvent.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): InstanceStatusEvent.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def notAfterAsScala(value: Option[java.time.Instant]): InstanceStatusEvent.Builder = {
            value.fold(self){ v => self.notAfter(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def notBeforeAsScala(value: Option[java.time.Instant]): InstanceStatusEvent.Builder = {
            value.fold(self){ v => self.notBefore(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def notBeforeDeadlineAsScala(value: Option[java.time.Instant]): InstanceStatusEvent.Builder = {
            value.fold(self){ v => self.notBeforeDeadline(v) }
            } 


}

final class InstanceStatusEventOps(val self: InstanceStatusEvent) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceEventIdAsScala: Option[String] = Option(self.instanceEventId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[EventCode] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def notAfterAsScala: Option[java.time.Instant] = Option(self.notAfter) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def notBeforeAsScala: Option[java.time.Instant] = Option(self.notBefore) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def notBeforeDeadlineAsScala: Option[java.time.Instant] = Option(self.notBeforeDeadline) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceStatusEventOps {

implicit def toInstanceStatusEventBuilderOps(v: InstanceStatusEvent.Builder): InstanceStatusEventBuilderOps = new InstanceStatusEventBuilderOps(v)

implicit def toInstanceStatusEventOps(v: InstanceStatusEvent): InstanceStatusEventOps = new InstanceStatusEventOps(v)

}

