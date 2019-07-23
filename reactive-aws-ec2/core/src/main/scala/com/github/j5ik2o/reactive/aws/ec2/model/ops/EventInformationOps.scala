// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EventInformationBuilderOps(val self: EventInformation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventDescriptionAsScala(value: Option[String]): EventInformation.Builder = {
    value.fold(self) { v =>
      self.eventDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSubTypeAsScala(value: Option[String]): EventInformation.Builder = {
    value.fold(self) { v =>
      self.eventSubType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): EventInformation.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

}

final class EventInformationOps(val self: EventInformation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventDescriptionAsScala: Option[String] = Option(self.eventDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSubTypeAsScala: Option[String] = Option(self.eventSubType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEventInformationOps {

  implicit def toEventInformationBuilderOps(v: EventInformation.Builder): EventInformationBuilderOps =
    new EventInformationBuilderOps(v)

  implicit def toEventInformationOps(v: EventInformation): EventInformationOps = new EventInformationOps(v)

}
