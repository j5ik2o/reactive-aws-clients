// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IdFormatBuilderOps(val self: IdFormat.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadlineAsScala(value: Option[java.time.Instant]): IdFormat.Builder = {
    value.fold(self) { v =>
      self.deadline(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceAsScala(value: Option[String]): IdFormat.Builder = {
    value.fold(self) { v =>
      self.resource(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def useLongIdsAsScala(value: Option[Boolean]): IdFormat.Builder = {
    value.fold(self) { v =>
      self.useLongIds(v)
    }
  }

}

final class IdFormatOps(val self: IdFormat) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadlineAsScala: Option[java.time.Instant] = Option(self.deadline)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceAsScala: Option[String] = Option(self.resource)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def useLongIdsAsScala: Option[Boolean] = Option(self.useLongIds)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIdFormatOps {

  implicit def toIdFormatBuilderOps(v: IdFormat.Builder): IdFormatBuilderOps = new IdFormatBuilderOps(v)

  implicit def toIdFormatOps(v: IdFormat): IdFormatOps = new IdFormatOps(v)

}
