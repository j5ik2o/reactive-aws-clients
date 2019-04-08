// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IdFormatBuilderOps(val self: IdFormat.Builder) extends AnyVal {

  final def deadlineAsScala(value: Option[java.time.Instant]): IdFormat.Builder = {
    value.fold(self) { v =>
      self.deadline(v)
    }
  }

  final def resourceAsScala(value: Option[String]): IdFormat.Builder = {
    value.fold(self) { v =>
      self.resource(v)
    }
  }

  final def useLongIdsAsScala(value: Option[Boolean]): IdFormat.Builder = {
    value.fold(self) { v =>
      self.useLongIds(v)
    }
  }

}

final class IdFormatOps(val self: IdFormat) extends AnyVal {

  final def deadlineAsScala: Option[java.time.Instant] = Option(self.deadline)

  final def resourceAsScala: Option[String] = Option(self.resource)

  final def useLongIdsAsScala: Option[Boolean] = Option(self.useLongIds)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIdFormatOps {

  implicit def toIdFormatBuilderOps(v: IdFormat.Builder): IdFormatBuilderOps = new IdFormatBuilderOps(v)

  implicit def toIdFormatOps(v: IdFormat): IdFormatOps = new IdFormatOps(v)

}
